package com.example.basickotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variable
        //var mutable (isi bisa dirubah)
        var nama = "aji"
        Log.v("tampil", "ini valuenya " + nama)

        nama += " nuansa"
        Log.v("tampil", "ini valuenya " + nama)

        //val constant (tidak bisa dirubah)
        val nomer = 10

        //property
        val siswa = Siswa()
        //setter
        siswa.namaSiswa = "Aji"
        //getter
        Log.v("siswa", "ini valuenya " + siswa.namaSiswa)

        //condition
        var a = 10
        var b = 20

        if (a > b) {
            Log.v("kondisi", "value a lebih besar dari b")
        } else if (a == b) {
            Log.v("kondisi", "value a sama besar dari b")
        } else {
            Log.v("kondisi", "value b lebih besar dari a")
        }

        when(a){
            1 -> Log.v("kondisi", "value a = 1")
            2 -> Log.v("kondisi", "value a = 2")
            else -> {
                Log.v("kondisi", "value a lebih besar dari b")
            }
        }

        //loop
        for (number in 1..5){
            Log.v("loop", "valuenya"+number)
        }

        var x = 1
        while(x < 5){
            Log.v("while", "ini valuenya "+x)
            x++
        }
    }
}