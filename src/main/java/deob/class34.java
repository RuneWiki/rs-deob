package deob;

@ObfuscatedName("bl")
public class class34 {

    @ObfuscatedName("bl.at")
    public int field176;

    @ObfuscatedName("bl.ab")
    public int field177;

    public class34(int arg0, int arg1) {
        this.field176 = arg0;
        this.field177 = arg1;
    }

    @ObfuscatedName("bl.ak(Lbi;B)Z")
    public boolean method471(class30 arg0) {
        if (arg0 == null) {
            return false;
        }
        switch(this.field176) {
            case 1:
                return arg0.method434(this.field177);
            case 2:
                return arg0.method436(this.field177);
            case 3:
                return arg0.method423((char) this.field177);
            case 4:
                return arg0.method437(this.field177 == 1);
            default:
                return false;
        }
    }
}
