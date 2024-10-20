package deob;

@ObfuscatedName("al")
public final class class30 extends class86 {

    @ObfuscatedName("al.t")
    public int field693;

    @ObfuscatedName("al.i")
    public int field684;

    @ObfuscatedName("al.g")
    public int field685;

    @ObfuscatedName("al.h")
    public int field686;

    @ObfuscatedName("al.z")
    public int field688;

    @ObfuscatedName("al.r")
    public int field694;

    @ObfuscatedName("al.f")
    public class43 field683;

    @ObfuscatedName("al.s")
    public int field689 = 0;

    @ObfuscatedName("al.d")
    public int field687 = 0;

    @ObfuscatedName("al.l")
    public boolean field692 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field693 = arg0;
        this.field685 = arg1;
        this.field686 = arg2;
        this.field694 = arg3;
        this.field688 = arg4;
        this.field684 = arg5 + arg6;
        int var8 = class44.method153(this.field693).field1015;
        if (var8 == -1) {
            this.field692 = true;
        } else {
            this.field692 = false;
            this.field683 = class43.method168(var8);
        }
    }

    @ObfuscatedName("al.t(II)V")
    public final void method628(int arg0) {
        if (this.field692) {
            return;
        }
        this.field687 += arg0;
        while (this.field687 > this.field683.field988[this.field689]) {
            this.field687 -= this.field683.field988[this.field689];
            this.field689++;
            if (this.field689 >= this.field683.field986.length) {
                this.field692 = true;
                break;
            }
        }
    }

    @ObfuscatedName("al.g(I)Ldk;")
    public final class106 method11() {
        class44 var1 = class44.method153(this.field693);
        class106 var2;
        if (this.field692) {
            var2 = var1.method851(-1);
        } else {
            var2 = var1.method851(this.field689);
        }
        return var2 == null ? null : var2;
    }
}
