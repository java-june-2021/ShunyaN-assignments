class Project {
    private String name;
    private String description;
    private double initialCost;
    
    public Project(){

    }

    public Project(String NewName){
        this.name = NewName;
    }

    public Project(String NewName, String NewDescription) {
        this.name = NewName;
        this.description = NewDescription;
    }

    public String getName(){
        return this.name;
    }

    public void getDescription(){
        System.out.println(this.description);
    }

    public double getInitialCost(){
        return this.initialCost;
    }

    public void setName(String NewName){
        this.name = NewName;
    }

    public void setDescription(String NewDescription){
        this.description = NewDescription;
    }

    public void setInitialCost(double NewCost){
        this.initialCost = NewCost;
    }

    public String elevatedPitch(){
        String output = "Project Name: " + this.name + "("+ this.initialCost +"):" + this.description;
        return output;
    }
}