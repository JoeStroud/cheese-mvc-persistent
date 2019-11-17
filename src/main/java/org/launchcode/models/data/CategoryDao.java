package org.launchcode.models.data;

import org.launchcode.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

<<<<<<< HEAD
/**
 * Created by LaunchCode
 */
@Repository
@Transactional
public interface CategoryDao extends CrudRepository<Category, Integer> {
}
=======

@Repository
@Transactional
public interface CategoryDao extends CrudRepository<Category, Integer> {
}
>>>>>>> 823740f1614c7c229110c6d1ce4873d84fbec13b
