package deob;

@ObfuscatedName("w")
public final class class7 extends class79 {

    @ObfuscatedName("w.a")
    public int field99;

    @ObfuscatedName("w.v")
    public int field123;

    @ObfuscatedName("w.i")
    public int field98;

    @ObfuscatedName("w.b")
    public int field108;

    @ObfuscatedName("w.l")
    public int field102;

    @ObfuscatedName("w.m")
    public int field129;

    @ObfuscatedName("w.w")
    public int field104;

    @ObfuscatedName("w.e")
    public int field105;

    @ObfuscatedName("w.n")
    public int field106;

    @ObfuscatedName("w.s")
    public int field107;

    @ObfuscatedName("w.k")
    public int field117;

    @ObfuscatedName("w.f")
    public boolean field109 = false;

    @ObfuscatedName("w.d")
    public double field110;

    @ObfuscatedName("w.x")
    public double field120;

    @ObfuscatedName("w.o")
    public double field112;

    @ObfuscatedName("w.q")
    public double field124;

    @ObfuscatedName("w.t")
    public double field125;

    @ObfuscatedName("w.h")
    public double field115;

    @ObfuscatedName("w.u")
    public double field116;

    @ObfuscatedName("w.j")
    public double field100;

    @ObfuscatedName("w.g")
    public int field118;

    @ObfuscatedName("w.y")
    public int field119;

    @ObfuscatedName("w.p")
    public class39 field113;

    @ObfuscatedName("w.r")
    public int field103 = 0;

    @ObfuscatedName("w.z")
    public int field122 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field99 = arg0;
        this.field123 = arg1;
        this.field98 = arg2;
        this.field108 = arg3;
        this.field102 = arg4;
        this.field104 = arg5;
        this.field105 = arg6;
        this.field106 = arg7;
        this.field107 = arg8;
        this.field117 = arg9;
        this.field129 = arg10;
        this.field109 = false;
        int var12 = class40.method1765(this.field99).field935;
        if (var12 == -1) {
            this.field113 = null;
        } else {
            this.field113 = Statics.method97(var12);
        }
    }

    @ObfuscatedName("w.a(IIIII)V")
    public final void method91(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field109) {
            double var5 = (double) (arg0 - this.field98);
            double var7 = (double) (arg1 - this.field108);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field110 = (double) this.field107 * var5 / var9 + (double) this.field98;
            this.field120 = (double) this.field107 * var7 / var9 + (double) this.field108;
            this.field112 = (double) this.field102;
        }
        double var11 = (double) (this.field105 + 1 - arg3);
        this.field124 = ((double) arg0 - this.field110) / var11;
        this.field125 = ((double) arg1 - this.field120) / var11;
        this.field115 = Math.sqrt(this.field125 * this.field125 + this.field124 * this.field124);
        if (!this.field109) {
            this.field116 = -this.field115 * Math.tan((double) this.field106 * 0.02454369D);
        }
        this.field100 = ((double) arg2 - this.field112 - this.field116 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("w.i(IB)V")
    public final void method92(int arg0) {
        this.field109 = true;
        this.field110 += (double) arg0 * this.field124;
        this.field120 += (double) arg0 * this.field125;
        this.field112 += this.field100 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field116;
        this.field116 += (double) arg0 * this.field100;
        this.field118 = (int) (Math.atan2(this.field124, this.field125) * 325.949D) + 1024 & 0x7FF;
        this.field119 = (int) (Math.atan2(this.field116, this.field115) * 325.949D) & 0x7FF;
        if (this.field113 == null) {
            return;
        }
        this.field122 += arg0;
        while (true) {
            do {
                do {
                    if (this.field122 <= this.field113.field912[this.field103]) {
                        return;
                    }
                    this.field122 -= this.field113.field912[this.field103];
                    this.field103++;
                } while (this.field103 < this.field113.field911.length);
                this.field103 -= this.field113.field914;
            } while (this.field103 >= 0 && this.field103 < this.field113.field911.length);
            this.field103 = 0;
        }
    }

    @ObfuscatedName("w.v(I)Lcl;")
    public final class99 method24() {
        class40 var1 = class40.method1765(this.field99);
        class99 var2 = var1.method768(this.field103);
        if (var2 == null) {
            return null;
        } else {
            var2.method1988(this.field119);
            return var2;
        }
    }
}
