package com.ceydaceyhan.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Veri Hazırlığı

        var superKahramanIsimleri = ArrayList<String>()
        superKahramanIsimleri.add("Batman")
        superKahramanIsimleri.add("Deadpool")
        superKahramanIsimleri.add("Iron man")
        superKahramanIsimleri.add("Spider-man")
        superKahramanIsimleri.add("Thor")

        //Verimsiz Tanımlamalar

        /*val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val deadpoolBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.deadpool)
        val ironmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)
        val spidermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)
        val thorBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.thor)

        var superKahramanGorselleri = ArrayList<Bitmap>()
        superKahramanGorselleri.add(batmanBitmap)
        superKahramanGorselleri.add(deadpoolBitmap)
        superKahramanGorselleri.add(ironmanBitmap)
        superKahramanGorselleri.add(spidermanBitmap)
        superKahramanGorselleri.add(thorBitmap)*/

        //Verimli Tanımlamalar
        val batmanDrawableId = R.drawable.batman
        val deadpoolDrawableId = R.drawable.deadpool
        val ironmanDrawableId = R.drawable.ironman
        val spidermanDrawableId = R.drawable.spiderman
        val thorDrawableId = R.drawable.thor

        var superkahramanDrawableListesi = ArrayList<Int>()
        superkahramanDrawableListesi.add(batmanDrawableId)
        superkahramanDrawableListesi.add(deadpoolDrawableId)
        superkahramanDrawableListesi.add(ironmanDrawableId)
        superkahramanDrawableListesi.add(spidermanDrawableId)
        superkahramanDrawableListesi.add(thorDrawableId)


        //Adapter

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(superKahramanIsimleri,superkahramanDrawableListesi)
        recyclerView.adapter = adapter

    }
}