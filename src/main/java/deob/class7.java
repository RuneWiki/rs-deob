package deob;

@ObfuscatedName("a")
public final class class7 extends class78 {

    @ObfuscatedName("a.y")
    public int field102;

    @ObfuscatedName("a.u")
    public int field99;

    @ObfuscatedName("a.k")
    public int field100;

    @ObfuscatedName("a.v")
    public int field101;

    @ObfuscatedName("a.l")
    public int field110;

    @ObfuscatedName("a.g")
    public int field121;

    @ObfuscatedName("a.a")
    public int field107;

    @ObfuscatedName("a.x")
    public int field108;

    @ObfuscatedName("a.r")
    public int field106;

    @ObfuscatedName("a.w")
    public int field126;

    @ObfuscatedName("a.c")
    public int field103;

    @ObfuscatedName("a.f")
    public boolean field109 = false;

    @ObfuscatedName("a.o")
    public double field112;

    @ObfuscatedName("a.p")
    public double field104;

    @ObfuscatedName("a.n")
    public double field124;

    @ObfuscatedName("a.m")
    public double field113;

    @ObfuscatedName("a.s")
    public double field114;

    @ObfuscatedName("a.t")
    public double field115;

    @ObfuscatedName("a.j")
    public double field116;

    @ObfuscatedName("a.b")
    public double field117;

    @ObfuscatedName("a.i")
    public int field118;

    @ObfuscatedName("a.h")
    public int field119;

    @ObfuscatedName("a.q")
    public class38 field120;

    @ObfuscatedName("a.d")
    public int field98 = 0;

    @ObfuscatedName("a.z")
    public int field122 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field102 = arg0;
        this.field99 = arg1;
        this.field100 = arg2;
        this.field101 = arg3;
        this.field110 = arg4;
        this.field107 = arg5;
        this.field108 = arg6;
        this.field106 = arg7;
        this.field126 = arg8;
        this.field103 = arg9;
        this.field121 = arg10;
        this.field109 = false;
        int var12 = class39.method2683(this.field102).field905;
        if (var12 == -1) {
            this.field120 = null;
        } else {
            this.field120 = class38.method1866(var12);
        }
    }

    @ObfuscatedName("a.y(IIIII)V")
    public final void method77(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field109) {
            double var5 = (double) (arg0 - this.field100);
            double var7 = (double) (arg1 - this.field101);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field112 = (double) this.field126 * var5 / var9 + (double) this.field100;
            this.field104 = (double) this.field126 * var7 / var9 + (double) this.field101;
            this.field124 = (double) this.field110;
        }
        double var11 = (double) (this.field108 + 1 - arg3);
        this.field113 = ((double) arg0 - this.field112) / var11;
        this.field114 = ((double) arg1 - this.field104) / var11;
        this.field115 = Math.sqrt(this.field114 * this.field114 + this.field113 * this.field113);
        if (!this.field109) {
            this.field116 = -this.field115 * Math.tan((double) this.field106 * 0.02454369D);
        }
        this.field117 = ((double) arg2 - this.field124 - this.field116 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("a.k(IB)V")
    public final void method75(int arg0) {
        this.field109 = true;
        this.field112 += (double) arg0 * this.field113;
        this.field104 += (double) arg0 * this.field114;
        this.field124 += this.field117 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field116;
        this.field116 += (double) arg0 * this.field117;
        this.field118 = (int) (Math.atan2(this.field113, this.field114) * 325.949D) + 1024 & 0x7FF;
        this.field119 = (int) (Math.atan2(this.field116, this.field115) * 325.949D) & 0x7FF;
        if (this.field120 == null) {
            return;
        }
        this.field122 += arg0;
        while (true) {
            do {
                do {
                    if (this.field122 <= this.field120.field881[this.field98]) {
                        return;
                    }
                    this.field122 -= this.field120.field881[this.field98];
                    this.field98++;
                } while (this.field98 < this.field120.field886.length);
                this.field98 -= this.field120.field890;
            } while (this.field98 >= 0 && this.field98 < this.field120.field886.length);
            this.field98 = 0;
        }
    }

    @ObfuscatedName("a.u(I)Lcz;")
    public final class98 method14() {
        class39 var1 = class39.method2683(this.field102);
        class98 var2 = var1.method739(this.field98);
        if (var2 == null) {
            return null;
        } else {
            var2.method2001(this.field119);
            return var2;
        }
    }
}
