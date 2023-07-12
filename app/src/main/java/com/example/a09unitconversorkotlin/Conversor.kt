package com.example.a09unitconversorkotlin

fun main() {

    println("Ingrese temperatura en grados Celsius (ej: 27):")
    val inputTempC = readLine()!!.toDouble()

    println("Ingrese temperatura en grados Kelvin (ej: 350):")
    val inputTempK = readLine()!!.toDouble()

    println("Ingrese temperatura en grados Fahrenheit (ej: 10):")
    val inputTempF = readLine()!!.toDouble()
    println("")
    println("")
    println("")

    // Celsius a Fahrenheit
    val tempCtoF = "%.2f".format(((9.0 / 5.0) * inputTempC) + 32.0)
    println ("$inputTempC grados Celsius son $tempCtoF grados Fahrenheit.")
    println("------------------------------------------------------------")

    // Kelvin a Celsius
    val tempKtoC = "%.2f".format(inputTempK - 273.15)
    println ("$inputTempK grados Kelvin son $tempKtoC grados Celsius.")
    println("------------------------------------------------------------")

    // Fahrenheit a Kelvin
    val tempFtoK = "%.2f".format(((5.0/9.0) * (inputTempF - 32)) + 273.15)
    println ("$inputTempF grados Fahrenheit son $tempFtoK grados Kelvin.")
    println("------------------------------------------------------------")
}
