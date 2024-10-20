package deob;

@ObfuscatedName("j")
public final class class7 extends class89 {

    @ObfuscatedName("j.m")
    public int field93;

    @ObfuscatedName("j.w")
    public int field94;

    @ObfuscatedName("j.e")
    public int field112;

    @ObfuscatedName("j.o")
    public int field96;

    @ObfuscatedName("j.g")
    public int field97;

    @ObfuscatedName("j.l")
    public int field98;

    @ObfuscatedName("j.j")
    public int field99;

    @ObfuscatedName("j.r")
    public int field100;

    @ObfuscatedName("j.x")
    public int field113;

    @ObfuscatedName("j.k")
    public int field102;

    @ObfuscatedName("j.v")
    public int field103;

    @ObfuscatedName("j.h")
    public boolean field101 = false;

    @ObfuscatedName("j.u")
    public double field105;

    @ObfuscatedName("j.y")
    public double field106;

    @ObfuscatedName("j.p")
    public double field118;

    @ObfuscatedName("j.s")
    public double field108;

    @ObfuscatedName("j.f")
    public double field109;

    @ObfuscatedName("j.i")
    public double field110;

    @ObfuscatedName("j.d")
    public double field111;

    @ObfuscatedName("j.t")
    public double field107;

    @ObfuscatedName("j.c")
    public int field95;

    @ObfuscatedName("j.z")
    public int field120;

    @ObfuscatedName("j.n")
    public class45 field115;

    @ObfuscatedName("j.q")
    public int field114 = 0;

    @ObfuscatedName("j.a")
    public int field117 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field93 = arg0;
        this.field94 = arg1;
        this.field112 = arg2;
        this.field96 = arg3;
        this.field97 = arg4;
        this.field99 = arg5;
        this.field100 = arg6;
        this.field113 = arg7;
        this.field102 = arg8;
        this.field103 = arg9;
        this.field98 = arg10;
        this.field101 = false;
        int var12 = class46.method3219(this.field93).field1029;
        if (var12 == -1) {
            this.field115 = null;
        } else {
            this.field115 = class45.method637(var12);
        }
    }

    @ObfuscatedName("j.m(IIIII)V")
    public final void method81(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field101) {
            double var5 = (double) (arg0 - this.field112);
            double var7 = (double) (arg1 - this.field96);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field105 = (double) this.field102 * var5 / var9 + (double) this.field112;
            this.field106 = (double) this.field102 * var7 / var9 + (double) this.field96;
            this.field118 = (double) this.field97;
        }
        double var11 = (double) (this.field100 + 1 - arg3);
        this.field108 = ((double) arg0 - this.field105) / var11;
        this.field109 = ((double) arg1 - this.field106) / var11;
        this.field110 = Math.sqrt(this.field109 * this.field109 + this.field108 * this.field108);
        if (!this.field101) {
            this.field111 = -this.field110 * Math.tan((double) this.field113 * 0.02454369D);
        }
        this.field107 = ((double) arg2 - this.field118 - this.field111 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("j.w(II)V")
    public final void method82(int arg0) {
        this.field101 = true;
        this.field105 += (double) arg0 * this.field108;
        this.field106 += (double) arg0 * this.field109;
        this.field118 += this.field107 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field111;
        this.field111 += (double) arg0 * this.field107;
        this.field95 = (int) (Math.atan2(this.field108, this.field109) * 325.949D) + 1024 & 0x7FF;
        this.field120 = (int) (Math.atan2(this.field111, this.field110) * 325.949D) & 0x7FF;
        if (this.field115 == null) {
            return;
        }
        this.field117 += arg0;
        while (true) {
            do {
                do {
                    if (this.field117 <= this.field115.field1012[this.field114]) {
                        return;
                    }
                    this.field117 -= this.field115.field1012[this.field114];
                    this.field114++;
                } while (this.field114 < this.field115.field1010.length);
                this.field114 -= this.field115.field1014;
            } while (this.field114 >= 0 && this.field114 < this.field115.field1010.length);
            this.field114 = 0;
        }
    }

    @ObfuscatedName("j.e(I)Ldg;")
    public final class109 method22() {
        class46 var1 = class46.method3219(this.field93);
        class109 var2 = var1.method908(this.field114);
        if (var2 == null) {
            return null;
        } else {
            var2.method2233(this.field120);
            return var2;
        }
    }
}
