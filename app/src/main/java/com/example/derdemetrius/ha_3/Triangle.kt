package com.example.derdemetrius.ha_3

class Triangle (var side1:Double,var side2:Double,var side3:Double) {

    var p:Double = (side1+side2+side3)/2
    fun squareTr() = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3))
    fun perinetrTr() = side1+side2+side3
}