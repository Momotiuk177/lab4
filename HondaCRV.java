class HondaCRV extends Car {
    public HondaCRV(String model, int horsepower, double weight, int maxSpeed, String country) {
        super(model, horsepower, weight, maxSpeed, country);
        // Для прикладу, змінимо ціну для HondaCRV
        setPrice(13500.0);
    }
}