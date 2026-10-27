package CSS217_4N.OCT27;

class ProxyImage implements Image {
    private String fileName;
    private String userRole;
    private RealImage realImage;

    public ProxyImage(String fileName, String userRole) {
        this.fileName = fileName;
        this.userRole = userRole;
    }

    @Override
    public void show() {
        if (!userRole.equals("ADMIN")) {
            System.out.println("[ACCESS DENIED] You lack permission to view: " + fileName);
            return;
        }

        if (realImage == null) {
            realImage = new RealImage(fileName);
        }

        realImage.show();
    }
}
