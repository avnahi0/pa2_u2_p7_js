package ec.edu.uce.pa.grupo.u2.pedido.application;

import ec.edu.uce.pa.grupo.u2.pedido.domain.model.Envio;
import ec.edu.uce.pa.grupo.u2.pedido.domain.repository.EnvioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class EnvioService {

    @Inject
    private EnvioRepository envioRepository;

    public void guardar(Envio envio) {
        this.envioRepository.cread(envio);
    }

    public Envio buscarPorId(Integer id) {
        return this.envioRepository.read(id);
    }

    public void actualizar(Envio envio) {
        this.envioRepository.update(envio);
    }

    public void eliminar(Integer id) {
        this.envioRepository.delete(id);
    }
}
