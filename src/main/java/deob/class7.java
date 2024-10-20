package deob;

@ObfuscatedName("p")
public final class class7 extends class85 {

    @ObfuscatedName("p.i")
    public int field115;

    @ObfuscatedName("p.v")
    public int field102;

    @ObfuscatedName("p.f")
    public int field103;

    @ObfuscatedName("p.h")
    public int field104;

    @ObfuscatedName("p.a")
    public int field105;

    @ObfuscatedName("p.s")
    public int field101;

    @ObfuscatedName("p.p")
    public int field107;

    @ObfuscatedName("p.r")
    public int field130;

    @ObfuscatedName("p.k")
    public int field109;

    @ObfuscatedName("p.d")
    public int field122;

    @ObfuscatedName("p.n")
    public int field111;

    @ObfuscatedName("p.z")
    public boolean field112 = false;

    @ObfuscatedName("p.c")
    public double field127;

    @ObfuscatedName("p.b")
    public double field114;

    @ObfuscatedName("p.w")
    public double field110;

    @ObfuscatedName("p.g")
    public double field116;

    @ObfuscatedName("p.x")
    public double field117;

    @ObfuscatedName("p.o")
    public double field118;

    @ObfuscatedName("p.l")
    public double field108;

    @ObfuscatedName("p.j")
    public double field123;

    @ObfuscatedName("p.m")
    public int field120;

    @ObfuscatedName("p.e")
    public int field119;

    @ObfuscatedName("p.u")
    public class43 field113;

    @ObfuscatedName("p.y")
    public int field124 = 0;

    @ObfuscatedName("p.t")
    public int field125 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field115 = arg0;
        this.field102 = arg1;
        this.field103 = arg2;
        this.field104 = arg3;
        this.field105 = arg4;
        this.field107 = arg5;
        this.field130 = arg6;
        this.field109 = arg7;
        this.field122 = arg8;
        this.field111 = arg9;
        this.field101 = arg10;
        this.field112 = false;
        int var12 = class44.method769(this.field115).field1027;
        if (var12 == -1) {
            this.field113 = null;
        } else {
            this.field113 = class43.method3831(var12);
        }
    }

    @ObfuscatedName("p.i(IIIIB)V")
    public final void method93(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field112) {
            double var5 = (double) (arg0 - this.field103);
            double var7 = (double) (arg1 - this.field104);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field127 = (double) this.field122 * var5 / var9 + (double) this.field103;
            this.field114 = (double) this.field122 * var7 / var9 + (double) this.field104;
            this.field110 = (double) this.field105;
        }
        double var11 = (double) (this.field130 + 1 - arg3);
        this.field116 = ((double) arg0 - this.field127) / var11;
        this.field117 = ((double) arg1 - this.field114) / var11;
        this.field118 = Math.sqrt(this.field117 * this.field117 + this.field116 * this.field116);
        if (!this.field112) {
            this.field108 = -this.field118 * Math.tan((double) this.field109 * 0.02454369D);
        }
        this.field123 = ((double) arg2 - this.field110 - this.field108 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("p.v(II)V")
    public final void method95(int arg0) {
        this.field112 = true;
        this.field127 += (double) arg0 * this.field116;
        this.field114 += (double) arg0 * this.field117;
        this.field110 += this.field123 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field108;
        this.field108 += (double) arg0 * this.field123;
        this.field120 = (int) (Math.atan2(this.field116, this.field117) * 325.949D) + 1024 & 0x7FF;
        this.field119 = (int) (Math.atan2(this.field108, this.field118) * 325.949D) & 0x7FF;
        if (this.field113 == null) {
            return;
        }
        this.field125 += arg0;
        while (true) {
            do {
                do {
                    if (this.field125 <= this.field113.field1010[this.field124]) {
                        return;
                    }
                    this.field125 -= this.field113.field1010[this.field124];
                    this.field124++;
                } while (this.field124 < this.field113.field1000.length);
                this.field124 -= this.field113.field1015;
            } while (this.field124 >= 0 && this.field124 < this.field113.field1000.length);
            this.field124 = 0;
        }
    }

    @ObfuscatedName("p.f(I)Ldo;")
    public final class105 method29() {
        class44 var1 = class44.method769(this.field115);
        class105 var2 = var1.method840(this.field124);
        if (var2 == null) {
            return null;
        } else {
            var2.method2114(this.field119);
            return var2;
        }
    }
}
