package lab.mobi.javalibrary;

public class JavaLibrary {

    private String javaValue;

    public JavaLibrary(String value) {
        this.javaValue = value;
    }

    public void processValue() {
        if (this.javaValue == null) {
            return;
        }
        this.javaValue = this.javaValue.replace("h", "Hello! ");
    }

    public String getJavaValue() {
        return this.javaValue;
    }
}
