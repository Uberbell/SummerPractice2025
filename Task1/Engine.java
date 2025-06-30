package Task1;

public class Engine  {

    private int cylindersCount;
    private int power;
    private CylinderArrangement cylinderArrangement;
    private float volume;
    private Material material;

    public Engine(int cylindersCount, int power, float volume, Material material,
                  CylinderArrangement cylinderArrangement ) {
        this.cylindersCount = cylindersCount;
        this.power = power;
        this.volume = volume;
        this.material = material;
        this.cylinderArrangement = cylinderArrangement;
    }

    public int getCylindersCount() {
        return cylindersCount;
    }

    public void setCylindersCount(int cylindersCount) {
        this.cylindersCount = cylindersCount;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public CylinderArrangement getCylinderArrangement() {
        return cylinderArrangement;
    }

    public void setCylinderArrangement(CylinderArrangement cylinderArrangement) {
        this.cylinderArrangement = cylinderArrangement;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cylindersCount=" + cylindersCount +
                ", power=" + power +
                ", cylinderArrangement=" + cylinderArrangement +
                ", volume=" + volume +
                ", material=" + material +
                '}';
    }
}
