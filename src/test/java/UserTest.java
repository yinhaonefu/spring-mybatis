import com.test.mapper.UserMapper;
import com.test.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/spring.xml")
public class UserTest {

	@Resource
	private UserMapper userMapper;
	
	@Test
	public void testAdd(){
		User user = new User();
		user.setAge(20);
		user.setUsername("zhangsan");
		userMapper.save(user);
		
	}
	
	@Test
	public void testFindAll(){
		List<User> findAllList = userMapper.findAll();
		System.out.println(findAllList.size());
	}
	
	@Test
	public void testFindById(){
		User user = userMapper.findById(1);
		System.out.println(user.getId());
		System.out.println(user.getUsername());
	}


	@Test
	public void testUpdate(){
		User user = new User();
		user.setUsername("lisi");
		user.setAge(30);
		userMapper.update(user);
	}
	
	@Test
	public void testDelete(){
		userMapper.delete(1);
	}
}
