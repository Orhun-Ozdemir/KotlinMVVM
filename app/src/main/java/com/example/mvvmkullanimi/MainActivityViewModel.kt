package com.example.mvvmkullanimi

import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel()
{
    var sonuc="0"

    fun ToplamaYap(alinanSayi1:String,alinanSayi2:String)
    {

        val sayi1=alinanSayi1.toInt()
        val sayi2=alinanSayi2.toInt()

        val toplam=sayi1+sayi2

        sonuc=toplam.toString()
    }
    fun CarpmaYap(alinanSayi1:String,alinanSayi2:String)
    {
        val sayi1=alinanSayi1.toInt()
        val sayi2=alinanSayi2.toInt()

        val toplam=sayi1*sayi2

       sonuc=toplam.toString()
    }


}