package web.Model;

public class Car {
    private String Model;
    private String Color;
    private int Series;

    public Car(String model, String color, int series) {
        Model = model;
        Color = color;
        Series = series;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getSeries() {
        return Series;
    }

    public void setSeries(int series) {
        Series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Model='" + Model + '\'' +
                ", Color='" + Color + '\'' +
                ", Series=" + Series +
                '}';
    }
}
