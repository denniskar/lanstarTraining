public class BCar {
    //instance variables

    private String make;
    private String model;
    private double price;
    private int year;
    
    
    //car constructor
public BCar(String make, String model, double price, int year){
    this.make=make;
    this.model=model;
    this.price=price;
    this.year=year;
}

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void printDetails(){
        System.out.println("make " + make + "model " + model + "price " + price + "year " + year);
    }
    public void discount(double perDiscount){
    double amount=price*perDiscount/100.00;
    price -=amount;

    }
}
