package clases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {
    Producto p1;
    @BeforeEach
    void setUp() {
        p1= new Producto("CDs",1000.0,12);
    }
    @Test
    void getValorTotal() {
        assertEquals(12000.0,p1.getValorTotal());
    }

    @Test
    void setCantiada() {
        p1.setCantiada(-1);
        assertEquals(0,p1.getCantiada());
    }
}