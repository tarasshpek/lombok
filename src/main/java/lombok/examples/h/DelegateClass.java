package lombok.examples.h;

import lombok.experimental.Delegate;

import java.util.Arrays;
import java.util.List;

public class DelegateClass {
    
    @Delegate
    private List<Integer> someList = Arrays.asList(1, 2, 3);

    @Delegate
    private String someString() {
        return "hello";
    }
    
}

class Example {
    public static void main(String[] args) {
        DelegateClass delegateClass = new DelegateClass();
        System.out.println(Arrays.toString(delegateClass.toArray()));//list
        System.out.println(delegateClass.charAt(0));//string
        System.out.println(delegateClass.size());//list
        System.out.println(delegateClass.length());//string
    }
}
