package esgi.trains;

import java.util.stream.IntStream;

public class Seat {
    private int seatId;
    private SeatType type;
    private Status status;

    public Seat(int id){
        this.seatId = id;
        this.status = Status.Free;
    }

    public int isFree(){
        if(this.status.equals(Status.Free)){
            return 1;
        }
        return 0;
    }

    public void book(){
        this.status = Status.Booked;
    }
}
