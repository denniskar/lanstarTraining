public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main main=new Main();
        main.train(6,9);
    }

    public  void train(int i, int i1){
        System.out.println(i+i1);
        Train train=new Train();
        System.out.println(train.getName());
        System.out.println(train.addAge(4,6));
    }
}