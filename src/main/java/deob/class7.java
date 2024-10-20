package deob;

@ObfuscatedName("f")
public final class class7 extends class83 {

    @ObfuscatedName("f.j")
    public int field122;

    @ObfuscatedName("f.y")
    public int field113;

    @ObfuscatedName("f.z")
    public int field120;

    @ObfuscatedName("f.l")
    public int field114;

    @ObfuscatedName("f.w")
    public int field116;

    @ObfuscatedName("f.d")
    public int field117;

    @ObfuscatedName("f.f")
    public int field124;

    @ObfuscatedName("f.i")
    public int field119;

    @ObfuscatedName("f.a")
    public int field115;

    @ObfuscatedName("f.o")
    public int field121;

    @ObfuscatedName("f.u")
    public int field118;

    @ObfuscatedName("f.m")
    public boolean field126 = false;

    @ObfuscatedName("f.e")
    public double field123;

    @ObfuscatedName("f.v")
    public double field125;

    @ObfuscatedName("f.r")
    public double field112;

    @ObfuscatedName("f.t")
    public double field127;

    @ObfuscatedName("f.g")
    public double field128;

    @ObfuscatedName("f.s")
    public double field129;

    @ObfuscatedName("f.n")
    public double field130;

    @ObfuscatedName("f.h")
    public double field131;

    @ObfuscatedName("f.p")
    public int field132;

    @ObfuscatedName("f.c")
    public int field133;

    @ObfuscatedName("f.x")
    public class41 field134;

    @ObfuscatedName("f.q")
    public int field135 = 0;

    @ObfuscatedName("f.b")
    public int field136 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field122 = arg0;
        this.field113 = arg1;
        this.field120 = arg2;
        this.field114 = arg3;
        this.field116 = arg4;
        this.field124 = arg5;
        this.field119 = arg6;
        this.field115 = arg7;
        this.field121 = arg8;
        this.field118 = arg9;
        this.field117 = arg10;
        this.field126 = false;
        int var12 = class42.method122(this.field122).field991;
        if (var12 == -1) {
            this.field134 = null;
        } else {
            this.field134 = class41.method1016(var12);
        }
    }

    @ObfuscatedName("f.j(IIIIB)V")
    public final void method88(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field126) {
            double var5 = (double) (arg0 - this.field120);
            double var7 = (double) (arg1 - this.field114);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field123 = (double) this.field121 * var5 / var9 + (double) this.field120;
            this.field125 = (double) this.field121 * var7 / var9 + (double) this.field114;
            this.field112 = (double) this.field116;
        }
        double var11 = (double) (this.field119 + 1 - arg3);
        this.field127 = ((double) arg0 - this.field123) / var11;
        this.field128 = ((double) arg1 - this.field125) / var11;
        this.field129 = Math.sqrt(this.field128 * this.field128 + this.field127 * this.field127);
        if (!this.field126) {
            this.field130 = -this.field129 * Math.tan((double) this.field115 * 0.02454369D);
        }
        this.field131 = ((double) arg2 - this.field112 - this.field130 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("f.z(IB)V")
    public final void method87(int arg0) {
        this.field126 = true;
        this.field123 += (double) arg0 * this.field127;
        this.field125 += (double) arg0 * this.field128;
        this.field112 += this.field131 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field130;
        this.field130 += (double) arg0 * this.field131;
        this.field132 = (int) (Math.atan2(this.field127, this.field128) * 325.949D) + 1024 & 0x7FF;
        this.field133 = (int) (Math.atan2(this.field130, this.field129) * 325.949D) & 0x7FF;
        if (this.field134 == null) {
            return;
        }
        this.field136 += arg0;
        while (true) {
            do {
                do {
                    if (this.field136 <= this.field134.field963[this.field135]) {
                        return;
                    }
                    this.field136 -= this.field134.field963[this.field135];
                    this.field135++;
                } while (this.field135 < this.field134.field970.length);
                this.field135 -= this.field134.field972;
            } while (this.field135 >= 0 && this.field135 < this.field134.field970.length);
            this.field135 = 0;
        }
    }

    @ObfuscatedName("f.y(I)Lcw;")
    public final class103 method14() {
        class42 var1 = class42.method122(this.field122);
        class103 var2 = var1.method888(this.field135);
        if (var2 == null) {
            return null;
        } else {
            var2.method2179(this.field133);
            return var2;
        }
    }
}
