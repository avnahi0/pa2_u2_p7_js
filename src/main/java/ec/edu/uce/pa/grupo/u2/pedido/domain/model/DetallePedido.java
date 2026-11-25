package ec.edu.uce.pa.grupo.u2.pedido.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "detallePedidos")
public class DetallePedido {

    @Id
    @SequenceGenerator(name = "dtllepdd_seq", sequenceName = "dtdp_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dtllepdd_seq")
    @Column(name = "dtpd_id")
    private Integer id;

    @Column(name = "dtpd_producto")
    private String producto;

    @Column(name = "dtpd_precio")
    private Double precio;

    @Column(name = "dtpd_cantidad")
    private Integer cantidad;

    // GETTERS AND SETTERS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "DetallePedido [id=" + id + ", producto=" + producto + ", precio=" + precio + ", cantidad=" + cantidad
                + "]";
    }

}
