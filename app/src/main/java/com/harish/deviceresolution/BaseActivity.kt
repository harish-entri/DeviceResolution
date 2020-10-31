package com.harish.deviceresolution

import android.os.Bundle
import android.os.PersistableBundle
import android.util.DisplayMetrics
import android.util.DisplayMetrics.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity(){



    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    fun getDeviceMetricsType():String{
        val density : String = "DENSITY_MEDIUM"

        val dp =getResources().getDisplayMetrics().densityDpi
        when(dp){
            DENSITY_LOW -> return " DENSITY_LOW "
            DENSITY_140 -> return " DENSITY_MEDIUM "
            DENSITY_MEDIUM -> return "DENSITY_MEDIUM"
            DENSITY_180 -> return "DENSITY_HIGH"
            DENSITY_200 -> return "DENSITY_HIGH"
            DENSITY_TV -> return "DENSITY_TV"
            DENSITY_220 -> return "DENSITY_HIGH"
            DENSITY_HIGH -> return "DENSITY_HIGH"
            DENSITY_260 -> return "DENSITY_XHIGH"
            DENSITY_280 -> return "DENSITY_XHIGH"
            DENSITY_300 -> return "DENSITY_XHIGH"
            DENSITY_XHIGH -> return "DENSITY_XHIGH"
            DENSITY_340 -> return "DENSITY_XXHIGH"
            DENSITY_360 -> return "DENSITY_XXHIGH"
            DENSITY_400 -> return "DENSITY_XXHIGH"
            DENSITY_420 -> return "DENSITY_XXHIGH"
            DENSITY_440 -> return "DENSITY_XXHIGH"
            DENSITY_450 -> return "DENSITY_XXHIGH"
            DENSITY_XXHIGH -> return "DENSITY_XXHIGH"
            DENSITY_560 -> return "DENSITY_XXXHIGH"
            DENSITY_600 -> return "DENSITY_XXXHIGH"
            DENSITY_XXXHIGH -> return "DENSITY_XXXHIGH"

        }
        return density
    }
}