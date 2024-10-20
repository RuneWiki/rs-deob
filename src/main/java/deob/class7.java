package deob;

@ObfuscatedName("m")
public final class class7 extends class85 {

    @ObfuscatedName("m.o")
    public int field120;

    @ObfuscatedName("m.f")
    public int field113;

    @ObfuscatedName("m.i")
    public int field110;

    @ObfuscatedName("m.h")
    public int field123;

    @ObfuscatedName("m.q")
    public int field112;

    @ObfuscatedName("m.u")
    public int field117;

    @ObfuscatedName("m.m")
    public int field111;

    @ObfuscatedName("m.y")
    public int field115;

    @ObfuscatedName("m.p")
    public int field122;

    @ObfuscatedName("m.t")
    public int field118;

    @ObfuscatedName("m.g")
    public int field108;

    @ObfuscatedName("m.v")
    public boolean field121 = false;

    @ObfuscatedName("m.l")
    public double field116;

    @ObfuscatedName("m.e")
    public double field109;

    @ObfuscatedName("m.a")
    public double field119;

    @ObfuscatedName("m.w")
    public double field114;

    @ObfuscatedName("m.d")
    public double field124;

    @ObfuscatedName("m.z")
    public double field125;

    @ObfuscatedName("m.s")
    public double field126;

    @ObfuscatedName("m.j")
    public double field127;

    @ObfuscatedName("m.b")
    public int field128;

    @ObfuscatedName("m.r")
    public int field129;

    @ObfuscatedName("m.n")
    public class43 field130;

    @ObfuscatedName("m.c")
    public int field131 = 0;

    @ObfuscatedName("m.k")
    public int field132 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field120 = arg0;
        this.field113 = arg1;
        this.field110 = arg2;
        this.field123 = arg3;
        this.field112 = arg4;
        this.field111 = arg5;
        this.field115 = arg6;
        this.field122 = arg7;
        this.field118 = arg8;
        this.field108 = arg9;
        this.field117 = arg10;
        this.field121 = false;
        int var12 = class44.method1455(this.field120).field998;
        if (var12 == -1) {
            this.field130 = null;
        } else {
            this.field130 = class43.method3081(var12);
        }
    }

    @ObfuscatedName("m.o(IIIII)V")
    public final void method78(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field121) {
            double var5 = (double) (arg0 - this.field110);
            double var7 = (double) (arg1 - this.field123);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field116 = (double) this.field118 * var5 / var9 + (double) this.field110;
            this.field109 = (double) this.field118 * var7 / var9 + (double) this.field123;
            this.field119 = (double) this.field112;
        }
        double var11 = (double) (this.field115 + 1 - arg3);
        this.field114 = ((double) arg0 - this.field116) / var11;
        this.field124 = ((double) arg1 - this.field109) / var11;
        this.field125 = Math.sqrt(this.field124 * this.field124 + this.field114 * this.field114);
        if (!this.field121) {
            this.field126 = -this.field125 * Math.tan((double) this.field122 * 0.02454369D);
        }
        this.field127 = ((double) arg2 - this.field119 - this.field126 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("m.f(IB)V")
    public final void method77(int arg0) {
        this.field121 = true;
        this.field116 += (double) arg0 * this.field114;
        this.field109 += (double) arg0 * this.field124;
        this.field119 += this.field127 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field126;
        this.field126 += (double) arg0 * this.field127;
        this.field128 = (int) (Math.atan2(this.field114, this.field124) * 325.949D) + 1024 & 0x7FF;
        this.field129 = (int) (Math.atan2(this.field126, this.field125) * 325.949D) & 0x7FF;
        if (this.field130 == null) {
            return;
        }
        this.field132 += arg0;
        while (true) {
            do {
                do {
                    if (this.field132 <= this.field130.field980[this.field131]) {
                        return;
                    }
                    this.field132 -= this.field130.field980[this.field131];
                    this.field131++;
                } while (this.field131 < this.field130.field978.length);
                this.field131 -= this.field130.field974;
            } while (this.field131 >= 0 && this.field131 < this.field130.field978.length);
            this.field131 = 0;
        }
    }

    @ObfuscatedName("m.i(B)Ldm;")
    public final class105 method21() {
        class44 var1 = class44.method1455(this.field120);
        class105 var2 = var1.method847(this.field131);
        if (var2 == null) {
            return null;
        } else {
            var2.method2092(this.field129);
            return var2;
        }
    }
}
