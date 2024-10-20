package deob;

@ObfuscatedName("k")
public final class class7 extends class79 {

    @ObfuscatedName("k.v")
    public int field107;

    @ObfuscatedName("k.t")
    public int field118;

    @ObfuscatedName("k.f")
    public int field101;

    @ObfuscatedName("k.j")
    public int field102;

    @ObfuscatedName("k.l")
    public int field103;

    @ObfuscatedName("k.g")
    public int field104;

    @ObfuscatedName("k.k")
    public int field105;

    @ObfuscatedName("k.p")
    public int field106;

    @ObfuscatedName("k.y")
    public int field122;

    @ObfuscatedName("k.m")
    public int field100;

    @ObfuscatedName("k.o")
    public int field113;

    @ObfuscatedName("k.c")
    public boolean field110 = false;

    @ObfuscatedName("k.r")
    public double field115;

    @ObfuscatedName("k.s")
    public double field112;

    @ObfuscatedName("k.n")
    public double field109;

    @ObfuscatedName("k.q")
    public double field114;

    @ObfuscatedName("k.e")
    public double field111;

    @ObfuscatedName("k.d")
    public double field116;

    @ObfuscatedName("k.b")
    public double field117;

    @ObfuscatedName("k.a")
    public double field108;

    @ObfuscatedName("k.i")
    public int field119;

    @ObfuscatedName("k.w")
    public int field99;

    @ObfuscatedName("k.x")
    public class39 field121;

    @ObfuscatedName("k.h")
    public int field120 = 0;

    @ObfuscatedName("k.z")
    public int field123 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field107 = arg0;
        this.field118 = arg1;
        this.field101 = arg2;
        this.field102 = arg3;
        this.field103 = arg4;
        this.field105 = arg5;
        this.field106 = arg6;
        this.field122 = arg7;
        this.field100 = arg8;
        this.field113 = arg9;
        this.field104 = arg10;
        this.field110 = false;
        int var12 = class40.method2864(this.field107).field933;
        if (var12 == -1) {
            this.field121 = null;
        } else {
            this.field121 = class39.method682(var12);
        }
    }

    @ObfuscatedName("k.v(IIIII)V")
    public final void method72(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field110) {
            double var5 = (double) (arg0 - this.field101);
            double var7 = (double) (arg1 - this.field102);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field115 = (double) this.field100 * var5 / var9 + (double) this.field101;
            this.field112 = (double) this.field100 * var7 / var9 + (double) this.field102;
            this.field109 = (double) this.field103;
        }
        double var11 = (double) (this.field106 + 1 - arg3);
        this.field114 = ((double) arg0 - this.field115) / var11;
        this.field111 = ((double) arg1 - this.field112) / var11;
        this.field116 = Math.sqrt(this.field114 * this.field114 + this.field111 * this.field111);
        if (!this.field110) {
            this.field117 = -this.field116 * Math.tan((double) this.field122 * 0.02454369D);
        }
        this.field108 = ((double) arg2 - this.field109 - this.field117 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("k.f(II)V")
    public final void method76(int arg0) {
        this.field110 = true;
        this.field115 += (double) arg0 * this.field114;
        this.field112 += (double) arg0 * this.field111;
        this.field109 += this.field108 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field117;
        this.field117 += (double) arg0 * this.field108;
        this.field119 = (int) (Math.atan2(this.field114, this.field111) * 325.949D) + 1024 & 0x7FF;
        this.field99 = (int) (Math.atan2(this.field117, this.field116) * 325.949D) & 0x7FF;
        if (this.field121 == null) {
            return;
        }
        this.field123 += arg0;
        while (true) {
            do {
                do {
                    if (this.field123 <= this.field121.field911[this.field120]) {
                        return;
                    }
                    this.field123 -= this.field121.field911[this.field120];
                    this.field120++;
                } while (this.field120 < this.field121.field908.length);
                this.field120 -= this.field121.field913;
            } while (this.field120 >= 0 && this.field120 < this.field121.field908.length);
            this.field120 = 0;
        }
    }

    @ObfuscatedName("k.t(I)Lcy;")
    public final class99 method11() {
        class40 var1 = class40.method2864(this.field107);
        class99 var2 = var1.method754(this.field120);
        if (var2 == null) {
            return null;
        } else {
            var2.method2013(this.field99);
            return var2;
        }
    }
}
