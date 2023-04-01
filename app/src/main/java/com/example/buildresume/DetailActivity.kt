package com.example.buildresume

import android.annotation.SuppressLint
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
    lateinit var personalbaseCardView:CardView
    lateinit var personalarrowButton:ImageButton
    lateinit var personalhidelayout:RelativeLayout
    lateinit var educationbaseCardView:CardView
    lateinit var educationarrowButton:ImageButton
    lateinit var educationhidelayout:RelativeLayout
    lateinit var experiencebaseCardView:CardView
    lateinit var experiencearrowButton:ImageButton
    lateinit var experiencehidelayout:RelativeLayout
    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        personalbaseCardView = findViewById(R.id.PersonalBaseCardView)
        personalarrowButton = findViewById(R.id.personalarrowButton)
        personalhidelayout = findViewById(R.id.personalHideLayout)

        educationbaseCardView = findViewById(R.id.EducationCardView)
        educationarrowButton = findViewById(R.id.educationArrowButton)
        educationhidelayout = findViewById(R.id.educationHideLayout)

        experiencebaseCardView = findViewById(R.id.experienceCardView)
        experiencearrowButton = findViewById(R.id.experienceArrowButton)
        experiencehidelayout = findViewById(R.id.experienceHideLayout)

        personalarrowButton.setOnClickListener(View.OnClickListener {
            if(personalhidelayout.visibility == View.VISIBLE){
                TransitionManager.beginDelayedTransition(personalbaseCardView,AutoTransition())
                personalarrowButton.setImageResource(R.drawable.expand_more)
                personalhidelayout.visibility = View.GONE
            }else{
                TransitionManager.beginDelayedTransition(personalbaseCardView,AutoTransition())
                personalarrowButton.setImageResource(R.drawable.expand_less)
                personalhidelayout.visibility = View.VISIBLE
            }
        })

        educationarrowButton.setOnClickListener(View.OnClickListener {
            if(educationhidelayout.visibility == View.GONE){
                TransitionManager.beginDelayedTransition(educationbaseCardView,AutoTransition())
                educationarrowButton.setImageResource(R.drawable.expand_less)
                educationhidelayout.visibility = View.VISIBLE
            }else{
                TransitionManager.beginDelayedTransition(educationbaseCardView,AutoTransition())
                educationarrowButton.setImageResource(R.drawable.expand_more)
                educationhidelayout.visibility = View.GONE
            }
        })

        experiencearrowButton.setOnClickListener(View.OnClickListener {
            if(experiencehidelayout.visibility == View.GONE){
                TransitionManager.beginDelayedTransition(experiencebaseCardView,AutoTransition())
                experiencearrowButton.setImageResource(R.drawable.expand_less)
                experiencehidelayout.visibility = View.VISIBLE
            }
            else{
                TransitionManager.beginDelayedTransition(experiencebaseCardView,AutoTransition())
                experiencearrowButton.setImageResource(R.drawable.expand_more)
                experiencehidelayout.visibility = View.GONE
            }
        })
    }
}