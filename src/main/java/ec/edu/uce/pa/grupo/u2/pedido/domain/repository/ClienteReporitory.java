package ec.edu.uce.pa.grupo.u2.pedido.domain.repository;

import ec.edu.uce.pa.grupo.u2.pedido.domain.model.Cliente;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public interface ClienteReporitory {

    // CREATED
    public void create(Cliente cliente);

    // READ POR ID
    public Cliente read(Integer id);

    // UPDATE
    public void update(Cliente cliente);

    // DELETE
    public void delete(Integer id);

}
