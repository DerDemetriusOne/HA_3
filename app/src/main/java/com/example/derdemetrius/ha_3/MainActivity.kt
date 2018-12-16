package com.example.derdemetrius.ha_3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View
import android.widget.*


class MainActivity : AppCompatActivity(),AdapterView.OnItemSelectedListener {

    var figure = arrayOf("Выберите фигуру","Круг", "Прямоугольник","Трёхугольник")

    var spinner:Spinner? = null
    var textView_msg:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        spinner = this.spinner_sample
        spinner!!.setOnItemSelectedListener(this)

        val aa = ArrayAdapter(this, android.R.layout.simple_spinner_item, figure)
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner!!.setAdapter(aa)

    }

    override fun onItemSelected(arg0: AdapterView<*>, arg1: View, position: Int, id: Long) {
        //textView_msg!!.text = "Selected : "+figure[position]
        if (position == 1)  {

            val intent = Intent(this,Cicle_activity::class.java)
            startActivity(intent)

        }

        if (position == 2) {

            val intent = Intent(this,Rectandle_activity::class.java)
            startActivity(intent)

        }

        if (position ==3) {
            val intent = Intent(this,Triangle_activity::class.java)
            startActivity(intent)
        }

            //if (position ==0) {
           // val snack = Snackbar.make(this,"Выберите Фигуру",Snackbar.LENGTH_LONG)
           // snack.show()
      //  }





    }

    override fun onNothingSelected(arg0: AdapterView<*>) {

    }
}