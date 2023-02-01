package Day_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01_Assertions {

    //junit icinde gömülü gelen main methodu kullaniliyor.
    // Junit 5 ile beraber methodlarda public modifier zorunlulugu kalkti.

    @Test
    public void test(){



    }

    // genel olarak test isimleriyle baslar

    @Test
    public void testLength(){

        String kelime = "Merhaba Dünya"; //13 karakter
        int anlikDeger = kelime.length();
        int beklenenDeger = 13;

        assertEquals(beklenenDeger,anlikDeger);
    }

    @Test
    public void testUpperCase(){

        String anlikDeger = "Merhaba".toUpperCase();
        String beklenenDeger = "MERHABA";
  //      assertEquals(beklenenDeger,anlikDeger);
        assertEquals(beklenenDeger,anlikDeger,"Uppercase methodu uyardi");
    }

    @Test
    void testToplama(){

        int sayi1 = 10;
        int sayi2 = 5;

        int anlikDeger = Math.addExact(sayi1,sayi2);
        int beklenenDeger = 15;

        assertEquals(anlikDeger,beklenenDeger);

    }
    @Test
    void testContains(){

        assertEquals(false,"Mirac".contains("z"));

    }
}
