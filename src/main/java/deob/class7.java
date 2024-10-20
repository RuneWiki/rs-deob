package deob;

@ObfuscatedName("k")
public final class class7 extends class89 {

    @ObfuscatedName("k.l")
    public int field103;

    @ObfuscatedName("k.g")
    public int field102;

    @ObfuscatedName("k.r")
    public int field117;

    @ObfuscatedName("k.e")
    public int field119;

    @ObfuscatedName("k.h")
    public int field105;

    @ObfuscatedName("k.s")
    public int field106;

    @ObfuscatedName("k.k")
    public int field101;

    @ObfuscatedName("k.u")
    public int field125;

    @ObfuscatedName("k.n")
    public int field109;

    @ObfuscatedName("k.b")
    public int field123;

    @ObfuscatedName("k.m")
    public int field111;

    @ObfuscatedName("k.q")
    public boolean field108 = false;

    @ObfuscatedName("k.p")
    public double field113;

    @ObfuscatedName("k.w")
    public double field114;

    @ObfuscatedName("k.o")
    public double field115;

    @ObfuscatedName("k.d")
    public double field127;

    @ObfuscatedName("k.f")
    public double field107;

    @ObfuscatedName("k.z")
    public double field118;

    @ObfuscatedName("k.i")
    public double field130;

    @ObfuscatedName("k.v")
    public double field120;

    @ObfuscatedName("k.j")
    public int field121;

    @ObfuscatedName("k.x")
    public int field122;

    @ObfuscatedName("k.t")
    public class45 field112;

    @ObfuscatedName("k.y")
    public int field124 = 0;

    @ObfuscatedName("k.a")
    public int field116 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field103 = arg0;
        this.field102 = arg1;
        this.field117 = arg2;
        this.field119 = arg3;
        this.field105 = arg4;
        this.field101 = arg5;
        this.field125 = arg6;
        this.field109 = arg7;
        this.field123 = arg8;
        this.field111 = arg9;
        this.field106 = arg10;
        this.field108 = false;
        int var12 = class46.method2351(this.field103).field1043;
        if (var12 == -1) {
            this.field112 = null;
        } else {
            this.field112 = class45.method578(var12);
        }
    }

    @ObfuscatedName("k.l(IIIIB)V")
    public final void method96(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field108) {
            double var5 = (double) (arg0 - this.field117);
            double var7 = (double) (arg1 - this.field119);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field113 = (double) this.field123 * var5 / var9 + (double) this.field117;
            this.field114 = (double) this.field123 * var7 / var9 + (double) this.field119;
            this.field115 = (double) this.field105;
        }
        double var11 = (double) (this.field125 + 1 - arg3);
        this.field127 = ((double) arg0 - this.field113) / var11;
        this.field107 = ((double) arg1 - this.field114) / var11;
        this.field118 = Math.sqrt(this.field127 * this.field127 + this.field107 * this.field107);
        if (!this.field108) {
            this.field130 = -this.field118 * Math.tan((double) this.field109 * 0.02454369D);
        }
        this.field120 = ((double) arg2 - this.field115 - this.field130 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("k.g(II)V")
    public final void method94(int arg0) {
        this.field108 = true;
        this.field113 += (double) arg0 * this.field127;
        this.field114 += (double) arg0 * this.field107;
        this.field115 += this.field120 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field130;
        this.field130 += (double) arg0 * this.field120;
        this.field121 = (int) (Math.atan2(this.field127, this.field107) * 325.949D) + 1024 & 0x7FF;
        this.field122 = (int) (Math.atan2(this.field130, this.field118) * 325.949D) & 0x7FF;
        if (this.field112 == null) {
            return;
        }
        this.field116 += arg0;
        while (true) {
            do {
                do {
                    if (this.field116 <= this.field112.field1019[this.field124]) {
                        return;
                    }
                    this.field116 -= this.field112.field1019[this.field124];
                    this.field124++;
                } while (this.field124 < this.field112.field1031.length);
                this.field124 -= this.field112.field1021;
            } while (this.field124 >= 0 && this.field124 < this.field112.field1031.length);
            this.field124 = 0;
        }
    }

    @ObfuscatedName("k.r(I)Ldv;")
    public final class109 method18() {
        class46 var1 = class46.method2351(this.field103);
        class109 var2 = var1.method927(this.field124);
        if (var2 == null) {
            return null;
        } else {
            var2.method2279(this.field122);
            return var2;
        }
    }
}
