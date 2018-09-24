package p5Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import p3.C31;
import p5.C51;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C51Test {
    private C51 c51;

    @BeforeEach
    void before() {
        this.c51 = new C51();
    }

    @Test
    void testM1() {
        assertEquals("m1", this.c51.m1());
    }

    @Test
    void testM2() {
        assertEquals("m2", this.c51.m2());
    }
}
