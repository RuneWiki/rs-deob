package deob;

@ObfuscatedName("m")
public final class class7 extends class86 {

    @ObfuscatedName("m.w")
    public int field130;

    @ObfuscatedName("m.x")
    public int field114;

    @ObfuscatedName("m.t")
    public int field139;

    @ObfuscatedName("m.p")
    public int field116;

    @ObfuscatedName("m.e")
    public int field137;

    @ObfuscatedName("m.y")
    public int field118;

    @ObfuscatedName("m.m")
    public int field119;

    @ObfuscatedName("m.c")
    public int field120;

    @ObfuscatedName("m.v")
    public int field121;

    @ObfuscatedName("m.l")
    public int field122;

    @ObfuscatedName("m.z")
    public int field129;

    @ObfuscatedName("m.s")
    public boolean field124 = false;

    @ObfuscatedName("m.j")
    public double field125;

    @ObfuscatedName("m.q")
    public double field126;

    @ObfuscatedName("m.a")
    public double field127;

    @ObfuscatedName("m.d")
    public double field128;

    @ObfuscatedName("m.u")
    public double field131;

    @ObfuscatedName("m.i")
    public double field123;

    @ObfuscatedName("m.o")
    public double field135;

    @ObfuscatedName("m.h")
    public double field132;

    @ObfuscatedName("m.k")
    public int field133;

    @ObfuscatedName("m.f")
    public int field134;

    @ObfuscatedName("m.r")
    public class43 field136;

    @ObfuscatedName("m.n")
    public int field117 = 0;

    @ObfuscatedName("m.g")
    public int field115 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field130 = arg0;
        this.field114 = arg1;
        this.field139 = arg2;
        this.field116 = arg3;
        this.field137 = arg4;
        this.field119 = arg5;
        this.field120 = arg6;
        this.field121 = arg7;
        this.field122 = arg8;
        this.field129 = arg9;
        this.field118 = arg10;
        this.field124 = false;
        int var12 = class44.method662(this.field130).field1019;
        if (var12 == -1) {
            this.field136 = null;
        } else {
            this.field136 = class43.method2054(var12);
        }
    }

    @ObfuscatedName("m.w(IIIII)V")
    public final void method96(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field124) {
            double var5 = (double) (arg0 - this.field139);
            double var7 = (double) (arg1 - this.field116);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field125 = (double) this.field122 * var5 / var9 + (double) this.field139;
            this.field126 = (double) this.field122 * var7 / var9 + (double) this.field116;
            this.field127 = (double) this.field137;
        }
        double var11 = (double) (this.field120 + 1 - arg3);
        this.field128 = ((double) arg0 - this.field125) / var11;
        this.field131 = ((double) arg1 - this.field126) / var11;
        this.field123 = Math.sqrt(this.field131 * this.field131 + this.field128 * this.field128);
        if (!this.field124) {
            this.field135 = -this.field123 * Math.tan((double) this.field121 * 0.02454369D);
        }
        this.field132 = ((double) arg2 - this.field127 - this.field135 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("m.x(IB)V")
    public final void method98(int arg0) {
        this.field124 = true;
        this.field125 += (double) arg0 * this.field128;
        this.field126 += (double) arg0 * this.field131;
        this.field127 += this.field132 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field135;
        this.field135 += (double) arg0 * this.field132;
        this.field133 = (int) (Math.atan2(this.field128, this.field131) * 325.949D) + 1024 & 0x7FF;
        this.field134 = (int) (Math.atan2(this.field135, this.field123) * 325.949D) & 0x7FF;
        if (this.field136 == null) {
            return;
        }
        this.field115 += arg0;
        while (true) {
            do {
                do {
                    if (this.field115 <= this.field136.field998[this.field117]) {
                        return;
                    }
                    this.field115 -= this.field136.field998[this.field117];
                    this.field117++;
                } while (this.field117 < this.field136.field996.length);
                this.field117 -= this.field136.field1000;
            } while (this.field117 >= 0 && this.field117 < this.field136.field996.length);
            this.field117 = 0;
        }
    }

    @ObfuscatedName("m.t(I)Ldp;")
    public final class106 method34() {
        class44 var1 = class44.method662(this.field130);
        class106 var2 = var1.method918(this.field117);
        if (var2 == null) {
            return null;
        } else {
            var2.method2181(this.field134);
            return var2;
        }
    }
}
