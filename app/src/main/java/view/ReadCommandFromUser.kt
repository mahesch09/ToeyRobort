package view

class ReadCommandFromUser {

    fun greetings(){
        println("Please enter your command to move Robot.")
    }

    fun readCommand(): List<String>{
        return readLine()!!.uppercase().split(" ")
    }
}
