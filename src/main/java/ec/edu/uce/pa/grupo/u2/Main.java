package ec.edu.uce.pa.grupo.u2;

import java.time.LocalDateTime;

import ec.edu.uce.pa.grupo.u2.pedido.application.ClienteService;
import ec.edu.uce.pa.grupo.u2.pedido.application.DetallePedidoService;
import ec.edu.uce.pa.grupo.u2.pedido.application.EnvioService;
import ec.edu.uce.pa.grupo.u2.pedido.application.PagoService;
import ec.edu.uce.pa.grupo.u2.pedido.application.PedidoService;
import ec.edu.uce.pa.grupo.u2.pedido.application.ProductoService;
import ec.edu.uce.pa.grupo.u2.pedido.domain.model.Cliente;
import ec.edu.uce.pa.grupo.u2.pedido.domain.model.DetallePedido;
import ec.edu.uce.pa.grupo.u2.pedido.domain.model.Envio;
import ec.edu.uce.pa.grupo.u2.pedido.domain.model.Pago;
import ec.edu.uce.pa.grupo.u2.pedido.domain.model.Pedido;
import ec.edu.uce.pa.grupo.u2.pedido.domain.model.Producto;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private PedidoService pedidoService;

    @Inject
    private ClienteService clienteService;

    @Inject
    private DetallePedidoService detallePedidoService;

    @Inject
    private EnvioService envioService;

    @Inject
    private PagoService pagoService;

    @Inject
    private ProductoService productoService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {

        System.out.println("\nHello, Quarkus!\n");

        // PEDIDO
        // CREATED (INSERT)
 
        Pedido pedido = new Pedido();
        pedido.setProducto("Producto de prueba2");
        pedido.setPrecio(100.00);
        pedido.setFecha(LocalDateTime.now());
        this.pedidoService.guardar(pedido);
        

        // READ (BUSCAR)
        Pedido pedido1 = this.pedidoService.bucarPorId(2);
        System.out.println("Pedido encontrado: " + pedido1 + "\n");

        //UPDATE (ACTUALIZAR)
        pedido.setPrecio(200.0);
        this.pedidoService.actualizar(pedido);

        Pedido pedido2 = this.pedidoService.bucarPorId(2);
        System.out.println("Pedido actualizado: " + pedido2 + "\n");

        // DELETE (ELIMINAR)
        this.pedidoService.eliminar(2);

        /* 
        // CLIENTE
        Cliente cliente = new Cliente();
        cliente.setNombre("Joselyn");
        cliente.setCorreo("avn.ahi@gmail.com");
        cliente.setTelefono("0994777562");

        this.clienteService.guardar(cliente);

        // DETALLE PEDIDO
        DetallePedido detallePedido = new DetallePedido();
        detallePedido.setCantidad(1);
        detallePedido.setPrecio(100.00);
        detallePedido.setProducto("Producto de prueba");

        this.detallePedidoService.guardar(detallePedido);

        // ENVIO
        Envio envio = new Envio();
        envio.setPais("Ecuador");
        envio.setCiudad("Quito");
        envio.setDireccion("La Joya N° 2 - Lote 13");
        envio.setEstado("EN PROCESO");

        this.envioService.guardar(envio);

        // PAGO
        Pago pago = new Pago();
        pago.setMetodoPago("EFECTIVO");
        pago.setMonto(100.00);

        this.pagoService.guardar(pago);

        // PRODUCTO
        Producto producto = new Producto();
        producto.setNombre("Producto de Prueba");
        producto.setDescripcion("Primer producto en la base de datos");
        producto.setPrecio(100.00);

        this.productoService.guardar(producto);*/

        return 0;

    }
}
