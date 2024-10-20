package deob;

@ObfuscatedName("bd")
public class class34 {

    @ObfuscatedName("bd.ab")
    public int field168;

    @ObfuscatedName("bd.ak")
    public int field172;

    public class34(int arg0, int arg1) {
        this.field168 = arg0;
        this.field172 = arg1;
    }

    @ObfuscatedName("bd.at(Lbo;I)Z")
    public boolean method450(class30 arg0) {
        if (arg0 == null) {
            return false;
        }
        switch(this.field168) {
            case 1:
                return arg0.method417(this.field172);
            case 2:
                return arg0.method416(this.field172);
            case 3:
                return arg0.method418((char) this.field172);
            case 4:
                return arg0.method423(this.field172 == 1);
            default:
                return false;
        }
    }
}
