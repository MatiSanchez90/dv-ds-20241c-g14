package ar.edu.davinci.dv_ds_20241c_g14.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.davinci.dv_ds_20241c_g14.domain.VentaEfectivo;

@Repository
public interface VentaEfectivoRepository extends JpaRepository<VentaEfectivo, Long> {
}
