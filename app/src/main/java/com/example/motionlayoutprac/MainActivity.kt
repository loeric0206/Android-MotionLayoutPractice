package com.example.motionlayoutprac

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 : Button = findViewById(R.id.btn1)
        val btn2 : Button = findViewById(R.id.btn2)
        val btn3 : Button = findViewById(R.id.btn3)
        val btn4 : Button = findViewById(R.id.btn4)
        val btn5 : Button = findViewById(R.id.btn5)

        btn1.setOnClickListener {
            val intent = Intent(this@MainActivity, Basic::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(this@MainActivity, Basic2::class.java)
            startActivity(intent) }
        btn3.setOnClickListener {
            val intent = Intent(this@MainActivity, BasicChangeColor::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener {
            val intent = Intent(this@MainActivity, ImageFilterViewOne::class.java)
            startActivity(intent)
        }
        btn5.setOnClickListener {
            val intent = Intent(this@MainActivity, ImageFilterViewTwo::class.java)
            startActivity(intent)
        }




        changeActivity()


    }

    private fun changeActivity() {


    }

    fun basic(view: View) {
        val intent = Intent(this, Basic::class.java)
        startActivity(intent)

    }

    fun second(view: View) {
        val intent = Intent(this, Basic2::class.java)
        startActivity(intent)
    }

    fun third(view: View) {
        val intent = Intent(this, BasicChangeColor::class.java)
        startActivity(intent)
    }

    fun imageFilterView1(view: View) {}

    fun imageFilterView2(view: View) {}
}
