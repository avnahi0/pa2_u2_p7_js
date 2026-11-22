package ec.edu.uce.pa.grupo.u2.pedido.infraestructure.persistence.repository;

import ec.edu.uce.pa.grupo.u2.pedido.domain.model.Envio;
import ec.edu.uce.pa.grupo.u2.pedido.domain.repository.EnvioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class EnvioRepositoryImpl implements EnvioRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void cread(Envio envio) {
        this.entityManager.persist(envio);
    }

    @Override
    public Envio read(Integer id) {
        return this.entityManager.find(Envio.class, id);
    }

    @Override
    public void update(Envio envio) {
        this.entityManager.merge(envio);
    }

    @Override
    public void delete(Integer id) {
        Envio envio = this.read(id);
        this.entityManager.remove(envio);
    }

}
