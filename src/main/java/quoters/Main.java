package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Aliaksandr_Makavets1 on 19.08.2016.
 */
public class Main
{
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "context.xml");
        while (true) {
            Thread.sleep(100);
            context.getBean(Quoter.class).sayQoute();
        }
    }
}
