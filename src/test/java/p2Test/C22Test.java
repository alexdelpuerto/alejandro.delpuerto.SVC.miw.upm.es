package p2Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import p2.C21;
import p2.C22;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C22Test {
    private C22 c22;

    @BeforeEach
    void before() {
        this.c22 = new C22();
    }

    @Test
    void testMA() {
        assertEquals("mA", this.c22.mA());
    }
}
