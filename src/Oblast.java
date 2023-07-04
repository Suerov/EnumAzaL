import javax.crypto.AEADBadTagException;

public enum Oblast {
    TALAS("Obko"),
    BATKEN("Ay-Gyl guly"),
    JALA_ABAD("Janak"),
    OSH("Samsa"),
    NARYN("At"),
    YSSUK_KOL("Trava"),
    CHUY("Bishkek");
    private  String peculiarity;
    Oblast() {
    }

    Oblast(String peculiarity) {
        this.peculiarity = peculiarity;
    }

    public String getPeculiarity() {
        return peculiarity;
    }

    @Override
    public String toString() {
        return "Oblast:" +"\n"+
                "peculiarity:" +"\n"+ peculiarity ;
    }
}
