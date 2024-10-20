package deob;

@ObfuscatedName("o")
public final class class7 extends class85 {

    @ObfuscatedName("o.j")
    public int field115;

    @ObfuscatedName("o.l")
    public int field107;

    @ObfuscatedName("o.a")
    public int field108;

    @ObfuscatedName("o.i")
    public int field133;

    @ObfuscatedName("o.f")
    public int field110;

    @ObfuscatedName("o.m")
    public int field123;

    @ObfuscatedName("o.o")
    public int field106;

    @ObfuscatedName("o.h")
    public int field113;

    @ObfuscatedName("o.n")
    public int field129;

    @ObfuscatedName("o.k")
    public int field109;

    @ObfuscatedName("o.r")
    public int field116;

    @ObfuscatedName("o.b")
    public boolean field117 = false;

    @ObfuscatedName("o.q")
    public double field114;

    @ObfuscatedName("o.u")
    public double field118;

    @ObfuscatedName("o.g")
    public double field124;

    @ObfuscatedName("o.y")
    public double field121;

    @ObfuscatedName("o.s")
    public double field122;

    @ObfuscatedName("o.d")
    public double field119;

    @ObfuscatedName("o.z")
    public double field131;

    @ObfuscatedName("o.p")
    public double field125;

    @ObfuscatedName("o.w")
    public int field126;

    @ObfuscatedName("o.t")
    public int field127;

    @ObfuscatedName("o.c")
    public class43 field128;

    @ObfuscatedName("o.x")
    public int field111 = 0;

    @ObfuscatedName("o.e")
    public int field130 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field115 = arg0;
        this.field107 = arg1;
        this.field108 = arg2;
        this.field133 = arg3;
        this.field110 = arg4;
        this.field106 = arg5;
        this.field113 = arg6;
        this.field129 = arg7;
        this.field109 = arg8;
        this.field116 = arg9;
        this.field123 = arg10;
        this.field117 = false;
        int var12 = class44.method632(this.field115).field1013;
        if (var12 == -1) {
            this.field128 = null;
        } else {
            this.field128 = class43.method729(var12);
        }
    }

    @ObfuscatedName("o.j(IIIIB)V")
    public final void method84(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field117) {
            double var5 = (double) (arg0 - this.field108);
            double var7 = (double) (arg1 - this.field133);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field114 = (double) this.field109 * var5 / var9 + (double) this.field108;
            this.field118 = (double) this.field109 * var7 / var9 + (double) this.field133;
            this.field124 = (double) this.field110;
        }
        double var11 = (double) (this.field113 + 1 - arg3);
        this.field121 = ((double) arg0 - this.field114) / var11;
        this.field122 = ((double) arg1 - this.field118) / var11;
        this.field119 = Math.sqrt(this.field122 * this.field122 + this.field121 * this.field121);
        if (!this.field117) {
            this.field131 = -this.field119 * Math.tan((double) this.field129 * 0.02454369D);
        }
        this.field125 = ((double) arg2 - this.field124 - this.field131 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("o.l(II)V")
    public final void method91(int arg0) {
        this.field117 = true;
        this.field114 += (double) arg0 * this.field121;
        this.field118 += (double) arg0 * this.field122;
        this.field124 += this.field125 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field131;
        this.field131 += (double) arg0 * this.field125;
        this.field126 = (int) (Math.atan2(this.field121, this.field122) * 325.949D) + 1024 & 0x7FF;
        this.field127 = (int) (Math.atan2(this.field131, this.field119) * 325.949D) & 0x7FF;
        if (this.field128 == null) {
            return;
        }
        this.field130 += arg0;
        while (true) {
            do {
                do {
                    if (this.field130 <= this.field128.field989[this.field111]) {
                        return;
                    }
                    this.field130 -= this.field128.field989[this.field111];
                    this.field111++;
                } while (this.field111 < this.field128.field987.length);
                this.field111 -= this.field128.field984;
            } while (this.field111 >= 0 && this.field111 < this.field128.field987.length);
            this.field111 = 0;
        }
    }

    @ObfuscatedName("o.a(I)Ldd;")
    public final class105 method14() {
        class44 var1 = class44.method632(this.field115);
        class105 var2 = var1.method884(this.field111);
        if (var2 == null) {
            return null;
        } else {
            var2.method2141(this.field127);
            return var2;
        }
    }
}
