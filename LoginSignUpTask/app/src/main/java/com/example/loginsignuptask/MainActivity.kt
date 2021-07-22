package com.example.loginsignuptask

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.transition.TransitionManager
import com.example.loginsignuptask.databinding.ActivityMainBinding
import com.google.android.material.transition.MaterialFade

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        binding.signUpTxt.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
        createAnim()
    }

    fun createAnim(){

        var ani = AnimationUtils.loadAnimation(this , android.R.anim.slide_in_left)
        ani.setDuration(3000)
        binding.textInputLayoutEmail.startAnimation(ani)
        ani = AnimationUtils.loadAnimation(this , android.R.anim.slide_in_left)
        ani.setDuration(3500)
        binding.textInputLayoutPass.startAnimation(ani)
        ani = AnimationUtils.loadAnimation(this , android.R.anim.slide_in_left)
        ani.setDuration(4000)
        binding.loginBtn.startAnimation(ani)
        ani = AnimationUtils.loadAnimation(this , android.R.anim.slide_in_left)
        ani.setDuration(4500)
        binding.signUpTxt.startAnimation(ani)

    }

}