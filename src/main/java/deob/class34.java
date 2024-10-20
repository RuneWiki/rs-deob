package deob;

@ObfuscatedName("bn")
public class class34 {

    @ObfuscatedName("bn.ag")
    public int field178;

    @ObfuscatedName("bn.ao")
    public int field174;

    public class34(int arg0, int arg1) {
        this.field178 = arg0;
        this.field174 = arg1;
    }

    @ObfuscatedName("bn.am(Lbt;I)Z")
    public boolean method485(class30 arg0) {
        if (arg0 == null) {
            return false;
        }
        switch(this.field178) {
            case 1:
                return arg0.method441(this.field174);
            case 2:
                return arg0.method438(this.field174);
            case 3:
                return arg0.method437((char) this.field174);
            case 4:
                return arg0.method444(this.field174 == 1);
            default:
                return false;
        }
    }
}
