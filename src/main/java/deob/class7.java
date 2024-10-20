package deob;

@ObfuscatedName("g")
public final class class7 extends class85 {

    @ObfuscatedName("g.a")
    public int field99;

    @ObfuscatedName("g.r")
    public int field97;

    @ObfuscatedName("g.f")
    public int field98;

    @ObfuscatedName("g.s")
    public int field107;

    @ObfuscatedName("g.y")
    public int field100;

    @ObfuscatedName("g.e")
    public int field101;

    @ObfuscatedName("g.g")
    public int field123;

    @ObfuscatedName("g.m")
    public int field103;

    @ObfuscatedName("g.j")
    public int field96;

    @ObfuscatedName("g.n")
    public int field105;

    @ObfuscatedName("g.l")
    public int field106;

    @ObfuscatedName("g.h")
    public boolean field120 = false;

    @ObfuscatedName("g.i")
    public double field114;

    @ObfuscatedName("g.v")
    public double field109;

    @ObfuscatedName("g.z")
    public double field110;

    @ObfuscatedName("g.u")
    public double field111;

    @ObfuscatedName("g.t")
    public double field112;

    @ObfuscatedName("g.b")
    public double field113;

    @ObfuscatedName("g.c")
    public double field104;

    @ObfuscatedName("g.x")
    public double field115;

    @ObfuscatedName("g.d")
    public int field116;

    @ObfuscatedName("g.p")
    public int field117;

    @ObfuscatedName("g.q")
    public class43 field118;

    @ObfuscatedName("g.w")
    public int field119 = 0;

    @ObfuscatedName("g.k")
    public int field102 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field99 = arg0;
        this.field97 = arg1;
        this.field98 = arg2;
        this.field107 = arg3;
        this.field100 = arg4;
        this.field123 = arg5;
        this.field103 = arg6;
        this.field96 = arg7;
        this.field105 = arg8;
        this.field106 = arg9;
        this.field101 = arg10;
        this.field120 = false;
        int var12 = class44.method588(this.field99).field1013;
        if (var12 == -1) {
            this.field118 = null;
        } else {
            this.field118 = class43.method2701(var12);
        }
    }

    @ObfuscatedName("g.a(IIIII)V")
    public final void method104(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field120) {
            double var5 = (double) (arg0 - this.field98);
            double var7 = (double) (arg1 - this.field107);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field114 = (double) this.field105 * var5 / var9 + (double) this.field98;
            this.field109 = (double) this.field105 * var7 / var9 + (double) this.field107;
            this.field110 = (double) this.field100;
        }
        double var11 = (double) (this.field103 + 1 - arg3);
        this.field111 = ((double) arg0 - this.field114) / var11;
        this.field112 = ((double) arg1 - this.field109) / var11;
        this.field113 = Math.sqrt(this.field112 * this.field112 + this.field111 * this.field111);
        if (!this.field120) {
            this.field104 = -this.field113 * Math.tan((double) this.field96 * 0.02454369D);
        }
        this.field115 = ((double) arg2 - this.field110 - this.field104 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("g.r(II)V")
    public final void method105(int arg0) {
        this.field120 = true;
        this.field114 += (double) arg0 * this.field111;
        this.field109 += (double) arg0 * this.field112;
        this.field110 += this.field115 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field104;
        this.field104 += (double) arg0 * this.field115;
        this.field116 = (int) (Math.atan2(this.field111, this.field112) * 325.949D) + 1024 & 0x7FF;
        this.field117 = (int) (Math.atan2(this.field104, this.field113) * 325.949D) & 0x7FF;
        if (this.field118 == null) {
            return;
        }
        this.field102 += arg0;
        while (true) {
            do {
                do {
                    if (this.field102 <= this.field118.field991[this.field119]) {
                        return;
                    }
                    this.field102 -= this.field118.field991[this.field119];
                    this.field119++;
                } while (this.field119 < this.field118.field989.length);
                this.field119 -= this.field118.field1001;
            } while (this.field119 >= 0 && this.field119 < this.field118.field989.length);
            this.field119 = 0;
        }
    }

    @ObfuscatedName("g.f(I)Ldn;")
    public final class105 method27() {
        class44 var1 = class44.method588(this.field99);
        class105 var2 = var1.method884(this.field119);
        if (var2 == null) {
            return null;
        } else {
            var2.method2165(this.field117);
            return var2;
        }
    }
}
