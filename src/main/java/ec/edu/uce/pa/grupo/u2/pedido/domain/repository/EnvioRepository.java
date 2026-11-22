package ec.edu.uce.pa.grupo.u2.pedido.domain.repository;

import ec.edu.uce.pa.grupo.u2.pedido.domain.model.Envio;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public interface EnvioRepository {

    // CREATED
    public void cread(Envio envio);

    // READ POR ID
    public Envio read(Integer id);

    // UPDATE
    public void update(Envio envio);

    // DELETE
    public void delete(Integer id);

}
