package deob;

@ObfuscatedName("ay")
public class class35 {

    @ObfuscatedName("ay.f")
    public int field201;

    @ObfuscatedName("ay.r")
    public int field203;

    public class35(int arg0, int arg1) {
        this.field201 = arg0;
        this.field203 = arg1;
    }

    @ObfuscatedName("ay.h(Lav;I)Z")
    public boolean method478(class31 arg0) {
        if (arg0 == null) {
            return false;
        }
        switch(this.field201) {
            case 1:
                return arg0.method432(this.field203);
            case 2:
                return arg0.method433(this.field203);
            case 3:
                return arg0.method427((char) this.field203);
            case 4:
                return arg0.method428(this.field203 == 1);
            default:
                return false;
        }
    }
}
