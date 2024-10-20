package deob;

@ObfuscatedName("g")
public final class class7 extends class86 {

    @ObfuscatedName("g.e")
    public int field124;

    @ObfuscatedName("g.w")
    public int field104;

    @ObfuscatedName("g.f")
    public int field115;

    @ObfuscatedName("g.s")
    public int field106;

    @ObfuscatedName("g.p")
    public int field107;

    @ObfuscatedName("g.h")
    public int field108;

    @ObfuscatedName("g.g")
    public int field109;

    @ObfuscatedName("g.a")
    public int field110;

    @ObfuscatedName("g.r")
    public int field127;

    @ObfuscatedName("g.k")
    public int field103;

    @ObfuscatedName("g.m")
    public int field126;

    @ObfuscatedName("g.n")
    public boolean field114 = false;

    @ObfuscatedName("g.y")
    public double field122;

    @ObfuscatedName("g.i")
    public double field125;

    @ObfuscatedName("g.j")
    public double field117;

    @ObfuscatedName("g.l")
    public double field116;

    @ObfuscatedName("g.o")
    public double field119;

    @ObfuscatedName("g.c")
    public double field120;

    @ObfuscatedName("g.x")
    public double field121;

    @ObfuscatedName("g.b")
    public double field118;

    @ObfuscatedName("g.q")
    public int field113;

    @ObfuscatedName("g.u")
    public int field112;

    @ObfuscatedName("g.t")
    public class43 field111;

    @ObfuscatedName("g.d")
    public int field105 = 0;

    @ObfuscatedName("g.z")
    public int field123 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field124 = arg0;
        this.field104 = arg1;
        this.field115 = arg2;
        this.field106 = arg3;
        this.field107 = arg4;
        this.field109 = arg5;
        this.field110 = arg6;
        this.field127 = arg7;
        this.field103 = arg8;
        this.field126 = arg9;
        this.field108 = arg10;
        this.field114 = false;
        int var12 = class44.method1763(this.field124).field989;
        if (var12 == -1) {
            this.field111 = null;
        } else {
            this.field111 = class43.method949(var12);
        }
    }

    @ObfuscatedName("g.e(IIIIB)V")
    public final void method95(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field114) {
            double var5 = (double) (arg0 - this.field115);
            double var7 = (double) (arg1 - this.field106);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field122 = (double) this.field103 * var5 / var9 + (double) this.field115;
            this.field125 = (double) this.field103 * var7 / var9 + (double) this.field106;
            this.field117 = (double) this.field107;
        }
        double var11 = (double) (this.field110 + 1 - arg3);
        this.field116 = ((double) arg0 - this.field122) / var11;
        this.field119 = ((double) arg1 - this.field125) / var11;
        this.field120 = Math.sqrt(this.field119 * this.field119 + this.field116 * this.field116);
        if (!this.field114) {
            this.field121 = -this.field120 * Math.tan((double) this.field127 * 0.02454369D);
        }
        this.field118 = ((double) arg2 - this.field117 - this.field121 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("g.w(IB)V")
    public final void method94(int arg0) {
        this.field114 = true;
        this.field122 += (double) arg0 * this.field116;
        this.field125 += (double) arg0 * this.field119;
        this.field117 += this.field118 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field121;
        this.field121 += (double) arg0 * this.field118;
        this.field113 = (int) (Math.atan2(this.field116, this.field119) * 325.949D) + 1024 & 0x7FF;
        this.field112 = (int) (Math.atan2(this.field121, this.field120) * 325.949D) & 0x7FF;
        if (this.field111 == null) {
            return;
        }
        this.field123 += arg0;
        while (true) {
            do {
                do {
                    if (this.field123 <= this.field111.field969[this.field105]) {
                        return;
                    }
                    this.field123 -= this.field111.field969[this.field105];
                    this.field105++;
                } while (this.field105 < this.field111.field976.length);
                this.field105 -= this.field111.field966;
            } while (this.field105 >= 0 && this.field105 < this.field111.field976.length);
            this.field105 = 0;
        }
    }

    @ObfuscatedName("g.f(B)Ldy;")
    public final class106 method25() {
        class44 var1 = class44.method1763(this.field124);
        class106 var2 = var1.method889(this.field105);
        if (var2 == null) {
            return null;
        } else {
            var2.method2220(this.field112);
            return var2;
        }
    }
}
