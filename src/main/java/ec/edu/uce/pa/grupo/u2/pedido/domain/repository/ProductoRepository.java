package ec.edu.uce.pa.grupo.u2.pedido.domain.repository;

import ec.edu.uce.pa.grupo.u2.pedido.domain.model.Producto;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public interface ProductoRepository {

    //CREATED
    public void create(Producto producto);

    //READ POR ID
    public Producto read(Integer id);

    //UPDATE
    public void update(Producto producto);

    //DELETE
    public void delete(Integer id);
}
