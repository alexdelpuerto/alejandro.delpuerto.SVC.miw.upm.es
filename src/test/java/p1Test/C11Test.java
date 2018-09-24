package p1Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import p1.C11;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C11Test {
    private C11 c11;

    @BeforeEach
    void before() {
        this.c11 = new C11();
    }

    @Test
    void testM1() {
        assertEquals("M1", this.c11.m1());
    }

    @Test
    void testM2() {
        assertEquals("m2", this.c11.m2());
    }
}
