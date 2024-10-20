package deob;

@ObfuscatedName("q")
public final class class7 extends class78 {

    @ObfuscatedName("q.e")
    public int field109;

    @ObfuscatedName("q.v")
    public int field106;

    @ObfuscatedName("q.i")
    public int field107;

    @ObfuscatedName("q.g")
    public int field108;

    @ObfuscatedName("q.x")
    public int field123;

    @ObfuscatedName("q.b")
    public int field110;

    @ObfuscatedName("q.q")
    public int field111;

    @ObfuscatedName("q.l")
    public int field112;

    @ObfuscatedName("q.m")
    public int field113;

    @ObfuscatedName("q.u")
    public int field131;

    @ObfuscatedName("q.s")
    public int field119;

    @ObfuscatedName("q.f")
    public boolean field116 = false;

    @ObfuscatedName("q.p")
    public double field117;

    @ObfuscatedName("q.w")
    public double field118;

    @ObfuscatedName("q.y")
    public double field127;

    @ObfuscatedName("q.h")
    public double field120;

    @ObfuscatedName("q.j")
    public double field121;

    @ObfuscatedName("q.c")
    public double field105;

    @ObfuscatedName("q.d")
    public double field128;

    @ObfuscatedName("q.a")
    public double field124;

    @ObfuscatedName("q.o")
    public int field125;

    @ObfuscatedName("q.r")
    public int field126;

    @ObfuscatedName("q.t")
    public class38 field115;

    @ObfuscatedName("q.k")
    public int field122 = 0;

    @ObfuscatedName("q.n")
    public int field129 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field109 = arg0;
        this.field106 = arg1;
        this.field107 = arg2;
        this.field108 = arg3;
        this.field123 = arg4;
        this.field111 = arg5;
        this.field112 = arg6;
        this.field113 = arg7;
        this.field131 = arg8;
        this.field119 = arg9;
        this.field110 = arg10;
        this.field116 = false;
        int var12 = Statics.method1958(this.field109).field925;
        if (var12 == -1) {
            this.field115 = null;
        } else {
            this.field115 = class38.method730(var12);
        }
    }

    @ObfuscatedName("q.e(IIIII)V")
    public final void method77(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field116) {
            double var5 = (double) (arg0 - this.field107);
            double var7 = (double) (arg1 - this.field108);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field117 = (double) this.field131 * var5 / var9 + (double) this.field107;
            this.field118 = (double) this.field131 * var7 / var9 + (double) this.field108;
            this.field127 = (double) this.field123;
        }
        double var11 = (double) (this.field112 + 1 - arg3);
        this.field120 = ((double) arg0 - this.field117) / var11;
        this.field121 = ((double) arg1 - this.field118) / var11;
        this.field105 = Math.sqrt(this.field121 * this.field121 + this.field120 * this.field120);
        if (!this.field116) {
            this.field128 = -this.field105 * Math.tan((double) this.field113 * 0.02454369D);
        }
        this.field124 = ((double) arg2 - this.field127 - this.field128 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("q.i(IB)V")
    public final void method76(int arg0) {
        this.field116 = true;
        this.field117 += (double) arg0 * this.field120;
        this.field118 += (double) arg0 * this.field121;
        this.field127 += this.field124 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field128;
        this.field128 += (double) arg0 * this.field124;
        this.field125 = (int) (Math.atan2(this.field120, this.field121) * 325.949D) + 1024 & 0x7FF;
        this.field126 = (int) (Math.atan2(this.field128, this.field105) * 325.949D) & 0x7FF;
        if (this.field115 == null) {
            return;
        }
        this.field129 += arg0;
        while (true) {
            do {
                do {
                    if (this.field129 <= this.field115.field899[this.field122]) {
                        return;
                    }
                    this.field129 -= this.field115.field899[this.field122];
                    this.field122++;
                } while (this.field122 < this.field115.field897.length);
                this.field122 -= this.field115.field902;
            } while (this.field122 >= 0 && this.field122 < this.field115.field897.length);
            this.field122 = 0;
        }
    }

    @ObfuscatedName("q.v(I)Lcz;")
    public final class98 method17() {
        class39 var1 = Statics.method1958(this.field109);
        class98 var2 = var1.method736(this.field122);
        if (var2 == null) {
            return null;
        } else {
            var2.method1986(this.field126);
            return var2;
        }
    }
}
