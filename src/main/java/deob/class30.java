package deob;

@ObfuscatedName("az")
public final class class30 extends class85 {

    @ObfuscatedName("az.c")
    public int field695;

    @ObfuscatedName("az.h")
    public int field690;

    @ObfuscatedName("az.k")
    public int field683;

    @ObfuscatedName("az.t")
    public int field684;

    @ObfuscatedName("az.g")
    public int field685;

    @ObfuscatedName("az.o")
    public int field681;

    @ObfuscatedName("az.i")
    public class43 field687;

    @ObfuscatedName("az.w")
    public int field682 = 0;

    @ObfuscatedName("az.m")
    public int field689 = 0;

    @ObfuscatedName("az.r")
    public boolean field693 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field695 = arg0;
        this.field683 = arg1;
        this.field684 = arg2;
        this.field685 = arg3;
        this.field681 = arg4;
        this.field690 = arg5 + arg6;
        int var8 = class44.method1037(this.field695).field1016;
        if (var8 == -1) {
            this.field693 = true;
        } else {
            this.field693 = false;
            this.field687 = class43.method2648(var8);
        }
    }

    @ObfuscatedName("az.c(II)V")
    public final void method636(int arg0) {
        if (this.field693) {
            return;
        }
        this.field689 += arg0;
        while (this.field689 > this.field687.field991[this.field682]) {
            this.field689 -= this.field687.field991[this.field682];
            this.field682++;
            if (this.field682 >= this.field687.field987.length) {
                this.field693 = true;
                break;
            }
        }
    }

    @ObfuscatedName("az.k(B)Ldt;")
    public final class105 method13() {
        class44 var1 = class44.method1037(this.field695);
        class105 var2;
        if (this.field693) {
            var2 = var1.method876(-1);
        } else {
            var2 = var1.method876(this.field682);
        }
        return var2 == null ? null : var2;
    }
}
