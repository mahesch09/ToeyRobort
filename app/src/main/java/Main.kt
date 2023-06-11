import controller.RobotController
import view.ReadCommandFromUser


fun main(){

    val readCommandFromUser = ReadCommandFromUser()

    readCommandFromUser.greetings()

    val oneFullCommand = readCommandFromUser.readCommand()

    val robotController = RobotController(oneFullCommand)
    robotController.processCommand()

    main()
}