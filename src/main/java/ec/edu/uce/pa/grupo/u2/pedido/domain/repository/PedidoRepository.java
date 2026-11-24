package ec.edu.uce.pa.grupo.u2.pedido.domain.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedido.domain.model.Pedido;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public interface PedidoRepository {

    //CREATED
    public void create(Pedido pedido);

    //READ POR ID
    public Optional<Pedido> read(Integer id);

    //READ POR ID
    public Optional<Pedido> readByNumber(String numero);
    
    //READ POR ID
    public List<Pedido> readAll(Integer id);

    //UPDATE
    public void update(Pedido pedido);

    //DELETE
    public void delete(Integer id);

}
