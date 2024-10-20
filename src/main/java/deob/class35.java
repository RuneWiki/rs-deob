package deob;

@ObfuscatedName("ak")
public class class35 {

    @ObfuscatedName("ak.y")
    public int field191;

    @ObfuscatedName("ak.d")
    public int field192;

    public class35(int arg0, int arg1) {
        this.field191 = arg0;
        this.field192 = arg1;
    }

    @ObfuscatedName("ak.a(Lac;I)Z")
    public boolean method496(class31 arg0) {
        if (arg0 == null) {
            return false;
        }
        switch(this.field191) {
            case 1:
                return arg0.method454(this.field192);
            case 2:
                return arg0.method444(this.field192);
            case 3:
                return arg0.method445((char) this.field192);
            case 4:
                return arg0.method446(this.field192 == 1);
            default:
                return false;
        }
    }
}
