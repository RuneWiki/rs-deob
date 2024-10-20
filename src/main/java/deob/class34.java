package deob;

@ObfuscatedName("at")
public class class34 {

    @ObfuscatedName("at.i")
    public int field202;

    @ObfuscatedName("at.n")
    public int field200;

    public class34(int arg0, int arg1) {
        this.field202 = arg0;
        this.field200 = arg1;
    }

    @ObfuscatedName("at.f(Lag;I)Z")
    public boolean method487(class30 arg0) {
        if (arg0 == null) {
            return false;
        }
        switch(this.field202) {
            case 1:
                return arg0.method430(this.field200);
            case 2:
                return arg0.method429(this.field200);
            case 3:
                return arg0.method437((char) this.field200);
            case 4:
                return arg0.method431(this.field200 == 1);
            default:
                return false;
        }
    }
}
