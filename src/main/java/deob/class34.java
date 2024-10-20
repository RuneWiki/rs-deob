package deob;

@ObfuscatedName("aw")
public final class class34 extends class90 {

    @ObfuscatedName("aw.i")
    public int field747;

    @ObfuscatedName("aw.e")
    public int field735;

    @ObfuscatedName("aw.f")
    public int field739;

    @ObfuscatedName("aw.k")
    public int field737;

    @ObfuscatedName("aw.g")
    public int field738;

    @ObfuscatedName("aw.n")
    public int field749;

    @ObfuscatedName("aw.a")
    public class202 field740;

    @ObfuscatedName("aw.q")
    public int field741 = 0;

    @ObfuscatedName("aw.w")
    public int field742 = 0;

    @ObfuscatedName("aw.v")
    public boolean field748 = false;

    public class34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field747 = arg0;
        this.field739 = arg1;
        this.field737 = arg2;
        this.field738 = arg3;
        this.field749 = arg4;
        this.field735 = arg5 + arg6;
        int var8 = class191.method194(this.field747).field2798;
        if (var8 == -1) {
            this.field748 = true;
        } else {
            this.field748 = false;
            this.field740 = class202.method2010(var8);
        }
    }

    @ObfuscatedName("aw.i(II)V")
    public final void method656(int arg0) {
        if (this.field748) {
            return;
        }
        this.field742 += arg0;
        while (this.field742 > this.field740.field3054[this.field741]) {
            this.field742 -= this.field740.field3054[this.field741];
            this.field741++;
            if (this.field741 >= this.field740.field3053.length) {
                this.field748 = true;
                break;
            }
        }
    }

    @ObfuscatedName("aw.f(B)Lch;")
    public final class83 method227() {
        class191 var1 = class191.method194(this.field747);
        class83 var2;
        if (this.field748) {
            var2 = var1.method3208(-1);
        } else {
            var2 = var1.method3208(this.field741);
        }
        return var2 == null ? null : var2;
    }
}
