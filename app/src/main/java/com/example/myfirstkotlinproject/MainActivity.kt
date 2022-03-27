package com.example.myfirstkotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.text_view)
        val button = findViewById<Button>(R.id.btn_main)

        val data1 = SomeDataClass(32, "Vasiliy")
        val data2 = data1.copy(b = "Ivan")

        val arrayList = arrayListOf("Sergey", "Vitaliy", "Denis", "Peter")
        val array = arrayOf(1, 4, 5, 7, 8, 4, 3, 2)

        button.setOnClickListener {
            (data2.a.toString() + " " + data2.b).also { textView.text = it }

            for (item in arrayList) {
                println(item)
            }
            println()
            array.forEach { string ->
                println(string)
            }
            println()
            for (i in 1..15) {
                println(i.toString())
            }
            println()
            for (i in 1 until 10) {
                println(i.toString())
            }
            println()
            for (i in 10 downTo 1) {
                println(i.toString())
            }
            println()
            for (i in 10 downTo 1 step 2) {
                println(i.toString())
            }
            println()
            for (i in arrayList.indices) {
                println(i.toString())
            }
            println()
        }


    }
}