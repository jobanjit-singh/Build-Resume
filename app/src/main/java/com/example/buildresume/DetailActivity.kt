package com.example.buildresume

import android.annotation.SuppressLint
import android.app.ActionBar.LayoutParams
import android.content.res.ColorStateList
import android.opengl.Visibility
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.RelativeLayout.LayoutParams.*
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.marginEnd
import androidx.core.view.marginTop

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
    lateinit var skillbasecardView:CardView
    lateinit var skillhidelayout:RelativeLayout
    lateinit var skillarrowButton:ImageButton
    lateinit var skillHideLayoutEditTextLayout:LinearLayout
    lateinit var skillHideLayoutAddEditText:Button
    lateinit var skillHideLayoutSubtractEditTextBtn:Button
    @SuppressLint("ResourceAsColor")
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

        skillbasecardView = findViewById(R.id.skillBaseCardView)
        skillarrowButton = findViewById(R.id.skillShowLayoutArrowButton)
        skillhidelayout = findViewById(R.id.skillHideLayout)

        skillHideLayoutEditTextLayout = findViewById(R.id.skillHideLayoutEditTextLayout)
        skillHideLayoutAddEditText = findViewById(R.id.skillHideLayoutAddEditTextBtn)
        skillHideLayoutSubtractEditTextBtn = findViewById(R.id.skillHideLayoutSubtractEditTextBtn)

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

        skillarrowButton.setOnClickListener(View.OnClickListener {
            if(skillhidelayout.visibility == View.GONE){
                TransitionManager.beginDelayedTransition(skillbasecardView,AutoTransition())
                skillarrowButton.setImageResource(R.drawable.expand_less)
                skillhidelayout.visibility = View.VISIBLE
            }
            else{
                TransitionManager.beginDelayedTransition(skillbasecardView,AutoTransition())
                skillarrowButton.setImageResource(R.drawable.expand_more)
                skillhidelayout.visibility = View.GONE
            }
        })
        var listofEditText = ArrayList<EditText>()
        skillHideLayoutAddEditText.setOnClickListener(View.OnClickListener {
            var layoutParem = LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT)
            var edi1 = EditText(this)
            edi1.id = View.generateViewId()
            edi1.layoutParams = layoutParem
            edi1.hint = "Skill"
            listofEditText.add(edi1)
            skillHideLayoutEditTextLayout.addView(edi1)
        })
        skillHideLayoutSubtractEditTextBtn.setOnClickListener(View.OnClickListener {
            if(listofEditText.size!=0){
                var view = listofEditText[0]
                skillHideLayoutEditTextLayout.removeView(view)
                listofEditText.removeAt(0)
            }
            else{
                Toast.makeText(this,"Kindly First add the Field",Toast.LENGTH_SHORT).show()
            }
        })
    }
}