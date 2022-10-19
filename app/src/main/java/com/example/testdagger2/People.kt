package com.example.testdagger2



@JvmSynthetic
fun main(args: Array<String>){
   var appComponent = DaggerAppComponent.create()
    println(appComponent.nikita)
}