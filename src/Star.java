public class Star {
    private String name;
    private double size;
    private double distance;
    private String type;

    public Star() {
    }

    public Star(String name, double size, double distance, String type) {
        this.name = name;
        this.size = size;
        this.distance = distance;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
