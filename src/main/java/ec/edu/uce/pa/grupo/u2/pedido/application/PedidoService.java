package ec.edu.uce.pa.grupo.u2.pedido.application;

import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedido.domain.model.Pedido;
import ec.edu.uce.pa.grupo.u2.pedido.domain.repository.PedidoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class PedidoService {

    @Inject
    private PedidoRepository pedidoRepository;

    public void guardar(Pedido pedido) {
        this.pedidoRepository.create(pedido);
    }

    public Optional<Pedido> bucarPorId(Integer id) {
        return this.pedidoRepository.read(id);
    }

    public Optional<Pedido> bucarPorNumero(String numero) {
        return this.pedidoRepository.readByNumber(numero);
    }

    public void actualizar(Pedido pedido) {
        this.pedidoRepository.update(pedido);
    }

    public void eliminar(Integer id) {
        this.pedidoRepository.delete(id);
    }
}
