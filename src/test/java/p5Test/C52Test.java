package p5Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import p3.C32;
import p5.C52;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C52Test {
    private C52 c52;

    @BeforeEach
    void before() {
        this.c52 = new C52();
    }

    @Test
    void testMA() {
        assertEquals("mA", this.c52.mA());
    }
}
