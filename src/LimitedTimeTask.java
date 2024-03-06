import java.time.LocalDateTime;

public class LimitedTimeTask extends Task{

    private LocalDateTime deadline;

    public LimitedTimeTask(String name, String description, String creatorUsername,LocalDateTime deadline) {
        super(name, description, creatorUsername);
        this.deadline=deadline;

    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return super.toString() + ",Deadline:" + deadline;
    }
}
