# ToeyRobort
Assignment for interview

RUN THE MAIN.KT FILE .
OUTPUT WILL BE ON CONSOLE.


Assumptions:
1.The code is intended to control the movement of a toy robot on a grid.
2. The Grid Size is 5X5 ( can be changed through code, means its not static)
3. The user inputs commands through the console.
4. The commands consist of a combination of valid instructions (MOVE, LEFT, RIGHT, REPORT) and coordinates for placing the robot on the grid.
5. The initial position of the robot is (0, 0) dfault facing direction of NORTH.  
6. The grid is assumed to have a maximum size defined by the Constants.X_LIMIT and Constants.Y_LIMIT values.
7. The code will be executed in a Kotlin environment that supports console input and output.
8. As per instructions, GUI or any hardware device/Emulator is not required ro run it successfully.
9. No modification or addition required in dependencies file.
10. Selected architecture is MVC , because in a given problem statement MVVM can be more complex and lenghty for this problem statment 
and since there is no UI , it removes the partial objective of Viewmodel and its advantages. 
11. MVC, in this case makes problem statement more readable and concise and easy to understand while implementing.
12. The Robot need REPORT command mandatorily to display Movement. 
13. REPORT command is taken as terminating command for one whole movement.
14. As per instructions, Robot ignores the move when its falling from the Grid but caters the direction movement.
15. One can Main.kt and he is good to go.
16. User dont need to consider case of strings like upper or lower , they have been handled.
17. If any spelling mistake or no space between two command then it is considered as incorrect input.


Constraints:

1.The code is designed to operate within the constraints of a single-threaded execution model.
2. The input commands are assumed to be valid and adhere to the specified command format.
3. The code assumes that the robot cannot move beyond the boundaries of the grid.
4. The implementation is focused on the core functionality of the toy robot movement and does not include additional features like obstacle detection, user interface, or persistence.

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
