package com.example.buildresume;

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.pdf.PdfDocument
import android.graphics.pdf.PdfDocument.Page
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Environment
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

class MainActivity : AppCompatActivity() {
    lateinit var createResume:Button
    lateinit var createCV:Button
    lateinit var mydoc:Button
    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createResume = findViewById(R.id.createResume)
        createCV = findViewById(R.id.createCV)
        mydoc = findViewById(R.id.myDoc)

        createResume.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"Create Resume",Toast.LENGTH_LONG).show()
            createpdf();
        })
    }
    @RequiresApi(Build.VERSION_CODES.KITKAT)
    fun createpdf(){
        var i = Intent(this,DetailActivity::class.java)
        startActivity(i)
//        var con:ConstraintLayout = findViewById(R.id.cons)
//        val document = PdfDocument()
//        val pageInfo = PdfDocument.PageInfo.Builder(con.width,con.height,1).create()
//        val page = document.startPage(pageInfo)
//        val canvas = page.canvas
//        con.draw(canvas)
//        document.finishPage(page)
//        var directory = Environment.getExternalStorageDirectory().path+"/mypdf/"
//        val file = File(directory)
//        if(!file.exists()){
//            file.mkdirs()
//        }
//        var target = directory+"file_1.pdf"
//        var filepath = File(target)
//        try{
//            document.writeTo(FileOutputStream(filepath))
//            Toast.makeText(this,"Saved",Toast.LENGTH_LONG).show()
//        }catch (e:IOException){
//            Toast.makeText(this,"Error",Toast.LENGTH_LONG).show()
//        }
    }
}