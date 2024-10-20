package deob;

@ObfuscatedName("m")
public final class class7 extends class78 {

    @ObfuscatedName("m.e")
    public int field109;

    @ObfuscatedName("m.p")
    public int field105;

    @ObfuscatedName("m.a")
    public int field107;

    @ObfuscatedName("m.g")
    public int field108;

    @ObfuscatedName("m.u")
    public int field113;

    @ObfuscatedName("m.k")
    public int field110;

    @ObfuscatedName("m.m")
    public int field118;

    @ObfuscatedName("m.t")
    public int field125;

    @ObfuscatedName("m.l")
    public int field112;

    @ObfuscatedName("m.f")
    public int field114;

    @ObfuscatedName("m.c")
    public int field115;

    @ObfuscatedName("m.i")
    public boolean field116 = false;

    @ObfuscatedName("m.o")
    public double field117;

    @ObfuscatedName("m.d")
    public double field111;

    @ObfuscatedName("m.b")
    public double field119;

    @ObfuscatedName("m.v")
    public double field120;

    @ObfuscatedName("m.n")
    public double field121;

    @ObfuscatedName("m.w")
    public double field106;

    @ObfuscatedName("m.z")
    public double field123;

    @ObfuscatedName("m.x")
    public double field124;

    @ObfuscatedName("m.q")
    public int field131;

    @ObfuscatedName("m.s")
    public int field126;

    @ObfuscatedName("m.j")
    public class38 field127;

    @ObfuscatedName("m.y")
    public int field128 = 0;

    @ObfuscatedName("m.r")
    public int field122 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field109 = arg0;
        this.field105 = arg1;
        this.field107 = arg2;
        this.field108 = arg3;
        this.field113 = arg4;
        this.field118 = arg5;
        this.field125 = arg6;
        this.field112 = arg7;
        this.field114 = arg8;
        this.field115 = arg9;
        this.field110 = arg10;
        this.field116 = false;
        int var12 = class39.method467(this.field109).field918;
        if (var12 == -1) {
            this.field127 = null;
        } else {
            this.field127 = class38.method81(var12);
        }
    }

    @ObfuscatedName("m.e(IIIII)V")
    public final void method72(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field116) {
            double var5 = (double) (arg0 - this.field107);
            double var7 = (double) (arg1 - this.field108);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field117 = (double) this.field114 * var5 / var9 + (double) this.field107;
            this.field111 = (double) this.field114 * var7 / var9 + (double) this.field108;
            this.field119 = (double) this.field113;
        }
        double var11 = (double) (this.field125 + 1 - arg3);
        this.field120 = ((double) arg0 - this.field117) / var11;
        this.field121 = ((double) arg1 - this.field111) / var11;
        this.field106 = Math.sqrt(this.field121 * this.field121 + this.field120 * this.field120);
        if (!this.field116) {
            this.field123 = -this.field106 * Math.tan((double) this.field112 * 0.02454369D);
        }
        this.field124 = ((double) arg2 - this.field119 - this.field123 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("m.a(II)V")
    public final void method74(int arg0) {
        this.field116 = true;
        this.field117 += (double) arg0 * this.field120;
        this.field111 += (double) arg0 * this.field121;
        this.field119 += this.field124 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field123;
        this.field123 += (double) arg0 * this.field124;
        this.field131 = (int) (Math.atan2(this.field120, this.field121) * 325.949D) + 1024 & 0x7FF;
        this.field126 = (int) (Math.atan2(this.field123, this.field106) * 325.949D) & 0x7FF;
        if (this.field127 == null) {
            return;
        }
        this.field122 += arg0;
        while (true) {
            do {
                do {
                    if (this.field122 <= this.field127.field909[this.field128]) {
                        return;
                    }
                    this.field122 -= this.field127.field909[this.field128];
                    this.field128++;
                } while (this.field128 < this.field127.field907.length);
                this.field128 -= this.field127.field897;
            } while (this.field128 >= 0 && this.field128 < this.field127.field907.length);
            this.field128 = 0;
        }
    }

    @ObfuscatedName("m.p(B)Lcs;")
    public final class98 method12() {
        class39 var1 = class39.method467(this.field109);
        class98 var2 = var1.method771(this.field128);
        if (var2 == null) {
            return null;
        } else {
            var2.method1997(this.field126);
            return var2;
        }
    }
}
