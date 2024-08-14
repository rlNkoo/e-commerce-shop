package pl.rlnkoo.ecommerceshop.service.image;

import org.springframework.web.multipart.MultipartFile;
import pl.rlnkoo.ecommerceshop.dto.ImageDto;
import pl.rlnkoo.ecommerceshop.model.Image;

import java.util.List;

public interface IImageService {

    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(List <MultipartFile> files, Long productId);
    void updateImage(MultipartFile file, Long imageId);
}
