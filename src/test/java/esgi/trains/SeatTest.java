package esgi.trains;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class SeatTest {

    @Test
    public void DefaultSeatShouldBeFree(){
        List<Integer> ids =IntStream.rangeClosed(1, 10)
                .boxed()
                .map((n) -> {return n;}).toList();
        Seat s1 = new Seat(ids.getFirst());
        assertEquals(1,s1.isFree());
    }

    @Test
    public void SeatShouldBeBookedAfterBook(){
        List<Integer> ids =IntStream.rangeClosed(1, 10)
                .boxed()
                .toList();
        Seat s1 = new Seat(ids.get(0));
        s1.book();
        assertEquals(0,s1.isFree());
    }
}
