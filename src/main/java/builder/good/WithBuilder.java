package builder.good;

public class WithBuilder {
    public static void main(String[] args) {
        House house=new House.HouseBuilder(2,true,true)
                .setGarage(true)
                .setLift(true)
                .build();
        System.out.println(house);
    }
}
