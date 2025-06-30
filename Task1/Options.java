package Task1;

public class Options {

    private boolean conditioner;
    private boolean frontHeaters;
    private boolean backHeaters;
    private boolean climateControl;
    private boolean cruiseControl;

    public Options(boolean conditioner, boolean frontHeaters, boolean backHeaters,
                   boolean climateControl, boolean cruiseControl) {
        this.conditioner = conditioner;
        this.frontHeaters = frontHeaters;
        this.backHeaters = backHeaters;
        this.climateControl = climateControl;
        this.cruiseControl = cruiseControl;
    }

    public boolean isConditioner() {
        return conditioner;
    }

    public void setConditioner(boolean conditioner) {
        this.conditioner = conditioner;
    }

    public boolean isFrontHeaters() {
        return frontHeaters;
    }

    public void setFrontHeaters(boolean frontHeaters) {
        this.frontHeaters = frontHeaters;
    }

    public boolean isBackHeaters() {
        return backHeaters;
    }

    public void setBackHeaters(boolean backHeaters) {
        this.backHeaters = backHeaters;
    }

    public boolean isClimateControl() {
        return climateControl;
    }

    public void setClimateControl(boolean climateControl) {
        this.climateControl = climateControl;
    }

    public boolean isCruiseControl() {
        return cruiseControl;
    }

    public void setCruiseControl(boolean cruiseControl) {
        this.cruiseControl = cruiseControl;
    }

    @Override
    public String toString() {
        return "Options{" +
                "conditioner=" + conditioner +
                ", frontHeaters=" + frontHeaters +
                ", backHeaters=" + backHeaters +
                ", clivateControl=" + climateControl +
                ", creiseControl=" + cruiseControl +
                '}';
    }
}
