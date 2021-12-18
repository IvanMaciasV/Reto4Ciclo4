package ciclo4.Reto4.repository.crud;

import ciclo4.Reto4.model.CleaningProduct;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Ivan Macias
 */
public interface CleaningCrudProductRepository extends MongoRepository<CleaningProduct, String> {
    public List<CleaningProduct> findByPriceLessThanEqual(double precio);
}
