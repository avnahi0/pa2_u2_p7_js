package ec.edu.uce.pa.grupo.u2.pedido.infraestructure.persistence.repository;

import ec.edu.uce.pa.grupo.u2.pedido.domain.model.DetallePedido;
import ec.edu.uce.pa.grupo.u2.pedido.domain.repository.DetallePedidoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class DetallePedidoImpl implements DetallePedidoRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(DetallePedido detallePedido) {
        this.entityManager.persist(detallePedido);
    }

    @Override
    public DetallePedido read(Integer id) {
        return this.entityManager.find(DetallePedido.class, id);
    }

    @Override
    public void update(DetallePedido detallePedido) {
        this.entityManager.merge(detallePedido);
    }

    @Override
    public void delete(Integer id) {
        DetallePedido detallePedido = this.read(id);
        this.entityManager.remove(detallePedido);
    }

}
