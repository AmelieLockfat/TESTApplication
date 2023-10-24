package com.example.testapplication

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow


class viewmodel : ViewModel() {
    var click =   MutableStateFlow(false)


    fun toggleClick() {
        click.value = !click.value
    }
}
