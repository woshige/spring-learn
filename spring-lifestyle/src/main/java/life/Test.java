package life;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Bean.xml");
        SpringBeanLifStyle bean = context.getBean(SpringBeanLifStyle.class);
        context.close();
    }
}
