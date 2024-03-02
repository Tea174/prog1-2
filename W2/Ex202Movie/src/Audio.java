

public enum Audio {
    PCM("PCM"),
    DOLBY("DOLBY"),
    DOLBY_HD("DOLBY_HD"),
    VHS("VHS"),
    DTS_HD("DTS_HD");

    private final String name;
    Audio(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name();
    }
}
