package com.example.presensilive.views.forgotpass

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.presensilive.R
import com.example.presensilive.databinding.ActivityForgotPasswordBinding

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var binding:ActivityForgotPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_forgot_password)

        init()
    }

    private fun init() {
        setSupportActionBar(binding.tbForgotPassword)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}