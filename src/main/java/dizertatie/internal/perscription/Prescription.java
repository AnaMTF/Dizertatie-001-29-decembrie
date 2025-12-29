package dizertatie.internal.perscription;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "T_PRESCRIPTION")
public class Prescription {
	@Id
	@Column(name = "PRESCRIPTION_UUID")
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID uuid;

	protected Prescription() {
		super();
	}	
}
