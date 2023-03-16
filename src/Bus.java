


public class Bus {
    private Boolean Ac;
    private int Capacity;
    private int Busno;
    Bus(int no,boolean ac,int cap){
        this.Busno=no;
        this.Ac=ac;
        this.Capacity=cap;
    }

    public int getCapacity(){
        return Capacity;
    }
    public boolean getAc(){
        return Ac;
    }
    public int getBusno(){
        return Busno;
    }
    public void setCapacity(int cap){
        Capacity=cap;
    }
    public void setAc(boolean val){
        Ac=val;
    }
    public void setBusno(int no){
        Busno=no;
    }
    public void displayBusinfo(){
        System.out.println("Bus no:"+Busno +"Ac:"+ Ac +"Capacity:"+Capacity);
    }
}
