package deob;

@ObfuscatedName("r")
public final class class7 extends class78 {

    @ObfuscatedName("r.p")
    public int field120;

    @ObfuscatedName("r.g")
    public int field101;

    @ObfuscatedName("r.x")
    public int field102;

    @ObfuscatedName("r.c")
    public int field103;

    @ObfuscatedName("r.n")
    public int field127;

    @ObfuscatedName("r.s")
    public int field129;

    @ObfuscatedName("r.r")
    public int field125;

    @ObfuscatedName("r.w")
    public int field100;

    @ObfuscatedName("r.u")
    public int field108;

    @ObfuscatedName("r.d")
    public int field109;

    @ObfuscatedName("r.h")
    public int field110;

    @ObfuscatedName("r.a")
    public boolean field111 = false;

    @ObfuscatedName("r.y")
    public double field112;

    @ObfuscatedName("r.v")
    public double field113;

    @ObfuscatedName("r.e")
    public double field114;

    @ObfuscatedName("r.b")
    public double field115;

    @ObfuscatedName("r.z")
    public double field106;

    @ObfuscatedName("r.l")
    public double field104;

    @ObfuscatedName("r.t")
    public double field118;

    @ObfuscatedName("r.q")
    public double field119;

    @ObfuscatedName("r.j")
    public int field116;

    @ObfuscatedName("r.o")
    public int field121;

    @ObfuscatedName("r.i")
    public class38 field122;

    @ObfuscatedName("r.m")
    public int field123 = 0;

    @ObfuscatedName("r.f")
    public int field124 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field120 = arg0;
        this.field101 = arg1;
        this.field102 = arg2;
        this.field103 = arg3;
        this.field127 = arg4;
        this.field125 = arg5;
        this.field100 = arg6;
        this.field108 = arg7;
        this.field109 = arg8;
        this.field110 = arg9;
        this.field129 = arg10;
        this.field111 = false;
        int var12 = class39.method3391(this.field120).field928;
        if (var12 == -1) {
            this.field122 = null;
        } else {
            this.field122 = class38.method507(var12);
        }
    }

    @ObfuscatedName("r.p(IIIII)V")
    public final void method86(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field111) {
            double var5 = (double) (arg0 - this.field102);
            double var7 = (double) (arg1 - this.field103);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field112 = (double) this.field109 * var5 / var9 + (double) this.field102;
            this.field113 = (double) this.field109 * var7 / var9 + (double) this.field103;
            this.field114 = (double) this.field127;
        }
        double var11 = (double) (this.field100 + 1 - arg3);
        this.field115 = ((double) arg0 - this.field112) / var11;
        this.field106 = ((double) arg1 - this.field113) / var11;
        this.field104 = Math.sqrt(this.field115 * this.field115 + this.field106 * this.field106);
        if (!this.field111) {
            this.field118 = -this.field104 * Math.tan((double) this.field108 * 0.02454369D);
        }
        this.field119 = ((double) arg2 - this.field114 - this.field118 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("r.x(II)V")
    public final void method81(int arg0) {
        this.field111 = true;
        this.field112 += (double) arg0 * this.field115;
        this.field113 += (double) arg0 * this.field106;
        this.field114 += this.field119 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field118;
        this.field118 += (double) arg0 * this.field119;
        this.field116 = (int) (Math.atan2(this.field115, this.field106) * 325.949D) + 1024 & 0x7FF;
        this.field121 = (int) (Math.atan2(this.field118, this.field104) * 325.949D) & 0x7FF;
        if (this.field122 == null) {
            return;
        }
        this.field124 += arg0;
        while (true) {
            do {
                do {
                    if (this.field124 <= this.field122.field907[this.field123]) {
                        return;
                    }
                    this.field124 -= this.field122.field907[this.field123];
                    this.field123++;
                } while (this.field123 < this.field122.field905.length);
                this.field123 -= this.field122.field909;
            } while (this.field123 >= 0 && this.field123 < this.field122.field905.length);
            this.field123 = 0;
        }
    }

    @ObfuscatedName("r.g(I)Lcn;")
    public final class98 method20() {
        class39 var1 = class39.method3391(this.field120);
        class98 var2 = var1.method776(this.field123);
        if (var2 == null) {
            return null;
        } else {
            var2.method2043(this.field121);
            return var2;
        }
    }
}
