package deob;

@ObfuscatedName("bs")
public class class34 {

    @ObfuscatedName("bs.az")
    public int field193;

    @ObfuscatedName("bs.ap")
    public int field187;

    public class34(int arg0, int arg1) {
        this.field193 = arg0;
        this.field187 = arg1;
    }

    @ObfuscatedName("bs.au(Lbv;I)Z")
    public boolean method485(class30 arg0) {
        if (arg0 == null) {
            return false;
        }
        switch(this.field193) {
            case 1:
                return arg0.method430(this.field187);
            case 2:
                return arg0.method427(this.field187);
            case 3:
                return arg0.method428((char) this.field187);
            case 4:
                return arg0.method435(this.field187 == 1);
            default:
                return false;
        }
    }
}
