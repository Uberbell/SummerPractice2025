package Task1;

class Car {

    private String name;
    private int year;
    private Engine engine;
    private Transmission transmission;
    private Body body;
    private Options options;

    public Car(String name,  int year,
               Engine engine, Transmission transmission, Body body, Options options) {
        this.name = name;

        this.year = year;
        this.engine = engine;
        this.transmission = transmission;
        this.body = body;
        this.options = options;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", body=" + body +
                ", options=" + options +
                '}';
    }
}
