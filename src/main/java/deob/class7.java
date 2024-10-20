package deob;

@ObfuscatedName("i")
public final class class7 extends class80 {

    @ObfuscatedName("i.n")
    public int field99;

    @ObfuscatedName("i.o")
    public int field114;

    @ObfuscatedName("i.a")
    public int field92;

    @ObfuscatedName("i.w")
    public int field93;

    @ObfuscatedName("i.m")
    public int field94;

    @ObfuscatedName("i.h")
    public int field95;

    @ObfuscatedName("i.i")
    public int field96;

    @ObfuscatedName("i.r")
    public int field97;

    @ObfuscatedName("i.l")
    public int field107;

    @ObfuscatedName("i.f")
    public int field91;

    @ObfuscatedName("i.e")
    public int field100;

    @ObfuscatedName("i.z")
    public boolean field101 = false;

    @ObfuscatedName("i.v")
    public double field102;

    @ObfuscatedName("i.x")
    public double field103;

    @ObfuscatedName("i.q")
    public double field104;

    @ObfuscatedName("i.b")
    public double field105;

    @ObfuscatedName("i.u")
    public double field106;

    @ObfuscatedName("i.t")
    public double field98;

    @ObfuscatedName("i.s")
    public double field111;

    @ObfuscatedName("i.p")
    public double field118;

    @ObfuscatedName("i.d")
    public int field110;

    @ObfuscatedName("i.j")
    public int field116;

    @ObfuscatedName("i.k")
    public class40 field112;

    @ObfuscatedName("i.y")
    public int field113 = 0;

    @ObfuscatedName("i.c")
    public int field109 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field99 = arg0;
        this.field114 = arg1;
        this.field92 = arg2;
        this.field93 = arg3;
        this.field94 = arg4;
        this.field96 = arg5;
        this.field97 = arg6;
        this.field107 = arg7;
        this.field91 = arg8;
        this.field100 = arg9;
        this.field95 = arg10;
        this.field101 = false;
        int var12 = class41.method493(this.field99).field974;
        if (var12 == -1) {
            this.field112 = null;
        } else {
            this.field112 = Statics.method860(var12);
        }
    }

    @ObfuscatedName("i.n(IIIII)V")
    public final void method78(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field101) {
            double var5 = (double) (arg0 - this.field92);
            double var7 = (double) (arg1 - this.field93);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field102 = (double) this.field91 * var5 / var9 + (double) this.field92;
            this.field103 = (double) this.field91 * var7 / var9 + (double) this.field93;
            this.field104 = (double) this.field94;
        }
        double var11 = (double) (this.field97 + 1 - arg3);
        this.field105 = ((double) arg0 - this.field102) / var11;
        this.field106 = ((double) arg1 - this.field103) / var11;
        this.field98 = Math.sqrt(this.field106 * this.field106 + this.field105 * this.field105);
        if (!this.field101) {
            this.field111 = -this.field98 * Math.tan((double) this.field107 * 0.02454369D);
        }
        this.field118 = ((double) arg2 - this.field104 - this.field111 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("i.a(II)V")
    public final void method85(int arg0) {
        this.field101 = true;
        this.field102 += (double) arg0 * this.field105;
        this.field103 += (double) arg0 * this.field106;
        this.field104 += this.field118 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field111;
        this.field111 += (double) arg0 * this.field118;
        this.field110 = (int) (Math.atan2(this.field105, this.field106) * 325.949D) + 1024 & 0x7FF;
        this.field116 = (int) (Math.atan2(this.field111, this.field98) * 325.949D) & 0x7FF;
        if (this.field112 == null) {
            return;
        }
        this.field109 += arg0;
        while (true) {
            do {
                do {
                    if (this.field109 <= this.field112.field971[this.field113]) {
                        return;
                    }
                    this.field109 -= this.field112.field971[this.field113];
                    this.field113++;
                } while (this.field113 < this.field112.field957.length);
                this.field113 -= this.field112.field970;
            } while (this.field113 >= 0 && this.field113 < this.field112.field957.length);
            this.field113 = 0;
        }
    }

    @ObfuscatedName("i.o(I)Lcp;")
    public final class100 method13() {
        class41 var1 = class41.method493(this.field99);
        class100 var2 = var1.method793(this.field113);
        if (var2 == null) {
            return null;
        } else {
            var2.method2089(this.field116);
            return var2;
        }
    }
}
