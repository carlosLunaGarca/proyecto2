package clases;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
public class Factura {
    private String Numero;
    private List<Producto> artuculos;
    private Integer cartidadProductos;
    private Double valorTotal=0.0;
    public Factura() {
        this.Numero=UUID.randomUUID().toString();
        this.artuculos= new ArrayList<>();
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public List<Producto> getArtuculos() {
        return artuculos;
    }

    public void addArtuculo(Producto artuculos) {
        this.artuculos.add(artuculos);
        getCartidadProductos();
    }

    public Integer getCartidadProductos() {
        return cartidadProductos=artuculos.size();
    }

    public Double getValorTotal() {
        for (Producto p:artuculos) {
            valorTotal+= p.getValorTotal();
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "Numero='" + Numero + '\'' +
                ", artuculos=" + artuculos +
                ", cartidadProductos=" + cartidadProductos +
                '}';
    }
}
