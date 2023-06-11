package controller

import com.mahesch.assignment.helper.Constants.ADD
import com.mahesch.assignment.helper.Constants.EAST
import com.mahesch.assignment.helper.Constants.MINUS
import com.mahesch.assignment.helper.Constants.NORTH
import com.mahesch.assignment.helper.Constants.SOUTH
import com.mahesch.assignment.helper.Constants.WEST
import com.mahesch.assignment.helper.Validation
import model.RobotPositionModel
import view.DisplayOutput

class Move(robotPositionModel: RobotPositionModel) {


    init { move(robotPositionModel) }

    private fun move(robotPositionModel: RobotPositionModel){

            when(robotPositionModel.face){
                NORTH -> moveYUp(robotPositionModel)
                SOUTH -> moveYDown(robotPositionModel)
                WEST ->  moveXLeft(robotPositionModel)
                EAST -> moveXRight(robotPositionModel)
            }
    }

    private fun moveYUp(robotPositionModel: RobotPositionModel){

        robotPositionModel.y += 1

        if(!(Validation.isToyStillOnBoard(robotPositionModel.x,robotPositionModel.y,robotPositionModel.face))){
            revertY(robotPositionModel, MINUS)
        }
    }

    private fun moveYDown(robotPositionModel: RobotPositionModel){

        robotPositionModel.y -= 1

        if(!(Validation.isToyStillOnBoard(robotPositionModel.x,robotPositionModel.y,robotPositionModel.face))){
            revertY(robotPositionModel, ADD)
        }
    }

    private fun moveXRight(robotPositionModel: RobotPositionModel){
        robotPositionModel.x += 1

        if(!(Validation.isToyStillOnBoard(robotPositionModel.x,robotPositionModel.y,robotPositionModel.face))){
            revertX(robotPositionModel, MINUS)
        }
    }

    private fun moveXLeft(robotPositionModel: RobotPositionModel){
        robotPositionModel.x -= 1

        if(!(Validation.isToyStillOnBoard(robotPositionModel.x,robotPositionModel.y,robotPositionModel.face))){
            revertX(robotPositionModel, ADD)
        }
    }


    private fun revertX(robotPositionModel: RobotPositionModel,operation: String){
        when(operation){
            ADD -> robotPositionModel.x += 1
            MINUS ->robotPositionModel.x -= 1
        }
        DisplayOutput().informUser(2)
    }

    private fun revertY(robotPositionModel: RobotPositionModel,operation: String){
        when(operation){
            ADD -> robotPositionModel.y += 1
            MINUS ->robotPositionModel.y -= 1
        }
        DisplayOutput().informUser(2)
    }




}