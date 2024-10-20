package deob;

@ObfuscatedName("g")
public final class class7 extends class78 {

    @ObfuscatedName("g.k")
    public int field97;

    @ObfuscatedName("g.r")
    public int field113;

    @ObfuscatedName("g.y")
    public int field96;

    @ObfuscatedName("g.w")
    public int field101;

    @ObfuscatedName("g.m")
    public int field121;

    @ObfuscatedName("g.j")
    public int field100;

    @ObfuscatedName("g.g")
    public int field109;

    @ObfuscatedName("g.p")
    public int field119;

    @ObfuscatedName("g.o")
    public int field103;

    @ObfuscatedName("g.b")
    public int field95;

    @ObfuscatedName("g.x")
    public int field105;

    @ObfuscatedName("g.n")
    public boolean field106 = false;

    @ObfuscatedName("g.d")
    public double field107;

    @ObfuscatedName("g.s")
    public double field108;

    @ObfuscatedName("g.v")
    public double field99;

    @ObfuscatedName("g.t")
    public double field110;

    @ObfuscatedName("g.u")
    public double field111;

    @ObfuscatedName("g.l")
    public double field112;

    @ObfuscatedName("g.i")
    public double field98;

    @ObfuscatedName("g.h")
    public double field114;

    @ObfuscatedName("g.e")
    public int field115;

    @ObfuscatedName("g.a")
    public int field116;

    @ObfuscatedName("g.c")
    public class38 field117;

    @ObfuscatedName("g.f")
    public int field118 = 0;

    @ObfuscatedName("g.q")
    public int field122 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field97 = arg0;
        this.field113 = arg1;
        this.field96 = arg2;
        this.field101 = arg3;
        this.field121 = arg4;
        this.field109 = arg5;
        this.field119 = arg6;
        this.field103 = arg7;
        this.field95 = arg8;
        this.field105 = arg9;
        this.field100 = arg10;
        this.field106 = false;
        int var12 = class39.method1416(this.field97).field930;
        if (var12 == -1) {
            this.field117 = null;
        } else {
            this.field117 = class38.method102(var12);
        }
    }

    @ObfuscatedName("g.k(IIIII)V")
    public final void method78(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field106) {
            double var5 = (double) (arg0 - this.field96);
            double var7 = (double) (arg1 - this.field101);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field107 = (double) this.field95 * var5 / var9 + (double) this.field96;
            this.field108 = (double) this.field95 * var7 / var9 + (double) this.field101;
            this.field99 = (double) this.field121;
        }
        double var11 = (double) (this.field119 + 1 - arg3);
        this.field110 = ((double) arg0 - this.field107) / var11;
        this.field111 = ((double) arg1 - this.field108) / var11;
        this.field112 = Math.sqrt(this.field111 * this.field111 + this.field110 * this.field110);
        if (!this.field106) {
            this.field98 = -this.field112 * Math.tan((double) this.field103 * 0.02454369D);
        }
        this.field114 = ((double) arg2 - this.field99 - this.field98 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("g.y(II)V")
    public final void method77(int arg0) {
        this.field106 = true;
        this.field107 += (double) arg0 * this.field110;
        this.field108 += (double) arg0 * this.field111;
        this.field99 += this.field114 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field98;
        this.field98 += (double) arg0 * this.field114;
        this.field115 = (int) (Math.atan2(this.field110, this.field111) * 325.949D) + 1024 & 0x7FF;
        this.field116 = (int) (Math.atan2(this.field98, this.field112) * 325.949D) & 0x7FF;
        if (this.field117 == null) {
            return;
        }
        this.field122 += arg0;
        while (true) {
            do {
                do {
                    if (this.field122 <= this.field117.field905[this.field118]) {
                        return;
                    }
                    this.field122 -= this.field117.field905[this.field118];
                    this.field118++;
                } while (this.field118 < this.field117.field900.length);
                this.field118 -= this.field117.field909;
            } while (this.field118 >= 0 && this.field118 < this.field117.field900.length);
            this.field118 = 0;
        }
    }

    @ObfuscatedName("g.r(I)Lcp;")
    public final class98 method24() {
        class39 var1 = class39.method1416(this.field97);
        class98 var2 = var1.method746(this.field118);
        if (var2 == null) {
            return null;
        } else {
            var2.method1989(this.field116);
            return var2;
        }
    }
}
