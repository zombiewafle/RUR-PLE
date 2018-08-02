import com.sun.javafx.scene.traversal.Direction;

public class Robot {
    private int coins = 0;
    private int PosinX = 0;
    private int PosinY = 0;
    private int Direction = 0;
    private static final int DirectUp= 0;
    private static final int DirectRight = 1;
    private static final int DirectDown = 2;
    private static final int DirectLeft = 3;
    private Coins monedas;
    public Robot(){

    }
    public Robot(int coins, int PosInX, int PosinY){
        this.coins = coins;
        this.PosinX = PosInX;
        this.PosinY = PosinY;
        this.Direction = Robot.DirectUp;
        this.monedas = new Coins();
    }
    private boolean pickUp(){
        while (coins != monedas.getAmount()){
            coins = coins + 1;
        }
        return(false);
    }
    public int getCoins() {return coins; }
    public int getDirection(){return Direction; }
    public int getPosinX() {return PosinX; }
    public int getPosinY() {return PosinY;}
    public int getDirecion(){return DirectUp;}



}
