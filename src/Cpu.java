public class Cpu {
    public final int frequency;
    public final int numberOfCores;
    public final String manufacturerOfCpu;
    public final int weightOfCpu;

    public Cpu(int frequency, int numberOfCores, String manufacturerOfCpu, int weightOfCpu) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.manufacturerOfCpu = manufacturerOfCpu;
        this.weightOfCpu = weightOfCpu;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public String getManufacturerOfCpu() {
        return manufacturerOfCpu;
    }

    public int getWeightOfCpu() {
        return weightOfCpu;
    }

    public String toString() {
        return "\nCPU: " +
                "Frequency - " + getFrequency() + ", " +
                "Cores - " + getNumberOfCores() + ", " +
                "Manufacturer - " + getManufacturerOfCpu() + ", " +
                "Weight - " + getWeightOfCpu();
    }
}
