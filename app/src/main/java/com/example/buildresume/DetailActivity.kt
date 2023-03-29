package com.example.buildresume

import android.opengl.Visibility
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.RelativeLayout
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView

class DetailActivity : AppCompatActivity() {
    lateinit var baseCardView:CardView
    lateinit var arrowButton:ImageButton
    lateinit var hidelayout:RelativeLayout
    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        baseCardView = findViewById(R.id.BaseCardView)
        arrowButton = findViewById(R.id.arrowButton)
        hidelayout = findViewById(R.id.hideLayout)

        arrowButton.setOnClickListener(View.OnClickListener {
            if(hidelayout.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(baseCardView,AutoTransition())
                hidelayout.visibility = View.GONE
                arrowButton.setImageResource(R.drawable.expand_more)
            }else{
                TransitionManager.beginDelayedTransition(baseCardView,AutoTransition())
                hidelayout.visibility = View.VISIBLE
                arrowButton.setImageResource(R.drawable.expand_less)
            }
        })
    }
}