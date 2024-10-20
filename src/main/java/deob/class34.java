package deob;

@ObfuscatedName("bz")
public class class34 {

    @ObfuscatedName("bz.ar")
    public int field178;

    @ObfuscatedName("bz.ab")
    public int field182;

    public class34(int arg0, int arg1) {
        this.field178 = arg0;
        this.field182 = arg1;
    }

    @ObfuscatedName("bz.ac(Lbd;I)Z")
    public boolean method466(class30 arg0) {
        if (arg0 == null) {
            return false;
        }
        switch(this.field178) {
            case 1:
                return arg0.method430(this.field182);
            case 2:
                return arg0.method413(this.field182);
            case 3:
                return arg0.method422((char) this.field182);
            case 4:
                return arg0.method415(this.field182 == 1);
            default:
                return false;
        }
    }
}
