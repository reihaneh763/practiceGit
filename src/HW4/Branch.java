package HW4;

public class Branch {
    private int id;
    private String city;
    private final int quality;

    Branch(int id, String city, int quality) {
        this.id = id;
        this.city = city;
        if (quality == 1 || quality == 2 || quality == 3)
            this.quality = quality;
        else {
            System.out.println("The Branch quality out of range. So we replaced it with the lowest amount of quality!");
            this.quality = 3;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getQuality() {
        return quality;
    }

    @Override
    public String toString() {
        return id + ", " + city + ", " + quality;
    }
}
