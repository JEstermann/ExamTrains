package esgi.trains;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SeatTest {

    @Test
    public void DefaultSeatShouldBeFree(){
        Seat s1 = new Seat();
        assertEquals(1,s1.isFree());
    }

    @Test
    public void SeatShouldBeBookedAfterBook(){
        Seat s1 = new Seat();
        s1.book();
        assertEquals(0,s1.isFree());
    }
}
