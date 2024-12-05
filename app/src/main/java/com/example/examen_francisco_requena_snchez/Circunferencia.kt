package com.example.examen_francisco_requena_snchez

open class Circunferencia(var radio:Float) {

constructor(posicion:Array<Int>,punto_cualquier:Array<Int>): this(0f)

    fun longitud( pi:Float=3.1415f):Float{
        return 2*pi*radio
    }

    override fun toString(): String {
        return "El radio es: $radio y "
    }
}