package ar.edu.davinci.dv_ds_20241c_g14.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/tienda/api")
public abstract class TiendaAppRest {

	// Esto es equivalente a hacer
	// http://localhost:8090/tienda/api
	// El puerto 8090, está configurado en la propiedad server.port

	// aca se ejecutan todos los endpoints que quisiera ejecturar
	// un endpoint es un punto de contacto con la aplicacion,donde yo puedo mediante
	// un metodo para poder consultar cierta informacion

}
