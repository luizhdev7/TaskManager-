package domain;

public class Task {
    private String title;
    private Boolean done;

    public Task(String title) {
        this.title = title;
        this.done = false;
    }

    public void completeTask() {
        this.done = true;
    }




}
