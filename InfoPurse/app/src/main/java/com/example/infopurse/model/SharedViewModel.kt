package com.example.infopurse.model

import android.widget.EditText
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel:ViewModel() {
    private val _namesEntered = MutableLiveData<String>("")
    val namesEntered: LiveData<String> = _namesEntered
    fun getNamesEntered(nameOfPerson: String) {
        _namesEntered.value = nameOfPerson
    }
    fun nameINullorEmpty(): Boolean {
        return _namesEntered.value.isNullOrEmpty()
    }
}