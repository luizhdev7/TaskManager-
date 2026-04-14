package domain;

public class Task {
    private String title;
    private boolean done;
    private int id;

    public Task(int id, String title) {
        this.title = title;
        this.done = false;
    }

    public void completeTask() {
        this.done = true;
    }




}
