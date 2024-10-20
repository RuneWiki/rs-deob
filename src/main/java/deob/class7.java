package deob;

@ObfuscatedName("s")
public final class class7 extends class78 {

    @ObfuscatedName("s.z")
    public int field122;

    @ObfuscatedName("s.j")
    public int field94;

    @ObfuscatedName("s.a")
    public int field95;

    @ObfuscatedName("s.y")
    public int field96;

    @ObfuscatedName("s.i")
    public int field97;

    @ObfuscatedName("s.b")
    public int field113;

    @ObfuscatedName("s.s")
    public int field99;

    @ObfuscatedName("s.q")
    public int field100;

    @ObfuscatedName("s.p")
    public int field106;

    @ObfuscatedName("s.h")
    public int field111;

    @ObfuscatedName("s.r")
    public int field107;

    @ObfuscatedName("s.o")
    public boolean field104 = false;

    @ObfuscatedName("s.f")
    public double field105;

    @ObfuscatedName("s.u")
    public double field93;

    @ObfuscatedName("s.c")
    public double field102;

    @ObfuscatedName("s.l")
    public double field108;

    @ObfuscatedName("s.w")
    public double field109;

    @ObfuscatedName("s.x")
    public double field110;

    @ObfuscatedName("s.t")
    public double field103;

    @ObfuscatedName("s.k")
    public double field112;

    @ObfuscatedName("s.e")
    public int field119;

    @ObfuscatedName("s.v")
    public int field114;

    @ObfuscatedName("s.n")
    public class38 field115;

    @ObfuscatedName("s.d")
    public int field116 = 0;

    @ObfuscatedName("s.m")
    public int field117 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field122 = arg0;
        this.field94 = arg1;
        this.field95 = arg2;
        this.field96 = arg3;
        this.field97 = arg4;
        this.field99 = arg5;
        this.field100 = arg6;
        this.field106 = arg7;
        this.field111 = arg8;
        this.field107 = arg9;
        this.field113 = arg10;
        this.field104 = false;
        int var12 = class39.method1360(this.field122).field896;
        if (var12 == -1) {
            this.field115 = null;
        } else {
            this.field115 = class38.method84(var12);
        }
    }

    @ObfuscatedName("s.z(IIIII)V")
    public final void method77(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field104) {
            double var5 = (double) (arg0 - this.field95);
            double var7 = (double) (arg1 - this.field96);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field105 = (double) this.field111 * var5 / var9 + (double) this.field95;
            this.field93 = (double) this.field111 * var7 / var9 + (double) this.field96;
            this.field102 = (double) this.field97;
        }
        double var11 = (double) (this.field100 + 1 - arg3);
        this.field108 = ((double) arg0 - this.field105) / var11;
        this.field109 = ((double) arg1 - this.field93) / var11;
        this.field110 = Math.sqrt(this.field109 * this.field109 + this.field108 * this.field108);
        if (!this.field104) {
            this.field103 = -this.field110 * Math.tan((double) this.field106 * 0.02454369D);
        }
        this.field112 = ((double) arg2 - this.field102 - this.field103 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("s.a(II)V")
    public final void method82(int arg0) {
        this.field104 = true;
        this.field105 += (double) arg0 * this.field108;
        this.field93 += (double) arg0 * this.field109;
        this.field102 += this.field112 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field103;
        this.field103 += (double) arg0 * this.field112;
        this.field119 = (int) (Math.atan2(this.field108, this.field109) * 325.949D) + 1024 & 0x7FF;
        this.field114 = (int) (Math.atan2(this.field103, this.field110) * 325.949D) & 0x7FF;
        if (this.field115 == null) {
            return;
        }
        this.field117 += arg0;
        while (true) {
            do {
                do {
                    if (this.field117 <= this.field115.field867[this.field116]) {
                        return;
                    }
                    this.field117 -= this.field115.field867[this.field116];
                    this.field116++;
                } while (this.field116 < this.field115.field872.length);
                this.field116 -= this.field115.field883;
            } while (this.field116 >= 0 && this.field116 < this.field115.field872.length);
            this.field116 = 0;
        }
    }

    @ObfuscatedName("s.j(B)Lcu;")
    public final class98 method16() {
        class39 var1 = class39.method1360(this.field122);
        class98 var2 = var1.method728(this.field116);
        if (var2 == null) {
            return null;
        } else {
            var2.method2044(this.field114);
            return var2;
        }
    }
}
