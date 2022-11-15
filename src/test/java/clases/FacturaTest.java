package clases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacturaTest {
    Producto p1;
    Producto p2;
    Producto p3;
    Factura factura1;

    @BeforeEach
    void setUp() {
        factura1= new Factura();
         p1= new Producto("CDs",1000.0,12);
        factura1.addArtuculo(p1);
         p2= new Producto("USBs",23345.2,5);
        factura1.addArtuculo(p2);
         p3= new Producto("Placa Madre ",230000.3,2);
        factura1.addArtuculo(p3);


    }
    @Test
    void addArtuculo() {
        assertEquals(3,factura1.getCartidadProductos());

    }

    @Test
    void getCartidadProductos() {
    assertEquals(3,factura1.getCartidadProductos());
    }

    @Test
    void getValorTotal() {
assertEquals(588726.6,factura1.getValorTotal());
    }
}