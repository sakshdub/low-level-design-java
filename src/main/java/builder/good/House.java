package builder.good;

public class House {

    private int floors;
    private boolean garden;
    private boolean swimmingPool;
    private boolean garage;
    private boolean lift;

    private House(HouseBuilder builder) {
        this.floors = builder.floors;
        this.garden = builder.garden;
        this.swimmingPool = builder.swimmingPool;
        this.garage = builder.garage;
        this.lift = builder.lift;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", garden=" + garden +
                ", swimmingPool=" + swimmingPool +
                ", garage=" + garage +
                ", lift=" + lift +
                '}';
    }

    public static class HouseBuilder {

        private int floors;
        private boolean garden;
        private boolean swimmingPool;

        private boolean garage;
        private boolean lift;

        public HouseBuilder(int floors,
                            boolean garden,
                            boolean swimmingPool) {

            this.floors = floors;
            this.garden = garden;
            this.swimmingPool = swimmingPool;
        }

        public HouseBuilder setGarage(boolean garage) {
            this.garage = garage;
            return this;
        }

        public HouseBuilder setLift(boolean lift) {
            this.lift = lift;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}