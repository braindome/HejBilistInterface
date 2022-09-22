public class MilitaryTank extends Vehicle implements OnAVehicle {

    public MilitaryTank() {
        this.distance = 2000;
        System.out.println("Tank created. " + this.distance + " miles to go!");
    }


    @Override
    public void drive() {
        if (this.driver == null) {
            System.out.println("Tank didn't drive - There's no driver!");
        } else {
            this.distance = this.distance -5;
            System.out.println("Tank drove 10 miles. " + this.distance + " miles to go!");
        }
    }

    @Override
    public void setDriver(Driver driver) {
        if (driver.age < 30) {
            System.out.println("Driver not changed! " + driver.name + " is " + driver.age + " , but must be 30 or older to drive tank");
            driver = null;
        } else {
            this.driver = driver;
            System.out.println("Driver changed to " + driver.name);
        }

    }
}
