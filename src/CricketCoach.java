public class CricketCoach implements Coach
{
    private FortuneService fortuneService;
    private String emailAddress;
    private String teamName;

    public CricketCoach()
    {
        System.out.println("CricketCoach: inside no-arg constructor...");
    }
    public void setFortuneService(FortuneService fortuneService)
    {
        System.out.println("inside cricketCoach setter method ");
        this.fortuneService = fortuneService;
    }
    public void setEmailAddress(String emailAddress)
    {
        System.out.println("inside setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeamName(String teamName)
    {
        System.out.println("inside setTeamName");
        this.teamName = teamName;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public String getTeamName()
    {
        return teamName;
    }

    @Override
    public String getDailyWorkout()
    {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
}
