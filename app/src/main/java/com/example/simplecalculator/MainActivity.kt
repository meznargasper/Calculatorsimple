package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.simplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding= DataBindingUtil.setContentView(this, R.layout. activity_main)
        // We ask lifeCycle to provide us with viewmodel
        viewModel= ViewModelProvider(this).get(MainViewModel::class.java)
        // We make data binding lifecycle aware-lifedata databinding
        binding.lifecycleOwner= this
        // We need to add viewmodel to databinding- first we create Mainviewmodel variable in data block(activity.xml)
        // Than we pass viewmodel into data binding(mainactivity)
        binding.viewModel=viewModel



    }
}