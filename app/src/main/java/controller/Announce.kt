package controller

import model.RobotPositionModel
import view.DisplayOutput

class Announce(robotPositionModel: RobotPositionModel) {

    init{
        output(robotPositionModel)
    }

    private fun output(robotPositionModel: RobotPositionModel) =
        DisplayOutput().displayFinalPosition(robotPositionModel)
}