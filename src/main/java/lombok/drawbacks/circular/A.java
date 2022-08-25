package lombok.drawbacks.circular;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@Setter
public class A {
    
    private String name;
    private B b;

    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        a1.setName("myName");
        a1.setB(b1);
        b1.setA(a1);
        
        A a2 = new A();
        B b2 = new B();
        a2.setB(b2);
        a2.setName("myName");
        b2.setA(a2);

        System.out.println(a1.toString()); // StackOverflowError
        System.out.println(a1.equals(a2)); // StackOverflowError
        System.out.println(a1.hashCode()); // StackOverflowError
    }
    
}
