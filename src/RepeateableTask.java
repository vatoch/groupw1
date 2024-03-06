import java.time.LocalDateTime;

public class RepeateableTask extends Task{

    private Integer executeNumber;

    private LocalDateTime executionTime;

    public RepeateableTask(String name, String description, String creatorUsername,Integer executeNumber, LocalDateTime executionTime) {
        super(name, description, creatorUsername);
        this.executeNumber=executeNumber;
        this.executionTime=executionTime;
    }

    public Integer getExecuteNumber() {
        return executeNumber;
    }

    public void setExecuteNumber(Integer executeNumber) {
        this.executeNumber = executeNumber;
    }

    public LocalDateTime getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(LocalDateTime executionTime) {
        this.executionTime = executionTime;
    }

    @Override
    public String toString() {
        return super.toString() + ", executeNumber=" + executeNumber + ", executionTime=" + executionTime;
    }
}
