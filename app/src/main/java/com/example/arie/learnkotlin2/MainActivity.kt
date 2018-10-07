package com.example.arie.learnkotlin2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userName = intent.getStringExtra("USER_NAME")
        val userPassword = intent.getStringExtra("USER_PASSWORD")

        username.setText(userName)
        password.setText(userPassword)
    }
}
