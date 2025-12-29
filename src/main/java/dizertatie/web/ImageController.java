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
import org.springframework.web.bind.annotation.RestController;

import dizertatie.internal.image.Image;
import dizertatie.internal.image.ImageManager;

@RestController
public class ImageController {
	private final Logger logger = LoggerFactory.getLogger(getClass());
//	private ImageManager imageManager;
//	
//	@Autowired
//	public ImageController(ImageManager imageManager) {
//		super();
//		this.imageManager = imageManager;
//	}

	@PostMapping("/image")
	public ResponseEntity<Void> uploadImage(@RequestBody Image newImage) {
		return null;
	}
	
	@GetMapping("/image")
	public List<Image> getImages(@RequestParam String patientId) {
		return null;
	}
	
	@GetMapping("/image/{imageId}")
	public Image getImageById() {
		return null;
	}	
}
