package lombok.examples.e;

import lombok.SneakyThrows;
import lombok.extern.java.Log;

import java.util.concurrent.Callable;

public class SneakyThrowsClass {
    
    private String name;
    private int number;
    
    public void call1(Callable<?> callable) {
        try {
            callable.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @SneakyThrows
    public void call2(Callable<?> callable) {
        callable.call();
    }
    
    
    
}
