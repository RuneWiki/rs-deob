package deob;

@ObfuscatedName("ae")
public final class class30 extends class85 {

    @ObfuscatedName("ae.j")
    public int field668;

    @ObfuscatedName("ae.m")
    public int field664;

    @ObfuscatedName("ae.f")
    public int field665;

    @ObfuscatedName("ae.l")
    public int field666;

    @ObfuscatedName("ae.u")
    public int field667;

    @ObfuscatedName("ae.a")
    public int field677;

    @ObfuscatedName("ae.h")
    public class43 field671;

    @ObfuscatedName("ae.i")
    public int field670 = 0;

    @ObfuscatedName("ae.t")
    public int field674 = 0;

    @ObfuscatedName("ae.k")
    public boolean field663 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field668 = arg0;
        this.field665 = arg1;
        this.field666 = arg2;
        this.field667 = arg3;
        this.field677 = arg4;
        this.field664 = arg5 + arg6;
        int var8 = class44.method152(this.field668).field1006;
        if (var8 == -1) {
            this.field663 = true;
        } else {
            this.field663 = false;
            this.field671 = class43.method575(var8);
        }
    }

    @ObfuscatedName("ae.j(II)V")
    public final void method686(int arg0) {
        if (this.field663) {
            return;
        }
        this.field674 += arg0;
        while (this.field674 > this.field671.field976[this.field670]) {
            this.field674 -= this.field671.field976[this.field670];
            this.field670++;
            if (this.field670 >= this.field671.field974.length) {
                this.field663 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ae.f(I)Lda;")
    public final class105 method17() {
        class44 var1 = class44.method152(this.field668);
        class105 var2;
        if (this.field663) {
            var2 = var1.method914(-1);
        } else {
            var2 = var1.method914(this.field670);
        }
        return var2 == null ? null : var2;
    }
}
