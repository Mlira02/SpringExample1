public class TrackCoach implements Coach
{
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout()
    {
        return "Run a hard 5K";
    }

    @Override
    public String getDailyFortune()
    {
        return "From track coach " + fortuneService.getFortune();
    }

    public void beanStartup()
    {
        System.out.println("Bean is charged up!!");
    }
    public void beanDestroyed()
    {
        System.out.println("Bean being Destroyed!!");
    }

}