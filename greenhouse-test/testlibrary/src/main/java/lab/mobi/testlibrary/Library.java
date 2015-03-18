package lab.mobi.testlibrary;

public class Library {

    private String value;

    public Library() {
        this.value = "default value";
    }

    public Library(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}