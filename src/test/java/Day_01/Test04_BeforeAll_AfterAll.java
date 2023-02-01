package Day_01;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test04_BeforeAll_AfterAll {

    @BeforeAll
    static void beforeAll(TestInfo info){

        System.out.println(info.getDisplayName()+" calisti");

    }

    @AfterAll
    static void afterAll( TestInfo info){

        System.out.println(info.getDisplayName()+" calisti");

    }

    @Test
    void testArrays( TestInfo info){

        String str = "Spring Boot ile Backend yazmak Everestin tepesine çıkmak gibi";
        int anlikDeger = str.split(" ").length;
        int beklenenDeger = 9;
        System.out.println(info.getDisplayName() + " çalıştı");
        assertEquals(beklenenDeger,anlikDeger,"uzunluklar birbirine eşit değil");

    }
}
