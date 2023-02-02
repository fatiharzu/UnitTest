package Day_02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test00_TestingExceptions {


    // Test ettigimiz kodun bekledigimiz exception u firlatma durumuna bakiyoruz

    @Test
    void testException(){
        String str = "Merhaba JUnit";

        assertThrows(NullPointerException.class , ()->{
            System.out.println("testException calisti");
            str.length();
        });
    }

    // baska bir ornek
    @Test
    void testException2(){
        int sayi1 = 5;
        int sayi2 = 0;

        //parent i olan runtimeexception da koysak calisir.

        assertThrows(RuntimeException.class,()->{
            System.out.println(sayi1/sayi2);
        });
    }

    @Test
    void testException3(){

        int sayi1 = 1;
        int sayi2 = 0;

        assertThrows(ArithmeticException.class, ()-> divide(sayi1,sayi2));

    }

    // testException3() de kullanilacak method
    private int divide(int sayi1 , int sayi2){
        return sayi1/sayi2;
    }

}
