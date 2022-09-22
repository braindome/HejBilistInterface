public class Vehicle {
    Driver driver;
    int distance;


    public Vehicle() {

    }

    public void drive() {

    }

    public void setDriver(Driver driver) {

    }

    //Checks if vehicle subclass has a driver; if it doesn't, prints a negative response depending on the vehicle.
    //If vehicle does have q driver, removes an amount of distance to go from the respective class.
    /*@Override
    public void drive() {
        if (this.driver == null) {
            if (getClass().equals(Car.class)) {
                System.out.println("Car didn’t drive - there’s no driver!");
            } else if (getClass().equals(MilitaryTank.class)) {
                System.out.println("Tank didn’t drive - there’s no driver!");
            }
        } else {
            if (getClass().equals(Car.class)) {
                this.distance = this.distance - 10;
                System.out.println("Car drove 10 miles. " + this.distance + " miles to go!");
            } else if (getClass().equals((MilitaryTank.class))) {
                this.distance = this.distance - 5;
                System.out.println("Tank drove 5 miles. " + this.distance + " miles to go!");
            }
        }
    }*/

    //Checks legal age for each class.
    /*@Override
    public void setDriver(Driver driver) {
        if (getClass().equals(Car.class)) {
            if (driver.age < 18) {
                System.out.println("Driver not changed! " + driver.name + " is " + driver.age + " , but must be 18 or older to drive tank");
                driver = null;
            } else {
                this.driver = driver;
                System.out.println("Driver changed to " + driver.name);
            }
        } else if (getClass().equals(MilitaryTank.class)) {
            if (driver.age < 30) {
                System.out.println("Driver not changed! " + driver.name + " is " + driver.age + " , but must be 30 or older to drive tank");
                driver = null;
            } else {
                this.driver = driver;
                System.out.println("Driver changed to " + driver.name);
            }
        }

    }*/

}
