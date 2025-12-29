package dizertatie.internal.image;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "T_IMAGES")
public class Image {
	@Id
	@Column(name = "IMAGE_UUID")
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID uuid;
	
	@Column(name = "IMAGE_WIDTH")
	private long width;
	
	@Column(name = "IMAGE_HEIGHT")
	private long height;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "IMAGE_KIND", nullable = false)
	private ImageKind kind;

	public Image(long width, long height, ImageKind kind) {
		super();
		this.width = width;
		this.height = height;
		this.kind = kind;
	}

	protected Image() {
		super();
	}

	public UUID getUuid() {
		return uuid;
	}

	public long getWidth() {
		return width;
	}

	public long getHeight() {
		return height;
	}

	public ImageKind getKind() {
		return kind;
	}

	public void setWidth(long width) {
		this.width = width;
	}

	public void setHeight(long height) {
		this.height = height;
	}

	public void setKind(ImageKind kind) {
		this.kind = kind;
	}
}
