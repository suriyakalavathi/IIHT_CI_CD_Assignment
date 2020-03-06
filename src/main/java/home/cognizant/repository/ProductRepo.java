package home.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import home.cognizant.entity.ProductObj;

public interface ProductRepo extends JpaRepository<ProductObj, Long> {

}
