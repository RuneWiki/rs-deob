package deob;

@ObfuscatedName("ba")
public class class34 {

    @ObfuscatedName("ba.aa")
    public int field164;

    @ObfuscatedName("ba.ac")
    public int field169;

    public class34(int arg0, int arg1) {
        this.field164 = arg0;
        this.field169 = arg1;
    }

    @ObfuscatedName("ba.at(Lbi;I)Z")
    public boolean method485(class30 arg0) {
        if (arg0 == null) {
            return false;
        }
        switch(this.field164) {
            case 1:
                return arg0.method453(this.field169);
            case 2:
                return arg0.method455(this.field169);
            case 3:
                return arg0.method447((char) this.field169);
            case 4:
                return arg0.method445(this.field169 == 1);
            default:
                return false;
        }
    }
}
