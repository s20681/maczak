package pl.pjatk.maczak;

public class MySimplePojo {
    private String someStringValue;

    public MySimplePojo(String someStringValue) {
        this.someStringValue = someStringValue;
    }

    public String getSomeStringValue() {
        return someStringValue;
    }

    public void setSomeStringValue(String someStringValue) {
        this.someStringValue = someStringValue;
    }

    public void sout() {
        System.out.println("someStringValue");
    }
}
