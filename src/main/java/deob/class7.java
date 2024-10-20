package deob;

@ObfuscatedName("f")
public final class class7 extends class75 {

    @ObfuscatedName("f.m")
    public int field129;

    @ObfuscatedName("f.k")
    public int field107;

    @ObfuscatedName("f.y")
    public int field120;

    @ObfuscatedName("f.g")
    public int field125;

    @ObfuscatedName("f.r")
    public int field130;

    @ObfuscatedName("f.i")
    public int field109;

    @ObfuscatedName("f.f")
    public int field110;

    @ObfuscatedName("f.a")
    public int field111;

    @ObfuscatedName("f.w")
    public int field112;

    @ObfuscatedName("f.u")
    public int field113;

    @ObfuscatedName("f.d")
    public int field114;

    @ObfuscatedName("f.t")
    public boolean field115 = false;

    @ObfuscatedName("f.j")
    public double field116;

    @ObfuscatedName("f.q")
    public double field128;

    @ObfuscatedName("f.p")
    public double field118;

    @ObfuscatedName("f.v")
    public double field119;

    @ObfuscatedName("f.n")
    public double field106;

    @ObfuscatedName("f.l")
    public double field121;

    @ObfuscatedName("f.c")
    public double field122;

    @ObfuscatedName("f.b")
    public double field123;

    @ObfuscatedName("f.s")
    public int field124;

    @ObfuscatedName("f.o")
    public int field105;

    @ObfuscatedName("f.h")
    public class35 field126;

    @ObfuscatedName("f.x")
    public int field104 = 0;

    @ObfuscatedName("f.e")
    public int field127 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field129 = arg0;
        this.field107 = arg1;
        this.field120 = arg2;
        this.field125 = arg3;
        this.field130 = arg4;
        this.field110 = arg5;
        this.field111 = arg6;
        this.field112 = arg7;
        this.field113 = arg8;
        this.field114 = arg9;
        this.field109 = arg10;
        this.field115 = false;
        int var12 = class36.method2678(this.field129).field893;
        if (var12 == -1) {
            this.field126 = null;
        } else {
            this.field126 = class35.method162(var12);
        }
    }

    @ObfuscatedName("f.m(IIIII)V")
    public final void method90(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field115) {
            double var5 = (double) (arg0 - this.field120);
            double var7 = (double) (arg1 - this.field125);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field116 = (double) this.field113 * var5 / var9 + (double) this.field120;
            this.field128 = (double) this.field113 * var7 / var9 + (double) this.field125;
            this.field118 = (double) this.field130;
        }
        double var11 = (double) (this.field111 + 1 - arg3);
        this.field119 = ((double) arg0 - this.field116) / var11;
        this.field106 = ((double) arg1 - this.field128) / var11;
        this.field121 = Math.sqrt(this.field119 * this.field119 + this.field106 * this.field106);
        if (!this.field115) {
            this.field122 = -this.field121 * Math.tan((double) this.field112 * 0.02454369D);
        }
        this.field123 = ((double) arg2 - this.field118 - this.field122 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("f.y(IB)V")
    public final void method98(int arg0) {
        this.field115 = true;
        this.field116 += (double) arg0 * this.field119;
        this.field128 += (double) arg0 * this.field106;
        this.field118 += this.field123 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field122;
        this.field122 += (double) arg0 * this.field123;
        this.field124 = (int) (Math.atan2(this.field119, this.field106) * 325.949D) + 1024 & 0x7FF;
        this.field105 = (int) (Math.atan2(this.field122, this.field121) * 325.949D) & 0x7FF;
        if (this.field126 == null) {
            return;
        }
        this.field127 += arg0;
        while (true) {
            do {
                do {
                    if (this.field127 <= this.field126.field884[this.field104]) {
                        return;
                    }
                    this.field127 -= this.field126.field884[this.field104];
                    this.field104++;
                } while (this.field104 < this.field126.field870.length);
                this.field104 -= this.field126.field872;
            } while (this.field104 >= 0 && this.field104 < this.field126.field870.length);
            this.field104 = 0;
        }
    }

    @ObfuscatedName("f.k(I)Lcl;")
    public final class95 method22() {
        class36 var1 = class36.method2678(this.field129);
        class95 var2 = var1.method707(this.field104);
        if (var2 == null) {
            return null;
        } else {
            var2.method1984(this.field105);
            return var2;
        }
    }
}
