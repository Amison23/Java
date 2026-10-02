package HappyPet;

public final class Operation {
    private final int surgeryNo;

    public Operation(int surgeryNo) {
        this.surgeryNo = surgeryNo;
    }

    public int getSurgeryNo() {
        return surgeryNo;
    }

    public void giveTreatment() {

    }

    public static void main(String[] args) {
        Operation procedure = new Operation(116549);

        System.out.println(procedure.surgeryNo);
    }
}
