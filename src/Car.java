public class Car extends Vehicle implements OnAVehicle {

    public Car() {
        this.distance = 100;
        System.out.println("Car created. " + this.distance + " miles to go!");
    }


    @Override
    public void drive() {
        if (this.driver == null) {
            System.out.println("Car didn't drive - There's no driver!");
        } else {
            this.distance = this.distance -10;
            System.out.println("Car drove 10 miles. " + this.distance + " miles to go!");
        }
    }

    @Override
    public void setDriver(Driver driver) {
        if (driver.age < 18) {
            System.out.println("Driver not changed! " + driver.name + " is " + driver.age + " , but must be 18 or older to drive tank");
            driver = null;
        } else {
            this.driver = driver;
            System.out.println("Driver changed to " + driver.name);
        }

    }
}
