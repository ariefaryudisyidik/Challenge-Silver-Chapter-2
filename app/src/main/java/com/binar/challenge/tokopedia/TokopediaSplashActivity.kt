package com.binar.challenge.tokopedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.binar.challenge.R

class TokopediaSplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tokopedia_splash)

        Handler().postDelayed({
            startActivity(Intent(this, TokopediaActivity::class.java))
            finish()
        }, 1000)
    }
}