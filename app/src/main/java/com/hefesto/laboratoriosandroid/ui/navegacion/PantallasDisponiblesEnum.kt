package com.hefesto.laboratoriosandroid.ui.navegacion

enum class PantallasDisponiblesEnum constructor(private val path: String){
    PANTALLA_1("pantalla1"),
    PANTALLA_2("pantalla2"),
    PANTALLA_3("pantalla3"),
    PANTALLA_4("pantalla4"),
    ;
    fun traerNombrePantalla() = path
}