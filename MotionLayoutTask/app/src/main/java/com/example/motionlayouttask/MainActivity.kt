package com.example.motionlayouttask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.motionlayouttask.adapter.RecyclerAdapter
import com.example.motionlayouttask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var Adapter: RecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
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
}