import utils.controlFlow

class rockPaperScissors (){
    private fun inputPrintHeader(){                                         //choose game suit options
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
        println("Pick one among gunting, batu, & kertas: ")
        println("Masukkan pemain 1 : ")
        println("Masukkan pemain 2 : ")
    }

    private fun pickSelection(): String {                                       //validation
        val input = readLine()?.lowercase() ?: " "
        if (input == "gunting" || input == "batu" || input == "kertas") {
            return input
        } else {
            println("You must pick one among gunting, batu, & kertas")
            return ""
        }
    }

    private fun winDecision(){                                      //win decision
        val inputFirstPlayer = pickSelection()
        val inputSecondPlayer = pickSelection()
        controlFlow.suitPlayer(inputFirstPlayer,inputSecondPlayer)
    }

    fun run (){                                                     //main function
        inputPrintHeader()
        winDecision()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            rockPaperScissors().run()
        }
    }
}