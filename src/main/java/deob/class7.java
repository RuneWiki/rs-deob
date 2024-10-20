package deob;

@ObfuscatedName("h")
public final class class7 extends class85 {

    @ObfuscatedName("h.i")
    public int field99;

    @ObfuscatedName("h.v")
    public int field103;

    @ObfuscatedName("h.r")
    public int field120;

    @ObfuscatedName("h.n")
    public int field102;

    @ObfuscatedName("h.x")
    public int field112;

    @ObfuscatedName("h.q")
    public int field109;

    @ObfuscatedName("h.h")
    public int field98;

    @ObfuscatedName("h.d")
    public int field104;

    @ObfuscatedName("h.c")
    public int field105;

    @ObfuscatedName("h.y")
    public int field106;

    @ObfuscatedName("h.m")
    public int field107;

    @ObfuscatedName("h.e")
    public boolean field108 = false;

    @ObfuscatedName("h.z")
    public double field101;

    @ObfuscatedName("h.t")
    public double field110;

    @ObfuscatedName("h.b")
    public double field111;

    @ObfuscatedName("h.l")
    public double field119;

    @ObfuscatedName("h.s")
    public double field113;

    @ObfuscatedName("h.f")
    public double field114;

    @ObfuscatedName("h.g")
    public double field115;

    @ObfuscatedName("h.u")
    public double field116;

    @ObfuscatedName("h.o")
    public int field117;

    @ObfuscatedName("h.k")
    public int field118;

    @ObfuscatedName("h.a")
    public class43 field97;

    @ObfuscatedName("h.j")
    public int field100 = 0;

    @ObfuscatedName("h.p")
    public int field121 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field99 = arg0;
        this.field103 = arg1;
        this.field120 = arg2;
        this.field102 = arg3;
        this.field112 = arg4;
        this.field98 = arg5;
        this.field104 = arg6;
        this.field105 = arg7;
        this.field106 = arg8;
        this.field107 = arg9;
        this.field109 = arg10;
        this.field108 = false;
        int var12 = class44.method2267(this.field99).field1009;
        if (var12 == -1) {
            this.field97 = null;
        } else {
            this.field97 = class43.method2299(var12);
        }
    }

    @ObfuscatedName("h.i(IIIII)V")
    public final void method87(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field108) {
            double var5 = (double) (arg0 - this.field120);
            double var7 = (double) (arg1 - this.field102);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field101 = (double) this.field106 * var5 / var9 + (double) this.field120;
            this.field110 = (double) this.field106 * var7 / var9 + (double) this.field102;
            this.field111 = (double) this.field112;
        }
        double var11 = (double) (this.field104 + 1 - arg3);
        this.field119 = ((double) arg0 - this.field101) / var11;
        this.field113 = ((double) arg1 - this.field110) / var11;
        this.field114 = Math.sqrt(this.field119 * this.field119 + this.field113 * this.field113);
        if (!this.field108) {
            this.field115 = -this.field114 * Math.tan((double) this.field105 * 0.02454369D);
        }
        this.field116 = ((double) arg2 - this.field111 - this.field115 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("h.v(II)V")
    public final void method95(int arg0) {
        this.field108 = true;
        this.field101 += (double) arg0 * this.field119;
        this.field110 += (double) arg0 * this.field113;
        this.field111 += this.field116 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field115;
        this.field115 += (double) arg0 * this.field116;
        this.field117 = (int) (Math.atan2(this.field119, this.field113) * 325.949D) + 1024 & 0x7FF;
        this.field118 = (int) (Math.atan2(this.field115, this.field114) * 325.949D) & 0x7FF;
        if (this.field97 == null) {
            return;
        }
        this.field121 += arg0;
        while (true) {
            do {
                do {
                    if (this.field121 <= this.field97.field985[this.field100]) {
                        return;
                    }
                    this.field121 -= this.field97.field985[this.field100];
                    this.field100++;
                } while (this.field100 < this.field97.field983.length);
                this.field100 -= this.field97.field987;
            } while (this.field100 >= 0 && this.field100 < this.field97.field983.length);
            this.field100 = 0;
        }
    }

    @ObfuscatedName("h.r(I)Ldj;")
    public final class105 method18() {
        class44 var1 = class44.method2267(this.field99);
        class105 var2 = var1.method900(this.field100);
        if (var2 == null) {
            return null;
        } else {
            var2.method2161(this.field118);
            return var2;
        }
    }
}
