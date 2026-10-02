class CarClass{
    public double speedLimit(){
        return 100.5;
    }
}
class Ford extends CarClass{
    public double speedLimit(){
        return 150.5;
    }
    public static void main(String[] args){
        CarClass obj = new Ford();
        double num = obj.speedLimit();
        System.out.println("Speed Limit is: " + num);
    }
}