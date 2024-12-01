package Task;

public enum BaseUrls {

    URLS("https://www.w3resource.com/java-exercises/java-enum-types.php"),
    Base("www.google.com")
    ;
private String name;
BaseUrls(String name)
{
    this.name=name;
}

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println(BaseUrls.Base.getName());
        System.out.println(BaseUrls.URLS.getName());
        BaseUrls.Base.getName();
}

}