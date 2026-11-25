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
        // CREATE (INSERT)
        Pedido pedido = new Pedido();
        pedido.setProducto("Producto de prueba2");
        pedido.setPrecio(100.00);
        pedido.setFecha(LocalDateTime.now());
        this.pedidoService.guardar(pedido);

        // READ (BUSCAR)
        Pedido pedido1 = this.pedidoService.bucarPorId(1);
        System.out.println("Pedido encontrado: " + pedido1 + "\n");

        // UPDATE (ACTUALIZAR)
        if (pedido1 != null) {
            pedido1.setPrecio(200.00);
            this.pedidoService.actualizar(pedido1);
        }

        Pedido pedido2 = this.pedidoService.bucarPorId(1);
        System.out.println("Pedido actualizado: " + pedido2 + "\n");

        // DELETE (ELIMINAR)
        this.pedidoService.eliminar(5);


        // CLIENTE
        // CREATE (INSERT)
        Cliente cliente = new Cliente();
        cliente.setNombre("Joselyn");
        cliente.setCorreo("avn.ahi@gmail.com");
        cliente.setTelefono("0994777562");
        this.clienteService.guardar(cliente);

        // READ (BUSCAR)
        Cliente cliente1 = this.clienteService.buscarPorId(1);
        System.out.println("Cliente encontrado: " + cliente1 + "\n");

        // UPDATE (ACTUALIZAR)
        if (cliente1 != null) {
            cliente1.setNombre("Joselyn Anahi");
            this.clienteService.actualizar(cliente1);
        }

        Cliente cliente2 = this.clienteService.buscarPorId(1);
        System.out.println("Cliente actualizado: " + cliente2 + "\n");

        // DELETE (ELIMINAR)
        this.clienteService.eliminar(5);


        // DETALLE PEDIDO
        // CREATE (INSERT)
        DetallePedido detallePedido = new DetallePedido();
        detallePedido.setCantidad(1);
        detallePedido.setPrecio(100.00);
        detallePedido.setProducto("Producto de prueba");
        this.detallePedidoService.guardar(detallePedido);

        // READ (BUSCAR)
        DetallePedido detallePedido1 = this.detallePedidoService.buscarPorId(1);
        System.out.println("Detalle pedido encontrado: " + detallePedido1 + "\n");

        // UPDATE (ACTUALIZAR)
        if (detallePedido1 != null) {
            detallePedido1.setCantidad(2);
            this.detallePedidoService.actualizar(detallePedido1);
        }

        DetallePedido detallePedido2 = this.detallePedidoService.buscarPorId(1);
        System.out.println("Detalle pedido actualizado: " + detallePedido2 + "\n");

        // DELETE (ELIMINAR)
        this.detallePedidoService.eliminar(3);


        // ENVIO
        // CREATE (INSERT)
        Envio envio = new Envio();
        envio.setPais("Ecuador");
        envio.setCiudad("Quito");
        envio.setDireccion("La Joya N° 2 - Lote 13");
        envio.setEstado("EN PROCESO");
        this.envioService.guardar(envio);

        // READ (BUSCAR)
        Envio envio1 = this.envioService.buscarPorId(1);
        System.out.println("Envio encontrado: " + envio1 + "\n");

        // UPDATE (ACTUALIZAR)
        if (envio1 != null) {
            envio1.setEstado("ENTREGADO");
            this.envioService.actualizar(envio1);
        }

        Envio envio2 = this.envioService.buscarPorId(1);
        System.out.println("Envio actualizado: " + envio2 + "\n");

        // DELETE (ELIMINAR)
        this.envioService.eliminar(4);


        // PAGO
        // CREATE (INSERT)
        Pago pago = new Pago();
        pago.setMetodoPago("EFECTIVO");
        pago.setMonto(100.00);
        this.pagoService.guardar(pago);

        // READ (BUSCAR)
        Pago pago1 = this.pagoService.buscarPorId(1);
        System.out.println("Pago encontrado: " + pago1 + "\n");

        // UPDATE (ACTUALIZAR)
        if (pago1 != null) {
            pago1.setMonto(200.00);
            this.pagoService.actualizar(pago1);
        }

        Pago pago2 = this.pagoService.buscarPorId(1);
        System.out.println("Pago actualizado: " + pago2 + "\n");

        // DELETE (ELIMINAR)
        this.pagoService.eliminar(4);


        // PRODUCTO
        // CREATE (INSERT)
        Producto producto = new Producto();
        producto.setNombre("Producto de Prueba");
        producto.setDescripcion("Primer producto en la base de datos");
        producto.setPrecio(100.00);
        this.productoService.guardar(producto);

        // READ (BUSCAR)
        Producto producto1 = this.productoService.buscarPorId(1);
        System.out.println("Producto encontrado: " + producto1 + "\n");

        // UPDATE (ACTUALIZAR)
        if (producto1 != null) {
            producto1.setPrecio(200.00);
            this.productoService.actualizar(producto1);
        }

        Producto producto2 = this.productoService.buscarPorId(1);
        System.out.println("Producto actualizado: " + producto2 + "\n");

        // DELETE (ELIMINAR)
        this.productoService.eliminar(4);

        return 0;
    }
}