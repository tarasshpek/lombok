package lombok.drawbacks.circular;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Setter
public class B1 {
    
    private A1 a;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        B1 b1 = (B1) o;

        return a != null ? a.equals(b1.a) : b1.a == null;
    }

    @Override
    public int hashCode() {
        return a != null ? a.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "B1{" +
                "a=" + a +
                '}';
    }
}
