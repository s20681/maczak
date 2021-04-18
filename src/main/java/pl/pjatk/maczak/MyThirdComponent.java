package pl.pjatk.maczak;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyThirdComponent {
    public MyThirdComponent(ApplicationContext applicationContext, MyFirstComponent myFirstComponent, MySecondComponent mySecondComponent) {
//        System.out.println("Hello from third component");
        myFirstComponent.helloFromMethod();
        mySecondComponent.helloFromMethod();
    }
}
