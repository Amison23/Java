package Lab1_2;

public class Owner_Test {
    double Totalprice;

    public Owner_Test(){


    }
    public void getRole(){
        
    }
    public double calculate_cost(double Totalprice, float size, String role){
        if(role == "coorporate"){
            Totalprice = (size * 2392) + 219892.23; 
        }else{
            Totalprice = (size * 2392);
        }
        return Totalprice;
    }
    public double calculate_cost(){
        return 0;
    }

}
