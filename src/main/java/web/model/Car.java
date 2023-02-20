package web.model;

public class Car {

    private String series;
    private String model;
    private int power;

    public Car() {
    }

    public Car(String series, String model, int power) {
        this.series = series;
        this.model = model;
        this.power = power;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car {" +
                "series = '" + series + '\'' +
                ", model = '" + model + '\'' +
                ", power = " + power +
                '}';
    }
}
