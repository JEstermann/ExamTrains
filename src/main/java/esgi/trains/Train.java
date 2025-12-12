package esgi.trains;

public class Train {
    private List<Car> cars;

    public void attach(Car car){
        cars.add(car);
    }

    public record Ticket(int carId, int seatId){

    }
}
