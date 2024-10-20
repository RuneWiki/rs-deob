package deob;

@ObfuscatedName("m")
public final class class7 extends class78 {

    @ObfuscatedName("m.n")
    public int field132;

    @ObfuscatedName("m.x")
    public int field104;

    @ObfuscatedName("m.k")
    public int field103;

    @ObfuscatedName("m.i")
    public int field106;

    @ObfuscatedName("m.d")
    public int field118;

    @ObfuscatedName("m.q")
    public int field108;

    @ObfuscatedName("m.m")
    public int field110;

    @ObfuscatedName("m.a")
    public int field119;

    @ObfuscatedName("m.w")
    public int field122;

    @ObfuscatedName("m.e")
    public int field112;

    @ObfuscatedName("m.o")
    public int field113;

    @ObfuscatedName("m.v")
    public boolean field114 = false;

    @ObfuscatedName("m.z")
    public double field115;

    @ObfuscatedName("m.j")
    public double field116;

    @ObfuscatedName("m.r")
    public double field117;

    @ObfuscatedName("m.c")
    public double field129;

    @ObfuscatedName("m.u")
    public double field124;

    @ObfuscatedName("m.h")
    public double field120;

    @ObfuscatedName("m.t")
    public double field121;

    @ObfuscatedName("m.f")
    public double field109;

    @ObfuscatedName("m.g")
    public int field123;

    @ObfuscatedName("m.s")
    public int field128;

    @ObfuscatedName("m.y")
    public class38 field125;

    @ObfuscatedName("m.p")
    public int field126 = 0;

    @ObfuscatedName("m.b")
    public int field127 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field132 = arg0;
        this.field104 = arg1;
        this.field103 = arg2;
        this.field106 = arg3;
        this.field118 = arg4;
        this.field110 = arg5;
        this.field119 = arg6;
        this.field122 = arg7;
        this.field112 = arg8;
        this.field113 = arg9;
        this.field108 = arg10;
        this.field114 = false;
        int var12 = class39.method138(this.field132).field928;
        if (var12 == -1) {
            this.field125 = null;
        } else {
            this.field125 = class38.method658(var12);
        }
    }

    @ObfuscatedName("m.n(IIIII)V")
    public final void method87(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field114) {
            double var5 = (double) (arg0 - this.field103);
            double var7 = (double) (arg1 - this.field106);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field115 = (double) this.field112 * var5 / var9 + (double) this.field103;
            this.field116 = (double) this.field112 * var7 / var9 + (double) this.field106;
            this.field117 = (double) this.field118;
        }
        double var11 = (double) (this.field119 + 1 - arg3);
        this.field129 = ((double) arg0 - this.field115) / var11;
        this.field124 = ((double) arg1 - this.field116) / var11;
        this.field120 = Math.sqrt(this.field129 * this.field129 + this.field124 * this.field124);
        if (!this.field114) {
            this.field121 = -this.field120 * Math.tan((double) this.field122 * 0.02454369D);
        }
        this.field109 = ((double) arg2 - this.field117 - this.field121 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("m.k(II)V")
    public final void method88(int arg0) {
        this.field114 = true;
        this.field115 += (double) arg0 * this.field129;
        this.field116 += (double) arg0 * this.field124;
        this.field117 += this.field109 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field121;
        this.field121 += (double) arg0 * this.field109;
        this.field123 = (int) (Math.atan2(this.field129, this.field124) * 325.949D) + 1024 & 0x7FF;
        this.field128 = (int) (Math.atan2(this.field121, this.field120) * 325.949D) & 0x7FF;
        if (this.field125 == null) {
            return;
        }
        this.field127 += arg0;
        while (true) {
            do {
                do {
                    if (this.field127 <= this.field125.field906[this.field126]) {
                        return;
                    }
                    this.field127 -= this.field125.field906[this.field126];
                    this.field126++;
                } while (this.field126 < this.field125.field916.length);
                this.field126 -= this.field125.field908;
            } while (this.field126 >= 0 && this.field126 < this.field125.field916.length);
            this.field126 = 0;
        }
    }

    @ObfuscatedName("m.x(S)Lcy;")
    public final class98 method18() {
        class39 var1 = class39.method138(this.field132);
        class98 var2 = var1.method751(this.field126);
        if (var2 == null) {
            return null;
        } else {
            var2.method2059(this.field128);
            return var2;
        }
    }
}
