package ec.edu.uce.pa.grupo.u2.pedido.domain.repository;

import ec.edu.uce.pa.grupo.u2.pedido.domain.model.Pago;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public interface PagoRepository {

    // CREATED
    public void create(Pago pago);

    // READ POR ID
    public Pago read(Integer id);

    // UPDATE
    public void update(Pago pago);

    // DELETE
    public void delete(Integer id);

}
