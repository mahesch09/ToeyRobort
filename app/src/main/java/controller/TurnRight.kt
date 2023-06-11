package controller

import com.mahesch.assignment.helper.Constants.EAST
import com.mahesch.assignment.helper.Constants.INITIAL_FACE
import com.mahesch.assignment.helper.Constants.NORTH
import com.mahesch.assignment.helper.Constants.SOUTH
import com.mahesch.assignment.helper.Constants.WEST
import model.RobotPositionModel

class TurnRight(robotPositionModel: RobotPositionModel) {

    init {
        right(robotPositionModel)
    }

    private fun right(robotPositionModel: RobotPositionModel) {
        when(robotPositionModel.face){
            NORTH -> EAST
            EAST -> NORTH
            SOUTH -> EAST
            WEST -> SOUTH
            else -> INITIAL_FACE
        }.also { robotPositionModel.face = it }
    }

}