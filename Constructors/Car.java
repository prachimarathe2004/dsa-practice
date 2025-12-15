class Car {
    String brand;

    Car() {               // default
        brand = "Unknown";
    }

    Car(String brand) {   // parameterized
        this.brand = brand;
    }
      public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Honda");

        System.out.println(c1.brand);
        System.out.println(c2.brand);
    }
}

