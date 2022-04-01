package com.example.myapplication

import android.animation.IntEvaluator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var Text1 = findViewById<TextView>(R.id.Text1)
    var Text0 = findViewById<TextView>(R.id.Text0)

    var operation = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val button0 = findViewById<Button>(R.id.button0)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val buttonminus = findViewById<Button>(R.id.buttonminus)
        val buttonplus = findViewById<Button>(R.id.buttonplus)
        val  buttondivide = findViewById<Button>(R.id. buttondivide)
        val buttondot = findViewById<Button>(R.id.buttondot)
        val buttonmultiply = findViewById<Button>(R.id.buttonmultiply)
        val buttonequals = findViewById<Button>(R.id.buttonequals)
        val buttonC = findViewById<Button>(R.id.buttonC)



        button1.setOnClickListener { click(button1)}
        button2.setOnClickListener { click(button2)}
        button3.setOnClickListener { click(button3)}
        button4.setOnClickListener { click(button4)}
        button5.setOnClickListener { click(button5)}
        button6.setOnClickListener { click(button6)}
        button7.setOnClickListener { click(button7)}
        button8.setOnClickListener { click(button8)}
        button9.setOnClickListener { click(button9)}
        button0.setOnClickListener { click(button0)}
        buttonminus.setOnClickListener { click(buttonminus)}
        buttonplus.setOnClickListener { click(buttonplus)}
        buttondivide.setOnClickListener { click(buttondivide)}
        buttondot.setOnClickListener { click(buttondot)}
        buttonmultiply.setOnClickListener { click(buttonmultiply)}
//        buttonequals.setOnClickListener { calculate()}
        buttonC.setOnClickListener { Clear() }

    }




    private fun click(btn : Button)

    {

        if(!Text1.text.isBlank() || !Text1.text.isNullOrEmpty()) {
            operation = ""
            Text0.setText("")
            Text1.setText("")
        }

        operation += btn.text
        Text0.setText(operation)
    }

    private fun Clear()
    {
        operation = ""
        Text0.setText("")
        Text1.setText("")
    }

//    private fun calculate()
//    {
////        val result = IntEvaluator(operation)
//
//        if(result % 1 == 0.0)
//            Text1.setText(result.toInt().toString())
//        else
//            Text1.setText(result.toString())
//
//    }


}