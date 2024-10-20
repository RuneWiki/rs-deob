package deob;

@ObfuscatedName("a")
public final class class7 extends class85 {

    @ObfuscatedName("a.y")
    public int field108;

    @ObfuscatedName("a.d")
    public int field100;

    @ObfuscatedName("a.g")
    public int field103;

    @ObfuscatedName("a.w")
    public int field102;

    @ObfuscatedName("a.e")
    public int field110;

    @ObfuscatedName("a.c")
    public int field107;

    @ObfuscatedName("a.a")
    public int field104;

    @ObfuscatedName("a.q")
    public int field106;

    @ObfuscatedName("a.m")
    public int field99;

    @ObfuscatedName("a.n")
    public int field118;

    @ObfuscatedName("a.k")
    public int field121;

    @ObfuscatedName("a.o")
    public boolean field119 = false;

    @ObfuscatedName("a.f")
    public double field105;

    @ObfuscatedName("a.s")
    public double field112;

    @ObfuscatedName("a.z")
    public double field113;

    @ObfuscatedName("a.b")
    public double field114;

    @ObfuscatedName("a.p")
    public double field115;

    @ObfuscatedName("a.r")
    public double field116;

    @ObfuscatedName("a.x")
    public double field117;

    @ObfuscatedName("a.h")
    public double field111;

    @ObfuscatedName("a.j")
    public int field109;

    @ObfuscatedName("a.v")
    public int field120;

    @ObfuscatedName("a.l")
    public class43 field126;

    @ObfuscatedName("a.u")
    public int field122 = 0;

    @ObfuscatedName("a.t")
    public int field123 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field108 = arg0;
        this.field100 = arg1;
        this.field103 = arg2;
        this.field102 = arg3;
        this.field110 = arg4;
        this.field104 = arg5;
        this.field106 = arg6;
        this.field99 = arg7;
        this.field118 = arg8;
        this.field121 = arg9;
        this.field107 = arg10;
        this.field119 = false;
        int var12 = class44.method3639(this.field108).field1010;
        if (var12 == -1) {
            this.field126 = null;
        } else {
            this.field126 = class43.method750(var12);
        }
    }

    @ObfuscatedName("a.y(IIIIB)V")
    public final void method98(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field119) {
            double var5 = (double) (arg0 - this.field103);
            double var7 = (double) (arg1 - this.field102);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field105 = (double) this.field118 * var5 / var9 + (double) this.field103;
            this.field112 = (double) this.field118 * var7 / var9 + (double) this.field102;
            this.field113 = (double) this.field110;
        }
        double var11 = (double) (this.field106 + 1 - arg3);
        this.field114 = ((double) arg0 - this.field105) / var11;
        this.field115 = ((double) arg1 - this.field112) / var11;
        this.field116 = Math.sqrt(this.field115 * this.field115 + this.field114 * this.field114);
        if (!this.field119) {
            this.field117 = -this.field116 * Math.tan((double) this.field99 * 0.02454369D);
        }
        this.field111 = ((double) arg2 - this.field113 - this.field117 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("a.d(IB)V")
    public final void method105(int arg0) {
        this.field119 = true;
        this.field105 += (double) arg0 * this.field114;
        this.field112 += (double) arg0 * this.field115;
        this.field113 += this.field111 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field117;
        this.field117 += (double) arg0 * this.field111;
        this.field109 = (int) (Math.atan2(this.field114, this.field115) * 325.949D) + 1024 & 0x7FF;
        this.field120 = (int) (Math.atan2(this.field117, this.field116) * 325.949D) & 0x7FF;
        if (this.field126 == null) {
            return;
        }
        this.field123 += arg0;
        while (true) {
            do {
                do {
                    if (this.field123 <= this.field126.field985[this.field122]) {
                        return;
                    }
                    this.field123 -= this.field126.field985[this.field122];
                    this.field122++;
                } while (this.field122 < this.field126.field986.length);
                this.field122 -= this.field126.field994;
            } while (this.field122 >= 0 && this.field122 < this.field126.field986.length);
            this.field122 = 0;
        }
    }

    @ObfuscatedName("a.g(I)Ldg;")
    public final class105 method10() {
        class44 var1 = class44.method3639(this.field108);
        class105 var2 = var1.method874(this.field122);
        if (var2 == null) {
            return null;
        } else {
            var2.method2159(this.field120);
            return var2;
        }
    }
}
