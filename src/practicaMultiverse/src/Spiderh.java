import java.awt.*;

public class Spiderh extends Versiones implements Spiderham{
    public Spiderh(String nombre,String alias, int tierra){
        super(nombre,alias,tierra);
    }

    @Override
    public void Telarañacapullo(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",28, Colors.BlueHorizon);
        s.out("Telaraña capullo: es capaz de crear un capullo en el cual mete a sus enemigos y los deja inmoviles\n", "Helvetica",28, Colors.BlueHorizon);
    }

    @Override
    public void Telarañaescudo(Screen s) {
        s.setVisible(true);
        s.out("Telaraña escudo: hace que la telaraña tome la forma de un escudo el cual puede usar para defenderse o incluso contraatacar.\n","Helvetica",28,Colors.BlueHorizon);
    }
}
