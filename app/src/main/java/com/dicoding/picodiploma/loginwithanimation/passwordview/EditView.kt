package com.dicoding.picodiploma.loginwithanimation.passwordview

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.widget.addTextChangedListener

class EditView(context: Context, attrs: AttributeSet) : AppCompatEditText(context, attrs) {
    init {
        setOnTextChangedListener()
    }

    private fun setOnTextChangedListener() {
        addTextChangedListener { text ->
            val errorMessage = if ((text?.length ?: 0) < 8) {
                "Password harus 8 Karakter atau lebih"
            } else {
                null
            }
            setError(errorMessage, null)
        }
    }
}