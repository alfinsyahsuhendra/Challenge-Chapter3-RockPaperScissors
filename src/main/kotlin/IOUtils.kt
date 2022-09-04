package utils
//Control Flow
object controlFlow {
    fun suitPlayer (firstPlayer: String, secondPlayer: String) {
        when {
            firstPlayer == "gunting" && secondPlayer == "batu" -> {
                println("Pemain 2 MENANG!")
            }
            firstPlayer == "batu" && secondPlayer == "kertas" -> {
                println("Pemain 2 MENANG!")
            }
            firstPlayer == "kertas" && secondPlayer == "gunting" -> {
                println("Pemain 2 MENANG!")
            }
            firstPlayer == "batu" && secondPlayer == "gunting" -> {
                println("Pemain 1 MENANG!")
            }
            firstPlayer == "kertas" && secondPlayer == "batu" -> {
                println("Pemain 1 MENANG!")
            }
            firstPlayer == "gunting" && secondPlayer == "kertas" -> {
                println("Pemain 1 MENANG!")
            }
            else -> {
                println("DRAW!")
            }
        }
    }
}