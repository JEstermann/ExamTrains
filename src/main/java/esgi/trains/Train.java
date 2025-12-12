package esgi.trains;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private List<Car> cars;

    public Train() {
        this.cars = new ArrayList<Car>();
    }

    public void attach(Car car){
        cars.add(car);
    }

    public record Ticket(int carId, int seatId){}
}
