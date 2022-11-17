package clases;

public class Producto {
    private String Descrpcion;
    private Double valorUnidad;
    private Double valorTotal;
    private Integer cantiada;

    public Producto(String descrpcion, Double valorUnidad, Integer cantiada) {
        Descrpcion = descrpcion;
        if(valorUnidad<0.0) {
            this.valorUnidad = valorUnidad;
        }else{
            this.valorUnidad=0.0;
        }
        if(cantiada<0) {
            this.cantiada = cantiada;
        }else{
            this.cantiada=0;
        }
        getValorTotal();
    }

    public Double getValorTotal() {
        this.valorTotal=valorUnidad*cantiada;
        return valorTotal;
    }

    public String getDescrpcion() {
        return Descrpcion;
    }

    public void setDescrpcion(String descrpcion) {

        Descrpcion = descrpcion;
    }

    public Double getValorUnidad() {
        return valorUnidad;
    }

    public void setValorUnidad(Double valorUnidad) {
        if(valorUnidad<0.0) {
            this.valorUnidad = valorUnidad;
        }else{
            this.valorUnidad=0.0;
        }
    }

    public Integer getCantiada() {
        return cantiada;
    }

    public void setCantiada(Integer cantiada) {
        if(cantiada<0) {
            this.cantiada = cantiada;
        }else{
            this.cantiada=0;
        }

    }

    @Override
    public String toString() {
        return "Producto{" +
                "Descrpcion='" + Descrpcion + '\'' +
                ", valorUnidad=" + valorUnidad +
                ", valorTotal=" + valorTotal +
                ", cantiada=" + cantiada +
                '}';
    }
}
