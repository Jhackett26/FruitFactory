public class Fruit {

    //var declarations
    public String color;
    public String shape;
    public int numSeeds;
    public boolean isRipe;
    public int numBush;

    public Fruit(String paramCol, String paramShape, int paramSeeds, boolean paramRipe, int paramBush){
        color = paramCol;
        shape = paramShape;
        numSeeds = paramSeeds;
        isRipe = paramRipe;
        numBush = paramBush;
    }
    public void printInfo(){
        System.out.println(color);
        System.out.println(shape);
        System.out.println(numSeeds);
        System.out.println(isRipe);
        System.out.println(numBush);
    }

}
