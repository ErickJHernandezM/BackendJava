public class S2099 extends Versiones implements Spider2099{
    public S2099(String nombre,String alias, int tierra){
        super(nombre,alias,tierra);
    }
    @Override
    public void GarrasVenenosas(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",28, Colors.BlueHorizon);
        s.out("Garras Venenosas: Genera veneno que sale por sus garras, el cual usa para inyectar a sus enemigos y dejarlos inconsientes \n","Helvetica",28, Colors.BlueHorizon);
    }

    @Override
    public void Llaveinversa(Screen s) {
        s.setVisible(true);
        s.out("LLave inversa: Al tener experiencia como luchador es capaz de aplicar llaves para dejar inmoviles a los enemigos, incluso puede noquearlos \n","Helvetica",28,Colors.BlueHorizon);
    }

    @Override
    public void Estilospider(Screen s) {
        s.setVisible(true);
        s.out("Estilo spider: Un estilo de lucha unico, que combina la lucha libre con los movimientos y agilidad sobrehumana que tiene \n"+"\n","Helvetica",28,Colors.BlueHorizon);
    }
}
