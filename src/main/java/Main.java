import clases.Factura;
import clases.Producto;

public class Main {
    public static void main(String[] args) {
        Factura factura1= new Factura();
        Producto p1= new Producto("CDs",1000.0,12);
        factura1.addArtuculo(p1);
        System.out.println(factura1);
        Producto p2= new Producto("USBs",23345.2,5);
        factura1.addArtuculo(p2);
        System.out.println(factura1);
        Producto p3= new Producto("Placa Madre ",230000.3,2);
        factura1.addArtuculo(p3);
        System.out.println(factura1);
        Producto p4= new Producto("Producto negativo",-100.0,-1);
        factura1.addArtuculo(p4);
        System.out.println(factura1);

        System.out.println("valor Total factura----->>"+factura1.getValorTotal());

    }
}
