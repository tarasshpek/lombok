package lombok.examples.f;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
public class AccessorsClass {
    
    private String name;
    private int number;

    public static void main(String[] args) {
        AccessorsClass accessorsClass = new AccessorsClass();
        accessorsClass.name("myName").number(42);
    }
    
    
    
}
