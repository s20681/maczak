package pl.pjatk.maczak;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MySecondComponent{
    public MySecondComponent() {
    }

    public void helloFromMethod(){
//        System.out.println("Hello from Second component");
    }
}