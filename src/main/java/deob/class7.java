package deob;

@ObfuscatedName("j")
public final class class7 extends class85 {

    @ObfuscatedName("j.n")
    public int field122;

    @ObfuscatedName("j.q")
    public int field112;

    @ObfuscatedName("j.c")
    public int field109;

    @ObfuscatedName("j.l")
    public int field107;

    @ObfuscatedName("j.r")
    public int field111;

    @ObfuscatedName("j.u")
    public int field120;

    @ObfuscatedName("j.j")
    public int field113;

    @ObfuscatedName("j.w")
    public int field130;

    @ObfuscatedName("j.y")
    public int field115;

    @ObfuscatedName("j.o")
    public int field116;

    @ObfuscatedName("j.h")
    public int field126;

    @ObfuscatedName("j.e")
    public boolean field118 = false;

    @ObfuscatedName("j.v")
    public double field119;

    @ObfuscatedName("j.p")
    public double field110;

    @ObfuscatedName("j.m")
    public double field121;

    @ObfuscatedName("j.b")
    public double field114;

    @ObfuscatedName("j.s")
    public double field123;

    @ObfuscatedName("j.x")
    public double field124;

    @ObfuscatedName("j.z")
    public double field125;

    @ObfuscatedName("j.d")
    public double field132;

    @ObfuscatedName("j.a")
    public int field127;

    @ObfuscatedName("j.t")
    public int field128;

    @ObfuscatedName("j.k")
    public class43 field129;

    @ObfuscatedName("j.f")
    public int field108 = 0;

    @ObfuscatedName("j.g")
    public int field131 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field122 = arg0;
        this.field112 = arg1;
        this.field109 = arg2;
        this.field107 = arg3;
        this.field111 = arg4;
        this.field113 = arg5;
        this.field130 = arg6;
        this.field115 = arg7;
        this.field116 = arg8;
        this.field126 = arg9;
        this.field120 = arg10;
        this.field118 = false;
        int var12 = class44.method601(this.field122).field1008;
        if (var12 == -1) {
            this.field129 = null;
        } else {
            this.field129 = class43.method788(var12);
        }
    }

    @ObfuscatedName("j.n(IIIII)V")
    public final void method90(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field118) {
            double var5 = (double) (arg0 - this.field109);
            double var7 = (double) (arg1 - this.field107);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field119 = (double) this.field116 * var5 / var9 + (double) this.field109;
            this.field110 = (double) this.field116 * var7 / var9 + (double) this.field107;
            this.field121 = (double) this.field111;
        }
        double var11 = (double) (this.field130 + 1 - arg3);
        this.field114 = ((double) arg0 - this.field119) / var11;
        this.field123 = ((double) arg1 - this.field110) / var11;
        this.field124 = Math.sqrt(this.field123 * this.field123 + this.field114 * this.field114);
        if (!this.field118) {
            this.field125 = -this.field124 * Math.tan((double) this.field115 * 0.02454369D);
        }
        this.field132 = ((double) arg2 - this.field121 - this.field125 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("j.q(IB)V")
    public final void method91(int arg0) {
        this.field118 = true;
        this.field119 += (double) arg0 * this.field114;
        this.field110 += (double) arg0 * this.field123;
        this.field121 += this.field132 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field125;
        this.field125 += (double) arg0 * this.field132;
        this.field127 = (int) (Math.atan2(this.field114, this.field123) * 325.949D) + 1024 & 0x7FF;
        this.field128 = (int) (Math.atan2(this.field125, this.field124) * 325.949D) & 0x7FF;
        if (this.field129 == null) {
            return;
        }
        this.field131 += arg0;
        while (true) {
            do {
                do {
                    if (this.field131 <= this.field129.field985[this.field108]) {
                        return;
                    }
                    this.field131 -= this.field129.field985[this.field108];
                    this.field108++;
                } while (this.field108 < this.field129.field983.length);
                this.field108 -= this.field129.field979;
            } while (this.field108 >= 0 && this.field108 < this.field129.field983.length);
            this.field108 = 0;
        }
    }

    @ObfuscatedName("j.c(I)Ldt;")
    public final class105 method14() {
        class44 var1 = class44.method601(this.field122);
        class105 var2 = var1.method895(this.field108);
        if (var2 == null) {
            return null;
        } else {
            var2.method2225(this.field128);
            return var2;
        }
    }
}
