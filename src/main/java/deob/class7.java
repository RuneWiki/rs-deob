package deob;

@ObfuscatedName("l")
public final class class7 extends class75 {

    @ObfuscatedName("l.z")
    public int field131;

    @ObfuscatedName("l.n")
    public int field105;

    @ObfuscatedName("l.u")
    public int field128;

    @ObfuscatedName("l.t")
    public int field107;

    @ObfuscatedName("l.e")
    public int field109;

    @ObfuscatedName("l.a")
    public int field118;

    @ObfuscatedName("l.l")
    public int field111;

    @ObfuscatedName("l.v")
    public int field130;

    @ObfuscatedName("l.j")
    public int field112;

    @ObfuscatedName("l.k")
    public int field110;

    @ObfuscatedName("l.g")
    public int field114;

    @ObfuscatedName("l.d")
    public boolean field108 = false;

    @ObfuscatedName("l.b")
    public double field116;

    @ObfuscatedName("l.i")
    public double field117;

    @ObfuscatedName("l.o")
    public double field122;

    @ObfuscatedName("l.x")
    public double field119;

    @ObfuscatedName("l.m")
    public double field120;

    @ObfuscatedName("l.f")
    public double field121;

    @ObfuscatedName("l.q")
    public double field132;

    @ObfuscatedName("l.c")
    public double field123;

    @ObfuscatedName("l.h")
    public int field124;

    @ObfuscatedName("l.y")
    public int field125;

    @ObfuscatedName("l.r")
    public class35 field126;

    @ObfuscatedName("l.w")
    public int field127 = 0;

    @ObfuscatedName("l.p")
    public int field104 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field131 = arg0;
        this.field105 = arg1;
        this.field128 = arg2;
        this.field107 = arg3;
        this.field109 = arg4;
        this.field111 = arg5;
        this.field130 = arg6;
        this.field112 = arg7;
        this.field110 = arg8;
        this.field114 = arg9;
        this.field118 = arg10;
        this.field108 = false;
        int var12 = class36.method2724(this.field131).field902;
        if (var12 == -1) {
            this.field126 = null;
        } else {
            this.field126 = class35.method2065(var12);
        }
    }

    @ObfuscatedName("l.z(IIIIB)V")
    public final void method108(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field108) {
            double var5 = (double) (arg0 - this.field128);
            double var7 = (double) (arg1 - this.field107);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field116 = (double) this.field110 * var5 / var9 + (double) this.field128;
            this.field117 = (double) this.field110 * var7 / var9 + (double) this.field107;
            this.field122 = (double) this.field109;
        }
        double var11 = (double) (this.field130 + 1 - arg3);
        this.field119 = ((double) arg0 - this.field116) / var11;
        this.field120 = ((double) arg1 - this.field117) / var11;
        this.field121 = Math.sqrt(this.field120 * this.field120 + this.field119 * this.field119);
        if (!this.field108) {
            this.field132 = -this.field121 * Math.tan((double) this.field112 * 0.02454369D);
        }
        this.field123 = ((double) arg2 - this.field122 - this.field132 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("l.u(II)V")
    public final void method109(int arg0) {
        this.field108 = true;
        this.field116 += (double) arg0 * this.field119;
        this.field117 += (double) arg0 * this.field120;
        this.field122 += this.field123 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field132;
        this.field132 += (double) arg0 * this.field123;
        this.field124 = (int) (Math.atan2(this.field119, this.field120) * 325.949D) + 1024 & 0x7FF;
        this.field125 = (int) (Math.atan2(this.field132, this.field121) * 325.949D) & 0x7FF;
        if (this.field126 == null) {
            return;
        }
        this.field104 += arg0;
        while (true) {
            do {
                do {
                    if (this.field104 <= this.field126.field877[this.field127]) {
                        return;
                    }
                    this.field104 -= this.field126.field877[this.field127];
                    this.field127++;
                } while (this.field127 < this.field126.field876.length);
                this.field127 -= this.field126.field885;
            } while (this.field127 >= 0 && this.field127 < this.field126.field876.length);
            this.field127 = 0;
        }
    }

    @ObfuscatedName("l.n(I)Lcp;")
    public final class95 method19() {
        class36 var1 = class36.method2724(this.field131);
        class95 var2 = var1.method752(this.field127);
        if (var2 == null) {
            return null;
        } else {
            var2.method1991(this.field125);
            return var2;
        }
    }
}
