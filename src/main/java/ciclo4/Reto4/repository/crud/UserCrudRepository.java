package ciclo4.Reto4.repository.crud;

import ciclo4.Reto4.model.User;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Ivan Macias
 */
public interface UserCrudRepository extends CrudRepository<User, Integer>{
    Optional<User> findByEmail(String email);
    List<User> findBybirthtDay(Date date);
    Optional <User> findByEmailAndPassword(String email,String password);

    List<User> findByMonthBirthtDay(String monthBirthtDay);
}
