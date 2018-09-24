package p3Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import p2.C21;
import p3.C31;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C31Test {
    private C31 c31;

    @BeforeEach
    void before() {
        this.c31 = new C31();
    }

    @Test
    void testM1() {
        assertEquals("m1", this.c31.m1());
    }

    @Test
    void testM2() {
        assertEquals("m2", this.c31.m2());
    }

    @Test
    void testMB() {
        assertEquals("mB", this.c31.mB());
    }
}
