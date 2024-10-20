package deob;

@ObfuscatedName("b")
public final class class7 extends class89 {

    @ObfuscatedName("b.e")
    public int field100;

    @ObfuscatedName("b.l")
    public int field99;

    @ObfuscatedName("b.c")
    public int field106;

    @ObfuscatedName("b.h")
    public int field101;

    @ObfuscatedName("b.r")
    public int field102;

    @ObfuscatedName("b.a")
    public int field103;

    @ObfuscatedName("b.b")
    public int field104;

    @ObfuscatedName("b.u")
    public int field105;

    @ObfuscatedName("b.o")
    public int field123;

    @ObfuscatedName("b.p")
    public int field107;

    @ObfuscatedName("b.i")
    public int field128;

    @ObfuscatedName("b.q")
    public boolean field109 = false;

    @ObfuscatedName("b.g")
    public double field110;

    @ObfuscatedName("b.j")
    public double field111;

    @ObfuscatedName("b.w")
    public double field112;

    @ObfuscatedName("b.x")
    public double field108;

    @ObfuscatedName("b.f")
    public double field114;

    @ObfuscatedName("b.t")
    public double field115;

    @ObfuscatedName("b.z")
    public double field116;

    @ObfuscatedName("b.y")
    public double field117;

    @ObfuscatedName("b.m")
    public int field118;

    @ObfuscatedName("b.v")
    public int field119;

    @ObfuscatedName("b.k")
    public class45 field113;

    @ObfuscatedName("b.n")
    public int field120 = 0;

    @ObfuscatedName("b.d")
    public int field122 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field100 = arg0;
        this.field99 = arg1;
        this.field106 = arg2;
        this.field101 = arg3;
        this.field102 = arg4;
        this.field104 = arg5;
        this.field105 = arg6;
        this.field123 = arg7;
        this.field107 = arg8;
        this.field128 = arg9;
        this.field103 = arg10;
        this.field109 = false;
        int var12 = class46.method3025(this.field100).field1048;
        if (var12 == -1) {
            this.field113 = null;
        } else {
            this.field113 = Statics.method144(var12);
        }
    }

    @ObfuscatedName("b.e(IIIII)V")
    public final void method80(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field109) {
            double var5 = (double) (arg0 - this.field106);
            double var7 = (double) (arg1 - this.field101);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field110 = (double) this.field107 * var5 / var9 + (double) this.field106;
            this.field111 = (double) this.field107 * var7 / var9 + (double) this.field101;
            this.field112 = (double) this.field102;
        }
        double var11 = (double) (this.field105 + 1 - arg3);
        this.field108 = ((double) arg0 - this.field110) / var11;
        this.field114 = ((double) arg1 - this.field111) / var11;
        this.field115 = Math.sqrt(this.field114 * this.field114 + this.field108 * this.field108);
        if (!this.field109) {
            this.field116 = -this.field115 * Math.tan((double) this.field123 * 0.02454369D);
        }
        this.field117 = ((double) arg2 - this.field112 - this.field116 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("b.l(II)V")
    public final void method81(int arg0) {
        this.field109 = true;
        this.field110 += (double) arg0 * this.field108;
        this.field111 += (double) arg0 * this.field114;
        this.field112 += this.field117 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field116;
        this.field116 += (double) arg0 * this.field117;
        this.field118 = (int) (Math.atan2(this.field108, this.field114) * 325.949D) + 1024 & 0x7FF;
        this.field119 = (int) (Math.atan2(this.field116, this.field115) * 325.949D) & 0x7FF;
        if (this.field113 == null) {
            return;
        }
        this.field122 += arg0;
        while (true) {
            do {
                do {
                    if (this.field122 <= this.field113.field1026[this.field120]) {
                        return;
                    }
                    this.field122 -= this.field113.field1026[this.field120];
                    this.field120++;
                } while (this.field120 < this.field113.field1024.length);
                this.field120 -= this.field113.field1028;
            } while (this.field120 >= 0 && this.field120 < this.field113.field1024.length);
            this.field120 = 0;
        }
    }

    @ObfuscatedName("b.c(I)Lds;")
    public final class109 method9() {
        class46 var1 = class46.method3025(this.field100);
        class109 var2 = var1.method932(this.field120);
        if (var2 == null) {
            return null;
        } else {
            var2.method2265(this.field119);
            return var2;
        }
    }
}
