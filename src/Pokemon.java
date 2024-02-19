public class Pokemon {
    private final int DexID;
    private String name;
    private Type[] type;
    private Move[] moves;
    private int[] stats;

    public Pokemon(int DexID, String name, Type[] type, Move[] moves, int[] stats){
        this.DexID = DexID;
        this.name = name;
        this.type = type;
        this.moves = moves;
        this.stats = stats;
    }
}
