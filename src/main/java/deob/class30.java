package deob;

@ObfuscatedName("aw")
public final class class30 extends class85 {

    @ObfuscatedName("aw.j")
    public int field682;

    @ObfuscatedName("aw.l")
    public int field691;

    @ObfuscatedName("aw.a")
    public int field692;

    @ObfuscatedName("aw.i")
    public int field686;

    @ObfuscatedName("aw.f")
    public int field683;

    @ObfuscatedName("aw.m")
    public int field684;

    @ObfuscatedName("aw.o")
    public class43 field685;

    @ObfuscatedName("aw.h")
    public int field690 = 0;

    @ObfuscatedName("aw.n")
    public int field687 = 0;

    @ObfuscatedName("aw.k")
    public boolean field688 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field682 = arg0;
        this.field692 = arg1;
        this.field686 = arg2;
        this.field683 = arg3;
        this.field684 = arg4;
        this.field691 = arg5 + arg6;
        int var8 = class44.method632(this.field682).field1013;
        if (var8 == -1) {
            this.field688 = true;
        } else {
            this.field688 = false;
            this.field685 = class43.method729(var8);
        }
    }

    @ObfuscatedName("aw.j(II)V")
    public final void method652(int arg0) {
        if (this.field688) {
            return;
        }
        this.field687 += arg0;
        while (this.field687 > this.field685.field989[this.field690]) {
            this.field687 -= this.field685.field989[this.field690];
            this.field690++;
            if (this.field690 >= this.field685.field987.length) {
                this.field688 = true;
                break;
            }
        }
    }

    @ObfuscatedName("aw.a(I)Ldd;")
    public final class105 method14() {
        class44 var1 = class44.method632(this.field682);
        class105 var2;
        if (this.field688) {
            var2 = var1.method884(-1);
        } else {
            var2 = var1.method884(this.field690);
        }
        return var2 == null ? null : var2;
    }
}
