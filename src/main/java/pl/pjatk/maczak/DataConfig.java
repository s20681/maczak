package pl.pjatk.maczak;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataConfig {

    private static String myValue;

    @Value("${default.property: Nothing}")
    public void setValue(String value) {
        myValue = value;
        System.out.println("myValue is now "+ myValue);
    }

    @Bean
    public MySimplePojo mySimplePojo(){
        return new MySimplePojo("some val");
    }

    @Bean
    public List<String> defaultData(){
        return List.of("5", "4", "3", "2", "1");
    }

    @Bean
    public List<String> anotherDefaultData(){
        return List.of("1", "2", "3", "4", "5");
    }

    @Bean
    public String myCustomData(@Value("${my.custom.property: True}") String valueFromProperties){
//        System.out.println("My custom value: "+ valueFromProperties);
        return valueFromProperties;
    }

    @Bean
    @Conditional(YamlConditioner.class)
    public void initiateIfTrue(){
        System.out.println("The property is True! BEAN INITIATED!");
    }

    @Bean
    @ConditionalOnMissingBean(name = "initiateIfTrue")
    public void initiateIfFalse(){
        System.out.println("The property is not true... ANOTHER BEAN INITIATED.");
    }



}
