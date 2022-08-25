package lombok.examples.a;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class DataClass {
    
    private String name;
    private int number;

    public static void main(String[] args) {
        DataClass dataClass = new DataClass();
        dataClass.getName();
        dataClass.getNumber();
        dataClass.setName("name");
        dataClass.setNumber(0);
        System.out.println(dataClass.toString());
        System.out.println(dataClass.equals(new DataClass()));
    }
    
}
