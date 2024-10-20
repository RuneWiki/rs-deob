package deob;

@ObfuscatedName("m")
public final class class7 extends class89 {

    @ObfuscatedName("m.k")
    public int field114;

    @ObfuscatedName("m.q")
    public int field99;

    @ObfuscatedName("m.f")
    public int field120;

    @ObfuscatedName("m.c")
    public int field101;

    @ObfuscatedName("m.v")
    public int field102;

    @ObfuscatedName("m.j")
    public int field103;

    @ObfuscatedName("m.m")
    public int field104;

    @ObfuscatedName("m.y")
    public int field105;

    @ObfuscatedName("m.u")
    public int field121;

    @ObfuscatedName("m.h")
    public int field113;

    @ObfuscatedName("m.l")
    public int field108;

    @ObfuscatedName("m.b")
    public boolean field109 = false;

    @ObfuscatedName("m.g")
    public double field110;

    @ObfuscatedName("m.e")
    public double field111;

    @ObfuscatedName("m.p")
    public double field112;

    @ObfuscatedName("m.s")
    public double field98;

    @ObfuscatedName("m.w")
    public double field106;

    @ObfuscatedName("m.i")
    public double field127;

    @ObfuscatedName("m.r")
    public double field116;

    @ObfuscatedName("m.a")
    public double field117;

    @ObfuscatedName("m.n")
    public int field100;

    @ObfuscatedName("m.z")
    public int field119;

    @ObfuscatedName("m.x")
    public class45 field107;

    @ObfuscatedName("m.d")
    public int field115 = 0;

    @ObfuscatedName("m.t")
    public int field122 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field114 = arg0;
        this.field99 = arg1;
        this.field120 = arg2;
        this.field101 = arg3;
        this.field102 = arg4;
        this.field104 = arg5;
        this.field105 = arg6;
        this.field121 = arg7;
        this.field113 = arg8;
        this.field108 = arg9;
        this.field103 = arg10;
        this.field109 = false;
        int var12 = class46.method2984(this.field114).field1036;
        if (var12 == -1) {
            this.field107 = null;
        } else {
            this.field107 = class45.method726(var12);
        }
    }

    @ObfuscatedName("m.k(IIIII)V")
    public final void method85(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field109) {
            double var5 = (double) (arg0 - this.field120);
            double var7 = (double) (arg1 - this.field101);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field110 = (double) this.field113 * var5 / var9 + (double) this.field120;
            this.field111 = (double) this.field113 * var7 / var9 + (double) this.field101;
            this.field112 = (double) this.field102;
        }
        double var11 = (double) (this.field105 + 1 - arg3);
        this.field98 = ((double) arg0 - this.field110) / var11;
        this.field106 = ((double) arg1 - this.field111) / var11;
        this.field127 = Math.sqrt(this.field98 * this.field98 + this.field106 * this.field106);
        if (!this.field109) {
            this.field116 = -this.field127 * Math.tan((double) this.field121 * 0.02454369D);
        }
        this.field117 = ((double) arg2 - this.field112 - this.field116 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("m.q(IB)V")
    public final void method87(int arg0) {
        this.field109 = true;
        this.field110 += (double) arg0 * this.field98;
        this.field111 += (double) arg0 * this.field106;
        this.field112 += this.field117 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field116;
        this.field116 += (double) arg0 * this.field117;
        this.field100 = (int) (Math.atan2(this.field98, this.field106) * 325.949D) + 1024 & 0x7FF;
        this.field119 = (int) (Math.atan2(this.field116, this.field127) * 325.949D) & 0x7FF;
        if (this.field107 == null) {
            return;
        }
        this.field122 += arg0;
        while (true) {
            do {
                do {
                    if (this.field122 <= this.field107.field1009[this.field115]) {
                        return;
                    }
                    this.field122 -= this.field107.field1009[this.field115];
                    this.field115++;
                } while (this.field115 < this.field107.field1007.length);
                this.field115 -= this.field107.field1011;
            } while (this.field115 >= 0 && this.field115 < this.field107.field1007.length);
            this.field115 = 0;
        }
    }

    @ObfuscatedName("m.f(I)Ldj;")
    public final class109 method14() {
        class46 var1 = class46.method2984(this.field114);
        class109 var2 = var1.method904(this.field115);
        if (var2 == null) {
            return null;
        } else {
            var2.method2241(this.field119);
            return var2;
        }
    }
}
