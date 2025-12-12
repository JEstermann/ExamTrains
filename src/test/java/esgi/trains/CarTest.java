package esgi.trains;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


class CarTest {

    @Test
    void shouldCreateWithValideArgs() {
        List<Seat> seats = new ArrayList<Seat>();
        Car car = new Car(2, CarClass.First, seats);
        assertThat(car).isNotNull();
    }

    @Test
    void shouldThrowExceptionForInvalidCarNumberHigh() {
        List<Seat> seats = new ArrayList<Seat>();
        assertThatThrownBy(() -> new Car(5, CarClass.First, seats))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void toStringShouldReturnExpectedFormat() {
        List<Seat> seats = new ArrayList<Seat>();
        Car car = new Car(3, CarClass.Second, seats);
        assertThat(car.toString()).isEqualTo("Voiture 3/siège SECOND");
    }
}