package annotation;
        import org.springframework.stereotype.Service;

/**
 * Created by zhangshukang
 */

@Service
public class MyAnnotationService{

    public MyAnnotationService(){
        System.out.println("init service");
    }

    @Logable
    @Logable2
    public void myAnnotationServiceExecute(){
        System.out.println("myAnnotationServiceExecute");
    }

    public void myAnnotationServiceExecute1(){
        System.out.println("myAnnotationServiceExecute");
    }
}
