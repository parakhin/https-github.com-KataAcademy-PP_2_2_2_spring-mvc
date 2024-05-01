package web.model;

public class Car {
    private String corporation;
    private String title;
    private int year;

    public Car() {
    }

    public Car(String corporation, String title, int year) {
        this.corporation = corporation;
        this.title = title;
        this.year = year;
    }

    public String getCorporation() {
        return corporation;
    }

    public void setCorporation(String corporation) {
        this.corporation = corporation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "corporation='" + corporation + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
