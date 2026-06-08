package builder.bad;

public class House {
    private int floors;
    private boolean garden;
    private boolean swimmingPool;
    private boolean garage;
    private boolean lift;

    public House(int floors,
                  boolean garden,
                  boolean swimmingPool,
                  boolean garage,
                  boolean lift){
        this.floors=floors;
        this.swimmingPool=swimmingPool;
        this.garage=garage;
        this.lift=lift;
    }
}
