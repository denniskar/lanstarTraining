public class Train {

    private  int age;
    private int idNumber;
    private String name;
    //inboxing,outboxing
    //getter and setter;
    public int addAge(int age1,int ag21){
        return  age1*ag21;
    }

    public Train() {
    }

    public Train(int age, int idNumber, String name) {
        this.age = age;
        this.idNumber = idNumber;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
