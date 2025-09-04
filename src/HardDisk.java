public class HardDisk {
    public final String typeOfHard;
    public final int sizeOfHard;
    public final int weightOfHard;

    public HardDisk(String typeOfHard, int sizeOfHard, int weightOfHard) {
        this.typeOfHard = typeOfHard;
        this.sizeOfHard = sizeOfHard;
        this.weightOfHard = weightOfHard;
    }

    public String getTypeOfHard() {
        return typeOfHard;
    }

    public int getSizeOfHard() {
        return sizeOfHard;
    }

    public int getWeightOfHard() {
        return weightOfHard;
    }

    public String toString() {
        return "\nHard Disk: " +
                "Type - " + getTypeOfHard() + ", " +
                "Size - " + getSizeOfHard() + ", " +
                "Weight - " + getWeightOfHard();
    }
}
