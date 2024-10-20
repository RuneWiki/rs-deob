package deob;

@ObfuscatedName("ax")
public final class class30 extends class85 {

    @ObfuscatedName("ax.a")
    public int field687;

    @ObfuscatedName("ax.r")
    public int field686;

    @ObfuscatedName("ax.f")
    public int field697;

    @ObfuscatedName("ax.s")
    public int field688;

    @ObfuscatedName("ax.y")
    public class43 field691;

    @ObfuscatedName("ax.e")
    public int field689;

    @ObfuscatedName("ax.g")
    public int field690;

    @ObfuscatedName("ax.m")
    public int field692 = 0;

    @ObfuscatedName("ax.j")
    public int field693 = 0;

    @ObfuscatedName("ax.n")
    public boolean field694 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field687 = arg0;
        this.field697 = arg1;
        this.field688 = arg2;
        this.field689 = arg3;
        this.field690 = arg4;
        this.field686 = arg5 + arg6;
        int var8 = class44.method588(this.field687).field1013;
        if (var8 == -1) {
            this.field694 = true;
        } else {
            this.field694 = false;
            this.field691 = class43.method2701(var8);
        }
    }

    @ObfuscatedName("ax.a(II)V")
    public final void method647(int arg0) {
        if (this.field694) {
            return;
        }
        this.field693 += arg0;
        while (this.field693 > this.field691.field991[this.field692]) {
            this.field693 -= this.field691.field991[this.field692];
            this.field692++;
            if (this.field692 >= this.field691.field989.length) {
                this.field694 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ax.f(I)Ldn;")
    public final class105 method27() {
        class44 var1 = class44.method588(this.field687);
        class105 var2;
        if (this.field694) {
            var2 = var1.method884(-1);
        } else {
            var2 = var1.method884(this.field692);
        }
        return var2 == null ? null : var2;
    }
}
