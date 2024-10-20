package deob;

@ObfuscatedName("y")
public final class class7 extends class85 {

    @ObfuscatedName("y.o")
    public int field120;

    @ObfuscatedName("y.e")
    public int field112;

    @ObfuscatedName("y.u")
    public int field96;

    @ObfuscatedName("y.b")
    public int field97;

    @ObfuscatedName("y.p")
    public int field98;

    @ObfuscatedName("y.s")
    public int field99;

    @ObfuscatedName("y.y")
    public int field115;

    @ObfuscatedName("y.t")
    public int field114;

    @ObfuscatedName("y.w")
    public int field102;

    @ObfuscatedName("y.h")
    public int field103;

    @ObfuscatedName("y.d")
    public int field95;

    @ObfuscatedName("y.l")
    public boolean field105 = false;

    @ObfuscatedName("y.n")
    public double field106;

    @ObfuscatedName("y.q")
    public double field109;

    @ObfuscatedName("y.f")
    public double field108;

    @ObfuscatedName("y.v")
    public double field100;

    @ObfuscatedName("y.a")
    public double field110;

    @ObfuscatedName("y.k")
    public double field107;

    @ObfuscatedName("y.r")
    public double field104;

    @ObfuscatedName("y.i")
    public double field113;

    @ObfuscatedName("y.j")
    public int field94;

    @ObfuscatedName("y.z")
    public int field111;

    @ObfuscatedName("y.m")
    public class43 field116;

    @ObfuscatedName("y.g")
    public int field117 = 0;

    @ObfuscatedName("y.c")
    public int field118 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field120 = arg0;
        this.field112 = arg1;
        this.field96 = arg2;
        this.field97 = arg3;
        this.field98 = arg4;
        this.field115 = arg5;
        this.field114 = arg6;
        this.field102 = arg7;
        this.field103 = arg8;
        this.field95 = arg9;
        this.field99 = arg10;
        this.field105 = false;
        int var12 = class44.method3260(this.field120).field1004;
        if (var12 == -1) {
            this.field116 = null;
        } else {
            this.field116 = class43.method774(var12);
        }
    }

    @ObfuscatedName("y.o(IIIII)V")
    public final void method92(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field105) {
            double var5 = (double) (arg0 - this.field96);
            double var7 = (double) (arg1 - this.field97);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field106 = (double) this.field103 * var5 / var9 + (double) this.field96;
            this.field109 = (double) this.field103 * var7 / var9 + (double) this.field97;
            this.field108 = (double) this.field98;
        }
        double var11 = (double) (this.field114 + 1 - arg3);
        this.field100 = ((double) arg0 - this.field106) / var11;
        this.field110 = ((double) arg1 - this.field109) / var11;
        this.field107 = Math.sqrt(this.field110 * this.field110 + this.field100 * this.field100);
        if (!this.field105) {
            this.field104 = -this.field107 * Math.tan((double) this.field102 * 0.02454369D);
        }
        this.field113 = ((double) arg2 - this.field108 - this.field104 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("y.e(II)V")
    public final void method97(int arg0) {
        this.field105 = true;
        this.field106 += (double) arg0 * this.field100;
        this.field109 += (double) arg0 * this.field110;
        this.field108 += this.field113 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field104;
        this.field104 += (double) arg0 * this.field113;
        this.field94 = (int) (Math.atan2(this.field100, this.field110) * 325.949D) + 1024 & 0x7FF;
        this.field111 = (int) (Math.atan2(this.field104, this.field107) * 325.949D) & 0x7FF;
        if (this.field116 == null) {
            return;
        }
        this.field118 += arg0;
        while (true) {
            do {
                do {
                    if (this.field118 <= this.field116.field986[this.field117]) {
                        return;
                    }
                    this.field118 -= this.field116.field986[this.field117];
                    this.field117++;
                } while (this.field117 < this.field116.field984.length);
                this.field117 -= this.field116.field992;
            } while (this.field117 >= 0 && this.field117 < this.field116.field984.length);
            this.field117 = 0;
        }
    }

    @ObfuscatedName("y.u(I)Ldk;")
    public final class105 method14() {
        class44 var1 = class44.method3260(this.field120);
        class105 var2 = var1.method883(this.field117);
        if (var2 == null) {
            return null;
        } else {
            var2.method2126(this.field111);
            return var2;
        }
    }
}
