package com.binar.challenge.gojek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.binar.challenge.R

class GojekSplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gojek_splash)

        Handler().postDelayed({
            startActivity(Intent(this, GojekActivity::class.java))
            finish()
        }, 1000)
    }
}