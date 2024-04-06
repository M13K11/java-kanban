public class Task {
    private final String title;
    private final String description;
    private final int taskId;
    private final TaskStatus status;

    public Task(String title, String description, int taskId, TaskStatus status) {
        this.title = title;
        this.description = description;
        this.taskId = taskId;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getTaskId() {
        return taskId;
    }

    public TaskStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", taskId=" + taskId +
                ", status=" + status +
                '}';
    }
}