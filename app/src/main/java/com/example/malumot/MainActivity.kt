package com.example.malumot

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.example.malumot.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameText: TextView = findViewById(R.id.nameText)
        val surnameText: TextView = findViewById(R.id.surnameText)
        val ageText: TextView = findViewById(R.id.ageText)
        val telegramLink: TextView = findViewById(R.id.telegramLink)
        val instagramLink: TextView = findViewById(R.id.instagramLink)

        nameText.text = "Ism: Asadbek"
        surnameText.text = "Familya: Usmonov"
        ageText.text = "Yosh: 14"
        telegramLink.text = "Telegram: t.me/@usmonov_o13"
        instagramLink.text = "Instagram: https://www.instagram.com/macan__o12?igsh=ZGUzMzM3NWJiOQ=="
    }
}
