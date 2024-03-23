package be.kdg.paint.model;

public enum Size {
    SMALL(10), MEDIUM(40), LARGE(70);

    private final int pixel;

    Size(int size) {
        this.pixel = size;
    }

    public int getPixel() {
        return pixel;
    }

    @Override
    public String toString(){
        return String.format(name());
    }
}
