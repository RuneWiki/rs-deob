package deob;

@ObfuscatedName("ae")
public final class class34 extends class90 {

    @ObfuscatedName("ae.b")
    public int field745;

    @ObfuscatedName("ae.l")
    public int field737;

    @ObfuscatedName("ae.i")
    public int field738;

    @ObfuscatedName("ae.t")
    public int field739;

    @ObfuscatedName("ae.k")
    public int field740;

    @ObfuscatedName("ae.h")
    public int field741;

    @ObfuscatedName("ae.n")
    public class202 field742;

    @ObfuscatedName("ae.f")
    public int field743 = 0;

    @ObfuscatedName("ae.a")
    public int field744 = 0;

    @ObfuscatedName("ae.r")
    public boolean field748 = false;

    public class34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field745 = arg0;
        this.field738 = arg1;
        this.field739 = arg2;
        this.field740 = arg3;
        this.field741 = arg4;
        this.field737 = arg5 + arg6;
        int var8 = class191.method2966(this.field745).field2798;
        if (var8 == -1) {
            this.field748 = true;
        } else {
            this.field748 = false;
            this.field742 = class202.method262(var8);
        }
    }

    @ObfuscatedName("ae.b(II)V")
    public final void method753(int arg0) {
        if (this.field748) {
            return;
        }
        this.field744 += arg0;
        while (this.field744 > this.field742.field3067[this.field743]) {
            this.field744 -= this.field742.field3067[this.field743];
            this.field743++;
            if (this.field743 >= this.field742.field3073.length) {
                this.field748 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ae.i(B)Lcs;")
    public final class83 method226() {
        class191 var1 = class191.method2966(this.field745);
        class83 var2;
        if (this.field748) {
            var2 = var1.method3334(-1);
        } else {
            var2 = var1.method3334(this.field743);
        }
        return var2 == null ? null : var2;
    }
}
