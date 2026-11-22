package ec.edu.uce.pa.grupo.u2.pedido.domain.repository;

import ec.edu.uce.pa.grupo.u2.pedido.domain.model.DetallePedido;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public interface DetallePedidoRepository {

    //CREATED
    public void create(DetallePedido detallePedido);

    //READ POR ID
    public DetallePedido read(Integer id);

    //UPDATE
    public void update(DetallePedido detallePedido);

    //DELETE
    public void delete(Integer id);
}
