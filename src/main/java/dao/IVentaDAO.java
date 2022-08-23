package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dto.Venta;

public interface IVentaDAO extends JpaRepository<Venta, Integer>{

}
