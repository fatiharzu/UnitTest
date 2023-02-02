package Day_02;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Test_PerformansTest {


    @Test
    void testPrintPerformans(){

        //int stream integer akis saglar ilk eleman ile son elemani verdik. of seconf istedigi saniyede bitiremezse failed
        assertTimeout(Duration.ofSeconds(3), ()-> IntStream.rangeClosed(1,1000000).forEach(System.out::println));

    }

    @Test
    void testPerformans(){

        assertTimeout(Duration.ofSeconds(1),
                ()-> IntStream.rangeClosed(1,50000).reduce((x,y)-> Math.addExact(x,y))
                );

    }

}
