import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp
{
    public static void main(String[] args)
    {
        //        Coach alphaCoach = context.getBean("myCoach", Coach.class);
        //        boolean result = theCoach == alphaCoach;
        //        System.out.println(result);
        //        System.out.println("memory location for alpha coach " + alphaCoach);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        Coach theCoach = context.getBean("myCoach", Coach.class);
        System.out.println("Memory location for coach " + theCoach);
        context.close();
    }
}