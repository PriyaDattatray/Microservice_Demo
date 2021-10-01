//package com.demo.user;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//import com.demo.user.entity.User;
//import com.demo.user.repository.UserRepository;
//
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace=Replace.NONE)
//public class UserTest {
//	
//	
//	@Autowired
//	private UserRepository userRepo;
//	
//	
//	@Test
//	public void testCreateUser()
//	{
//		User user = new User(11, "Priya" ,"Ghumare", "ghumare@gmail.com", 1);
//		User saveUser= userRepo.save(user);
//		assertNotNull(saveUser);
//	}
//	
//	@Test
//	  public void should_delete() {
//	    
//	  //  entityManager.persist(new User(1L,"priya", "Ghumare", "ghumare@gmail.com" ,11L));
//
//	   // entityManager.persist (new User(2L ,"Hrushi", "vitnor","v@gmail.com" ,22L));
//		User user1 = new User(11, "Priya" ,"Ghumare", "ghumare@gmail.com", 1);
//		
//		User user2 = new User(12, "Purva" ,"Choudhari", "purva@gmail.com", 2);
//	    userRepo.deleteAll();
//	    assertThat(userRepo.findAll()).isEmpty();
//
//	    	  }
//	
//	@Test
//    public void testGetUser() {
//
//		User user1 = new User(11, "Priya" ,"Ghumare", "ghumare@gmail.com", 1);
//        userRepo.save(user1);
//        User user2 = userRepo.findByFirstName("Priya");
//        assertNotNull(user1);
//        assertEquals(user2.getFirstName(), user1.getFirstName());
//        assertEquals(user2.getLastName(), user1.getLastName());
//    }
//	
//	@Test
//    public void findAllUsers() {
//		User user1 = new User(11, "Priya" ,"Ghumare", "ghumare@gmail.com", 1);
//		User user2 = new User(12, "Purva" ,"Choudhari", "purva@gmail.com", 2);
//        userRepo.save(user1);
//        assertNotNull(userRepo.findAll());
//    }
//	
//	 @Test
//	    public void deletByUserIdTest() {
//			User user1 = new User(11, "Priya" ,"Ghumare", "ghumare@gmail.com", 1);
//
//	        User emp = userRepo.save(user1);
//	        userRepo.deleteById(emp.getUserId());
//	    }
//	/*@Test
//	public void getIdTest()
//	{
//		assertEquals(1, 1);
//	}*/
//	
//	
//
//}
