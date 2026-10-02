package CAT1_2;

public class Supplier {
    public String Supplies;
    public String Supply_rate;
    public String Supply_item;

    public int termly_supply_code;

    public Supplier(){

    }

    // GETTERS
    public String getSuppliers() {
        return Supplies;
    }
    
    public String getSupply_rate() {
        return Supply_rate;
    }

    public String getSupply_item() {
        return Supply_item;
    }
    
    public int getTermly_supply_code() {
        return termly_supply_code;
    }

    // SETTERS
    public void setSuppliers(String Supplies) {
        this.Supplies = Supplies;
    }

    public void setSupply_rate(String supply_rate) {
        this.Supply_rate = supply_rate;
    }

    public void setSupply_item(String supply_item) {
        this.Supply_item = supply_item;
    }

    public void setTermly_supply_code(int termly_supply_code) {
        this.termly_supply_code = termly_supply_code;
    }

    // Other methods
    

    public static void main(String[] args) {
        
    }
    
}
