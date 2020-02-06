package util;

public class OperationPriority {

    private int priority;
    private String operation;

    public OperationPriority(int priority, String operation) {
        this.priority = priority;
        this.operation = operation;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
