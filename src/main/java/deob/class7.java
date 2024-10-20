package deob;

@ObfuscatedName("r")
public final class class7 extends class85 {

    @ObfuscatedName("r.z")
    public int field108;

    @ObfuscatedName("r.q")
    public int field103;

    @ObfuscatedName("r.k")
    public int field117;

    @ObfuscatedName("r.f")
    public int field105;

    @ObfuscatedName("r.d")
    public int field106;

    @ObfuscatedName("r.l")
    public int field104;

    @ObfuscatedName("r.r")
    public int field125;

    @ObfuscatedName("r.g")
    public int field109;

    @ObfuscatedName("r.h")
    public int field107;

    @ObfuscatedName("r.n")
    public int field127;

    @ObfuscatedName("r.j")
    public int field112;

    @ObfuscatedName("r.a")
    public boolean field113 = false;

    @ObfuscatedName("r.b")
    public double field114;

    @ObfuscatedName("r.c")
    public double field115;

    @ObfuscatedName("r.v")
    public double field116;

    @ObfuscatedName("r.p")
    public double field110;

    @ObfuscatedName("r.i")
    public double field111;

    @ObfuscatedName("r.t")
    public double field119;

    @ObfuscatedName("r.u")
    public double field120;

    @ObfuscatedName("r.e")
    public double field121;

    @ObfuscatedName("r.m")
    public int field122;

    @ObfuscatedName("r.s")
    public int field102;

    @ObfuscatedName("r.x")
    public class43 field124;

    @ObfuscatedName("r.y")
    public int field118 = 0;

    @ObfuscatedName("r.w")
    public int field126 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field108 = arg0;
        this.field103 = arg1;
        this.field117 = arg2;
        this.field105 = arg3;
        this.field106 = arg4;
        this.field125 = arg5;
        this.field109 = arg6;
        this.field107 = arg7;
        this.field127 = arg8;
        this.field112 = arg9;
        this.field104 = arg10;
        this.field113 = false;
        int var12 = class44.method216(this.field108).field1004;
        if (var12 == -1) {
            this.field124 = null;
        } else {
            this.field124 = class43.method72(var12);
        }
    }

    @ObfuscatedName("r.z(IIIII)V")
    public final void method97(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field113) {
            double var5 = (double) (arg0 - this.field117);
            double var7 = (double) (arg1 - this.field105);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field114 = (double) this.field127 * var5 / var9 + (double) this.field117;
            this.field115 = (double) this.field127 * var7 / var9 + (double) this.field105;
            this.field116 = (double) this.field106;
        }
        double var11 = (double) (this.field109 + 1 - arg3);
        this.field110 = ((double) arg0 - this.field114) / var11;
        this.field111 = ((double) arg1 - this.field115) / var11;
        this.field119 = Math.sqrt(this.field111 * this.field111 + this.field110 * this.field110);
        if (!this.field113) {
            this.field120 = -this.field119 * Math.tan((double) this.field107 * 0.02454369D);
        }
        this.field121 = ((double) arg2 - this.field116 - this.field120 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("r.q(II)V")
    public final void method98(int arg0) {
        this.field113 = true;
        this.field114 += (double) arg0 * this.field110;
        this.field115 += (double) arg0 * this.field111;
        this.field116 += this.field121 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field120;
        this.field120 += (double) arg0 * this.field121;
        this.field122 = (int) (Math.atan2(this.field110, this.field111) * 325.949D) + 1024 & 0x7FF;
        this.field102 = (int) (Math.atan2(this.field120, this.field119) * 325.949D) & 0x7FF;
        if (this.field124 == null) {
            return;
        }
        this.field126 += arg0;
        while (true) {
            do {
                do {
                    if (this.field126 <= this.field124.field981[this.field118]) {
                        return;
                    }
                    this.field126 -= this.field124.field981[this.field118];
                    this.field118++;
                } while (this.field118 < this.field124.field974.length);
                this.field118 -= this.field124.field977;
            } while (this.field118 >= 0 && this.field118 < this.field124.field974.length);
            this.field118 = 0;
        }
    }

    @ObfuscatedName("r.k(I)Ldb;")
    public final class105 method18() {
        class44 var1 = class44.method216(this.field108);
        class105 var2 = var1.method860(this.field118);
        if (var2 == null) {
            return null;
        } else {
            var2.method2115(this.field102);
            return var2;
        }
    }
}
