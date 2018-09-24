package p3Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import p3.C31;
import p3.C32;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C32Test {
    private C32 c32;

    @BeforeEach
    void before() {
        this.c32 = new C32();
    }

    @Test
    void testMA() {
        assertEquals("mA", this.c32.mA());
    }
}
