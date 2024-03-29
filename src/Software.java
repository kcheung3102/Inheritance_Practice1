public class Software extends Product {

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public final String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public final String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    @Override
    final String toString() {
        return "Programmer:         " + programmer + "\n" +
                "Platform:          " + platform + "\n"  +
                "OS:                " + os;
    }

}
