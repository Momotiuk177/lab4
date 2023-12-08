class OpelVectraB extends Car {
    public OpelVectraB(String model, int horsepower, double weight, int maxSpeed, String country) {
        super(model, horsepower, weight, maxSpeed, country);
        // Для прикладу, змінимо ціну для OpelVectraB
        setPrice(4000.0);
    }
}