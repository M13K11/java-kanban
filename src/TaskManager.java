import java.util.ArrayList;
import java.util.HashMap;

public class TaskManager {
    private int nextTaskId = 1;
    private final HashMap<Integer, Task> tasksMap = new HashMap<>();
    private final HashMap<Integer, ArrayList<Subtask>> subtasksMap = new HashMap<>();
    private final HashMap<Integer, Epic> epicsMap = new HashMap<>();

    public Task createTask(String title, String description, TaskStatus status) {
        Task newTask = new Task(title, description, nextTaskId, status);
        tasksMap.put(nextTaskId, newTask);
        nextTaskId++;
        return newTask;
    }

    public Subtask createSubtask(int epicId, String title, String description, TaskStatus status) {
        Subtask newSubtask = new Subtask(title, description, nextTaskId, status, epicId);
        tasksMap.put(nextTaskId, newSubtask);
        subtasksMap.computeIfAbsent(epicId, k -> new ArrayList<>()).add(newSubtask);
        nextTaskId++;
        return newSubtask;
    }

    public Epic createEpic(String title, String description, TaskStatus status) {
        Epic newEpic = new Epic(title, description, nextTaskId, status);
        tasksMap.put(nextTaskId, newEpic);
        epicsMap.put(nextTaskId, newEpic);
        nextTaskId++;
        return newEpic;
    }
}