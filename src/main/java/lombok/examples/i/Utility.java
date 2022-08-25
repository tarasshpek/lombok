package lombok.examples.i;

import lombok.experimental.UtilityClass;

import java.util.UUID;

@UtilityClass
public class Utility {
    
    public final String CONSTANT = "I'm a constant!";
    
    public String generateString() {
        return UUID.randomUUID().toString().replace("-", "");
    }
    
    public boolean isNull(Object o) {
        return o == null;
    }
    
}

class Example {
    public static void main(String[] args) {
        //Utility utility = new Utility(); ERROR
        System.out.println(Utility.CONSTANT);
        System.out.println(Utility.generateString());
        System.out.println(Utility.isNull(new Object()));
    }
}
