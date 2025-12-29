package dizertatie.internal.medicine;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "T_MEDICINE")
public class Medicine {
	@Id
	@Column(name = "MEDICINE_UUID")
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID uuid;
	
	@Column(name = "MEDICINE_NAME")
	private String name;
	
	@Column(name = "MEDICINE_STOCK")
	private long stock;
	
	@Column(name = "MEDICINE_PRICE")
	private double price;

	public Medicine(String name, long stock, double price) {
		super();
		this.name = name;
		this.stock = stock;
		this.price = price;
	}

	protected Medicine() {
		super();
	}

	public UUID getUuid() {
		return uuid;
	}

	public String getName() {
		return name;
	}

	public long getStock() {
		return stock;
	}

	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStock(long stock) {
		this.stock = stock;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
