package lombok.examples.c;

import lombok.Builder;

@Builder
public class BuilderClass {
    
    private String name;
    private int number;

    public static void main(String[] args) {
        //BuilderClass builderClass = new BuilderClass(); ERROR
        BuilderClass builderClass = BuilderClass.builder()
                .name("name")        
                .number(42)
                .build();        
    }
    
    
}
