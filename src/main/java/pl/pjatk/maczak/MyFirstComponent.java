package pl.pjatk.maczak;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyFirstComponent {
    private final String name;

    public MyFirstComponent(MySecondComponent mySecondComponent, MySimplePojo mySimplePojo, List<String> defaultData, List<String> anotherDefaultData,
                            String myCustomData) {
        this.name = "b";
    }

    public void helloFromMethod(){
//        System.out.println("Hello from first component");
    }

}
