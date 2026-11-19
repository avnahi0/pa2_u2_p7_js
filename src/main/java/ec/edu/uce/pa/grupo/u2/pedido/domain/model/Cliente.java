
package ec.edu.uce.pa.grupo.u2.pedido.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity // Esta clase es administrada por Jakarta Persistence API
@Table(name = "clientes") // Nombre de la tabla en la base de datos
public class Cliente {

    @Id
    @SequenceGenerator(name = "cliente_seq", sequenceName = "clie_seq_db", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_seq")
    @Column(name = "clie_id") // Nombre de la columna en la base de datos
    private Integer id;

    @Column(name = "clie_nombre")
    private String nombre;

    @Column(name = "clie_correo")
    private String correo;

    @Column(name = "clie_telefono")
    private String telefono;

    // GETTERS AND SETTERS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
