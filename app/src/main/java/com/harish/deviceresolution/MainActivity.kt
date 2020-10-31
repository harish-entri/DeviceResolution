package com.harish.deviceresolution

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.harish.deviceresolution.databinding.ActivityMainBinding


class MainActivity : BaseActivity() {

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val dp = this.getResources().getDisplayMetrics().toString().plus("\n SCREEN TYPE :  ${getDeviceMetricsType()}")
        binding.resolution = dp
    }
}