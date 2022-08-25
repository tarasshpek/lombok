package lombok.examples.a;

import lombok.Data;

@Data
public class DataClass2 {
    
    private String name;
    private int number;

    public static void main(String[] args) {
        DataClass2 myClass = new DataClass2();
        myClass.getName();
        myClass.getNumber();
        myClass.setName("name");
        myClass.setNumber(0);
        System.out.println(myClass.toString());
        System.out.println(myClass.equals(new DataClass2()));
    }
    
}
