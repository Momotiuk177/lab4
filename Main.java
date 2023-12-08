public class Main {
    public static void main(String[] args) {
        VolkswagenPasatB7 pasat = new VolkswagenPasatB7("Passat B7", 150, 1400.5, 220, "Німеччина");
        OpelVectraB opel = new OpelVectraB("VectraB", 110, 1650.2, 190, "Німеччина");
        HondaCRV honda = new HondaCRV("CRV", 160, 1765.4, 200, "Японія");

        Car fastestCar = findFastestCar(pasat, opel, honda);
        System.out.println(fastestCar.getModel() + " має найвищу максимальну швидкість: " + fastestCar.getMaxSpeed() + " км/год");

        Car mostExpensiveCar = findMostExpensiveCar(pasat, opel, honda);
        System.out.println(mostExpensiveCar.getModel() + " є найдорожчою машиною. Ціна: " + mostExpensiveCar.getPrice() + " $");

        System.out.println("Країна виробника " + pasat.getModel() + ": " + pasat.getCountry());
        System.out.println("Країна виробника " + opel.getModel() + ": " + opel.getCountry());
        System.out.println("Країна виробника " + honda.getModel() + ": " + honda.getCountry());
    }

    private static Car findFastestCar(Car car1, Car car2, Car car3) {
        int maxSpeed1 = car1.getMaxSpeed();
        int maxSpeed2 = car2.getMaxSpeed();
        int maxSpeed3 = car3.getMaxSpeed();

        if (maxSpeed1 > maxSpeed2 && maxSpeed1 > maxSpeed3) {
            return car1;
        } else if (maxSpeed2 > maxSpeed1 && maxSpeed2 > maxSpeed3) {
            return car2;
        } else {
            return car3;
        }
    }

    private static Car findMostExpensiveCar(Car car1, Car car2, Car car3) {
        double price1 = car1.getPrice();
        double price2 = car2.getPrice();
        double price3 = car3.getPrice();

        if (price1 > price2 && price1 > price3) {
            return car1;
        } else if (price2 > price1 && price2 > price3) {
            return car2;
        } else {
            return car3;
        }
    }
}
