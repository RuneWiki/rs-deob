package deob;

@ObfuscatedName("bh")
public class class34 {

    @ObfuscatedName("bh.am")
    public int field155;

    @ObfuscatedName("bh.ac")
    public int field149;

    public class34(int arg0, int arg1) {
        this.field155 = arg0;
        this.field149 = arg1;
    }

    @ObfuscatedName("bh.ab(Lbc;I)Z")
    public boolean method446(class30 arg0) {
        if (arg0 == null) {
            return false;
        }
        switch(this.field155) {
            case 1:
                return arg0.method402(this.field149);
            case 2:
                return arg0.method400(this.field149);
            case 3:
                return arg0.method405((char) this.field149);
            case 4:
                return arg0.method399(this.field149 == 1);
            default:
                return false;
        }
    }
}
