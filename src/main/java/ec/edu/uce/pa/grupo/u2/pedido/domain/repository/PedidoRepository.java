package ec.edu.uce.pa.grupo.u2.pedido.domain.repository;

import ec.edu.uce.pa.grupo.u2.pedido.domain.model.Pedido;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public interface PedidoRepository {

    //CREATED
    public void create(Pedido pedido);

    //READ POR ID
    public Pedido read(Integer id);

    //UPDATE
    public void update(Pedido pedido);

    //DELETE
    public void delete(Integer id);

}
