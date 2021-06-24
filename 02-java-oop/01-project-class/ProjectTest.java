import java.util.*;
public class ProjectTest{
    public static void main(String[] args){
        Project sample = new Project("1st Project", "Sample");

        sample.setDescription("I'm trying to test here");
        sample.setInitialCost(10000);

        System.out.println(sample.elevatedPitch());

        Portfolio resume = new Portfolio(sample);

        System.out.println(resume.getPortfolioCost());

    }
}