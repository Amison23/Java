package HappyPet;

public final class Payment {
    private final int cost;

    public Payment(int cost){
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
    
    public int makePayemnt(){
        return 0;
    }

    public static void main(String[] args){
        Payment bill = new Payment(5000);

        System.out.println(bill.cost);
    }
    
}