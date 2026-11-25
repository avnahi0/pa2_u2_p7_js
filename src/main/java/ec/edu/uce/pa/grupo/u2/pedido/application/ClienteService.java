package ec.edu.uce.pa.grupo.u2.pedido.application;

import ec.edu.uce.pa.grupo.u2.pedido.domain.model.Cliente;
import ec.edu.uce.pa.grupo.u2.pedido.domain.repository.ClienteReporitory;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class ClienteService {

    @Inject 
    private ClienteReporitory clienteReporitory;

    public void guardar(Cliente cliente) {
        this.clienteReporitory.create(cliente);
    }

    public Cliente buscarPorId(Integer id) {
        return this.clienteReporitory.read(id);
    }

    public void actualizar(Cliente cliente) {
        this.clienteReporitory.update(cliente);
    }

    public void eliminar(Integer id) {
        this.clienteReporitory.delete(id);
    }

}
