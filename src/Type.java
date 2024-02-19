public class Type {
    private final String name;
    private final Type[] resistances;
    private final Type[] weaknesses;
    private final Type[] typeAdvantage;
    private final Type[] typeDisadvantage;
    private final Type[] immunities;

    public Type(String name, Type[] resistances, Type[] weaknesses, Type[] typeAdvantage, Type[] typeDisadvantage, Type[] immunities){
        this.name = name;
        this.resistances = resistances;
        this.weaknesses = weaknesses;
        this.typeAdvantage = typeAdvantage;
        this.typeDisadvantage = typeDisadvantage;
        this.immunities = immunities;
    }

    public Type[] getResistances() {
        return resistances;
    }

    public Type[] getWeaknesses() {
        return weaknesses;
    }

    public Type[] getTypeAdvantage() {
        return typeAdvantage;
    }

    public Type[] getTypeDisadvantage() {
        return typeDisadvantage;
    }

    public Type[] getImmunities() {
        return immunities;
    }
}
