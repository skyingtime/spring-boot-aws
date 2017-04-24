import com.Application;
import com.rabbitmq.spring.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yangliu on 23/04/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class SpringRabbitMqTest {
    @Autowired
    private Sender sender;

    @Test
    public void simpleTest() throws Exception {
        sender.send();
    }

    @Test
    public void oneToMany() throws Exception {
        //for(int i = 0; i < 10; i++) {
            sender.send();
        //}
    }
}
