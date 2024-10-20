package deob;

@ObfuscatedName("ab")
public final class class30 extends class85 {

    @ObfuscatedName("ab.i")
    public int field685;

    @ObfuscatedName("ab.v")
    public int field694;

    @ObfuscatedName("ab.f")
    public int field687;

    @ObfuscatedName("ab.h")
    public int field688;

    @ObfuscatedName("ab.a")
    public int field689;

    @ObfuscatedName("ab.s")
    public int field690;

    @ObfuscatedName("ab.p")
    public class43 field701;

    @ObfuscatedName("ab.r")
    public int field702 = 0;

    @ObfuscatedName("ab.k")
    public int field693 = 0;

    @ObfuscatedName("ab.d")
    public boolean field692 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field685 = arg0;
        this.field687 = arg1;
        this.field688 = arg2;
        this.field689 = arg3;
        this.field690 = arg4;
        this.field694 = arg5 + arg6;
        int var8 = class44.method769(this.field685).field1027;
        if (var8 == -1) {
            this.field692 = true;
        } else {
            this.field692 = false;
            this.field701 = class43.method3831(var8);
        }
    }

    @ObfuscatedName("ab.i(II)V")
    public final void method604(int arg0) {
        if (this.field692) {
            return;
        }
        this.field693 += arg0;
        while (this.field693 > this.field701.field1010[this.field702]) {
            this.field693 -= this.field701.field1010[this.field702];
            this.field702++;
            if (this.field702 >= this.field701.field1000.length) {
                this.field692 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ab.f(I)Ldo;")
    public final class105 method29() {
        class44 var1 = class44.method769(this.field685);
        class105 var2;
        if (this.field692) {
            var2 = var1.method840(-1);
        } else {
            var2 = var1.method840(this.field702);
        }
        return var2 == null ? null : var2;
    }
}
