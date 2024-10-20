package deob;

@ObfuscatedName("hz")
public class class231 extends class243 {

    @ObfuscatedName("hz.c")
    public final int field2766;

    @ObfuscatedName("hz.v")
    public final class238 field2770;

    @ObfuscatedName("hz.q")
    public final int field2768;

    @ObfuscatedName("hz.f")
    public final int field2769;

    public class231(class289 arg0, class289 arg1, int arg2, class238 arg3) {
        super(arg0, arg1);
        this.field2766 = arg2;
        this.field2770 = arg3;
        class171 var5 = class171.method6889(this.method4228());
        class456 var6 = var5.method3060(false);
        if (var6 == null) {
            this.field2768 = 0;
            this.field2769 = 0;
        } else {
            this.field2768 = var6.field4796;
            this.field2769 = var6.field4795;
        }
    }

    @ObfuscatedName("hz.v(I)I")
    public int method4228() {
        return this.field2766;
    }

    @ObfuscatedName("hz.q(I)Liz;")
    public class238 method4237() {
        return this.field2770;
    }

    @ObfuscatedName("hz.f(I)I")
    public int method4230() {
        return this.field2768;
    }

    @ObfuscatedName("hz.j(B)I")
    public int method4231() {
        return this.field2769;
    }
}
