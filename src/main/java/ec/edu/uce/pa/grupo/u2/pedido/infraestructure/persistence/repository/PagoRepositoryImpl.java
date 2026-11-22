package ec.edu.uce.pa.grupo.u2.pedido.infraestructure.persistence.repository;

import ec.edu.uce.pa.grupo.u2.pedido.domain.model.Pago;
import ec.edu.uce.pa.grupo.u2.pedido.domain.repository.PagoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class PagoRepositoryImpl implements PagoRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Pago pago) {
        this.entityManager.persist(pago);
    }

    @Override
    public Pago read(Integer id) {
        return this.entityManager.find(Pago.class, id);
    }

    @Override
    public void update(Pago pago) {
        this.entityManager.merge(pago);
    }

    @Override
    public void delete(Integer id) {
        Pago pago = this.read(id);
        this.entityManager.remove(pago);
    }
}
