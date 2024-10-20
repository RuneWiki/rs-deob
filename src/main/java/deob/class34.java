package deob;

@ObfuscatedName("bv")
public class class34 {

    @ObfuscatedName("bv.ag")
    public int field190;

    @ObfuscatedName("bv.az")
    public int field195;

    public class34(int arg0, int arg1) {
        this.field190 = arg0;
        this.field195 = arg1;
    }

    @ObfuscatedName("bv.aw(Lba;S)Z")
    public boolean method463(class30 arg0) {
        if (arg0 == null) {
            return false;
        }
        switch(this.field190) {
            case 1:
                return arg0.method436(this.field195);
            case 2:
                return arg0.method427(this.field195);
            case 3:
                return arg0.method428((char) this.field195);
            case 4:
                return arg0.method429(this.field195 == 1);
            default:
                return false;
        }
    }
}
