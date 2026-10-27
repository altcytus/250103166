package CSS217_4N.OCT27.Part2;

abstract class Hero {
    protected Weapon weapon;

    public Hero(Weapon weapon) {
        this.weapon = weapon;
    }

    public abstract void attack();
}
