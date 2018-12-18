package com.example.adomas.kttodo.store

import android.arch.core.util.Function
import com.example.adomas.kttodo.model.Action
import com.example.adomas.kttodo.store.Renderer


interface Store<T> {
    fun dispatch(action: Action)

    fun subscribe(renderer: Renderer<T>, func: Function<T, T> = Function { it })
}