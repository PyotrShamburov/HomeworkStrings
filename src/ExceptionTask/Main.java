package ExceptionTask;

public class Main {
    public static void main(String[] args) throws MyException {
        Car car = new Car();
        car.setBrand("BMW");
        car.setMaxSpeed(210);
        car.setPrice(6000);
        car.carStart();

        Car car1 = new Car("Toyota",220,8000);
        car1.carStart();

        Car car2 = new Car("Mercedes",230,9000);
        car2.carStart();

    }
}
