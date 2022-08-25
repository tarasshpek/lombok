package lombok.examples.g;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class FieldDefaultsClass {
    
    String name;
    int number;
    
}

class Example {
    public static void main(String[] args) {
        FieldDefaultsClass fieldDefaultsClass = new FieldDefaultsClass();
        //fieldDefaultsClass.name; ERROR
    }
}
