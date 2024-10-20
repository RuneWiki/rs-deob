package deob;

@ObfuscatedName("ae")
public final class class30 extends class86 {

    @ObfuscatedName("ae.b")
    public int field688;

    @ObfuscatedName("ae.g")
    public int field677;

    @ObfuscatedName("ae.j")
    public int field676;

    @ObfuscatedName("ae.d")
    public int field679;

    @ObfuscatedName("ae.x")
    public int field684;

    @ObfuscatedName("ae.y")
    public class43 field682;

    @ObfuscatedName("ae.r")
    public int field681;

    @ObfuscatedName("ae.c")
    public int field683 = 0;

    @ObfuscatedName("ae.l")
    public int field686 = 0;

    @ObfuscatedName("ae.u")
    public boolean field685 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field688 = arg0;
        this.field676 = arg1;
        this.field679 = arg2;
        this.field684 = arg3;
        this.field681 = arg4;
        this.field677 = arg5 + arg6;
        int var8 = class44.method701(this.field688).field991;
        if (var8 == -1) {
            this.field685 = true;
        } else {
            this.field685 = false;
            this.field682 = class43.method175(var8);
        }
    }

    @ObfuscatedName("ae.b(IB)V")
    public final void method647(int arg0) {
        if (this.field685) {
            return;
        }
        this.field686 += arg0;
        while (this.field686 > this.field682.field984[this.field683]) {
            this.field686 -= this.field682.field984[this.field683];
            this.field683++;
            if (this.field683 >= this.field682.field966.length) {
                this.field685 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ae.j(I)Ldd;")
    public final class106 method16() {
        class44 var1 = class44.method701(this.field688);
        class106 var2;
        if (this.field685) {
            var2 = var1.method889(-1);
        } else {
            var2 = var1.method889(this.field683);
        }
        return var2 == null ? null : var2;
    }
}
