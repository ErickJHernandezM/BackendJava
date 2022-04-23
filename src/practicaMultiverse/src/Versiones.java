public class Versiones {
    private String nombre, alias;
    private int tierra;
    Versiones(String nombre, String alias,int tierra){
        this.nombre=nombre;
        this.alias=alias;
        this.tierra=tierra;
    }
    public String getNombre(){  return nombre;  }
    public String getAlias(){  return  alias;  }
    public int getTierra(){  return tierra;  }

    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }else
            return false;
    }
    public boolean setAlias(String alias){
        if (!alias.isEmpty()){
            this.alias=alias;
            return true;
        }else
            return false;
    }
    public boolean setTierra(int tierra){
        if (tierra>0){
            this.tierra=tierra;
            return true;
        }else
            return false;
    }
    public String showMessage(){
        return
                "Nombre: "+nombre+"\n"+
                        "Alias: "+alias+"\n"+
                        "Tierra: "+tierra+"\n";
    }
}
