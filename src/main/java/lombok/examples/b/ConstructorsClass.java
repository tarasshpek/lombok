package lombok.examples.b;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

//@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class ConstructorsClass {

    private String name;
    private final String finalName;

    public static void main(String[] args) {
        ConstructorsClass constructorsClass1 = new ConstructorsClass("finalName");
        ConstructorsClass constructorsClass2 = new ConstructorsClass("name", "finalName");
    }
    
}
