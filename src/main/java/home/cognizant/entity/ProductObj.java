package home.cognizant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductObj {
	private Long prod_id;
	private String prod_name;
	private String prod_brand;
	private String prod_madein;
	private float prod_price;

	public ProductObj() {
	}

	public ProductObj(Long prod_id, String prod_name, String prod_brand, String prod_madein, float prod_price) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_brand = prod_brand;
		this.prod_madein = prod_madein;
		this.prod_price = prod_price;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getProd_id() {
		return prod_id;
	}

	public void setProd_id(Long prod_id) {
		this.prod_id = prod_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getProd_brand() {
		return prod_brand;
	}

	public void setProd_brand(String prod_brand) {
		this.prod_brand = prod_brand;
	}

	public String getProd_madein() {
		return prod_madein;
	}

	public void setProd_madein(String prod_madein) {
		this.prod_madein = prod_madein;
	}

	public float getProd_price() {
		return prod_price;
	}

	public void setProd_price(float prod_price) {
		this.prod_price = prod_price;
	}


	
}
