package HW2;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;


public class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @Nested
    class TestCasesWithCar {

        @BeforeEach
        void prepareData() {
            car = new Car("Toyota", "Lexus LC 500", 2018);
        }

        @Test
        void carIsInstanceOfVehicleTest() {
            assertThat(car).isInstanceOf(Vehicle.class);
        }
        @Test
        void carObjectHasFourWheelsTest() {
            assertThat(car.getNumWheels()).isEqualTo(4);
        }
        @Test
        void carCheckTestDriveSpeedTest() {
            car.testDrive();
            assertThat(car.getSpeed()).isEqualTo(60);
        }
        @Test
        void carCheckParkModeSpeedTest() {
            car.testDrive();
            car.park();
            assertThat(car.getSpeed()).isEqualTo(0);
        }
    }

    @Nested
    class TestCasesWithMotorcycle {

        @BeforeEach
        void prepareData() {
            motorcycle = new Motorcycle("Suzuki", "V-Strom 650 ABS", 2017);
        }

        @Test
        void motorcycleObjectHasTwoWheelsTest() {
            assertThat(motorcycle.getNumWheels()).isEqualTo(2);
        }
        @Test
        void motorcycleCheckTestDriveSpeedTest() {
            motorcycle.testDrive();
            assertThat(motorcycle.getSpeed()).isEqualTo(75);
        }
        @Test
        void motorcycleCheckParkModeSpeedTest() {
            motorcycle.testDrive();
            motorcycle.park();
            assertThat(motorcycle.getSpeed()).isEqualTo(0);
        }
    }
}