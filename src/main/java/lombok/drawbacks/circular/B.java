package lombok.drawbacks.circular;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@Setter
public class B {
    
    private A a;
    
}
