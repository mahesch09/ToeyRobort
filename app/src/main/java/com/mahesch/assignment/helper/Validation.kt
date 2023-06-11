package com.mahesch.assignment.helper

import com.mahesch.assignment.helper.Constants.DEFAULT_X
import com.mahesch.assignment.helper.Constants.DEFAULT_Y
import com.mahesch.assignment.helper.Constants.EAST
import com.mahesch.assignment.helper.Constants.X_LIMIT
import com.mahesch.assignment.helper.Constants.Y_LIMIT
import com.mahesch.assignment.helper.Constants.NORTH
import com.mahesch.assignment.helper.Constants.PLACE
import com.mahesch.assignment.helper.Constants.SOUTH
import com.mahesch.assignment.helper.Constants.WEST

class Validation {

    companion object{
        private fun isValidInt(inputCoordinates: String): Int?{
            return inputCoordinates.toIntOrNull()
        }

         private fun isValidFace(inputFace: String) : Boolean =
             inputFace in listOf(EAST, WEST, NORTH, SOUTH)

        fun isToyStillOnBoard(currentPosition_x: Int, currentPosition_y: Int, currentFace: String): Boolean {
            return (currentPosition_x in DEFAULT_X..X_LIMIT
                    && currentPosition_y in DEFAULT_Y..Y_LIMIT
                    && isValidFace(currentFace))
        }

        fun isInitialCoordinatesValid(currentPosition_x: Int,currentPosition_y: Int): Boolean{
            return (currentPosition_x >= DEFAULT_X && currentPosition_y >= DEFAULT_Y)
        }

        fun validateFirstTwoSubCommands(oneWholeCommand: List<String>) : Boolean{

            if(oneWholeCommand[0] != PLACE){
                return false
            }

            val initialCoordinatesAndFace = oneWholeCommand[1].split(",")

            return if(initialCoordinatesAndFace.size==3){

                ((isValidInt(initialCoordinatesAndFace[0])) != null) && ((isValidInt(initialCoordinatesAndFace[1]))!= null) && isValidFace(initialCoordinatesAndFace[2])
            }
            else
            {
                false
            }
        }
    }


}

