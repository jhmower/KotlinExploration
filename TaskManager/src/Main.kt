fun createNewTask() {
    println("Task Name:")
    val Name = readln()
    println("Task Priority")
    val priority = readln()
}

fun viewTaskList(taskList:List<Task>) {
    var index: Int = 1
    for (task in taskList) {
        println("$index. ${task.taskName}")
        index += 1
    }
}

fun completeTas(incompleteTasks:List<Task>, completeTasks:List<Task>) {
    print
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val currentTasks = mutableListOf<Task>()
    var notDone: Boolean = true
    while (notDone) {
        println("Welcom to Task Manager")
        println("Please choose and option")
        println("1. View Uncompleted Tasks")
        println("2. Create new Task")
        println("3. Complete Task")
        println("4. Quit")
        var choice: String = readln()

        when (choice) {
            "1" -> createNewTask()
            "2" -> createNewTask()
        }
    }
}