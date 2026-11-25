package com.fyser.launcher

import android.app.Activity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(32, 60, 32, 32)

        val title = TextView(this)
        title.text = "Fyser Launcher Lite"
        title.textSize = 26f
        layout.addView(title)

        val bedrock = Button(this)
        bedrock.text = "Lancer Minecraft Bedrock"
        layout.addView(bedrock)

        bedrock.setOnClickListener {
            val intent = packageManager
                .getLaunchIntentForPackage("com.mojang.minecraftpe")

            if (intent != null) {
                startActivity(intent)
            } else {
                Toast.makeText(
                    this,
                    "Minecraft Bedrock n'est pas installé",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

        val java = Button(this)
        java.text = "Minecraft Java - bientôt disponible"
        layout.addView(java)

        setContentView(layout)
    }
}
