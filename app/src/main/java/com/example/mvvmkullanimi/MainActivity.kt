package com.example.mvvmkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mvvmkullanimi.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim=DataBindingUtil.setContentView(this,R.layout.activity_main)
        // Yetkilendirme işlemi mainActivityNesnesi için
        tasarim.mainActivityNesnesi=this


        tasarim.hesaplamaSonucu="0"


    }

    fun buttonToplamaTikla(alinanSayi1:String,alinanSayi2:String)
    {

        val sayi1=alinanSayi1.toInt()
        val sayi2=alinanSayi2.toInt()

        val toplam=sayi1+sayi2

        tasarim.hesaplamaSonucu=toplam.toString()
    }
    fun buttonCarpmaTikla(alinanSayi1:String,alinanSayi2:String)
    {
        val sayi1=alinanSayi1.toInt()
        val sayi2=alinanSayi2.toInt()

        val toplam=sayi1*sayi2

        tasarim.hesaplamaSonucu=toplam.toString()
    }


}

