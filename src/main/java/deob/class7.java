package deob;

@ObfuscatedName("m")
public final class class7 extends class85 {

    @ObfuscatedName("m.g")
    public int field129;

    @ObfuscatedName("m.b")
    public int field110;

    @ObfuscatedName("m.w")
    public int field111;

    @ObfuscatedName("m.d")
    public int field112;

    @ObfuscatedName("m.z")
    public int field130;

    @ObfuscatedName("m.l")
    public int field114;

    @ObfuscatedName("m.m")
    public int field127;

    @ObfuscatedName("m.p")
    public int field116;

    @ObfuscatedName("m.u")
    public int field117;

    @ObfuscatedName("m.c")
    public int field118;

    @ObfuscatedName("m.v")
    public int field119;

    @ObfuscatedName("m.o")
    public boolean field115 = false;

    @ObfuscatedName("m.n")
    public double field121;

    @ObfuscatedName("m.k")
    public double field122;

    @ObfuscatedName("m.f")
    public double field123;

    @ObfuscatedName("m.x")
    public double field124;

    @ObfuscatedName("m.j")
    public double field125;

    @ObfuscatedName("m.r")
    public double field126;

    @ObfuscatedName("m.y")
    public double field109;

    @ObfuscatedName("m.t")
    public double field128;

    @ObfuscatedName("m.a")
    public int field135;

    @ObfuscatedName("m.s")
    public int field120;

    @ObfuscatedName("m.e")
    public class43 field136;

    @ObfuscatedName("m.q")
    public int field132 = 0;

    @ObfuscatedName("m.i")
    public int field133 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field129 = arg0;
        this.field110 = arg1;
        this.field111 = arg2;
        this.field112 = arg3;
        this.field130 = arg4;
        this.field127 = arg5;
        this.field116 = arg6;
        this.field117 = arg7;
        this.field118 = arg8;
        this.field119 = arg9;
        this.field114 = arg10;
        this.field115 = false;
        int var12 = class44.method2656(this.field129).field1017;
        if (var12 == -1) {
            this.field136 = null;
        } else {
            this.field136 = class43.method2054(var12);
        }
    }

    @ObfuscatedName("m.g(IIIII)V")
    public final void method100(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field115) {
            double var5 = (double) (arg0 - this.field111);
            double var7 = (double) (arg1 - this.field112);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field121 = (double) this.field118 * var5 / var9 + (double) this.field111;
            this.field122 = (double) this.field118 * var7 / var9 + (double) this.field112;
            this.field123 = (double) this.field130;
        }
        double var11 = (double) (this.field116 + 1 - arg3);
        this.field124 = ((double) arg0 - this.field121) / var11;
        this.field125 = ((double) arg1 - this.field122) / var11;
        this.field126 = Math.sqrt(this.field125 * this.field125 + this.field124 * this.field124);
        if (!this.field115) {
            this.field109 = -this.field126 * Math.tan((double) this.field117 * 0.02454369D);
        }
        this.field128 = ((double) arg2 - this.field123 - this.field109 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("m.b(II)V")
    public final void method101(int arg0) {
        this.field115 = true;
        this.field121 += (double) arg0 * this.field124;
        this.field122 += (double) arg0 * this.field125;
        this.field123 += this.field128 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field109;
        this.field109 += (double) arg0 * this.field128;
        this.field135 = (int) (Math.atan2(this.field124, this.field125) * 325.949D) + 1024 & 0x7FF;
        this.field120 = (int) (Math.atan2(this.field109, this.field126) * 325.949D) & 0x7FF;
        if (this.field136 == null) {
            return;
        }
        this.field133 += arg0;
        while (true) {
            do {
                do {
                    if (this.field133 <= this.field136.field996[this.field132]) {
                        return;
                    }
                    this.field133 -= this.field136.field996[this.field132];
                    this.field132++;
                } while (this.field132 < this.field136.field994.length);
                this.field132 -= this.field136.field998;
            } while (this.field132 >= 0 && this.field132 < this.field136.field994.length);
            this.field132 = 0;
        }
    }

    @ObfuscatedName("m.w(I)Ldd;")
    public final class105 method19() {
        class44 var1 = class44.method2656(this.field129);
        class105 var2 = var1.method917(this.field132);
        if (var2 == null) {
            return null;
        } else {
            var2.method2188(this.field120);
            return var2;
        }
    }
}
