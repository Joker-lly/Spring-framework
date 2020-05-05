package test;



import com.lly.MyBeanFactory.MyBeanfactory;
import com.lly.config.ApplicationConfig;
import com.lly.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);

		//applicationContext.register(ApplicationConfig.class);
		//applicationContext.addBeanFactoryPostProcessor(new MyBeanfactory());
		//applicationContext.refresh();
		UserDao userDao=(UserDao)applicationContext.getBean("userDaoImpl");
		//System.out.println(userDao.hashCode());
		userDao.query();
		userDao.list();
	}
}
