class Car {
    private String model;
    private int horsepower;
    private double weight;
    private int maxSpeed;
    private double price;
    private String country;

    public Car(String model, int horsepower, double weight, int maxSpeed, String country) {
        this.model = model;
        this.horsepower = horsepower;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.price = 25000.0;
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public String getCountry() {
        return country;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}