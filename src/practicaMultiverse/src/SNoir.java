public class SNoir extends Versiones implements SpiderNoir{
    public SNoir(String nombre,String alias, int tierra){
        super(nombre,alias,tierra);
    }

    @Override
    public void revolver(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica",28, Colors.BlueHorizon);
        s.out("Revolver: Combinando sus habilidades de araña, esta version de Spider-man usa un revolver para atacar \n","Helvetica",28,Colors.BlueHorizon);
    }

    @Override
    public void ametralladora(Screen s) {
        s.setVisible(true);
        s.out("Ametralladora Thompson: con esta arma ataca a sus enemigos a distancias medias, combinando su agilidad \n"+"\n","Helvetica",28,Colors.BlueHorizon);
    }
}
