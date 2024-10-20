package deob;

@ObfuscatedName("u")
public final class class7 extends class85 {

    @ObfuscatedName("u.d")
    public int field109;

    @ObfuscatedName("u.p")
    public int field106;

    @ObfuscatedName("u.v")
    public int field107;

    @ObfuscatedName("u.l")
    public int field108;

    @ObfuscatedName("u.y")
    public int field120;

    @ObfuscatedName("u.w")
    public int field110;

    @ObfuscatedName("u.u")
    public int field111;

    @ObfuscatedName("u.a")
    public int field112;

    @ObfuscatedName("u.e")
    public int field131;

    @ObfuscatedName("u.b")
    public int field114;

    @ObfuscatedName("u.o")
    public int field115;

    @ObfuscatedName("u.m")
    public boolean field116 = false;

    @ObfuscatedName("u.x")
    public double field117;

    @ObfuscatedName("u.k")
    public double field118;

    @ObfuscatedName("u.n")
    public double field105;

    @ObfuscatedName("u.j")
    public double field132;

    @ObfuscatedName("u.t")
    public double field121;

    @ObfuscatedName("u.z")
    public double field122;

    @ObfuscatedName("u.h")
    public double field123;

    @ObfuscatedName("u.i")
    public double field124;

    @ObfuscatedName("u.q")
    public int field119;

    @ObfuscatedName("u.r")
    public int field126;

    @ObfuscatedName("u.s")
    public class43 field127;

    @ObfuscatedName("u.g")
    public int field128 = 0;

    @ObfuscatedName("u.f")
    public int field129 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field109 = arg0;
        this.field106 = arg1;
        this.field107 = arg2;
        this.field108 = arg3;
        this.field120 = arg4;
        this.field111 = arg5;
        this.field112 = arg6;
        this.field131 = arg7;
        this.field114 = arg8;
        this.field115 = arg9;
        this.field110 = arg10;
        this.field116 = false;
        int var12 = class44.method723(this.field109).field1016;
        if (var12 == -1) {
            this.field127 = null;
        } else {
            this.field127 = class43.method578(var12);
        }
    }

    @ObfuscatedName("u.d(IIIII)V")
    public final void method99(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field116) {
            double var5 = (double) (arg0 - this.field107);
            double var7 = (double) (arg1 - this.field108);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field117 = (double) this.field114 * var5 / var9 + (double) this.field107;
            this.field118 = (double) this.field114 * var7 / var9 + (double) this.field108;
            this.field105 = (double) this.field120;
        }
        double var11 = (double) (this.field112 + 1 - arg3);
        this.field132 = ((double) arg0 - this.field117) / var11;
        this.field121 = ((double) arg1 - this.field118) / var11;
        this.field122 = Math.sqrt(this.field132 * this.field132 + this.field121 * this.field121);
        if (!this.field116) {
            this.field123 = -this.field122 * Math.tan((double) this.field131 * 0.02454369D);
        }
        this.field124 = ((double) arg2 - this.field105 - this.field123 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("u.p(II)V")
    public final void method100(int arg0) {
        this.field116 = true;
        this.field117 += (double) arg0 * this.field132;
        this.field118 += (double) arg0 * this.field121;
        this.field105 += this.field124 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field123;
        this.field123 += (double) arg0 * this.field124;
        this.field119 = (int) (Math.atan2(this.field132, this.field121) * 325.949D) + 1024 & 0x7FF;
        this.field126 = (int) (Math.atan2(this.field123, this.field122) * 325.949D) & 0x7FF;
        if (this.field127 == null) {
            return;
        }
        this.field129 += arg0;
        while (true) {
            do {
                do {
                    if (this.field129 <= this.field127.field1004[this.field128]) {
                        return;
                    }
                    this.field129 -= this.field127.field1004[this.field128];
                    this.field128++;
                } while (this.field128 < this.field127.field996.length);
                this.field128 -= this.field127.field1000;
            } while (this.field128 >= 0 && this.field128 < this.field127.field996.length);
            this.field128 = 0;
        }
    }

    @ObfuscatedName("u.v(B)Ldn;")
    public final class105 method15() {
        class44 var1 = class44.method723(this.field109);
        class105 var2 = var1.method878(this.field128);
        if (var2 == null) {
            return null;
        } else {
            var2.method2166(this.field126);
            return var2;
        }
    }
}
