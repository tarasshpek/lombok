package lombok.examples.d;

import lombok.Builder;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

@Log
//@Log4j2
//@Slf4j
public class LogClass {
    
    private String name;
    private int number;
    
    public void myMethod() {
        log.info("Logging");
    }
    
}
