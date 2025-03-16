package com.example.buttonnavigationlesson.buttom_navigation

import com.example.buttonnavigationlesson.R

sealed class BottomItem(val tittle:String,val iconId:Int,val route:String) {

     data object Screen1:BottomItem("Screen 1", R.drawable.icon,"screen_1")
     data object Screen2:BottomItem("Screen 2", R.drawable.icon,"screen_2")
     data object Screen3:BottomItem("Screen 3", R.drawable.icon,"screen_3")
     data object Screen4:BottomItem("Screen 4", R.drawable.icon,"screen_4")
}