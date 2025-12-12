package esgi.trains;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


class CarTest {

    @Test
    void shouldCreateWithValideArgs() {
        Seat[] seats = new Seat[10];
        Car car = new Car(2, CarClass.First, seats);
        assertThat(car).isNotNull();
    }

    @Test
    void shouldThrowExceptionForInvalidCarNumberHigh() {
        Seat[] seats = new Seat[10];
        assertThatThrownBy(() -> new Car(5, CarClass.First, seats))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void toStringShouldReturnExpectedFormat() {
        Seat[] seats = new Seat[10];
        Car car = new Car(3, CarClass.Second, seats);
        assertThat(car.toString()).isEqualTo("Voiture 3/siège SECOND");
    }
}