import cn.tedu.bean.Worker;
import cn.tedu.config.Config;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCase {
    AnnotationConfigApplicationContext ctx;
    @Before
    public void init() {
        ctx = new AnnotationConfigApplicationContext(Config.class);
    }
    @After
    public void after() {
        ctx.close();
    }
    @Test
    public void test(){
        Worker worker=ctx.getBean(Worker.class);
        worker.work();
    }

}
