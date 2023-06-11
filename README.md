# ToeyRobort
Assignment for interview

Test Cases 
Valid command:
Input: "PLACE 1,2,NORTH MOVE REPORT"
Expected output: "1,3,NORTH"

Invalid command:
Input: "PLACE 1,2,NORTH JUMP REPORT"
Expected output: "Please read the manual to command robot in correct order"

Invalid initial coordinates:
Input: "PLACE A,2,NORTH MOVE REPORT"
Expected output: "Please read the manual to command robot in correct order"

Invalid face direction:
Input: "PLACE 1,2,UP MOVE REPORT"
Expected output: "Please read the manual to command robot in correct order"

Moving outside the board limits:
Input: "PLACE 4,4,NORTH MOVE MOVE MOVE MOVE REPORT"
Expected output: "4,4,NORTH"

Valid commands with multiple movements and turns:
Input: "PLACE 0,0,NORTH MOVE RIGHT MOVE REPORT"
Expected output: "1,1,EAST"

Valid command with reporting:
Input: "PLACE 2,2,EAST MOVE REPORT"
Expected output: "3,2,EAST"
