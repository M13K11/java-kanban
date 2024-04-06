public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        Epic epic = taskManager.createEpic("Задача №1", "Текст задачи", TaskStatus.NEW);
        Subtask subtask1 = taskManager.createSubtask(epic.getTaskId(), "Задача №2 ", "Текст зачачи", TaskStatus.IN_PROGRESS);
        Task task = taskManager.createTask("Задача №3", "Текст задачи", TaskStatus.DONE);

        System.out.println(epic);
        System.out.println(subtask1);
        System.out.println(task);
    }
}
