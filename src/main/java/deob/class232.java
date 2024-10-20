package deob;

@ObfuscatedName("hs")
public class class232 extends class244 {

    @ObfuscatedName("hs.c")
    public final int field2804;

    @ObfuscatedName("hs.p")
    public final class239 field2801;

    @ObfuscatedName("hs.f")
    public final int field2802;

    @ObfuscatedName("hs.n")
    public final int field2803;

    public class232(class291 arg0, class291 arg1, int arg2, class239 arg3) {
        super(arg0, arg1);
        this.field2804 = arg2;
        this.field2801 = arg3;
        class172 var5 = class172.method2879(this.method4295());
        class458 var6 = var5.method3188(false);
        if (var6 == null) {
            this.field2802 = 0;
            this.field2803 = 0;
        } else {
            this.field2802 = var6.field4825;
            this.field2803 = var6.field4829;
        }
    }

    @ObfuscatedName("hs.p(I)I")
    public int method4295() {
        return this.field2804;
    }

    @ObfuscatedName("hs.f(B)Lik;")
    public class239 method4298() {
        return this.field2801;
    }

    @ObfuscatedName("hs.n(I)I")
    public int method4296() {
        return this.field2802;
    }

    @ObfuscatedName("hs.k(I)I")
    public int method4299() {
        return this.field2803;
    }
}
