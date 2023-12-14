package com.aristidevs.abanicomax.firstapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aristidevs.abanicomax.R
import android.widget.Button
import android.widget.TextView

class FirtsAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firts_app)

        val btnEmailPassword = findViewById<Button>(R.id.btn_email_password)
        val btnPhoneNumber = findViewById<Button>(R.id.btn_phone_number)
        val tvRegister = findViewById<TextView>(R.id.tvRegister)

        btnEmailPassword.setOnClickListener {
            val intent = Intent(this, EmailPasswordLoginActivity::class.java)
            startActivity(intent)
        }

        btnPhoneNumber.setOnClickListener {
            val intent = Intent(this, PhoneNumberLoginActivity::class.java)
            startActivity(intent)
        }

        tvRegister.setOnClickListener {
            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
        }
    }
}
