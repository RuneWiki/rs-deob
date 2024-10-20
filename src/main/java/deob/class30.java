package deob;

@ObfuscatedName("ad")
public final class class30 extends class85 {

    @ObfuscatedName("ad.k")
    public int field674;

    @ObfuscatedName("ad.h")
    public int field664;

    @ObfuscatedName("ad.o")
    public int field665;

    @ObfuscatedName("ad.z")
    public int field668;

    @ObfuscatedName("ad.c")
    public int field670;

    @ObfuscatedName("ad.d")
    public int field677;

    @ObfuscatedName("ad.l")
    public class43 field669;

    @ObfuscatedName("ad.b")
    public int field667 = 0;

    @ObfuscatedName("ad.j")
    public int field671 = 0;

    @ObfuscatedName("ad.f")
    public boolean field672 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field674 = arg0;
        this.field665 = arg1;
        this.field670 = arg2;
        this.field677 = arg3;
        this.field668 = arg4;
        this.field664 = arg5 + arg6;
        int var8 = class44.method520(this.field674).field993;
        if (var8 == -1) {
            this.field672 = true;
        } else {
            this.field672 = false;
            this.field669 = class43.method3491(var8);
        }
    }

    @ObfuscatedName("ad.k(IB)V")
    public final void method613(int arg0) {
        if (this.field672) {
            return;
        }
        this.field671 += arg0;
        while (this.field671 > this.field669.field980[this.field667]) {
            this.field671 -= this.field669.field980[this.field667];
            this.field667++;
            if (this.field667 >= this.field669.field974.length) {
                this.field672 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ad.o(I)Ldl;")
    public final class105 method11() {
        class44 var1 = class44.method520(this.field674);
        class105 var2;
        if (this.field672) {
            var2 = var1.method847(-1);
        } else {
            var2 = var1.method847(this.field667);
        }
        return var2 == null ? null : var2;
    }
}
