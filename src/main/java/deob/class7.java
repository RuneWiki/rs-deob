package deob;

@ObfuscatedName("r")
public final class class7 extends class86 {

    @ObfuscatedName("r.b")
    public int field99;

    @ObfuscatedName("r.g")
    public int field94;

    @ObfuscatedName("r.j")
    public int field95;

    @ObfuscatedName("r.d")
    public int field96;

    @ObfuscatedName("r.x")
    public int field97;

    @ObfuscatedName("r.y")
    public int field118;

    @ObfuscatedName("r.r")
    public int field119;

    @ObfuscatedName("r.c")
    public int field100;

    @ObfuscatedName("r.l")
    public int field115;

    @ObfuscatedName("r.u")
    public int field102;

    @ObfuscatedName("r.p")
    public int field107;

    @ObfuscatedName("r.n")
    public boolean field120 = false;

    @ObfuscatedName("r.w")
    public double field93;

    @ObfuscatedName("r.z")
    public double field106;

    @ObfuscatedName("r.k")
    public double field105;

    @ObfuscatedName("r.o")
    public double field103;

    @ObfuscatedName("r.t")
    public double field104;

    @ObfuscatedName("r.h")
    public double field110;

    @ObfuscatedName("r.v")
    public double field109;

    @ObfuscatedName("r.a")
    public double field112;

    @ObfuscatedName("r.f")
    public int field113;

    @ObfuscatedName("r.q")
    public int field114;

    @ObfuscatedName("r.m")
    public class43 field108;

    @ObfuscatedName("r.s")
    public int field116 = 0;

    @ObfuscatedName("r.i")
    public int field117 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field99 = arg0;
        this.field94 = arg1;
        this.field95 = arg2;
        this.field96 = arg3;
        this.field97 = arg4;
        this.field119 = arg5;
        this.field100 = arg6;
        this.field115 = arg7;
        this.field102 = arg8;
        this.field107 = arg9;
        this.field118 = arg10;
        this.field120 = false;
        int var12 = class44.method701(this.field99).field991;
        if (var12 == -1) {
            this.field108 = null;
        } else {
            this.field108 = class43.method175(var12);
        }
    }

    @ObfuscatedName("r.b(IIIIB)V")
    public final void method81(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field120) {
            double var5 = (double) (arg0 - this.field95);
            double var7 = (double) (arg1 - this.field96);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field93 = (double) this.field102 * var5 / var9 + (double) this.field95;
            this.field106 = (double) this.field102 * var7 / var9 + (double) this.field96;
            this.field105 = (double) this.field97;
        }
        double var11 = (double) (this.field100 + 1 - arg3);
        this.field103 = ((double) arg0 - this.field93) / var11;
        this.field104 = ((double) arg1 - this.field106) / var11;
        this.field110 = Math.sqrt(this.field104 * this.field104 + this.field103 * this.field103);
        if (!this.field120) {
            this.field109 = -this.field110 * Math.tan((double) this.field115 * 0.02454369D);
        }
        this.field112 = ((double) arg2 - this.field105 - this.field109 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("r.g(II)V")
    public final void method82(int arg0) {
        this.field120 = true;
        this.field93 += (double) arg0 * this.field103;
        this.field106 += (double) arg0 * this.field104;
        this.field105 += this.field112 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field109;
        this.field109 += (double) arg0 * this.field112;
        this.field113 = (int) (Math.atan2(this.field103, this.field104) * 325.949D) + 1024 & 0x7FF;
        this.field114 = (int) (Math.atan2(this.field109, this.field110) * 325.949D) & 0x7FF;
        if (this.field108 == null) {
            return;
        }
        this.field117 += arg0;
        while (true) {
            do {
                do {
                    if (this.field117 <= this.field108.field984[this.field116]) {
                        return;
                    }
                    this.field117 -= this.field108.field984[this.field116];
                    this.field116++;
                } while (this.field116 < this.field108.field966.length);
                this.field116 -= this.field108.field967;
            } while (this.field116 >= 0 && this.field116 < this.field108.field966.length);
            this.field116 = 0;
        }
    }

    @ObfuscatedName("r.j(I)Ldd;")
    public final class106 method16() {
        class44 var1 = class44.method701(this.field99);
        class106 var2 = var1.method889(this.field116);
        if (var2 == null) {
            return null;
        } else {
            var2.method2137(this.field114);
            return var2;
        }
    }
}
