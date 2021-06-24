import java.util.ArrayList;
import java.util.Arrays;
// import java.util.*;
public class Portfolio {
    ArrayList<Project> Projects = new ArrayList<Project>();

    public Portfolio(){
    }

    public Portfolio(Project p){
        Projects.add(p);
    }

    public void AddToPortfolio(Project p) {
        this.Projects.add(p);
    }
    
    public String getPortfolio(){
        String[] portfolio = new String[Projects.size()];
        for(int i = 0; i < Projects.size(); i++){
            portfolio[i] = Projects.get(i).getName();
        }
        return Arrays.toString(portfolio);
    }

    public double getPortfolioCost() {
        double total = 0;
        for (Project p : Projects) {
            total += p.getInitialCost();
        }
        return total;
    }

    public void showPortfolio() {
        System.out.println("All projects in Portfolio.");
        for(Project p : Projects) {
            System.out.println(p.elevatedPitch());
        }
        System.out.println(String.format("Total Cost: %f", this.getPortfolioCost()));
    }
}
