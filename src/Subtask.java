public class Subtask extends Task {
    private final int epicId;

    public Subtask(String title, String description, int taskId, TaskStatus status, int epicId) {
        super(title, description, taskId, status);
        this.epicId = epicId;
    }


    @Override
    public String toString() {
        return "Subtask{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", taskId=" + getTaskId() +
                ", status=" + getStatus() +
                ", epicId=" + epicId +
                '}';
    }
}