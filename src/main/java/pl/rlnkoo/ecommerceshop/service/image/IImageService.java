package pl.rlnkoo.ecommerceshop.service.image;

import org.springframework.web.multipart.MultipartFile;
import pl.rlnkoo.ecommerceshop.model.Image;

public interface IImageService {

    Image getImageById(Long id);
    void deleteImageById(Long id);
    Image saveImage(MultipartFile file, Long productId);
    void updateImage(MultipartFile file, Long imageId);
}
