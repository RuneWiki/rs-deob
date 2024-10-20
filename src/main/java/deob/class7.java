package deob;

@ObfuscatedName("l")
public final class class7 extends class89 {

    @ObfuscatedName("l.x")
    public int field112;

    @ObfuscatedName("l.r")
    public int field100;

    @ObfuscatedName("l.j")
    public int field101;

    @ObfuscatedName("l.z")
    public int field108;

    @ObfuscatedName("l.i")
    public int field103;

    @ObfuscatedName("l.b")
    public int field104;

    @ObfuscatedName("l.l")
    public int field102;

    @ObfuscatedName("l.m")
    public int field106;

    @ObfuscatedName("l.p")
    public int field125;

    @ObfuscatedName("l.f")
    public int field99;

    @ObfuscatedName("l.d")
    public int field109;

    @ObfuscatedName("l.v")
    public boolean field110 = false;

    @ObfuscatedName("l.q")
    public double field107;

    @ObfuscatedName("l.t")
    public double field111;

    @ObfuscatedName("l.g")
    public double field114;

    @ObfuscatedName("l.s")
    public double field122;

    @ObfuscatedName("l.h")
    public double field115;

    @ObfuscatedName("l.u")
    public double field116;

    @ObfuscatedName("l.a")
    public double field117;

    @ObfuscatedName("l.e")
    public double field118;

    @ObfuscatedName("l.c")
    public int field119;

    @ObfuscatedName("l.n")
    public int field120;

    @ObfuscatedName("l.y")
    public class45 field121;

    @ObfuscatedName("l.k")
    public int field105 = 0;

    @ObfuscatedName("l.w")
    public int field113 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field112 = arg0;
        this.field100 = arg1;
        this.field101 = arg2;
        this.field108 = arg3;
        this.field103 = arg4;
        this.field102 = arg5;
        this.field106 = arg6;
        this.field125 = arg7;
        this.field99 = arg8;
        this.field109 = arg9;
        this.field104 = arg10;
        this.field110 = false;
        int var12 = class46.method1823(this.field112).field1018;
        if (var12 == -1) {
            this.field121 = null;
        } else {
            this.field121 = class45.method2337(var12);
        }
    }

    @ObfuscatedName("l.x(IIIII)V")
    public final void method102(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field110) {
            double var5 = (double) (arg0 - this.field101);
            double var7 = (double) (arg1 - this.field108);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field107 = (double) this.field99 * var5 / var9 + (double) this.field101;
            this.field111 = (double) this.field99 * var7 / var9 + (double) this.field108;
            this.field114 = (double) this.field103;
        }
        double var11 = (double) (this.field106 + 1 - arg3);
        this.field122 = ((double) arg0 - this.field107) / var11;
        this.field115 = ((double) arg1 - this.field111) / var11;
        this.field116 = Math.sqrt(this.field122 * this.field122 + this.field115 * this.field115);
        if (!this.field110) {
            this.field117 = -this.field116 * Math.tan((double) this.field125 * 0.02454369D);
        }
        this.field118 = ((double) arg2 - this.field114 - this.field117 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("l.r(IB)V")
    public final void method103(int arg0) {
        this.field110 = true;
        this.field107 += (double) arg0 * this.field122;
        this.field111 += (double) arg0 * this.field115;
        this.field114 += this.field118 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field117;
        this.field117 += (double) arg0 * this.field118;
        this.field119 = (int) (Math.atan2(this.field122, this.field115) * 325.949D) + 1024 & 0x7FF;
        this.field120 = (int) (Math.atan2(this.field117, this.field116) * 325.949D) & 0x7FF;
        if (this.field121 == null) {
            return;
        }
        this.field113 += arg0;
        while (true) {
            do {
                do {
                    if (this.field113 <= this.field121.field1000[this.field105]) {
                        return;
                    }
                    this.field113 -= this.field121.field1000[this.field105];
                    this.field105++;
                } while (this.field105 < this.field121.field1002.length);
                this.field105 -= this.field121.field1003;
            } while (this.field105 >= 0 && this.field105 < this.field121.field1002.length);
            this.field105 = 0;
        }
    }

    @ObfuscatedName("l.j(I)Ldj;")
    public final class109 method17() {
        class46 var1 = class46.method1823(this.field112);
        class109 var2 = var1.method875(this.field105);
        if (var2 == null) {
            return null;
        } else {
            var2.method2232(this.field120);
            return var2;
        }
    }
}
