package CSS217_4N.OCT27.Part1;

class RealInternet implements Internet {
    @Override
    public void connectTo(String site) {
        System.out.println("Connected to site: " + site);
    }
}