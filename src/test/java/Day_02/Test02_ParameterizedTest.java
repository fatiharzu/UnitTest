package Day_02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test02_ParameterizedTest {

    @Test
    void testLength() {
        assertTrue("Mirac".length()>0);
        assertTrue("Osman".length()>0);
        assertTrue("Şeyma".length()>0);
        assertTrue("Beyza".length()>0);
        assertTrue("Ömer".length()>0);
    }

    // daha kullanıslı olan parametreli test metodumuzu yazıyoruz
    @ParameterizedTest
    @ValueSource(strings = {"Mirac","Osman","Şeyma","Beyza","Ömer"})
    void testLength2(String str){
        assertTrue(str.length()>0);


    }

    @ParameterizedTest
    @CsvSource(value = {
            "Merhaba, MERHABA",
            "JAVA, Java",
            "TEST, Test"
    })
    void testUpperCase2(String str1, String str2){

        assertEquals(str1,str2.toUpperCase());
    }

    @ParameterizedTest
    @CsvSource(value ={"true, java, a", "true,junit,u","false, hello, a"})
    void testUpperCase(boolean b1, String s1, String s2){

        assertEquals(b1,s1.contains(s2));

    }





}
