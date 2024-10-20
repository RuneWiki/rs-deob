package deob;

@ObfuscatedName("ac")
public final class class30 extends class85 {

    @ObfuscatedName("ac.n")
    public int field670;

    @ObfuscatedName("ac.d")
    public int field661;

    @ObfuscatedName("ac.s")
    public int field662;

    @ObfuscatedName("ac.q")
    public int field663;

    @ObfuscatedName("ac.j")
    public int field660;

    @ObfuscatedName("ac.k")
    public int field665;

    @ObfuscatedName("ac.i")
    public class43 field667;

    @ObfuscatedName("ac.m")
    public int field664 = 0;

    @ObfuscatedName("ac.p")
    public int field668 = 0;

    @ObfuscatedName("ac.h")
    public boolean field669 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field670 = arg0;
        this.field662 = arg1;
        this.field663 = arg2;
        this.field660 = arg3;
        this.field665 = arg4;
        this.field661 = arg5 + arg6;
        int var8 = class44.method17(this.field670).field1004;
        if (var8 == -1) {
            this.field669 = true;
        } else {
            this.field669 = false;
            this.field667 = class43.method2827(var8);
        }
    }

    @ObfuscatedName("ac.n(II)V")
    public final void method638(int arg0) {
        if (this.field669) {
            return;
        }
        this.field668 += arg0;
        while (this.field668 > this.field667.field980[this.field664]) {
            this.field668 -= this.field667.field980[this.field664];
            this.field664++;
            if (this.field664 >= this.field667.field973.length) {
                this.field669 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ac.s(I)Ldb;")
    public final class105 method36() {
        class44 var1 = class44.method17(this.field670);
        class105 var2;
        if (this.field669) {
            var2 = var1.method866(-1);
        } else {
            var2 = var1.method866(this.field664);
        }
        return var2 == null ? null : var2;
    }
}
