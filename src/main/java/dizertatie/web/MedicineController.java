package dizertatie.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import dizertatie.internal.medicine.Medicine;
import dizertatie.internal.medicine.MedicineManager;

public class MedicineController {
	private final Logger logger = LoggerFactory.getLogger(getClass());
//	private MedicineManager medicineManager;
//	
//	@Autowired	
//	public MedicineController(MedicineManager medicineManager) {
//		super();
//		this.medicineManager = medicineManager;
//	}

	@PostMapping("/prescription")
	public ResponseEntity<Void> createMedicine(@RequestBody Medicine newPrescription) {
		return null;
	}
	
	@GetMapping("/prescription")
	public List<Medicine> getMedicines() {
		return null;
	}
	
	@GetMapping("/prescription/{imageId}")
	public Medicine getMedicineById() {
		return null;
	}	
}
