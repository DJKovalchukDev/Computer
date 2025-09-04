public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer("APPLE", "Macbook Air",
                new Cpu(3100, 7, "Apple M-series", 4),
                new Ram("unified memory LP-DDR4", 16, 10),
                new HardDisk("SSD", 256, 100),
                new Monitor("13.3 ins.", "IPS", 200),
                new Keyboard("Scissor-switch", true, 120));


        //computer = computer.setCPU(new Cpu(3200, 8, "Apple M1", 5));
        //computer = computer.setRAM(new Ram("unified memory DDR4", 16, 11));

        computer.setCpu(new Cpu(3200, 8, "Apple M2-series", 5));

        System.out.println(computer);
        computer.getTotalWeight();


        Computer computer1 = new Computer("ACER", "Aspire",
                new Cpu(2500, 1, "Intel Core i3", 43),
                new Ram("DDR3", 32, 17),
                new HardDisk("HDD", 512, 500),
                new Monitor("15.6 ins.", "VA", 1500),
                new Keyboard("Traditional", false, 150));


        //computer1 = computer1.setCPU(new Cpu(3300, 2, "Intel Core i5", 45));
        //computer1 = computer1.setRAM(new Ram("DDR3", 32, 18));

        System.out.println(computer1);
        computer1.getTotalWeight();

    }
}
