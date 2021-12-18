package ciclo4.Reto4.repository;

import ciclo4.Reto4.model.CleaningProduct;
import ciclo4.Reto4.repository.crud.CleaningCrudProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Ivan Macias
 */
@Repository
public class CleaningProductRepository {
    @Autowired
    private CleaningCrudProductRepository repository;

    public List<CleaningProduct> getAll() {
        return repository.findAll();
    }

    public Optional<CleaningProduct> getProduct(String reference) {
        return repository.findById(reference);
    }

    public CleaningProduct create(CleaningProduct cosmetic) {
        return repository.save(cosmetic);
    }

    public void update(CleaningProduct cosmetic) {
        repository.save(cosmetic);
    }

    public void delete(CleaningProduct cosmetic) {
        repository.delete(cosmetic);
    }

    public List<CleaningProduct> productByPrice(double precio){
        return repository.findByPriceLessThanEqual(precio);
    }
}
