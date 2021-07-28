package com.example.motionlayouttask

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
import com.example.motionlayouttask.adapter.RecyclerAdapter
import com.example.motionlayouttask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), TransitionListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var Adapter: RecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.motionHost.setTransitionListener(this)

        val data = arrayListOf(
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15",
            "16",
            "17",
            "18",
            "19",
            "20"
        )
        Adapter = RecyclerAdapter(data)
        binding.recyclerView.adapter =Adapter
    }

    override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
        Log.e("Main","Started")

    }

    override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
        /*if (p0!!.progress >= 0.9f)
        {
            binding.motionHost.transitionToStart()
        }*/
        Log.e("Main","Changed")
    }

    override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
        binding.motionHost.transitionToStart()
    }

    override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {
        Log.e("Main","Triggered")
    }
}