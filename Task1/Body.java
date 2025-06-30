package Task1;

public class Body {

    private int width;
    private int length;
    private int height;
    private String color;
    private TypeGear type;

    public Body(int width, int length, int height, String color, TypeGear type) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.color = color;
        this.type = type;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TypeGear getType() {
        return type;
    }

    public void setType(TypeGear type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Body{" +
                "width=" + width +
                ", length=" + length +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", type=" + type +
                '}';
    }
}
