package com.example.adomas.kttodo.store

import android.arch.lifecycle.LiveData

interface Renderer<T> {
    fun render(model: LiveData<T>)
}