package ec.edu.uce.pa.grupo.u2.pedido.application;

import ec.edu.uce.pa.grupo.u2.pedido.domain.model.DetallePedido;
import ec.edu.uce.pa.grupo.u2.pedido.domain.repository.DetallePedidoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
@Transactional 
public class DetallePedidoService {

    @Inject 
    private DetallePedidoRepository detallePedidoRepository;

    public void guardar(DetallePedido detallePedido){
        this.detallePedidoRepository.create(detallePedido);
    }

    public DetallePedido buscarPorId(Integer id){
       return  this.detallePedidoRepository.read(id);
    }

    public void actualizar(DetallePedido detallePedido){
        this.detallePedidoRepository.update(detallePedido);
    }

    public void eliminar(Integer id){
        this.detallePedidoRepository.delete(id);
    }

}
