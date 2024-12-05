package com.example.examen_francisco_requena_snchez


private fun filtrar_juegos(listavideojuegos:MutableList<Videojuego>,año: Int) {
    for (i in 0.. listavideojuegos.size-1){
        if (listavideojuegos[i].ano_salida==año){
            println(listavideojuegos[i].nombre)
        }
        }
    }
private fun mapaJuegos(listavideojuegos:MutableList<Videojuego>,año: Int):Map<String,MutableList<String>>{
    var mapa :Map<String,MutableList<String>>
    mapa= mutableMapOf()
    for (i in 0..listavideojuegos.size-1){
        if (listavideojuegos[i].ano_salida==año){
            mapa=mutableMapOf(
                listavideojuegos[i].plataforma to  mutableListOf(listavideojuegos[i].nombre),
            )
        }
    }
    return mapa
}
private fun plataformas(listavideojuegos: MutableList<Videojuego>):MutableList<String>{
    var listaplataformas:MutableList<String>
    listaplataformas= mutableListOf()

    listaplataformas.add(listavideojuegos[1].plataforma)

    for (i in 0 until  listavideojuegos.size){
        if (listaplataformas[0] != listavideojuegos[i].plataforma){
            listaplataformas.add(listavideojuegos[i].plataforma)
        }

    }

    return listaplataformas
}

fun championsLeague(listaequipos:MutableList<Equipos>){
    var random 
}

fun main(){
    var juego=Videojuego("GTA","PC",2020)
    var juego2=Videojuego("TLOF","PC",2012)
    var juego3=Videojuego("RL","PC",2020)
    var juego4=Videojuego("CV","ps5",2020)
    var listasjuegos:MutableList<Videojuego>
    listasjuegos= mutableListOf()

    listasjuegos.add(juego)
    listasjuegos.add(juego2)
    listasjuegos.add(juego3)
    listasjuegos.add(juego4)
    var equipo1=Equipos("Madrid1","Madrid")
    var equipo2=Equipos("Madrid2","Madrid")
    var equipo3=Equipos("Madrid3","Madrid")
    var equipo4=Equipos("Madrid4","Madrid")
    var equipo5=Equipos("Inglaterra1","Inglaterra")
    var equipo6=Equipos("Inglaterra2","Inglaterra")
    var equipo7=Equipos("Inglaterra3","Inglaterra")
    var equipo8=Equipos("Inglaterra4","Inglaterra")
    var equipo9=Equipos("Alemania1","Alemania")
    var equipo10=Equipos("Alemania2","Alemania")
    var equipo11=Equipos("Alemania3","Alemania")
    var equipo12=Equipos("Alemania4","Alemania")
    var equipo13=Equipos("Francia1","Francia")
    var equipo14=Equipos("Francia2","Francia")
    var equipo15=Equipos("Francia3","Francia")
    var equipo16=Equipos("Francia4","Francia")
    var listaEquipos:MutableList<Equipos>
    listaEquipos= mutableListOf()
    listaEquipos.add(equipo1)
    listaEquipos.add(equipo2)
    listaEquipos.add(equipo3)
    listaEquipos.add(equipo4)
    listaEquipos.add(equipo5)
    listaEquipos.add(equipo6)
    listaEquipos.add(equipo7)
    listaEquipos.add(equipo8)
    listaEquipos.add(equipo9)
    listaEquipos.add(equipo10)
    listaEquipos.add(equipo11)
    listaEquipos.add(equipo12)
    listaEquipos.add(equipo13)
    listaEquipos.add(equipo14)
    listaEquipos.add(equipo15)
    listaEquipos.add(equipo16)
println("Ejercicio 2 ")
   filtrar_juegos(listasjuegos,2012
    )
println("Ejercicio 3 ")
   println( mapaJuegos(listasjuegos,2020))
    println("Ejercicio 4 ")
    println(plataformas(listasjuegos))


}
