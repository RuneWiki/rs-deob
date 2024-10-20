package deob;

@ObfuscatedName("bo")
public class class34 {

    @ObfuscatedName("bo.ab")
    public int field163;

    @ObfuscatedName("bo.aw")
    public int field167;

    public class34(int arg0, int arg1) {
        this.field163 = arg0;
        this.field167 = arg1;
    }

    @ObfuscatedName("bo.az(Lbf;B)Z")
    public boolean method451(class30 arg0) {
        if (arg0 == null) {
            return false;
        }
        switch(this.field163) {
            case 1:
                return arg0.method407(this.field167);
            case 2:
                return arg0.method408(this.field167);
            case 3:
                return arg0.method409((char) this.field167);
            case 4:
                return arg0.method411(this.field167 == 1);
            default:
                return false;
        }
    }
}
