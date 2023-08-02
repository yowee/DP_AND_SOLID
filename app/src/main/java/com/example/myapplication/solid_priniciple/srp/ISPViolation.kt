package com.example.myapplication.solid_priniciple.srp

class ISPViolation {
}

interface OnClickListener {
    fun onClick()
    fun onLongClick()
}

class CustomUIComponent : OnClickListener {
    override fun onClick() {
        // handles onClick event.
    }

    // left empty as I don't want the [CustomUIComponent] to have long-click behavior.
    override fun onLongClick() {

    }
}