package com.idat.bodega.service;

import java.util.List;

import com.idat.bodega.dto.ProductoDTORequest;
import com.idat.bodega.dto.ProductoDTOResponse;

public interface ProductoServicio {
	
	public void guardarProducto (ProductoDTORequest producto);
	public void editarProducto (ProductoDTORequest producto);
	
	public void eliminarProducto(Integer id);
	
	public List<ProductoDTOResponse> listarProductos();
	public ProductoDTOResponse obtenerProductoId(Integer id);

}
