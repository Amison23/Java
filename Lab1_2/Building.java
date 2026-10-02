package Lab1_2;

public class Building extends RealEstate {

    public String building_type;
    public String construction_date;
    public int no_rooms;
    public int no_floors;
    public int original_price;
    public double depreciation_rate;
    public double dimensions;
   
    public Building(){
       
    }
   
    public double finalPrice(double finalPrice){
        finalPrice = original_price*(1-getDepreciation_rate());
        return finalPrice;
       
    }

    public String getBuilding_type() {
        return building_type;
    }

    public void setBuilding_type(String building_type) {
        this.building_type = building_type;
    }

    public String getConstruction_date() {
        return construction_date;
    }

    public void setConstruction_date(String construction_date) {
        this.construction_date = construction_date;
    }

    public int getNo_rooms() {
        return no_rooms;
    }

    public void setNo_rooms(int no_rooms) {
        this.no_rooms = no_rooms;
    }

    public int getNo_floors() {
        return no_floors;
    }

    public void setNo_floors(int no_floors) {
        this.no_floors = no_floors;
    }

    public int getOriginal_price() {
        return original_price;
    }

    public void setOriginal_price(int original_price) {
        this.original_price = original_price;
    }

    public double getDepreciation_rate() {
        return depreciation_rate;
    }

    public void setDepreciation_rate(double depreciation_rate) {
        this.depreciation_rate = depreciation_rate;
    }

    @Override
    public double getDimensions() {
        return dimensions;
    }

    @Override
    public void setDimensions(double dimensions) {
        this.dimensions = dimensions;
    }
   
}

    
