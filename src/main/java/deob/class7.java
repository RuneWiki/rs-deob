package deob;

@ObfuscatedName("p")
public final class class7 extends class85 {

    @ObfuscatedName("p.v")
    public int field103;

    @ObfuscatedName("p.f")
    public int field104;

    @ObfuscatedName("p.i")
    public int field128;

    @ObfuscatedName("p.d")
    public int field125;

    @ObfuscatedName("p.o")
    public int field107;

    @ObfuscatedName("p.c")
    public int field108;

    @ObfuscatedName("p.p")
    public int field109;

    @ObfuscatedName("p.j")
    public int field110;

    @ObfuscatedName("p.a")
    public int field111;

    @ObfuscatedName("p.y")
    public int field112;

    @ObfuscatedName("p.h")
    public int field119;

    @ObfuscatedName("p.z")
    public boolean field113 = false;

    @ObfuscatedName("p.w")
    public double field115;

    @ObfuscatedName("p.l")
    public double field127;

    @ObfuscatedName("p.q")
    public double field120;

    @ObfuscatedName("p.x")
    public double field114;

    @ObfuscatedName("p.s")
    public double field124;

    @ObfuscatedName("p.n")
    public double field106;

    @ObfuscatedName("p.u")
    public double field121;

    @ObfuscatedName("p.m")
    public double field122;

    @ObfuscatedName("p.e")
    public int field123;

    @ObfuscatedName("p.k")
    public int field105;

    @ObfuscatedName("p.r")
    public class43 field116;

    @ObfuscatedName("p.b")
    public int field126 = 0;

    @ObfuscatedName("p.t")
    public int field118 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field103 = arg0;
        this.field104 = arg1;
        this.field128 = arg2;
        this.field125 = arg3;
        this.field107 = arg4;
        this.field109 = arg5;
        this.field110 = arg6;
        this.field111 = arg7;
        this.field112 = arg8;
        this.field119 = arg9;
        this.field108 = arg10;
        this.field113 = false;
        int var12 = class44.method1502(this.field103).field1008;
        if (var12 == -1) {
            this.field116 = null;
        } else {
            this.field116 = class43.method616(var12);
        }
    }

    @ObfuscatedName("p.v(IIIII)V")
    public final void method89(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field113) {
            double var5 = (double) (arg0 - this.field128);
            double var7 = (double) (arg1 - this.field125);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field115 = (double) this.field112 * var5 / var9 + (double) this.field128;
            this.field127 = (double) this.field112 * var7 / var9 + (double) this.field125;
            this.field120 = (double) this.field107;
        }
        double var11 = (double) (this.field110 + 1 - arg3);
        this.field114 = ((double) arg0 - this.field115) / var11;
        this.field124 = ((double) arg1 - this.field127) / var11;
        this.field106 = Math.sqrt(this.field124 * this.field124 + this.field114 * this.field114);
        if (!this.field113) {
            this.field121 = -this.field106 * Math.tan((double) this.field111 * 0.02454369D);
        }
        this.field122 = ((double) arg2 - this.field120 - this.field121 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("p.f(II)V")
    public final void method90(int arg0) {
        this.field113 = true;
        this.field115 += (double) arg0 * this.field114;
        this.field127 += (double) arg0 * this.field124;
        this.field120 += this.field122 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field121;
        this.field121 += (double) arg0 * this.field122;
        this.field123 = (int) (Math.atan2(this.field114, this.field124) * 325.949D) + 1024 & 0x7FF;
        this.field105 = (int) (Math.atan2(this.field121, this.field106) * 325.949D) & 0x7FF;
        if (this.field116 == null) {
            return;
        }
        this.field118 += arg0;
        while (true) {
            do {
                do {
                    if (this.field118 <= this.field116.field978[this.field126]) {
                        return;
                    }
                    this.field118 -= this.field116.field978[this.field126];
                    this.field126++;
                } while (this.field126 < this.field116.field984.length);
                this.field126 -= this.field116.field985;
            } while (this.field126 >= 0 && this.field126 < this.field116.field984.length);
            this.field126 = 0;
        }
    }

    @ObfuscatedName("p.i(I)Ldq;")
    public final class105 method9() {
        class44 var1 = class44.method1502(this.field103);
        class105 var2 = var1.method874(this.field126);
        if (var2 == null) {
            return null;
        } else {
            var2.method2168(this.field105);
            return var2;
        }
    }
}
