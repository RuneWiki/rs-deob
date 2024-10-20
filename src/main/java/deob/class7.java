package deob;

@ObfuscatedName("s")
public final class class7 extends class80 {

    @ObfuscatedName("s.p")
    public int field112;

    @ObfuscatedName("s.k")
    public int field101;

    @ObfuscatedName("s.e")
    public int field96;

    @ObfuscatedName("s.f")
    public int field97;

    @ObfuscatedName("s.w")
    public int field98;

    @ObfuscatedName("s.t")
    public int field99;

    @ObfuscatedName("s.s")
    public int field100;

    @ObfuscatedName("s.c")
    public int field118;

    @ObfuscatedName("s.d")
    public int field102;

    @ObfuscatedName("s.v")
    public int field94;

    @ObfuscatedName("s.m")
    public int field104;

    @ObfuscatedName("s.h")
    public boolean field105 = false;

    @ObfuscatedName("s.n")
    public double field106;

    @ObfuscatedName("s.x")
    public double field107;

    @ObfuscatedName("s.o")
    public double field108;

    @ObfuscatedName("s.r")
    public double field109;

    @ObfuscatedName("s.y")
    public double field110;

    @ObfuscatedName("s.i")
    public double field113;

    @ObfuscatedName("s.q")
    public double field111;

    @ObfuscatedName("s.g")
    public double field103;

    @ObfuscatedName("s.l")
    public int field114;

    @ObfuscatedName("s.u")
    public int field116;

    @ObfuscatedName("s.j")
    public class40 field115;

    @ObfuscatedName("s.z")
    public int field95 = 0;

    @ObfuscatedName("s.b")
    public int field117 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field112 = arg0;
        this.field101 = arg1;
        this.field96 = arg2;
        this.field97 = arg3;
        this.field98 = arg4;
        this.field100 = arg5;
        this.field118 = arg6;
        this.field102 = arg7;
        this.field94 = arg8;
        this.field104 = arg9;
        this.field99 = arg10;
        this.field105 = false;
        int var12 = class41.method2637(this.field112).field969;
        if (var12 == -1) {
            this.field115 = null;
        } else {
            this.field115 = class40.method678(var12);
        }
    }

    @ObfuscatedName("s.p(IIIIB)V")
    public final void method73(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field105) {
            double var5 = (double) (arg0 - this.field96);
            double var7 = (double) (arg1 - this.field97);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field106 = (double) this.field94 * var5 / var9 + (double) this.field96;
            this.field107 = (double) this.field94 * var7 / var9 + (double) this.field97;
            this.field108 = (double) this.field98;
        }
        double var11 = (double) (this.field118 + 1 - arg3);
        this.field109 = ((double) arg0 - this.field106) / var11;
        this.field110 = ((double) arg1 - this.field107) / var11;
        this.field113 = Math.sqrt(this.field110 * this.field110 + this.field109 * this.field109);
        if (!this.field105) {
            this.field111 = -this.field113 * Math.tan((double) this.field102 * 0.02454369D);
        }
        this.field103 = ((double) arg2 - this.field108 - this.field111 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("s.e(II)V")
    public final void method66(int arg0) {
        this.field105 = true;
        this.field106 += (double) arg0 * this.field109;
        this.field107 += (double) arg0 * this.field110;
        this.field108 += this.field103 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field111;
        this.field111 += (double) arg0 * this.field103;
        this.field114 = (int) (Math.atan2(this.field109, this.field110) * 325.949D) + 1024 & 0x7FF;
        this.field116 = (int) (Math.atan2(this.field111, this.field113) * 325.949D) & 0x7FF;
        if (this.field115 == null) {
            return;
        }
        this.field117 += arg0;
        while (true) {
            do {
                do {
                    if (this.field117 <= this.field115.field947[this.field95]) {
                        return;
                    }
                    this.field117 -= this.field115.field947[this.field95];
                    this.field95++;
                } while (this.field95 < this.field115.field945.length);
                this.field95 -= this.field115.field961;
            } while (this.field95 >= 0 && this.field95 < this.field115.field945.length);
            this.field95 = 0;
        }
    }

    @ObfuscatedName("s.k(I)Lcm;")
    public final class100 method23() {
        class41 var1 = class41.method2637(this.field112);
        class100 var2 = var1.method780(this.field95);
        if (var2 == null) {
            return null;
        } else {
            var2.method2036(this.field116);
            return var2;
        }
    }
}
