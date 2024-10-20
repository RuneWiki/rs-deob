package deob;

@ObfuscatedName("av")
public final class class28 extends class80 {

    @ObfuscatedName("av.n")
    public int field658;

    @ObfuscatedName("av.w")
    public int field654;

    @ObfuscatedName("av.i")
    public int field655;

    @ObfuscatedName("av.e")
    public int field669;

    @ObfuscatedName("av.h")
    public int field657;

    @ObfuscatedName("av.q")
    public int field653;

    @ObfuscatedName("av.l")
    public class40 field667;

    @ObfuscatedName("av.c")
    public int field660 = 0;

    @ObfuscatedName("av.f")
    public int field668 = 0;

    @ObfuscatedName("av.s")
    public boolean field662 = false;

    public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field658 = arg0;
        this.field655 = arg1;
        this.field669 = arg2;
        this.field657 = arg3;
        this.field653 = arg4;
        this.field654 = arg5 + arg6;
        int var8 = class41.method667(this.field658).field957;
        if (var8 == -1) {
            this.field662 = true;
        } else {
            this.field662 = false;
            this.field667 = class40.method122(var8);
        }
    }

    @ObfuscatedName("av.n(II)V")
    public final void method567(int arg0) {
        if (this.field662) {
            return;
        }
        this.field668 += arg0;
        while (this.field668 > this.field667.field938[this.field660]) {
            this.field668 -= this.field667.field938[this.field660];
            this.field660++;
            if (this.field660 >= this.field667.field936.length) {
                this.field662 = true;
                break;
            }
        }
    }

    @ObfuscatedName("av.w(B)Lcw;")
    public final class100 method12() {
        class41 var1 = class41.method667(this.field658);
        class100 var2;
        if (this.field662) {
            var2 = var1.method780(-1);
        } else {
            var2 = var1.method780(this.field660);
        }
        return var2 == null ? null : var2;
    }
}
