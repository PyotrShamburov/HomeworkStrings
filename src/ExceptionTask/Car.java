package ExceptionTask;

import java.util.Random;

public class Car {
    private String brand;
    private int maxSpeed;
    private int price;

    public Car(String brand, int maxSpeed, int price) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void carStart(){

        Random random = new Random();
        int number = random.nextInt(21);
        System.out.println(number);
        try {
            if (number % 2 == 0) {
                throw new MyException("Problem with starter!");
            }
            System.out.println("Car "+getBrand()+" has been successfully started! ");
        }
        catch (MyException e){
            System.out.println("Car "+getBrand()+" doesn't start, because "+e);
            carStart();
        }
    }
}
