package example.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import example.entity.Numbers;

/** MyTestService is service. We need to have methods here as service.
 *  It is the best practice to put the method here and these methods will have logics in its implementation class  */

public interface MyTestService {
	Numbers update(Numbers number);
	Numbers getVal();
}
