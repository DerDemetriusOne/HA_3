package com.example.derdemetrius.ha_3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_rectandle_activity.*

class Rectandle_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectandle_activity)

        button.setOnClickListener {
            var x = editB.text.toString()
            var y = edit1.text.toString()
            var x1 = Rectangle(x.toDouble(),y.toDouble())
            pl.text = x1.squareRec().toString()
            per.text = x1.perimetrRec().toString()


        }

        back1.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }





    }

}
