public class Monitor {
    public final String sizeOfMonitor;
    public final String typeOfMonitor;
    public final int weightOfMonitor;

    public Monitor(String sizeOfMonitor, String typeOfMonitor, int weightOfMonitor) {
        this.sizeOfMonitor = sizeOfMonitor;
        this.typeOfMonitor = typeOfMonitor;
        this.weightOfMonitor = weightOfMonitor;
    }

    public String getSizeOfMonitor() {
        return sizeOfMonitor;
    }

    public String getTypeOfMonitor() {
        return typeOfMonitor;
    }

    public int getWeightOfMonitor() {
        return weightOfMonitor;
    }

    public String toString() {
        return "\nMonitor: " +
                "Size - " + getSizeOfMonitor() + ", " +
                "Type - " + getTypeOfMonitor() + ", " +
                "Weight - " + getWeightOfMonitor();
    }
}
