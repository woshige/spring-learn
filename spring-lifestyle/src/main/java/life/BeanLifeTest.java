package life;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-context.xml");
        SpringBean springBean = (SpringBean)context.getBean("springBean");
        System.out.println(springBean.getSpringBeanName());
        context.close();
    }
}
