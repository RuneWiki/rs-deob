package deob;

@ObfuscatedName("bz")
public class class34 {

    @ObfuscatedName("bz.aq")
    public int field192;

    @ObfuscatedName("bz.al")
    public int field193;

    public class34(int arg0, int arg1) {
        this.field192 = arg0;
        this.field193 = arg1;
    }

    @ObfuscatedName("bz.af(Lbe;I)Z")
    public boolean method492(class30 arg0) {
        if (arg0 == null) {
            return false;
        }
        switch(this.field192) {
            case 1:
                return arg0.method455(this.field193);
            case 2:
                return arg0.method448(this.field193);
            case 3:
                return arg0.method447((char) this.field193);
            case 4:
                return arg0.method450(this.field193 == 1);
            default:
                return false;
        }
    }
}
