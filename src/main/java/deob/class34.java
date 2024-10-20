package deob;

@ObfuscatedName("bw")
public class class34 {

    @ObfuscatedName("bw.af")
    public int field159;

    @ObfuscatedName("bw.at")
    public int field154;

    public class34(int arg0, int arg1) {
        this.field159 = arg0;
        this.field154 = arg1;
    }

    @ObfuscatedName("bw.ac(Lbx;I)Z")
    public boolean method467(class30 arg0) {
        if (arg0 == null) {
            return false;
        }
        switch(this.field159) {
            case 1:
                return arg0.method437(this.field154);
            case 2:
                return arg0.method427(this.field154);
            case 3:
                return arg0.method428((char) this.field154);
            case 4:
                return arg0.method429(this.field154 == 1);
            default:
                return false;
        }
    }
}
