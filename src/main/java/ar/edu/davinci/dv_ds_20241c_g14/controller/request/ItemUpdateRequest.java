package ar.edu.davinci.dv_ds_20241c_g14.controller.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemUpdateRequest {

	private Integer cantidad;

}
