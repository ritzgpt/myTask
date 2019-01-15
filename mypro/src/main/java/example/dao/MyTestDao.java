package example.dao;
import java.util.List;

import javax.persistence.LockModeType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import example.entity.Numbers;

/** MyTestDao is the repository which has extended the JPA repository.
 *  It will hold all the methods to perform database related query operation.
 *  For now there is only getVal() method which will give you object of Number entity.
 *   */
@Repository
public interface MyTestDao extends JpaRepository<Numbers,Integer>{
	 
	@Lock(LockModeType.PESSIMISTIC_WRITE)
	@Query("SELECT u FROM Numbers u") 
	List<Numbers> getVal();
}
