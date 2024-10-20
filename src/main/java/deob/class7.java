package deob;

@ObfuscatedName("f")
public final class class7 extends class86 {

    @ObfuscatedName("f.t")
    public int field107;

    @ObfuscatedName("f.i")
    public int field118;

    @ObfuscatedName("f.g")
    public int field104;

    @ObfuscatedName("f.h")
    public int field105;

    @ObfuscatedName("f.z")
    public int field106;

    @ObfuscatedName("f.r")
    public int field109;

    @ObfuscatedName("f.f")
    public int field108;

    @ObfuscatedName("f.s")
    public int field124;

    @ObfuscatedName("f.d")
    public int field110;

    @ObfuscatedName("f.l")
    public int field111;

    @ObfuscatedName("f.y")
    public int field121;

    @ObfuscatedName("f.p")
    public boolean field113 = false;

    @ObfuscatedName("f.k")
    public double field114;

    @ObfuscatedName("f.o")
    public double field115;

    @ObfuscatedName("f.b")
    public double field116;

    @ObfuscatedName("f.j")
    public double field129;

    @ObfuscatedName("f.a")
    public double field102;

    @ObfuscatedName("f.u")
    public double field119;

    @ObfuscatedName("f.c")
    public double field120;

    @ObfuscatedName("f.n")
    public double field128;

    @ObfuscatedName("f.q")
    public int field122;

    @ObfuscatedName("f.x")
    public int field123;

    @ObfuscatedName("f.v")
    public class43 field117;

    @ObfuscatedName("f.m")
    public int field125 = 0;

    @ObfuscatedName("f.w")
    public int field126 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field107 = arg0;
        this.field118 = arg1;
        this.field104 = arg2;
        this.field105 = arg3;
        this.field106 = arg4;
        this.field108 = arg5;
        this.field124 = arg6;
        this.field110 = arg7;
        this.field111 = arg8;
        this.field121 = arg9;
        this.field109 = arg10;
        this.field113 = false;
        int var12 = class44.method153(this.field107).field1015;
        if (var12 == -1) {
            this.field117 = null;
        } else {
            this.field117 = class43.method168(var12);
        }
    }

    @ObfuscatedName("f.t(IIIIB)V")
    public final void method70(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field113) {
            double var5 = (double) (arg0 - this.field104);
            double var7 = (double) (arg1 - this.field105);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field114 = (double) this.field111 * var5 / var9 + (double) this.field104;
            this.field115 = (double) this.field111 * var7 / var9 + (double) this.field105;
            this.field116 = (double) this.field106;
        }
        double var11 = (double) (this.field124 + 1 - arg3);
        this.field129 = ((double) arg0 - this.field114) / var11;
        this.field102 = ((double) arg1 - this.field115) / var11;
        this.field119 = Math.sqrt(this.field129 * this.field129 + this.field102 * this.field102);
        if (!this.field113) {
            this.field120 = -this.field119 * Math.tan((double) this.field110 * 0.02454369D);
        }
        this.field128 = ((double) arg2 - this.field116 - this.field120 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("f.i(II)V")
    public final void method72(int arg0) {
        this.field113 = true;
        this.field114 += (double) arg0 * this.field129;
        this.field115 += (double) arg0 * this.field102;
        this.field116 += this.field128 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field120;
        this.field120 += (double) arg0 * this.field128;
        this.field122 = (int) (Math.atan2(this.field129, this.field102) * 325.949D) + 1024 & 0x7FF;
        this.field123 = (int) (Math.atan2(this.field120, this.field119) * 325.949D) & 0x7FF;
        if (this.field117 == null) {
            return;
        }
        this.field126 += arg0;
        while (true) {
            do {
                do {
                    if (this.field126 <= this.field117.field988[this.field125]) {
                        return;
                    }
                    this.field126 -= this.field117.field988[this.field125];
                    this.field125++;
                } while (this.field125 < this.field117.field986.length);
                this.field125 -= this.field117.field982;
            } while (this.field125 >= 0 && this.field125 < this.field117.field986.length);
            this.field125 = 0;
        }
    }

    @ObfuscatedName("f.g(I)Ldk;")
    public final class106 method11() {
        class44 var1 = class44.method153(this.field107);
        class106 var2 = var1.method851(this.field125);
        if (var2 == null) {
            return null;
        } else {
            var2.method2125(this.field123);
            return var2;
        }
    }
}
