package com.bitinovus.tripapp.presentation.viewmodels.navigationviewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class NavigationViewmodel : ViewModel() {

    private val _isScrollable = MutableStateFlow(false)
    val isScrollable: StateFlow<Boolean> = _isScrollable.asStateFlow()

    fun hideBottomNavigation() {
        _isScrollable.value = true
    }

    fun displayBottomNavigation() {
        _isScrollable.value = false
    }

}