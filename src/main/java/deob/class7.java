package deob;

@ObfuscatedName("f")
public final class class7 extends class85 {

    @ObfuscatedName("f.h")
    public int field112;

    @ObfuscatedName("f.m")
    public int field99;

    @ObfuscatedName("f.i")
    public int field100;

    @ObfuscatedName("f.q")
    public int field101;

    @ObfuscatedName("f.p")
    public int field102;

    @ObfuscatedName("f.c")
    public int field103;

    @ObfuscatedName("f.f")
    public int field104;

    @ObfuscatedName("f.y")
    public int field106;

    @ObfuscatedName("f.w")
    public int field113;

    @ObfuscatedName("f.l")
    public int field98;

    @ObfuscatedName("f.v")
    public int field108;

    @ObfuscatedName("f.k")
    public boolean field109 = false;

    @ObfuscatedName("f.o")
    public double field110;

    @ObfuscatedName("f.u")
    public double field115;

    @ObfuscatedName("f.s")
    public double field121;

    @ObfuscatedName("f.g")
    public double field107;

    @ObfuscatedName("f.x")
    public double field114;

    @ObfuscatedName("f.a")
    public double field105;

    @ObfuscatedName("f.t")
    public double field116;

    @ObfuscatedName("f.z")
    public double field123;

    @ObfuscatedName("f.r")
    public int field118;

    @ObfuscatedName("f.d")
    public int field119;

    @ObfuscatedName("f.n")
    public class43 field120;

    @ObfuscatedName("f.j")
    public int field111 = 0;

    @ObfuscatedName("f.b")
    public int field122 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field112 = arg0;
        this.field99 = arg1;
        this.field100 = arg2;
        this.field101 = arg3;
        this.field102 = arg4;
        this.field104 = arg5;
        this.field106 = arg6;
        this.field113 = arg7;
        this.field98 = arg8;
        this.field108 = arg9;
        this.field103 = arg10;
        this.field109 = false;
        int var12 = class44.method2239(this.field112).field1017;
        if (var12 == -1) {
            this.field120 = null;
        } else {
            this.field120 = class43.method2257(var12);
        }
    }

    @ObfuscatedName("f.h(IIIII)V")
    public final void method89(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field109) {
            double var5 = (double) (arg0 - this.field100);
            double var7 = (double) (arg1 - this.field101);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field110 = (double) this.field98 * var5 / var9 + (double) this.field100;
            this.field115 = (double) this.field98 * var7 / var9 + (double) this.field101;
            this.field121 = (double) this.field102;
        }
        double var11 = (double) (this.field106 + 1 - arg3);
        this.field107 = ((double) arg0 - this.field110) / var11;
        this.field114 = ((double) arg1 - this.field115) / var11;
        this.field105 = Math.sqrt(this.field114 * this.field114 + this.field107 * this.field107);
        if (!this.field109) {
            this.field116 = -this.field105 * Math.tan((double) this.field113 * 0.02454369D);
        }
        this.field123 = ((double) arg2 - this.field121 - this.field116 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("f.m(II)V")
    public final void method82(int arg0) {
        this.field109 = true;
        this.field110 += (double) arg0 * this.field107;
        this.field115 += (double) arg0 * this.field114;
        this.field121 += this.field123 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field116;
        this.field116 += (double) arg0 * this.field123;
        this.field118 = (int) (Math.atan2(this.field107, this.field114) * 325.949D) + 1024 & 0x7FF;
        this.field119 = (int) (Math.atan2(this.field116, this.field105) * 325.949D) & 0x7FF;
        if (this.field120 == null) {
            return;
        }
        this.field122 += arg0;
        while (true) {
            do {
                do {
                    if (this.field122 <= this.field120.field995[this.field111]) {
                        return;
                    }
                    this.field122 -= this.field120.field995[this.field111];
                    this.field111++;
                } while (this.field111 < this.field120.field988.length);
                this.field111 -= this.field120.field990;
            } while (this.field111 >= 0 && this.field111 < this.field120.field988.length);
            this.field111 = 0;
        }
    }

    @ObfuscatedName("f.i(B)Ldb;")
    public final class105 method34() {
        class44 var1 = class44.method2239(this.field112);
        class105 var2 = var1.method870(this.field111);
        if (var2 == null) {
            return null;
        } else {
            var2.method2129(this.field119);
            return var2;
        }
    }
}
