public class Move {
    private final String name;
    private Type moveType;
    private String moveCategory;
    private int moveBPower;
    private int moveAcc;

    public Move(String name, Type moveType, String moveCategory, int moveBPower, int moveAcc){
        this.name = name;
        this.moveType = moveType;
        this.moveCategory = moveCategory;
        this.moveBPower = moveBPower;
        this.moveAcc = moveAcc;
    }

    public Type getMoveType() {
        return moveType;
    }

    public int getMoveBPower() {
        return moveBPower;
    }

    public int getMoveAcc() {
        return moveAcc;
    }
}
