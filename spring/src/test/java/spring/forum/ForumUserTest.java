package spring.forum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ForumUserTest{

    @Test
    public void testGetUsername(){
        // given
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("spring");
        ForumUser bean = context.getBean(ForumUser.class);
        // when
        String userName = bean.getUserName();
        // then
        assertThat(userName).isEqualTo("John Smith");
    }
}