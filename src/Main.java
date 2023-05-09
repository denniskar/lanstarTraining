

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main main=new Main();
        main.train(6,9);
        RCar car1 = new RCar("Toyota", "Camry", 25000.0, 2020);
       RCar car2 = new RCar("Ford", "Mustang", 30000.0, 2019);
       RCar car3 = new RCar("Chevrolet", "Corvette", 70000.0, 2021);

        car1.printDetails();
        car2.printDetails();
        car3.printDetails();

        System.out.println("Discounting the price of the Chevrolet Corvette by 10%...");
        car3.discount(10.0);
        car3.printDetails();
    }

    public  void train(int i, int i1){
        System.out.println(i+i1);
        Train train=new Train();
        System.out.println(train.getName());
        System.out.println(train.addAge(4,6));
    }
}