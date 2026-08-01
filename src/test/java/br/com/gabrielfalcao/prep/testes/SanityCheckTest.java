package br.com.gabrielfalcao.prep.testes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SanityCheckTest {

    @Test
    public void testMath() {
        assertEquals(4, 2 + 2, "2 + 2 deveria ser 4");
    }
}
