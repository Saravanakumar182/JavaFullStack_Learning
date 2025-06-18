public class Computer {
    String CPU;
    int memory;
    int storage;
    int gMemory;
    
    private Computer(ComputerBuilder builder){
        this.CPU = builder.CPU;
        this.memory = builder.memory;
        this.gMemory = builder.gMemory;
        this.storage = builder.storage;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", memory=" + memory + ", storage=" + storage + ", gMemory=" + gMemory + "]";
    }

    static class ComputerBuilder{
        private String CPU;
        private int memory;
        private int storage;
        private int gMemory;
        public ComputerBuilder(String CPU) {
            this.CPU = CPU;
        }
        public ComputerBuilder setMemory(int memory) {
            this.memory = memory;
            return this;
        }
        public ComputerBuilder setStorage(int storage) {
            this.storage = storage;

            return this;

        }
        public ComputerBuilder setgMemory(int gMemory) {
            this.gMemory = gMemory;

            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }
}
