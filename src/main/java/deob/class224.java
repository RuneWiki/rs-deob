package deob;

@ObfuscatedName("hq")
public class class224 extends class244 {

    @ObfuscatedName("hq.c")
    public final int field2712;

    @ObfuscatedName("hq.p")
    public final class227 field2710;

    @ObfuscatedName("hq.f")
    public int field2711;

    @ObfuscatedName("hq.n")
    public class239 field2713;

    @ObfuscatedName("hq.k")
    public int field2714;

    @ObfuscatedName("hq.w")
    public int field2715;

    public class224(class291 arg0, class291 arg1, int arg2, class227 arg3) {
        super(arg0, arg1);
        this.field2712 = arg2;
        this.field2710 = arg3;
        this.method4297();
    }

    @ObfuscatedName("hq.c(I)V")
    public void method4297() {
        this.field2711 = Statics.method5147(this.field2712).method3424().field2105;
        this.field2713 = this.field2710.method4447(class172.method2879(this.field2711));
        class172 var1 = class172.method2879(this.method4295());
        class458 var2 = var1.method3188(false);
        if (var2 == null) {
            this.field2714 = 0;
            this.field2715 = 0;
        } else {
            this.field2714 = var2.field4825;
            this.field2715 = var2.field4829;
        }
    }

    @ObfuscatedName("hq.p(I)I")
    public int method4295() {
        return this.field2711;
    }

    @ObfuscatedName("hq.f(B)Lik;")
    public class239 method4298() {
        return this.field2713;
    }

    @ObfuscatedName("hq.n(I)I")
    public int method4296() {
        return this.field2714;
    }

    @ObfuscatedName("hq.k(I)I")
    public int method4299() {
        return this.field2715;
    }
}
