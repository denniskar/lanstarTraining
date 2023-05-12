import java.util.*;

public class SetValues {
    private  static  Age age;


    public static void main(String[] args) {
        SetValues setValues=new SetValues();
        setValues.setValues();
    }
    public void setValues(){
        Train train=new Train(10,673637,"peter");
//        train.setAge(20);
//        train.setName("john");
//        train.setIdNumber(12342332);

         //java collections
        //Arraylist [2,7,8,9,9]
        //set [5,86,8]
        //map  [key,value]
        //treeMAP      {"name":67
        // }
        //array
        //streams

        String [] names={"peter","joan","silas"};
        List<String>namess=new ArrayList<>(Arrays.asList(names));
        namess.add("rr");
        System.out.println(namess);

        System.out.println(train.getName());

        //Set<String>people=new HashSet<>();
        namess.add("Dennis");
        namess.add("Dennis");
        System.out.println(namess);


        System.out.println(age.sumAge(2,7));

    }




}
