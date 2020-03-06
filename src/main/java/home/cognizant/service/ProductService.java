package home.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import home.cognizant.entity.ProductObj;
import home.cognizant.repository.ProductRepo;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductRepo repo;
	
	public List<ProductObj> listAll() {
		return repo.findAll();
	}
	
	public void save(ProductObj product) {
		repo.save(product);
	}
	
	public ProductObj get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
}
