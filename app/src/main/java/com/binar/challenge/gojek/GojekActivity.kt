package com.binar.challenge.gojek

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import com.binar.challenge.R

class GojekActivity : AppCompatActivity() {
    lateinit var svHome: SearchView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gojek)

        svHome = findViewById(R.id.sv_home)

        val id = svHome.context.resources.getIdentifier("android:id/search_src_text", null, null)
        val searchText = svHome.findViewById<TextView>(id)
        val typeface = ResourcesCompat.getFont(this, R.font.gojek_font)
        searchText.typeface = typeface
        searchText.textSize = 14f
    }
}