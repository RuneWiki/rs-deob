package deob;

@ObfuscatedName("bg")
public class class34 {

    @ObfuscatedName("bg.aj")
    public int field165;

    @ObfuscatedName("bg.av")
    public int field164;

    public class34(int arg0, int arg1) {
        this.field165 = arg0;
        this.field164 = arg1;
    }

    @ObfuscatedName("bg.aq(Lbm;I)Z")
    public boolean method473(class30 arg0) {
        if (arg0 == null) {
            return false;
        }
        switch(this.field165) {
            case 1:
                return arg0.method439(this.field164);
            case 2:
                return arg0.method441(this.field164);
            case 3:
                return arg0.method433((char) this.field164);
            case 4:
                return arg0.method434(this.field164 == 1);
            default:
                return false;
        }
    }
}
