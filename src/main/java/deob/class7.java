package deob;

@ObfuscatedName("v")
public final class class7 extends class80 {

    @ObfuscatedName("v.o")
    public int field95;

    @ObfuscatedName("v.l")
    public int field92;

    @ObfuscatedName("v.g")
    public int field119;

    @ObfuscatedName("v.u")
    public int field94;

    @ObfuscatedName("v.q")
    public int field112;

    @ObfuscatedName("v.r")
    public int field96;

    @ObfuscatedName("v.v")
    public int field97;

    @ObfuscatedName("v.y")
    public int field103;

    @ObfuscatedName("v.k")
    public int field91;

    @ObfuscatedName("v.c")
    public int field100;

    @ObfuscatedName("v.j")
    public int field98;

    @ObfuscatedName("v.m")
    public boolean field102 = false;

    @ObfuscatedName("v.a")
    public double field104;

    @ObfuscatedName("v.f")
    public double field113;

    @ObfuscatedName("v.i")
    public double field105;

    @ObfuscatedName("v.n")
    public double field106;

    @ObfuscatedName("v.x")
    public double field107;

    @ObfuscatedName("v.h")
    public double field108;

    @ObfuscatedName("v.t")
    public double field99;

    @ObfuscatedName("v.w")
    public double field110;

    @ObfuscatedName("v.p")
    public int field111;

    @ObfuscatedName("v.z")
    public int field109;

    @ObfuscatedName("v.s")
    public class40 field115;

    @ObfuscatedName("v.d")
    public int field114 = 0;

    @ObfuscatedName("v.b")
    public int field101 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field95 = arg0;
        this.field92 = arg1;
        this.field119 = arg2;
        this.field94 = arg3;
        this.field112 = arg4;
        this.field97 = arg5;
        this.field103 = arg6;
        this.field91 = arg7;
        this.field100 = arg8;
        this.field98 = arg9;
        this.field96 = arg10;
        this.field102 = false;
        int var12 = class41.method2537(this.field95).field954;
        if (var12 == -1) {
            this.field115 = null;
        } else {
            this.field115 = class40.method567(var12);
        }
    }

    @ObfuscatedName("v.o(IIIIS)V")
    public final void method92(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field102) {
            double var5 = (double) (arg0 - this.field119);
            double var7 = (double) (arg1 - this.field94);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field104 = (double) this.field100 * var5 / var9 + (double) this.field119;
            this.field113 = (double) this.field100 * var7 / var9 + (double) this.field94;
            this.field105 = (double) this.field112;
        }
        double var11 = (double) (this.field103 + 1 - arg3);
        this.field106 = ((double) arg0 - this.field104) / var11;
        this.field107 = ((double) arg1 - this.field113) / var11;
        this.field108 = Math.sqrt(this.field107 * this.field107 + this.field106 * this.field106);
        if (!this.field102) {
            this.field99 = -this.field108 * Math.tan((double) this.field91 * 0.02454369D);
        }
        this.field110 = ((double) arg2 - this.field105 - this.field99 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("v.g(II)V")
    public final void method89(int arg0) {
        this.field102 = true;
        this.field104 += (double) arg0 * this.field106;
        this.field113 += (double) arg0 * this.field107;
        this.field105 += this.field110 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field99;
        this.field99 += (double) arg0 * this.field110;
        this.field111 = (int) (Math.atan2(this.field106, this.field107) * 325.949D) + 1024 & 0x7FF;
        this.field109 = (int) (Math.atan2(this.field99, this.field108) * 325.949D) & 0x7FF;
        if (this.field115 == null) {
            return;
        }
        this.field101 += arg0;
        while (true) {
            do {
                do {
                    if (this.field101 <= this.field115.field929[this.field114]) {
                        return;
                    }
                    this.field101 -= this.field115.field929[this.field114];
                    this.field114++;
                } while (this.field114 < this.field115.field927.length);
                this.field114 -= this.field115.field924;
            } while (this.field114 >= 0 && this.field114 < this.field115.field927.length);
            this.field114 = 0;
        }
    }

    @ObfuscatedName("v.l(B)Lcq;")
    public final class100 method14() {
        class41 var1 = class41.method2537(this.field95);
        class100 var2 = var1.method819(this.field114);
        if (var2 == null) {
            return null;
        } else {
            var2.method2100(this.field109);
            return var2;
        }
    }
}
