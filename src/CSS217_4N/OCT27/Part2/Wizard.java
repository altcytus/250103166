package CSS217_4N.OCT27.Part2;


class Wizard extends Hero {
    public Wizard(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        weapon.use();
    }
}


