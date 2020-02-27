package com.example.daayoneapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_white.setOnClickListener{
            toast("white")
            layout_principal.setBackgroundColor(Color.WHITE)
        }

        btn_red.setOnClickListener{
            toast("red")
            layout_principal.setBackgroundColor(Color.RED)
        }


    }

    private fun toast(text: String, duration: Int =
        Toast.LENGTH_LONG) = Toast.makeText(this@MainActivity, text, Toast.LENGTH_LONG).show()


}


