package org.launchcode.models.data;

<<<<<<< HEAD

=======
>>>>>>> 823740f1614c7c229110c6d1ce4873d84fbec13b
import org.launchcode.models.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

<<<<<<< HEAD
/**
 * Created by LaunchCode
 */
@Repository
@Transactional
public interface MenuDao extends CrudRepository<Menu, Integer> {
}
=======
//make Dao interface
@Repository
@Transactional
public interface MenuDao extends CrudRepository<Menu, Integer> {
}
>>>>>>> 823740f1614c7c229110c6d1ce4873d84fbec13b
