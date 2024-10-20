package deob;

@ObfuscatedName("d")
public final class class7 extends class89 {

    @ObfuscatedName("d.i")
    public int field137;

    @ObfuscatedName("d.h")
    public int field139;

    @ObfuscatedName("d.e")
    public int field114;

    @ObfuscatedName("d.g")
    public int field115;

    @ObfuscatedName("d.n")
    public int field116;

    @ObfuscatedName("d.u")
    public int field132;

    @ObfuscatedName("d.d")
    public int field118;

    @ObfuscatedName("d.l")
    public int field119;

    @ObfuscatedName("d.m")
    public int field120;

    @ObfuscatedName("d.j")
    public int field121;

    @ObfuscatedName("d.y")
    public int field122;

    @ObfuscatedName("d.s")
    public boolean field123 = false;

    @ObfuscatedName("d.p")
    public double field124;

    @ObfuscatedName("d.v")
    public double field117;

    @ObfuscatedName("d.r")
    public double field126;

    @ObfuscatedName("d.c")
    public double field141;

    @ObfuscatedName("d.w")
    public double field128;

    @ObfuscatedName("d.x")
    public double field129;

    @ObfuscatedName("d.k")
    public double field130;

    @ObfuscatedName("d.z")
    public double field131;

    @ObfuscatedName("d.q")
    public int field136;

    @ObfuscatedName("d.o")
    public int field113;

    @ObfuscatedName("d.f")
    public class45 field134;

    @ObfuscatedName("d.b")
    public int field112 = 0;

    @ObfuscatedName("d.t")
    public int field127 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field137 = arg0;
        this.field139 = arg1;
        this.field114 = arg2;
        this.field115 = arg3;
        this.field116 = arg4;
        this.field118 = arg5;
        this.field119 = arg6;
        this.field120 = arg7;
        this.field121 = arg8;
        this.field122 = arg9;
        this.field132 = arg10;
        this.field123 = false;
        int var12 = class46.method895(this.field137).field1034;
        if (var12 == -1) {
            this.field134 = null;
        } else {
            this.field134 = class45.method3523(var12);
        }
    }

    @ObfuscatedName("d.i(IIIII)V")
    public final void method94(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field123) {
            double var5 = (double) (arg0 - this.field114);
            double var7 = (double) (arg1 - this.field115);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field124 = (double) this.field121 * var5 / var9 + (double) this.field114;
            this.field117 = (double) this.field121 * var7 / var9 + (double) this.field115;
            this.field126 = (double) this.field116;
        }
        double var11 = (double) (this.field119 + 1 - arg3);
        this.field141 = ((double) arg0 - this.field124) / var11;
        this.field128 = ((double) arg1 - this.field117) / var11;
        this.field129 = Math.sqrt(this.field141 * this.field141 + this.field128 * this.field128);
        if (!this.field123) {
            this.field130 = -this.field129 * Math.tan((double) this.field120 * 0.02454369D);
        }
        this.field131 = ((double) arg2 - this.field126 - this.field130 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("d.h(II)V")
    public final void method91(int arg0) {
        this.field123 = true;
        this.field124 += (double) arg0 * this.field141;
        this.field117 += (double) arg0 * this.field128;
        this.field126 += this.field131 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field130;
        this.field130 += (double) arg0 * this.field131;
        this.field136 = (int) (Math.atan2(this.field141, this.field128) * 325.949D) + 1024 & 0x7FF;
        this.field113 = (int) (Math.atan2(this.field130, this.field129) * 325.949D) & 0x7FF;
        if (this.field134 == null) {
            return;
        }
        this.field127 += arg0;
        while (true) {
            do {
                do {
                    if (this.field127 <= this.field134.field1020[this.field112]) {
                        return;
                    }
                    this.field127 -= this.field134.field1020[this.field112];
                    this.field112++;
                } while (this.field112 < this.field134.field1012.length);
                this.field112 -= this.field134.field1013;
            } while (this.field112 >= 0 && this.field112 < this.field134.field1012.length);
            this.field112 = 0;
        }
    }

    @ObfuscatedName("d.e(I)Ldo;")
    public final class109 method47() {
        class46 var1 = class46.method895(this.field137);
        class109 var2 = var1.method901(this.field112);
        if (var2 == null) {
            return null;
        } else {
            var2.method2213(this.field113);
            return var2;
        }
    }
}
