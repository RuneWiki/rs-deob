package deob;

@ObfuscatedName("g")
public final class class7 extends class78 {

    @ObfuscatedName("g.k")
    public int field116;

    @ObfuscatedName("g.b")
    public int field123;

    @ObfuscatedName("g.e")
    public int field101;

    @ObfuscatedName("g.i")
    public int field102;

    @ObfuscatedName("g.t")
    public int field103;

    @ObfuscatedName("g.z")
    public int field104;

    @ObfuscatedName("g.g")
    public int field108;

    @ObfuscatedName("g.c")
    public int field106;

    @ObfuscatedName("g.o")
    public int field107;

    @ObfuscatedName("g.q")
    public int field113;

    @ObfuscatedName("g.w")
    public int field126;

    @ObfuscatedName("g.y")
    public boolean field110 = false;

    @ObfuscatedName("g.p")
    public double field111;

    @ObfuscatedName("g.m")
    public double field109;

    @ObfuscatedName("g.a")
    public double field112;

    @ObfuscatedName("g.u")
    public double field114;

    @ObfuscatedName("g.n")
    public double field115;

    @ObfuscatedName("g.x")
    public double field105;

    @ObfuscatedName("g.f")
    public double field117;

    @ObfuscatedName("g.v")
    public double field99;

    @ObfuscatedName("g.s")
    public int field119;

    @ObfuscatedName("g.r")
    public int field120;

    @ObfuscatedName("g.j")
    public class38 field118;

    @ObfuscatedName("g.h")
    public int field122 = 0;

    @ObfuscatedName("g.d")
    public int field100 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field116 = arg0;
        this.field123 = arg1;
        this.field101 = arg2;
        this.field102 = arg3;
        this.field103 = arg4;
        this.field108 = arg5;
        this.field106 = arg6;
        this.field107 = arg7;
        this.field113 = arg8;
        this.field126 = arg9;
        this.field104 = arg10;
        this.field110 = false;
        int var12 = class39.method788(this.field116).field934;
        if (var12 == -1) {
            this.field118 = null;
        } else {
            this.field118 = class38.method595(var12);
        }
    }

    @ObfuscatedName("g.k(IIIIB)V")
    public final void method81(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field110) {
            double var5 = (double) (arg0 - this.field101);
            double var7 = (double) (arg1 - this.field102);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field111 = (double) this.field113 * var5 / var9 + (double) this.field101;
            this.field109 = (double) this.field113 * var7 / var9 + (double) this.field102;
            this.field112 = (double) this.field103;
        }
        double var11 = (double) (this.field106 + 1 - arg3);
        this.field114 = ((double) arg0 - this.field111) / var11;
        this.field115 = ((double) arg1 - this.field109) / var11;
        this.field105 = Math.sqrt(this.field115 * this.field115 + this.field114 * this.field114);
        if (!this.field110) {
            this.field117 = -this.field105 * Math.tan((double) this.field107 * 0.02454369D);
        }
        this.field99 = ((double) arg2 - this.field112 - this.field117 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("g.e(IB)V")
    public final void method82(int arg0) {
        this.field110 = true;
        this.field111 += (double) arg0 * this.field114;
        this.field109 += (double) arg0 * this.field115;
        this.field112 += this.field99 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field117;
        this.field117 += (double) arg0 * this.field99;
        this.field119 = (int) (Math.atan2(this.field114, this.field115) * 325.949D) + 1024 & 0x7FF;
        this.field120 = (int) (Math.atan2(this.field117, this.field105) * 325.949D) & 0x7FF;
        if (this.field118 == null) {
            return;
        }
        this.field100 += arg0;
        while (true) {
            do {
                do {
                    if (this.field100 <= this.field118.field902[this.field122]) {
                        return;
                    }
                    this.field100 -= this.field118.field902[this.field122];
                    this.field122++;
                } while (this.field122 < this.field118.field906.length);
                this.field122 -= this.field118.field904;
            } while (this.field122 >= 0 && this.field122 < this.field118.field906.length);
            this.field122 = 0;
        }
    }

    @ObfuscatedName("g.b(I)Lck;")
    public final class98 method19() {
        class39 var1 = class39.method788(this.field116);
        class98 var2 = var1.method738(this.field122);
        if (var2 == null) {
            return null;
        } else {
            var2.method1994(this.field120);
            return var2;
        }
    }
}
