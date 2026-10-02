package Lab1_2;

public class Land extends RealEstate{
    public String soilType;
    public double df_road;
    public double price;
    public double appreciation;

    public Land(){

    }

    public String getSoilType() {
        return soilType;
    }

    public void setSoilType(String soilType) {
        this.soilType = soilType;
    }

    public double getDf_road() {
        return df_road;
    }

    public void setDf_road(double df_road) {
        this.df_road = df_road;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getappreciation() {
        return appreciation;
    }

    public void setappreciation(double appreciation) {
        this.appreciation = appreciation;
    }

    public double New_Land(){
        df_road = df_road * 100;
        return df_road;
    }

    public double appreciation_price(int originalPrice, float appreciationRate, int yearsPassed){
        return appreciation;
    }
}
