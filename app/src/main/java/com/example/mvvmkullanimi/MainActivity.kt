package com.example.mvvmkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewSonuc.text="0"

        buttonToplama.setOnClickListener {

            val alinanSayi1=editTextSayi1.text.toString()
            val alinanSayi2=editTextSayi2.text.toString()

            val sayi1=alinanSayi1.toInt()
            val sayi2=alinanSayi2.toInt()

            val toplam=sayi1+sayi2

            textViewSonuc.text=toplam.toString()

        }


        buttonCarpma.setOnClickListener {
            val alinanSayi1=editTextSayi1.text.toString()
            val alinanSayi2=editTextSayi2.text.toString()

            val sayi1=alinanSayi1.toInt()
            val sayi2=alinanSayi2.toInt()

            val toplam=sayi1*sayi2

            textViewSonuc.text=toplam.toString()

        }

    }


}

