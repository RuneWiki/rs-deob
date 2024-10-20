package deob;

@ObfuscatedName("f")
public final class class7 extends class80 {

    @ObfuscatedName("f.n")
    public int field103;

    @ObfuscatedName("f.g")
    public int field114;

    @ObfuscatedName("f.a")
    public int field105;

    @ObfuscatedName("f.m")
    public int field106;

    @ObfuscatedName("f.s")
    public int field107;

    @ObfuscatedName("f.j")
    public int field124;

    @ObfuscatedName("f.f")
    public int field109;

    @ObfuscatedName("f.b")
    public int field110;

    @ObfuscatedName("f.t")
    public int field111;

    @ObfuscatedName("f.i")
    public int field104;

    @ObfuscatedName("f.c")
    public int field113;

    @ObfuscatedName("f.k")
    public boolean field131 = false;

    @ObfuscatedName("f.x")
    public double field112;

    @ObfuscatedName("f.e")
    public double field116;

    @ObfuscatedName("f.q")
    public double field128;

    @ObfuscatedName("f.o")
    public double field118;

    @ObfuscatedName("f.r")
    public double field117;

    @ObfuscatedName("f.v")
    public double field120;

    @ObfuscatedName("f.h")
    public double field121;

    @ObfuscatedName("f.p")
    public double field122;

    @ObfuscatedName("f.y")
    public int field123;

    @ObfuscatedName("f.z")
    public int field108;

    @ObfuscatedName("f.u")
    public class40 field125;

    @ObfuscatedName("f.w")
    public int field126 = 0;

    @ObfuscatedName("f.d")
    public int field127 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field103 = arg0;
        this.field114 = arg1;
        this.field105 = arg2;
        this.field106 = arg3;
        this.field107 = arg4;
        this.field109 = arg5;
        this.field110 = arg6;
        this.field111 = arg7;
        this.field104 = arg8;
        this.field113 = arg9;
        this.field124 = arg10;
        this.field131 = false;
        int var12 = class41.method24(this.field103).field982;
        if (var12 == -1) {
            this.field125 = null;
        } else {
            this.field125 = class40.method2146(var12);
        }
    }

    @ObfuscatedName("f.n(IIIII)V")
    public final void method87(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field131) {
            double var5 = (double) (arg0 - this.field105);
            double var7 = (double) (arg1 - this.field106);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field112 = (double) this.field104 * var5 / var9 + (double) this.field105;
            this.field116 = (double) this.field104 * var7 / var9 + (double) this.field106;
            this.field128 = (double) this.field107;
        }
        double var11 = (double) (this.field110 + 1 - arg3);
        this.field118 = ((double) arg0 - this.field112) / var11;
        this.field117 = ((double) arg1 - this.field116) / var11;
        this.field120 = Math.sqrt(this.field118 * this.field118 + this.field117 * this.field117);
        if (!this.field131) {
            this.field121 = -this.field120 * Math.tan((double) this.field111 * 0.02454369D);
        }
        this.field122 = ((double) arg2 - this.field128 - this.field121 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("f.a(IB)V")
    public final void method88(int arg0) {
        this.field131 = true;
        this.field112 += (double) arg0 * this.field118;
        this.field116 += (double) arg0 * this.field117;
        this.field128 += this.field122 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field121;
        this.field121 += (double) arg0 * this.field122;
        this.field123 = (int) (Math.atan2(this.field118, this.field117) * 325.949D) + 1024 & 0x7FF;
        this.field108 = (int) (Math.atan2(this.field121, this.field120) * 325.949D) & 0x7FF;
        if (this.field125 == null) {
            return;
        }
        this.field127 += arg0;
        while (true) {
            do {
                do {
                    if (this.field127 <= this.field125.field961[this.field126]) {
                        return;
                    }
                    this.field127 -= this.field125.field961[this.field126];
                    this.field126++;
                } while (this.field126 < this.field125.field955.length);
                this.field126 -= this.field125.field968;
            } while (this.field126 >= 0 && this.field126 < this.field125.field955.length);
            this.field126 = 0;
        }
    }

    @ObfuscatedName("f.g(S)Lcs;")
    public final class100 method17() {
        class41 var1 = class41.method24(this.field103);
        class100 var2 = var1.method782(this.field126);
        if (var2 == null) {
            return null;
        } else {
            var2.method2060(this.field108);
            return var2;
        }
    }
}
