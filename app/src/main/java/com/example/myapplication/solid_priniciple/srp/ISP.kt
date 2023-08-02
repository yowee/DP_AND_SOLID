package com.example.myapplication.solid_priniciple.srp

class ISP {
}

interface OnClickListener1 {
    fun onClick()
}


interface OnLongClickListener {
    fun onLongClick()
}

class CustomUIComponent1 : OnClickListener1 {
    override fun onClick() {
        // handle single-click event
    }
}