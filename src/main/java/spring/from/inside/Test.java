package spring.from.inside;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.stereotype.Component;
import spring.from.inside.methodName.MethodNameTest;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Arrays;

@Component
public class Test {

    @PostConstruct
    private void init(){
        System.out.println("postConstruct");
        DefaultListableBeanFactory a = new DefaultListableBeanFactory();
        System.out.println(Arrays.toString(a.getBeanDefinitionNames()));
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
        System.out.println(LocalDateTime.now());
        System.out.println(MethodNameTest.methodName());
        System.out.println(LocalDateTime.now());
        System.out.println();
    }


}
