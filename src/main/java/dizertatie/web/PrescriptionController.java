package dizertatie.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import dizertatie.internal.perscription.Prescription;
import dizertatie.internal.perscription.PrescriptionManager;


public class PrescriptionController {
	private final Logger logger = LoggerFactory.getLogger(getClass());
//	private PrescriptionManager prescriptionManager;
//	
//	@Autowired
//	public PrescriptionController(PrescriptionManager prescriptionManager) {
//		super();
//		this.prescriptionManager = prescriptionManager;
//	}

	@PostMapping("/prescription")
	public ResponseEntity<Void> createPrescription(@RequestBody Prescription newPrescription) {
		return null;
	}
	
	@GetMapping("/prescription")
	public List<Prescription> getPrescriptions(@RequestParam String patientId) {
		return null;
	}
	
	@GetMapping("/prescription/{imageId}")
	public Prescription getPrescriptionById() {
		return null;
	}	
}
