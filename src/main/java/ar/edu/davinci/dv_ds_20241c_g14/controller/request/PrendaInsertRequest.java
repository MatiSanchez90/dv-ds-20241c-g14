package ar.edu.davinci.dv_ds_20241c_g14.controller.request;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//Son objetos tipo formato JSON , que mediante PostMan les vamos a pasar estos datos mediante una peticion request 
//y esos datos los va recibir el servidor mas especifico el controller rest y el mapper va a transformar este objeto JSON a un objeto de la clase
public class PrendaInsertRequest {

	private String descripcion;
	private String tipo;
	private BigDecimal precioBase;
}
