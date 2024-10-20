package deob;

@ObfuscatedName("u")
public final class class7 extends class78 {

    @ObfuscatedName("u.g")
    public int field109;

    @ObfuscatedName("u.i")
    public int field119;

    @ObfuscatedName("u.k")
    public int field101;

    @ObfuscatedName("u.e")
    public int field125;

    @ObfuscatedName("u.w")
    public int field102;

    @ObfuscatedName("u.m")
    public int field104;

    @ObfuscatedName("u.u")
    public int field105;

    @ObfuscatedName("u.j")
    public int field106;

    @ObfuscatedName("u.o")
    public int field107;

    @ObfuscatedName("u.h")
    public int field108;

    @ObfuscatedName("u.b")
    public int field123;

    @ObfuscatedName("u.r")
    public boolean field110 = false;

    @ObfuscatedName("u.l")
    public double field116;

    @ObfuscatedName("u.x")
    public double field112;

    @ObfuscatedName("u.q")
    public double field113;

    @ObfuscatedName("u.t")
    public double field100;

    @ObfuscatedName("u.y")
    public double field115;

    @ObfuscatedName("u.d")
    public double field111;

    @ObfuscatedName("u.z")
    public double field117;

    @ObfuscatedName("u.n")
    public double field118;

    @ObfuscatedName("u.v")
    public int field124;

    @ObfuscatedName("u.f")
    public int field120;

    @ObfuscatedName("u.a")
    public class38 field121;

    @ObfuscatedName("u.p")
    public int field122 = 0;

    @ObfuscatedName("u.s")
    public int field103 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field109 = arg0;
        this.field119 = arg1;
        this.field101 = arg2;
        this.field125 = arg3;
        this.field102 = arg4;
        this.field105 = arg5;
        this.field106 = arg6;
        this.field107 = arg7;
        this.field108 = arg8;
        this.field123 = arg9;
        this.field104 = arg10;
        this.field110 = false;
        int var12 = class39.method685(this.field109).field939;
        if (var12 == -1) {
            this.field121 = null;
        } else {
            this.field121 = class38.method552(var12);
        }
    }

    @ObfuscatedName("u.g(IIIII)V")
    public final void method85(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field110) {
            double var5 = (double) (arg0 - this.field101);
            double var7 = (double) (arg1 - this.field125);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field116 = (double) this.field108 * var5 / var9 + (double) this.field101;
            this.field112 = (double) this.field108 * var7 / var9 + (double) this.field125;
            this.field113 = (double) this.field102;
        }
        double var11 = (double) (this.field106 + 1 - arg3);
        this.field100 = ((double) arg0 - this.field116) / var11;
        this.field115 = ((double) arg1 - this.field112) / var11;
        this.field111 = Math.sqrt(this.field115 * this.field115 + this.field100 * this.field100);
        if (!this.field110) {
            this.field117 = -this.field111 * Math.tan((double) this.field107 * 0.02454369D);
        }
        this.field118 = ((double) arg2 - this.field113 - this.field117 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("u.k(II)V")
    public final void method84(int arg0) {
        this.field110 = true;
        this.field116 += (double) arg0 * this.field100;
        this.field112 += (double) arg0 * this.field115;
        this.field113 += this.field118 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field117;
        this.field117 += (double) arg0 * this.field118;
        this.field124 = (int) (Math.atan2(this.field100, this.field115) * 325.949D) + 1024 & 0x7FF;
        this.field120 = (int) (Math.atan2(this.field117, this.field111) * 325.949D) & 0x7FF;
        if (this.field121 == null) {
            return;
        }
        this.field103 += arg0;
        while (true) {
            do {
                do {
                    if (this.field103 <= this.field121.field910[this.field122]) {
                        return;
                    }
                    this.field103 -= this.field121.field910[this.field122];
                    this.field122++;
                } while (this.field122 < this.field121.field921.length);
                this.field122 -= this.field121.field927;
            } while (this.field122 >= 0 && this.field122 < this.field121.field921.length);
            this.field122 = 0;
        }
    }

    @ObfuscatedName("u.i(I)Lce;")
    public final class98 method14() {
        class39 var1 = class39.method685(this.field109);
        class98 var2 = var1.method718(this.field122);
        if (var2 == null) {
            return null;
        } else {
            var2.method1971(this.field120);
            return var2;
        }
    }
}
