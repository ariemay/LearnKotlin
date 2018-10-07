package com.example.arie.learnkotlin2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login_firebase.*


class LoginFirebaseActivity : AppCompatActivity() {

    var userEmail: String? = ""
    var userPassword: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_firebase)

//        userEmail = emailInput.toString()
//        userPassword = passwordInput.toString()

        loginButton.setOnClickListener() {
            Toast.makeText(this@LoginFirebaseActivity, "Login??", Toast.LENGTH_SHORT).show()
            val intent =  Intent(this, MainActivity::class.java)
            val userEmail = emailInput!!.text.toString()
            val userPassword = passwordInput!!.text.toString()

            intent.putExtra("USER_EMAIL", userEmail)
            intent.putExtra("USER_PASSWORD", userPassword)
            startActivity(intent)
        }
    }
}
