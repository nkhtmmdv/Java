abstract class WrestlingStyle {
    protected String name;

    public WrestlingStyle(String name) {
        this.name = name;
    }

    public abstract void practice();
    public abstract void compete();

    public void showName() {
        System.out.println("Wrestling Style: " + name);
    }
}

class Sambo extends WrestlingStyle {

    public Sambo() {
        super("Sambo");
    }

    @Override
    public void practice() {
        System.out.println("Practicing Sambo: Focus on joint locks and throws.");
    }

    @Override
    public void compete() {
        System.out.println("Competing in Sambo: Emphasis on both grappling and striking.");
    }
}

class Judo extends WrestlingStyle {

    public Judo() {
        super("Judo");
    }

    @Override
    public void practice() {
        System.out.println("Practicing Judo: Focus on throws and ground control.");
    }

    @Override
    public void compete() {
        System.out.println("Competing in Judo: Points for throwing and pinning opponents.");
    }
}

class FreestyleWrestling extends WrestlingStyle {

    public FreestyleWrestling() {
        super("Freestyle Wrestling");
    }

    @Override
    public void practice() {
        System.out.println("Practicing Freestyle Wrestling: Focus on takedowns and escapes.");
    }

    @Override
    public void compete() {
        System.out.println("Competing in Freestyle Wrestling: Points for takedowns, reversals, and escapes.");
    }
}

public class Main {
    public static void main(String[] args) {

        WrestlingStyle sambo = new Sambo();
        WrestlingStyle judo = new Judo();
        WrestlingStyle freestyle = new FreestyleWrestling();

        sambo.showName();
        sambo.practice();
        sambo.compete();

        System.out.println();

        judo.showName();
        judo.practice();
        judo.compete();

        System.out.println();

        freestyle.showName();
        freestyle.practice();
        freestyle.compete();
    }
}
