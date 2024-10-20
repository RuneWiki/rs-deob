package deob;

@ObfuscatedName("j")
public class class19 extends class35 {

    @ObfuscatedName("j.q")
    public final int field126;

    @ObfuscatedName("j.w")
    public final class29 field123;

    @ObfuscatedName("j.e")
    public final int field124;

    @ObfuscatedName("j.p")
    public final int field125;

    public class19(class214 arg0, class214 arg1, int arg2, class29 arg3) {
        super(arg0, arg1);
        this.field126 = arg2;
        this.field123 = arg3;
        class242 var5 = class242.method3753(this.method176());
        class326 var6 = var5.method3996(false);
        if (var6 == null) {
            this.field124 = 0;
            this.field125 = 0;
        } else {
            this.field124 = var6.field3900;
            this.field125 = var6.field3901;
        }
    }

    @ObfuscatedName("j.q(I)I")
    public int method176() {
        return this.field126;
    }

    @ObfuscatedName("j.w(I)Las;")
    public class29 method177() {
        return this.field123;
    }

    @ObfuscatedName("j.e(B)I")
    public int method178() {
        return this.field124;
    }

    @ObfuscatedName("j.p(B)I")
    public int method192() {
        return this.field125;
    }
}
