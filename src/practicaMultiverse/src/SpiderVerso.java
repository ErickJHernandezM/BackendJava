public class SpiderVerso {
    public static void main(String[] args) throws InterruptedException {
        Screen screen= new Screen();
        S2099 s2099=new S2099("Miguel O´Hara","Spiderman 2099",928);
        s2099.GarrasVenenosas(screen);
        s2099.Llaveinversa(screen);
        s2099.Estilospider(screen);
        SNoir sNoir=new SNoir("Peter Parker","Spider-man Noir",90214);
        sNoir.revolver(screen);
        sNoir.ametralladora(screen);
        Spiderh spiderh= new Spiderh("Peter Porker","Spider-ham",8311);
        spiderh.Telarañacapullo(screen);
        spiderh.Telarañaescudo(screen);
    }
}
