package com.example.kazinikazi



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    lateinit var arrow: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
        click()
    }
    fun castView(){
        arrow= findViewById(R.id.arrow)
    }
    fun click(){
        arrow.setOnClickListener {
            var intent = Intent(baseContext,HomePage::class.java)
            startActivity(intent)
        }
    }
}