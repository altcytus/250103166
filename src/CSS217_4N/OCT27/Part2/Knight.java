package CSS217_4N.OCT27.Part2;


class Knight extends Hero {
    public Knight(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void attack() {
        weapon.use();
    }
}

