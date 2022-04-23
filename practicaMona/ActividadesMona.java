package practicaMona;

public class ActividadesMona {
    public static void main(String[] args) {
        Mona mona;
        mona=new Terracottocat();
        ((Terracottocat) mona).actividades();
        mona=new PrivateInvestocat();
        ((PrivateInvestocat)mona).actividades();
        mona=new Linktocat();
        ((Linktocat)mona).actividades();
        mona=new Spidertocat();
        ((Spidertocat)mona).actividades();
        mona=new DrOctocat();
        ((DrOctocat)mona).actividades();
        mona=new Dojocat();
        ((Dojocat)mona).actividades();
    }
}
