package controller

import com.mahesch.assignment.helper.Constants.EAST
import com.mahesch.assignment.helper.Constants.INITIAL_FACE
import com.mahesch.assignment.helper.Constants.NORTH
import com.mahesch.assignment.helper.Constants.SOUTH
import com.mahesch.assignment.helper.Constants.WEST
import model.RobotPositionModel

class TurnLeft(robotPositionModel: RobotPositionModel) {

    init {
        left(robotPositionModel)
    }

    private fun left(robotPositionModel: RobotPositionModel) {
        when (robotPositionModel.face) {
            NORTH -> WEST
            EAST -> NORTH
            SOUTH -> EAST
            WEST -> SOUTH
            else -> INITIAL_FACE
        }.also { robotPositionModel.face = it }
    }

}

