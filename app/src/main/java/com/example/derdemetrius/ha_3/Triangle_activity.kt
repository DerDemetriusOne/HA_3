package com.example.derdemetrius.ha_3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_triangle_activity.*

class Triangle_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangle_activity)

        button3.setOnClickListener {
            var x = sideA.text.toString()
            var y = sideB.text.toString()
            var z = sideC.text.toString()
            var x1 = Triangle(x.toDouble(),y.toDouble(),z.toDouble())
            textView3.text = x1.squareTr().toString()
            textView6.text = x1.perinetrTr().toString()

        }

        back1.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }



    }
}
