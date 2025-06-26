public class Task {
    int taskId;
    String taskName;
    String status;

    Task(int id , String name , String status){
        taskId = id;
        taskName  = name;
        this.status = status;
    }
    static class Builder {
        private int taskId;
        private String taskName;
        private String status;

        public Builder setTaskId(int taskId) {
            this.taskId = taskId;
            return this;
        }

        public Builder setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Task build() {
            return new Task(taskId, taskName, status);
        }
    }
}
