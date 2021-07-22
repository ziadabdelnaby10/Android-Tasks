package com.example.loginsignuptask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.loginsignuptask.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        binding.imageButton.setOnClickListener {
            onBackPressed()
        }
        binding.signInTxt.setOnClickListener {
            onBackPressed()
        }
        createAnim()
    }

    fun createAnim(){

        var ani = AnimationUtils.loadAnimation(this , android.R.anim.slide_in_left)
        ani.setDuration(3000)
        binding.textInputLayoutFName.startAnimation(ani)
        ani = AnimationUtils.loadAnimation(this , android.R.anim.slide_in_left)
        ani.setDuration(3000)
        binding.textInputLayoutLName.startAnimation(ani)
        ani = AnimationUtils.loadAnimation(this , android.R.anim.slide_in_left)
        ani.setDuration(3500)
        binding.textInputLayoutemail.startAnimation(ani)
        ani = AnimationUtils.loadAnimation(this , android.R.anim.slide_in_left)
        ani.setDuration(4000)
        binding.textInputLayoutPassword.startAnimation(ani)
        ani = AnimationUtils.loadAnimation(this , android.R.anim.slide_in_left)
        ani.setDuration(4500)
        binding.textInputLayoutConfirmPassword.startAnimation(ani)
        ani = AnimationUtils.loadAnimation(this , android.R.anim.slide_in_left)
        ani.setDuration(5000)
        binding.signupBtn.startAnimation(ani)
        ani = AnimationUtils.loadAnimation(this , android.R.anim.slide_in_left)
        ani.setDuration(5500)
        binding.signInTxt.startAnimation(ani)
    }
}