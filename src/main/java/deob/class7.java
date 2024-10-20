package deob;

@ObfuscatedName("r")
public final class class7 extends class86 {

    @ObfuscatedName("r.a")
    public int field125;

    @ObfuscatedName("r.w")
    public int field130;

    @ObfuscatedName("r.d")
    public int field106;

    @ObfuscatedName("r.c")
    public int field120;

    @ObfuscatedName("r.y")
    public int field108;

    @ObfuscatedName("r.k")
    public int field118;

    @ObfuscatedName("r.r")
    public int field110;

    @ObfuscatedName("r.p")
    public int field133;

    @ObfuscatedName("r.q")
    public int field112;

    @ObfuscatedName("r.m")
    public int field113;

    @ObfuscatedName("r.e")
    public int field104;

    @ObfuscatedName("r.x")
    public boolean field115 = false;

    @ObfuscatedName("r.z")
    public double field105;

    @ObfuscatedName("r.i")
    public double field117;

    @ObfuscatedName("r.t")
    public double field116;

    @ObfuscatedName("r.n")
    public double field107;

    @ObfuscatedName("r.u")
    public double field119;

    @ObfuscatedName("r.g")
    public double field121;

    @ObfuscatedName("r.j")
    public double field122;

    @ObfuscatedName("r.h")
    public double field123;

    @ObfuscatedName("r.s")
    public int field124;

    @ObfuscatedName("r.f")
    public int field109;

    @ObfuscatedName("r.b")
    public class43 field126;

    @ObfuscatedName("r.l")
    public int field127 = 0;

    @ObfuscatedName("r.o")
    public int field128 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field125 = arg0;
        this.field130 = arg1;
        this.field106 = arg2;
        this.field120 = arg3;
        this.field108 = arg4;
        this.field110 = arg5;
        this.field133 = arg6;
        this.field112 = arg7;
        this.field113 = arg8;
        this.field104 = arg9;
        this.field118 = arg10;
        this.field115 = false;
        int var12 = class44.method688(this.field125).field1022;
        if (var12 == -1) {
            this.field126 = null;
        } else {
            this.field126 = class43.method2137(var12);
        }
    }

    @ObfuscatedName("r.a(IIIII)V")
    public final void method132(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field115) {
            double var5 = (double) (arg0 - this.field106);
            double var7 = (double) (arg1 - this.field120);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field105 = (double) this.field113 * var5 / var9 + (double) this.field106;
            this.field117 = (double) this.field113 * var7 / var9 + (double) this.field120;
            this.field116 = (double) this.field108;
        }
        double var11 = (double) (this.field133 + 1 - arg3);
        this.field107 = ((double) arg0 - this.field105) / var11;
        this.field119 = ((double) arg1 - this.field117) / var11;
        this.field121 = Math.sqrt(this.field119 * this.field119 + this.field107 * this.field107);
        if (!this.field115) {
            this.field122 = -this.field121 * Math.tan((double) this.field112 * 0.02454369D);
        }
        this.field123 = ((double) arg2 - this.field116 - this.field122 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("r.w(IB)V")
    public final void method127(int arg0) {
        this.field115 = true;
        this.field105 += (double) arg0 * this.field107;
        this.field117 += (double) arg0 * this.field119;
        this.field116 += this.field123 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field122;
        this.field122 += (double) arg0 * this.field123;
        this.field124 = (int) (Math.atan2(this.field107, this.field119) * 325.949D) + 1024 & 0x7FF;
        this.field109 = (int) (Math.atan2(this.field122, this.field121) * 325.949D) & 0x7FF;
        if (this.field126 == null) {
            return;
        }
        this.field128 += arg0;
        while (true) {
            do {
                do {
                    if (this.field128 <= this.field126.field996[this.field127]) {
                        return;
                    }
                    this.field128 -= this.field126.field996[this.field127];
                    this.field127++;
                } while (this.field127 < this.field126.field990.length);
                this.field127 -= this.field126.field999;
            } while (this.field127 >= 0 && this.field127 < this.field126.field990.length);
            this.field127 = 0;
        }
    }

    @ObfuscatedName("r.d(I)Ldr;")
    public final class106 method32() {
        class44 var1 = class44.method688(this.field125);
        class106 var2 = var1.method972(this.field127);
        if (var2 == null) {
            return null;
        } else {
            var2.method2259(this.field109);
            return var2;
        }
    }
}
