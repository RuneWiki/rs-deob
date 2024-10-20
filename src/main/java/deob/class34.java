package deob;

@ObfuscatedName("bp")
public class class34 {

    @ObfuscatedName("bp.as")
    public int field151;

    @ObfuscatedName("bp.ae")
    public int field153;

    public class34(int arg0, int arg1) {
        this.field151 = arg0;
        this.field153 = arg1;
    }

    @ObfuscatedName("bp.ap(Lbx;I)Z")
    public boolean method485(class30 arg0) {
        if (arg0 == null) {
            return false;
        }
        switch(this.field151) {
            case 1:
                return arg0.method445(this.field153);
            case 2:
                return arg0.method450(this.field153);
            case 3:
                return arg0.method447((char) this.field153);
            case 4:
                return arg0.method442(this.field153 == 1);
            default:
                return false;
        }
    }
}
