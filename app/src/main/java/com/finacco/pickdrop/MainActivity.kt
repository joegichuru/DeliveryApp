package com.finacco.pickdrop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.finacco.pickdrop.databinding.MainActivityBinding
import com.finacco.pickdrop.ui.main.MainFragment
import com.gauravk.bubblenavigation.BubbleNavigationConstraintView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=MainActivityBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
    }
}