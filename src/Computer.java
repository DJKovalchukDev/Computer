public class Computer {

    public final String vendor;
    public final String name;
    public Cpu cpu;
    public Ram ram;
    public HardDisk hardDisk;
    public Monitor monitor;
    public Keyboard keyboard;


    public Computer(String vendor, String name, Cpu cpu, Ram ram, HardDisk hardDisk, Monitor monitor, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public int getTotalWeight() {
        return cpu.getWeightOfCpu() + ram.getWeightOfRam() + hardDisk.getWeightOfHard() + monitor.getWeightOfMonitor() + keyboard.getWeightOfKeyboard();
    }

    public void setCpu(Cpu cpu) {
        this.cpu = new Cpu(cpu.frequency, cpu.numberOfCores, cpu.manufacturerOfCpu, cpu.weightOfCpu);
    }

    /*
    public Computer setCPU(Cpu cpu) {
        return new Computer(vendor, name, new Cpu(cpu.frequency, cpu.numberOfCores, cpu.manufacturerOfCpu, cpu.weightOfCpu), ram, hardDisk, monitor, keyboard);
    }

    public Computer setRAM(Ram ram) {
        return new Computer(vendor, name, cpu, new Ram(ram.typeOfRam, ram.sizeOfRam, ram.weightOfRam), hardDisk, monitor, keyboard);
    }

    public Computer setHardDisk(HardDisk hardDisk) {
        return new Computer(vendor, name, cpu, ram, new HardDisk(hardDisk.typeOfHard, hardDisk.sizeOfHard, hardDisk.weightOfHard), monitor, keyboard);
    }

    public Computer setMonitor(Monitor monitor) {
        return new Computer(vendor, name, cpu, ram, hardDisk, new Monitor(monitor.sizeOfMonitor, monitor.typeOfMonitor, monitor.weightOfMonitor), keyboard);
    }

    public Computer setKeyboard(Keyboard keyboard) {
        return new Computer(vendor, name, cpu, ram, hardDisk, monitor, new Keyboard(keyboard.typeOfKeyboard, keyboard.illuminationOfKeyboard, keyboard.weightOfKeyboard));
    }
    */

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public String toString() {
        return "\nVendor and Name: " + getVendor() + " " + getName() + getCpu() + getRam() + getHardDisk()
                + getMonitor() + getKeyboard() + "\nTotalWeight: " + getTotalWeight();
    }
}
