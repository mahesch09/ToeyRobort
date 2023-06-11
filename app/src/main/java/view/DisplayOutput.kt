package view

import com.mahesch.assignment.helper.Constants.ERROR_CODE_1
import com.mahesch.assignment.helper.Constants.ERROR_CODE_1_MSG
import com.mahesch.assignment.helper.Constants.ERROR_CODE_2
import com.mahesch.assignment.helper.Constants.ERROR_CODE_2_MSG
import com.mahesch.assignment.helper.Constants.ERROR_CODE_3
import com.mahesch.assignment.helper.Constants.ERROR_CODE_3_MSG
import com.mahesch.assignment.helper.Constants.ERROR_CODE_4
import com.mahesch.assignment.helper.Constants.ERROR_CODE_4_MSG
import com.mahesch.assignment.helper.Constants.GENERIC_ERROR_MSG
import com.mahesch.assignment.helper.Constants.NORTH
import model.RobotPositionModel
import kotlin.io.println as println1

class DisplayOutput {

    fun displayFinalPosition(robotPositionModel: RobotPositionModel){

        println1(message = "OUTPUT : ${robotPositionModel.x},${robotPositionModel.y},${robotPositionModel.face}")

        robotPositionModel.x = 0
        robotPositionModel.y = 0
        robotPositionModel.face = NORTH
    }

    fun informUser(errorCode: Int){

        val message = when(errorCode){
            ERROR_CODE_1 -> ERROR_CODE_1_MSG
            ERROR_CODE_2 -> ERROR_CODE_2_MSG
            ERROR_CODE_3 -> ERROR_CODE_3_MSG
            ERROR_CODE_4 -> ERROR_CODE_4_MSG
            else -> { GENERIC_ERROR_MSG }
        }

        println1(message)
    }
}