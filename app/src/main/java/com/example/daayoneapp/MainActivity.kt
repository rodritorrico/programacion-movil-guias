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




        btn_servicios.setOnClickListener{
            dina.text = "servicios"
        }

        btn_acerca.setOnClickListener{
            dina.text = "acerca"
        }

        btn_contact.setOnClickListener{
            dina.text="contact"
        }

        btn_portafolio.setOnClickListener{
            dina.text="portafolio"
        }

        btn_redes.setOnClickListener{
            dina.text="redes"
        }




    }

    private fun toast(text: String, duration: Int =
        Toast.LENGTH_LONG) = Toast.makeText(this@MainActivity, text, Toast.LENGTH_LONG).show()


}


