package lombok.examples.j;

import lombok.experimental.FieldNameConstants;

@FieldNameConstants
public class FieldNameClass {

    private String name;
    private int number;

    public static void main(String[] args) {
        System.out.println(FieldNameClass.Fields.name);
        System.out.println(FieldNameClass.Fields.number);
    }
    
}