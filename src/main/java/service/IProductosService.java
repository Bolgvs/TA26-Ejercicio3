package service;

import java.util.List;

import dto.Productos;

public interface IProductosService {

	public List<Productos> listarProductos(); 
			
	public Productos guardarProductos(Productos productos);	
			
	public Productos productos(int id); 
			
	public Productos actualizarProductos(Productos productos); 
			
	public void eliminarProductos(int id);
}
