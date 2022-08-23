package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dto.Productos;

public interface IProductosDAO extends JpaRepository<Productos, Integer>{

}
