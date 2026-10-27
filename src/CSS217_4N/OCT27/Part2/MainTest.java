package CSS217_4N.OCT27.Part2;

import CSS217_4N.OCT27.Part1.*;

public class MainTest {
    public static void main(String[] args) {
        // Task 1: Protection Proxy
        Image guestImage = new ProxyImage("salary_sheet.png", "GUEST");
        Image adminImage = new ProxyImage("salary_sheet.png", "ADMIN");

        guestImage.show();
        adminImage.show();

        // Task 2: Tracking Proxy
        Video video = new ProxyVideo("Cat_Memes.mp4");

        video.play();
        video.play();
        video.play();

        // Task 3: School Wi-Fi Firewall
        Internet internet = new SchoolProxyInternet();

        internet.connectTo("wikipedia.org");
        internet.connectTo("gaming.com");

        // Task 4: Smart Light Bridge
        Device light = new SmartLight();
        AdvancedRemote remote = new AdvancedRemote(light);

        remote.powerOn();
        remote.mute();

        // Task 5: Party Remote Bridge
        Device radio = new Radio();
        PartyRemote partyRemote = new PartyRemote(radio);

        partyRemote.partyMode();

        // Task 6: RPG Weapon Bridge
        Hero knightWithSword = new Knight(new Sword());
        knightWithSword.attack();

        Hero knightWithMagicWand = new Knight(new MagicWand());
        knightWithMagicWand.attack();
    }
}
