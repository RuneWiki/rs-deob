package deob;

@ObfuscatedName("o")
public final class class7 extends class85 {

    @ObfuscatedName("o.h")
    public int field125;

    @ObfuscatedName("o.q")
    public int field113;

    @ObfuscatedName("o.v")
    public int field114;

    @ObfuscatedName("o.n")
    public int field115;

    @ObfuscatedName("o.f")
    public int field123;

    @ObfuscatedName("o.g")
    public int field140;

    @ObfuscatedName("o.o")
    public int field118;

    @ObfuscatedName("o.s")
    public int field119;

    @ObfuscatedName("o.k")
    public int field120;

    @ObfuscatedName("o.b")
    public int field131;

    @ObfuscatedName("o.c")
    public int field126;

    @ObfuscatedName("o.l")
    public boolean field132 = false;

    @ObfuscatedName("o.p")
    public double field124;

    @ObfuscatedName("o.d")
    public double field121;

    @ObfuscatedName("o.i")
    public double field134;

    @ObfuscatedName("o.x")
    public double field127;

    @ObfuscatedName("o.j")
    public double field128;

    @ObfuscatedName("o.w")
    public double field129;

    @ObfuscatedName("o.r")
    public double field130;

    @ObfuscatedName("o.u")
    public double field116;

    @ObfuscatedName("o.m")
    public int field122;

    @ObfuscatedName("o.t")
    public int field133;

    @ObfuscatedName("o.z")
    public class43 field117;

    @ObfuscatedName("o.e")
    public int field135 = 0;

    @ObfuscatedName("o.y")
    public int field136 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field125 = arg0;
        this.field113 = arg1;
        this.field114 = arg2;
        this.field115 = arg3;
        this.field123 = arg4;
        this.field118 = arg5;
        this.field119 = arg6;
        this.field120 = arg7;
        this.field131 = arg8;
        this.field126 = arg9;
        this.field140 = arg10;
        this.field132 = false;
        int var12 = class44.method2821(this.field125).field1019;
        if (var12 == -1) {
            this.field117 = null;
        } else {
            this.field117 = class43.method733(var12);
        }
    }

    @ObfuscatedName("o.h(IIIII)V")
    public final void method96(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field132) {
            double var5 = (double) (arg0 - this.field114);
            double var7 = (double) (arg1 - this.field115);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field124 = (double) this.field131 * var5 / var9 + (double) this.field114;
            this.field121 = (double) this.field131 * var7 / var9 + (double) this.field115;
            this.field134 = (double) this.field123;
        }
        double var11 = (double) (this.field119 + 1 - arg3);
        this.field127 = ((double) arg0 - this.field124) / var11;
        this.field128 = ((double) arg1 - this.field121) / var11;
        this.field129 = Math.sqrt(this.field128 * this.field128 + this.field127 * this.field127);
        if (!this.field132) {
            this.field130 = -this.field129 * Math.tan((double) this.field120 * 0.02454369D);
        }
        this.field116 = ((double) arg2 - this.field134 - this.field130 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("o.q(IB)V")
    public final void method97(int arg0) {
        this.field132 = true;
        this.field124 += (double) arg0 * this.field127;
        this.field121 += (double) arg0 * this.field128;
        this.field134 += this.field116 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field130;
        this.field130 += (double) arg0 * this.field116;
        this.field122 = (int) (Math.atan2(this.field127, this.field128) * 325.949D) + 1024 & 0x7FF;
        this.field133 = (int) (Math.atan2(this.field130, this.field129) * 325.949D) & 0x7FF;
        if (this.field117 == null) {
            return;
        }
        this.field136 += arg0;
        while (true) {
            do {
                do {
                    if (this.field136 <= this.field117.field996[this.field135]) {
                        return;
                    }
                    this.field136 -= this.field117.field996[this.field135];
                    this.field135++;
                } while (this.field135 < this.field117.field994.length);
                this.field135 -= this.field117.field998;
            } while (this.field135 >= 0 && this.field135 < this.field117.field994.length);
            this.field135 = 0;
        }
    }

    @ObfuscatedName("o.v(B)Ldg;")
    public final class105 method32() {
        class44 var1 = class44.method2821(this.field125);
        class105 var2 = var1.method886(this.field135);
        if (var2 == null) {
            return null;
        } else {
            var2.method2185(this.field133);
            return var2;
        }
    }
}
