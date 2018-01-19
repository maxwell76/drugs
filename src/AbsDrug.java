
import javax.swing.ImageIcon;


abstract public class AbsDrug {
    
    protected boolean sell;
    protected double price;
    protected ImageIcon img;
    protected String clas;
    protected String effect;
    
    public AbsDrug(boolean s, double p, String c, String e, ImageIcon i){
        sell = s;
        price = p;
        clas = c;
        effect = e;
        img = i;
    }
}
