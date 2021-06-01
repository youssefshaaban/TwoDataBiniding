package com.example.towwaydatabinding

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.towwaydatabinding.databinding.ActivityMainBinding
import com.example.towwaydatabinding.databinding.ActivityMainBindingImpl

class MainActivity : AppCompatActivity() {
  lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding=DataBindingUtil.setContentView(this, R.layout.activity_main)
    binding.executePendingBindings()
    binding.lifecycleOwner = this

  }

}