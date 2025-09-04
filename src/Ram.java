public class Ram {
    public final String typeOfRam;
    public final int sizeOfRam;
    public final int weightOfRam;

    public Ram(String typeOfRam, int sizeOfRam, int weightOfRam) {
        this.typeOfRam = typeOfRam;
        this.sizeOfRam = sizeOfRam;
        this.weightOfRam = weightOfRam;
    }

    public String getTypeOfRam() {
        return typeOfRam;
    }

    public int getSizeOfRam() {
        return sizeOfRam;
    }

    public int getWeightOfRam() {
        return weightOfRam;
    }

    public String toString() {
        return "\nRAM: " +
                "Type - " + getTypeOfRam() + ", " +
                "Size - " + getSizeOfRam() + ", " +
                "Weight - " + getWeightOfRam();
    }
}
