package com.example.mvvmkullanimi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel()
{

    var sonuc=MutableLiveData<String>()
    var mRepo=MatermatikRepository()
    init {
        sonuc=mRepo.matematikselSonucGetir()

    }

    fun ToplamaYap(alinanSayi1:String,alinanSayi2:String)
    {

       mRepo.Topla(alinanSayi1,alinanSayi2)


    }
    fun CarpmaYap(alinanSayi1:String,alinanSayi2:String)
    {
        mRepo.Carp(alinanSayi1,alinanSayi2)


    }


}