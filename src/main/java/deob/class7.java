package deob;

@ObfuscatedName("i")
public final class class7 extends class86 {

    @ObfuscatedName("i.j")
    public int field110;

    @ObfuscatedName("i.h")
    public int field107;

    @ObfuscatedName("i.m")
    public int field108;

    @ObfuscatedName("i.z")
    public int field109;

    @ObfuscatedName("i.x")
    public int field114;

    @ObfuscatedName("i.e")
    public int field106;

    @ObfuscatedName("i.i")
    public int field112;

    @ObfuscatedName("i.c")
    public int field111;

    @ObfuscatedName("i.n")
    public int field120;

    @ObfuscatedName("i.l")
    public int field125;

    @ObfuscatedName("i.u")
    public int field116;

    @ObfuscatedName("i.r")
    public boolean field117 = false;

    @ObfuscatedName("i.a")
    public double field118;

    @ObfuscatedName("i.d")
    public double field119;

    @ObfuscatedName("i.p")
    public double field115;

    @ObfuscatedName("i.q")
    public double field121;

    @ObfuscatedName("i.b")
    public double field122;

    @ObfuscatedName("i.t")
    public double field123;

    @ObfuscatedName("i.y")
    public double field124;

    @ObfuscatedName("i.w")
    public double field113;

    @ObfuscatedName("i.g")
    public int field126;

    @ObfuscatedName("i.s")
    public int field127;

    @ObfuscatedName("i.k")
    public class43 field128;

    @ObfuscatedName("i.o")
    public int field129 = 0;

    @ObfuscatedName("i.v")
    public int field130 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field110 = arg0;
        this.field107 = arg1;
        this.field108 = arg2;
        this.field109 = arg3;
        this.field114 = arg4;
        this.field112 = arg5;
        this.field111 = arg6;
        this.field120 = arg7;
        this.field125 = arg8;
        this.field116 = arg9;
        this.field106 = arg10;
        this.field117 = false;
        int var12 = class44.method236(this.field110).field994;
        if (var12 == -1) {
            this.field128 = null;
        } else {
            this.field128 = class43.method2947(var12);
        }
    }

    @ObfuscatedName("i.j(IIIIS)V")
    public final void method90(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field117) {
            double var5 = (double) (arg0 - this.field108);
            double var7 = (double) (arg1 - this.field109);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field118 = (double) this.field125 * var5 / var9 + (double) this.field108;
            this.field119 = (double) this.field125 * var7 / var9 + (double) this.field109;
            this.field115 = (double) this.field114;
        }
        double var11 = (double) (this.field111 + 1 - arg3);
        this.field121 = ((double) arg0 - this.field118) / var11;
        this.field122 = ((double) arg1 - this.field119) / var11;
        this.field123 = Math.sqrt(this.field122 * this.field122 + this.field121 * this.field121);
        if (!this.field117) {
            this.field124 = -this.field123 * Math.tan((double) this.field120 * 0.02454369D);
        }
        this.field113 = ((double) arg2 - this.field115 - this.field124 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("i.h(II)V")
    public final void method91(int arg0) {
        this.field117 = true;
        this.field118 += (double) arg0 * this.field121;
        this.field119 += (double) arg0 * this.field122;
        this.field115 += this.field113 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field124;
        this.field124 += (double) arg0 * this.field113;
        this.field126 = (int) (Math.atan2(this.field121, this.field122) * 325.949D) + 1024 & 0x7FF;
        this.field127 = (int) (Math.atan2(this.field124, this.field123) * 325.949D) & 0x7FF;
        if (this.field128 == null) {
            return;
        }
        this.field130 += arg0;
        while (true) {
            do {
                do {
                    if (this.field130 <= this.field128.field975[this.field129]) {
                        return;
                    }
                    this.field130 -= this.field128.field975[this.field129];
                    this.field129++;
                } while (this.field129 < this.field128.field973.length);
                this.field129 -= this.field128.field968;
            } while (this.field129 >= 0 && this.field129 < this.field128.field973.length);
            this.field129 = 0;
        }
    }

    @ObfuscatedName("i.m(I)Ldf;")
    public final class106 method12() {
        class44 var1 = class44.method236(this.field110);
        class106 var2 = var1.method875(this.field129);
        if (var2 == null) {
            return null;
        } else {
            var2.method2198(this.field127);
            return var2;
        }
    }
}
