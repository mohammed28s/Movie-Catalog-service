package io.javabrains.movie_catalog_service.resources;





import io.javabrains.movie_catalog_service.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.List;



@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {


    @RequestMapping("/{userId}")   // fetching the user info
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

        return Collections.singletonList(
                new CatalogItem("Transformers", "Test", 4)
        );
    }

}
