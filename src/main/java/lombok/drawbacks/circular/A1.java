package lombok.drawbacks.circular;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Setter
public class A1 {
    
    private String name;
    private B1 b;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        A1 a1 = (A1) o;

        if (name != null ? !name.equals(a1.name) : a1.name != null) return false;
        return b != null ? b.equals(a1.b) : a1.b == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (b != null ? b.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "A1{" +
                "name='" + name + '\'' +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        A1 a1 = new A1();
        B1 b1 = new B1();
        a1.setName("myName");
        a1.setB(b1);
        b1.setA(a1);
        
        A1 a2 = new A1();
        B1 b2 = new B1();
        a2.setB(b2);
        a2.setName("myName");
        b2.setA(a2);

        System.out.println(a1.toString()); // StackOverflowError
        System.out.println(a1.equals(a2)); // StackOverflowError
        System.out.println(a1.hashCode()); // StackOverflowError
    }
    
}
