package deob;

@ObfuscatedName("j")
public final class class7 extends class85 {

    @ObfuscatedName("j.f")
    public int field104;

    @ObfuscatedName("j.s")
    public int field114;

    @ObfuscatedName("j.q")
    public int field126;

    @ObfuscatedName("j.g")
    public int field106;

    @ObfuscatedName("j.m")
    public int field107;

    @ObfuscatedName("j.t")
    public int field113;

    @ObfuscatedName("j.j")
    public int field109;

    @ObfuscatedName("j.n")
    public int field110;

    @ObfuscatedName("j.l")
    public int field111;

    @ObfuscatedName("j.i")
    public int field112;

    @ObfuscatedName("j.w")
    public int field119;

    @ObfuscatedName("j.v")
    public boolean field103 = false;

    @ObfuscatedName("j.o")
    public double field115;

    @ObfuscatedName("j.p")
    public double field116;

    @ObfuscatedName("j.b")
    public double field131;

    @ObfuscatedName("j.z")
    public double field118;

    @ObfuscatedName("j.k")
    public double field105;

    @ObfuscatedName("j.r")
    public double field120;

    @ObfuscatedName("j.d")
    public double field117;

    @ObfuscatedName("j.u")
    public double field122;

    @ObfuscatedName("j.a")
    public int field123;

    @ObfuscatedName("j.x")
    public int field124;

    @ObfuscatedName("j.y")
    public class43 field125;

    @ObfuscatedName("j.c")
    public int field128 = 0;

    @ObfuscatedName("j.h")
    public int field127 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field104 = arg0;
        this.field114 = arg1;
        this.field126 = arg2;
        this.field106 = arg3;
        this.field107 = arg4;
        this.field109 = arg5;
        this.field110 = arg6;
        this.field111 = arg7;
        this.field112 = arg8;
        this.field119 = arg9;
        this.field113 = arg10;
        this.field103 = false;
        int var12 = class44.method732(this.field104).field1017;
        if (var12 == -1) {
            this.field125 = null;
        } else {
            this.field125 = Statics.method653(var12);
        }
    }

    @ObfuscatedName("j.f(IIIII)V")
    public final void method95(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field103) {
            double var5 = (double) (arg0 - this.field126);
            double var7 = (double) (arg1 - this.field106);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field115 = (double) this.field112 * var5 / var9 + (double) this.field126;
            this.field116 = (double) this.field112 * var7 / var9 + (double) this.field106;
            this.field131 = (double) this.field107;
        }
        double var11 = (double) (this.field110 + 1 - arg3);
        this.field118 = ((double) arg0 - this.field115) / var11;
        this.field105 = ((double) arg1 - this.field116) / var11;
        this.field120 = Math.sqrt(this.field118 * this.field118 + this.field105 * this.field105);
        if (!this.field103) {
            this.field117 = -this.field120 * Math.tan((double) this.field111 * 0.02454369D);
        }
        this.field122 = ((double) arg2 - this.field131 - this.field117 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("j.s(II)V")
    public final void method96(int arg0) {
        this.field103 = true;
        this.field115 += (double) arg0 * this.field118;
        this.field116 += (double) arg0 * this.field105;
        this.field131 += this.field122 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field117;
        this.field117 += (double) arg0 * this.field122;
        this.field123 = (int) (Math.atan2(this.field118, this.field105) * 325.949D) + 1024 & 0x7FF;
        this.field124 = (int) (Math.atan2(this.field117, this.field120) * 325.949D) & 0x7FF;
        if (this.field125 == null) {
            return;
        }
        this.field127 += arg0;
        while (true) {
            do {
                do {
                    if (this.field127 <= this.field125.field995[this.field128]) {
                        return;
                    }
                    this.field127 -= this.field125.field995[this.field128];
                    this.field128++;
                } while (this.field128 < this.field125.field992.length);
                this.field128 -= this.field125.field996;
            } while (this.field128 >= 0 && this.field128 < this.field125.field992.length);
            this.field128 = 0;
        }
    }

    @ObfuscatedName("j.q(I)Ldu;")
    public final class105 method16() {
        class44 var1 = class44.method732(this.field104);
        class105 var2 = var1.method886(this.field128);
        if (var2 == null) {
            return null;
        } else {
            var2.method2223(this.field124);
            return var2;
        }
    }
}
