package esgi.trains;

public class Seat {
    private SeatType type;
    private Status status;
    private CarClass carClass;

    public Seat(){
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
