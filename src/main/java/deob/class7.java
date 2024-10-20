package deob;

@ObfuscatedName("o")
public final class class7 extends class86 {

    @ObfuscatedName("o.s")
    public int field114;

    @ObfuscatedName("o.j")
    public int field109;

    @ObfuscatedName("o.p")
    public int field112;

    @ObfuscatedName("o.x")
    public int field106;

    @ObfuscatedName("o.d")
    public int field107;

    @ObfuscatedName("o.u")
    public int field108;

    @ObfuscatedName("o.o")
    public int field128;

    @ObfuscatedName("o.b")
    public int field110;

    @ObfuscatedName("o.k")
    public int field105;

    @ObfuscatedName("o.c")
    public int field111;

    @ObfuscatedName("o.l")
    public int field113;

    @ObfuscatedName("o.t")
    public boolean field126 = false;

    @ObfuscatedName("o.i")
    public double field115;

    @ObfuscatedName("o.r")
    public double field116;

    @ObfuscatedName("o.m")
    public double field104;

    @ObfuscatedName("o.e")
    public double field118;

    @ObfuscatedName("o.h")
    public double field119;

    @ObfuscatedName("o.z")
    public double field120;

    @ObfuscatedName("o.a")
    public double field117;

    @ObfuscatedName("o.w")
    public double field122;

    @ObfuscatedName("o.g")
    public int field123;

    @ObfuscatedName("o.y")
    public int field124;

    @ObfuscatedName("o.f")
    public class43 field125;

    @ObfuscatedName("o.q")
    public int field121 = 0;

    @ObfuscatedName("o.n")
    public int field127 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field114 = arg0;
        this.field109 = arg1;
        this.field112 = arg2;
        this.field106 = arg3;
        this.field107 = arg4;
        this.field128 = arg5;
        this.field110 = arg6;
        this.field105 = arg7;
        this.field111 = arg8;
        this.field113 = arg9;
        this.field108 = arg10;
        this.field126 = false;
        int var12 = class44.method3263(this.field114).field1009;
        if (var12 == -1) {
            this.field125 = null;
        } else {
            this.field125 = class43.method43(var12);
        }
    }

    @ObfuscatedName("o.s(IIIII)V")
    public final void method91(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field126) {
            double var5 = (double) (arg0 - this.field112);
            double var7 = (double) (arg1 - this.field106);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field115 = (double) this.field111 * var5 / var9 + (double) this.field112;
            this.field116 = (double) this.field111 * var7 / var9 + (double) this.field106;
            this.field104 = (double) this.field107;
        }
        double var11 = (double) (this.field110 + 1 - arg3);
        this.field118 = ((double) arg0 - this.field115) / var11;
        this.field119 = ((double) arg1 - this.field116) / var11;
        this.field120 = Math.sqrt(this.field119 * this.field119 + this.field118 * this.field118);
        if (!this.field126) {
            this.field117 = -this.field120 * Math.tan((double) this.field105 * 0.02454369D);
        }
        this.field122 = ((double) arg2 - this.field104 - this.field117 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("o.j(II)V")
    public final void method92(int arg0) {
        this.field126 = true;
        this.field115 += (double) arg0 * this.field118;
        this.field116 += (double) arg0 * this.field119;
        this.field104 += this.field122 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field117;
        this.field117 += (double) arg0 * this.field122;
        this.field123 = (int) (Math.atan2(this.field118, this.field119) * 325.949D) + 1024 & 0x7FF;
        this.field124 = (int) (Math.atan2(this.field117, this.field120) * 325.949D) & 0x7FF;
        if (this.field125 == null) {
            return;
        }
        this.field127 += arg0;
        while (true) {
            do {
                do {
                    if (this.field127 <= this.field125.field1000[this.field121]) {
                        return;
                    }
                    this.field127 -= this.field125.field1000[this.field121];
                    this.field121++;
                } while (this.field121 < this.field125.field987.length);
                this.field121 -= this.field125.field992;
            } while (this.field121 >= 0 && this.field121 < this.field125.field987.length);
            this.field121 = 0;
        }
    }

    @ObfuscatedName("o.p(B)Ldh;")
    public final class106 method14() {
        class44 var1 = class44.method3263(this.field114);
        class106 var2 = var1.method859(this.field121);
        if (var2 == null) {
            return null;
        } else {
            var2.method2154(this.field124);
            return var2;
        }
    }
}
