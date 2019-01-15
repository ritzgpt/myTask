package example.service;

import javax.persistence.LockModeType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import example.dao.MyTestDao;
import example.entity.Numbers;

/** MyTestServiceImpl is service implementation. We need to implements methods here.
 *  It is the best practice to put the method here and these methods will have logics*/
@Transactional
@Service
public class MyTestServiceImpl implements MyTestService {
@Autowired
MyTestDao myTestDao;


/** It has ( update(Numbers number)) one parameter of entity type Numbers.
 *  So, that we can update the table. It will return the entity type object */
@Override
public Numbers update(Numbers number) {
	return myTestDao.save(number);
	
}
/** It has (getVal()) no any parameter but it will return  entity type Numbers. */
@Override
public Numbers getVal() {
	return myTestDao.getVal()!=null && !myTestDao.getVal().isEmpty()
			? myTestDao.getVal().get(0):null;
	
}

}
