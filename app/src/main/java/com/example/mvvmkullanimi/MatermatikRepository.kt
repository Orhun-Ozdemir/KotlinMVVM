package com.example.mvvmkullanimi

import androidx.lifecycle.MutableLiveData

class MatermatikRepository
{

    var matematikselSonuc= MutableLiveData<String>()

    init {
        matematikselSonuc= MutableLiveData<String>("0")

    }
    fun matematikselSonucGetir():MutableLiveData<String>{

        return  matematikselSonuc
    }

    fun Topla(alinanSayi1:String,alinanSayi2:String)
    {

        val sayi1=alinanSayi1.toInt()
        val sayi2=alinanSayi2.toInt()

        val toplam=sayi1+sayi2

        matematikselSonuc.value=toplam.toString()
    }
    fun Carp(alinanSayi1:String,alinanSayi2:String)
    {
        val sayi1=alinanSayi1.toInt()
        val sayi2=alinanSayi2.toInt()

        val toplam=sayi1*sayi2

        matematikselSonuc.value=toplam.toString()
    }





}