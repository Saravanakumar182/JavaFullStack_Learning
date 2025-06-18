public class BuilderPatternTest {
    public static void main(String[] args) throws Exception {
        
        Computer gaming =new Computer.ComputerBuilder("Intel i9 13th gen")
                                    .setMemory(32)
                                    .setStorage(2048)
                                    .setgMemory(12)
                                    .build();
        
        Computer aiComputer = new Computer.ComputerBuilder("Snapdragon X")
                                            .setMemory(16)
                                            .setStorage(1024)
                                            .setgMemory(0)
                                            .build();
        Computer learnComputer = new Computer.ComputerBuilder("Intel i3 12th gen")
                                            .setMemory(8)
                                            .setStorage(512)
                                            .setgMemory(0)
                                            .build();
        Computer multiTaskComputer = new Computer.ComputerBuilder("Intel i5 12th gen")
                                            .setMemory(16)
                                            .setStorage(512)
                                            .setgMemory(0)
                                            .build();
                                            
        System.out.println(gaming);
        System.out.println(aiComputer);
        System.out.println(learnComputer);
        System.out.println(multiTaskComputer);
    }
}
