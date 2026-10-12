package com.actv5.actv5.controllers;

import com.actv5.actv5.model.Pedido;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pedidoController {
    @PostMapping("/pedidos")
    public String pedidos(@RequestBody Pedido pedido) {
        String nombreCliente = pedido.getCliente().getNombre();
        int totalProductos = pedido.getTotalProductos();
        double precioTotal = pedido.getPrecioTotal();

        return nombreCliente + " - " + totalProductos + " - " + precioTotal
                + " Pedido recibido correctamente";
    }
}
