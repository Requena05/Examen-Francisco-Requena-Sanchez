package com.example.examen_francisco_requena_snchez

class Circulo(var color:String): Circunferencia(0f) {
    constructor(centro:Array<Int>, punto_cualquiera:Array<Int>): this("")
    fun area(){

    }

    override fun toString(): String {
        return "color del circulo $color , su centro"
    }
}