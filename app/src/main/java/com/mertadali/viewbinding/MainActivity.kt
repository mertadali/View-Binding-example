package com.mertadali.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var name = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        }
    fun makeShow(view: View) {   // Buttonun oncreate ismiyle aynı adda bir fonksiyon oluşturuyoruz.
         name = nameText.text.toString()
        val depertman = depertmanText2.text.toString()
        var age = ageText.text.toString().toIntOrNull()
        if (age == null){
            age = 0

        }
        val person = Person(name,depertman,age)

        textView.text = "Name: ${person.name}, Depertman: ${person.depertman}, Age: ${person.age}"

    }

    // Scope

    fun  scopeExample(view: View){
        println(name)

    }

}