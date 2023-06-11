package controller

import com.mahesch.assignment.helper.Constants.DEFAULT_X
import com.mahesch.assignment.helper.Constants.DEFAULT_Y
import com.mahesch.assignment.helper.Constants.ERROR_CODE_4
import com.mahesch.assignment.helper.Constants.LEFT
import com.mahesch.assignment.helper.Constants.MOVE
import com.mahesch.assignment.helper.Constants.NORTH
import com.mahesch.assignment.helper.Constants.REPORT
import com.mahesch.assignment.helper.Constants.RIGHT
import com.mahesch.assignment.helper.Validation
import model.RobotPositionModel
import view.DisplayOutput

class RobotController(private val oneFullCommand: List<String>) {

    private var storeMove = ArrayList<String>()

    private lateinit var model: RobotPositionModel

    fun processCommand() : Boolean {

        var successCommand = true

        addCommandsInList(storeMove,oneFullCommand)

        if(Validation.validateFirstTwoSubCommands(oneFullCommand)){

            val coordinateAndFace = oneFullCommand[1].split(",")

            if(Validation.isInitialCoordinatesValid(coordinateAndFace[0].toInt(), coordinateAndFace[1].toInt())){
                model = RobotPositionModel(coordinateAndFace[0].toInt(), coordinateAndFace[1].toInt(), coordinateAndFace[2])
                moveToy(storeMove,model)
            }else{
                DisplayOutput().informUser(ERROR_CODE_4)
            }



        }else{
            announceInCorrectCommand()
            successCommand = false
        }
        return successCommand
    }

}



private fun addCommandsInList(storeMove: ArrayList<String>,oneFullCommand: List<String>){
    for(i in oneFullCommand.indices){

        if(i!=0 && i!=1)
            storeMove.add(oneFullCommand[i])

        if(oneFullCommand[i] == REPORT)
            break
    }
}


private fun moveToy(storeMove: ArrayList<String>,robotPositionModel: RobotPositionModel) {


    for (singleCommand in storeMove){

        when (singleCommand) {

            MOVE -> Move(robotPositionModel)

            LEFT -> TurnLeft(robotPositionModel)

            RIGHT -> TurnRight(robotPositionModel)

            REPORT -> Announce(robotPositionModel)

            else -> announceInCorrectCommand()
        }
    }
}

fun announceInCorrectCommand(){
   RobotPositionModel(DEFAULT_X, DEFAULT_Y, NORTH)
    DisplayOutput().informUser(1)
}


