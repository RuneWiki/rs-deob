package deob;

@ObfuscatedName("bk")
public class class34 {

    @ObfuscatedName("bk.av")
    public int field171;

    @ObfuscatedName("bk.aq")
    public int field175;

    public class34(int arg0, int arg1) {
        this.field171 = arg0;
        this.field175 = arg1;
    }

    @ObfuscatedName("bk.aj(Lbs;B)Z")
    public boolean method466(class30 arg0) {
        if (arg0 == null) {
            return false;
        }
        switch(this.field171) {
            case 1:
                return arg0.method431(this.field175);
            case 2:
                return arg0.method424(this.field175);
            case 3:
                return arg0.method425((char) this.field175);
            case 4:
                return arg0.method426(this.field175 == 1);
            default:
                return false;
        }
    }
}
