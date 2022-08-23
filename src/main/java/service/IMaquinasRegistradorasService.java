package service;

import java.util.List;

import dto.MaquinasRegistradoras;

public interface IMaquinasRegistradorasService {

	public List<MaquinasRegistradoras> listarMaquinasRegistradoras(); //Listar All 
			
	public MaquinasRegistradoras guardarMaquinasRegistradoras(MaquinasRegistradoras maquinas_registradoras);
			
	public MaquinasRegistradoras maquinas_registradoras(int id);
			
	public MaquinasRegistradoras actualizarMaquinasRegistradoras(MaquinasRegistradoras maquinas_registradoras); 
			
	public void eliminarMaquinasRegistradoras(int id);
}
