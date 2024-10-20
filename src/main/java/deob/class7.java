package deob;

@ObfuscatedName("y")
public final class class7 extends class78 {

    @ObfuscatedName("y.b")
    public int field111;

    @ObfuscatedName("y.u")
    public int field102;

    @ObfuscatedName("y.x")
    public int field126;

    @ObfuscatedName("y.j")
    public int field104;

    @ObfuscatedName("y.o")
    public int field105;

    @ObfuscatedName("y.n")
    public int field106;

    @ObfuscatedName("y.y")
    public int field121;

    @ObfuscatedName("y.f")
    public int field108;

    @ObfuscatedName("y.p")
    public int field109;

    @ObfuscatedName("y.l")
    public int field122;

    @ObfuscatedName("y.k")
    public int field101;

    @ObfuscatedName("y.q")
    public boolean field112 = false;

    @ObfuscatedName("y.e")
    public double field113;

    @ObfuscatedName("y.t")
    public double field114;

    @ObfuscatedName("y.g")
    public double field119;

    @ObfuscatedName("y.c")
    public double field116;

    @ObfuscatedName("y.m")
    public double field117;

    @ObfuscatedName("y.i")
    public double field103;

    @ObfuscatedName("y.h")
    public double field107;

    @ObfuscatedName("y.a")
    public double field120;

    @ObfuscatedName("y.w")
    public int field115;

    @ObfuscatedName("y.z")
    public int field118;

    @ObfuscatedName("y.v")
    public class38 field123;

    @ObfuscatedName("y.s")
    public int field124 = 0;

    @ObfuscatedName("y.r")
    public int field125 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field111 = arg0;
        this.field102 = arg1;
        this.field126 = arg2;
        this.field104 = arg3;
        this.field105 = arg4;
        this.field121 = arg5;
        this.field108 = arg6;
        this.field109 = arg7;
        this.field122 = arg8;
        this.field101 = arg9;
        this.field106 = arg10;
        this.field112 = false;
        int var12 = class39.method1(this.field111).field932;
        if (var12 == -1) {
            this.field123 = null;
        } else {
            this.field123 = Statics.method484(var12);
        }
    }

    @ObfuscatedName("y.b(IIIII)V")
    public final void method82(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field112) {
            double var5 = (double) (arg0 - this.field126);
            double var7 = (double) (arg1 - this.field104);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field113 = (double) this.field122 * var5 / var9 + (double) this.field126;
            this.field114 = (double) this.field122 * var7 / var9 + (double) this.field104;
            this.field119 = (double) this.field105;
        }
        double var11 = (double) (this.field108 + 1 - arg3);
        this.field116 = ((double) arg0 - this.field113) / var11;
        this.field117 = ((double) arg1 - this.field114) / var11;
        this.field103 = Math.sqrt(this.field117 * this.field117 + this.field116 * this.field116);
        if (!this.field112) {
            this.field107 = -this.field103 * Math.tan((double) this.field109 * 0.02454369D);
        }
        this.field120 = ((double) arg2 - this.field119 - this.field107 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("y.x(II)V")
    public final void method83(int arg0) {
        this.field112 = true;
        this.field113 += (double) arg0 * this.field116;
        this.field114 += (double) arg0 * this.field117;
        this.field119 += this.field120 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field107;
        this.field107 += (double) arg0 * this.field120;
        this.field115 = (int) (Math.atan2(this.field116, this.field117) * 325.949D) + 1024 & 0x7FF;
        this.field118 = (int) (Math.atan2(this.field107, this.field103) * 325.949D) & 0x7FF;
        if (this.field123 == null) {
            return;
        }
        this.field125 += arg0;
        while (true) {
            do {
                do {
                    if (this.field125 <= this.field123.field900[this.field124]) {
                        return;
                    }
                    this.field125 -= this.field123.field900[this.field124];
                    this.field124++;
                } while (this.field124 < this.field123.field911.length);
                this.field124 -= this.field123.field908;
            } while (this.field124 >= 0 && this.field124 < this.field123.field911.length);
            this.field124 = 0;
        }
    }

    @ObfuscatedName("y.u(I)Lcu;")
    public final class98 method19() {
        class39 var1 = class39.method1(this.field111);
        class98 var2 = var1.method733(this.field124);
        if (var2 == null) {
            return null;
        } else {
            var2.method1998(this.field118);
            return var2;
        }
    }
}
