package deob;

@ObfuscatedName("bk")
public class class34 {

    @ObfuscatedName("bk.aa")
    public int field173;

    @ObfuscatedName("bk.az")
    public int field169;

    public class34(int arg0, int arg1) {
        this.field173 = arg0;
        this.field169 = arg1;
    }

    @ObfuscatedName("bk.aq(Lbi;I)Z")
    public boolean method446(class30 arg0) {
        if (arg0 == null) {
            return false;
        }
        switch(this.field173) {
            case 1:
                return arg0.method403(this.field169);
            case 2:
                return arg0.method396(this.field169);
            case 3:
                return arg0.method402((char) this.field169);
            case 4:
                return arg0.method401(this.field169 == 1);
            default:
                return false;
        }
    }
}
