package Day_02;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test03_RepeatTestMultipleTime {


    @RepeatedTest(5)
    void testSubString(){

        assertEquals("Java", "Java cok guzel".substring(0,4));
        System.out.println("testSubString() calisti");

    }

    @RepeatedTest(3)
    void testRepeated(){
        assertEquals(2,Math.addExact(1,1));
    }

    Random rm = new Random();
    @RepeatedTest(5)
    @Disabled
    void TestMathAddExact(){
        int sayi = rm.nextInt(10);
        int sayi2 = rm.nextInt(10);

        assertEquals(sayi+sayi2,Math.addExact(sayi,sayi2));
        System.out.println("sayi1 : "+sayi+"sayi2 : "+sayi2);
    }
}
