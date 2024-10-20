package deob;

@ObfuscatedName("b")
public final class class7 extends class79 {

    @ObfuscatedName("b.c")
    public int field125;

    @ObfuscatedName("b.j")
    public int field97;

    @ObfuscatedName("b.y")
    public int field110;

    @ObfuscatedName("b.r")
    public int field112;

    @ObfuscatedName("b.f")
    public int field101;

    @ObfuscatedName("b.l")
    public int field99;

    @ObfuscatedName("b.b")
    public int field102;

    @ObfuscatedName("b.k")
    public int field103;

    @ObfuscatedName("b.g")
    public int field111;

    @ObfuscatedName("b.v")
    public int field105;

    @ObfuscatedName("b.i")
    public int field106;

    @ObfuscatedName("b.x")
    public boolean field107 = false;

    @ObfuscatedName("b.h")
    public double field96;

    @ObfuscatedName("b.w")
    public double field109;

    @ObfuscatedName("b.s")
    public double field108;

    @ObfuscatedName("b.p")
    public double field104;

    @ObfuscatedName("b.z")
    public double field126;

    @ObfuscatedName("b.n")
    public double field113;

    @ObfuscatedName("b.u")
    public double field114;

    @ObfuscatedName("b.a")
    public double field115;

    @ObfuscatedName("b.d")
    public int field100;

    @ObfuscatedName("b.m")
    public int field117;

    @ObfuscatedName("b.q")
    public class39 field118;

    @ObfuscatedName("b.e")
    public int field119 = 0;

    @ObfuscatedName("b.t")
    public int field120 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field125 = arg0;
        this.field97 = arg1;
        this.field110 = arg2;
        this.field112 = arg3;
        this.field101 = arg4;
        this.field102 = arg5;
        this.field103 = arg6;
        this.field111 = arg7;
        this.field105 = arg8;
        this.field106 = arg9;
        this.field99 = arg10;
        this.field107 = false;
        int var12 = class40.method903(this.field125).field930;
        if (var12 == -1) {
            this.field118 = null;
        } else {
            this.field118 = class39.method109(var12);
        }
    }

    @ObfuscatedName("b.c(IIIIB)V")
    public final void method68(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field107) {
            double var5 = (double) (arg0 - this.field110);
            double var7 = (double) (arg1 - this.field112);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field96 = (double) this.field105 * var5 / var9 + (double) this.field110;
            this.field109 = (double) this.field105 * var7 / var9 + (double) this.field112;
            this.field108 = (double) this.field101;
        }
        double var11 = (double) (this.field103 + 1 - arg3);
        this.field104 = ((double) arg0 - this.field96) / var11;
        this.field126 = ((double) arg1 - this.field109) / var11;
        this.field113 = Math.sqrt(this.field126 * this.field126 + this.field104 * this.field104);
        if (!this.field107) {
            this.field114 = -this.field113 * Math.tan((double) this.field111 * 0.02454369D);
        }
        this.field115 = ((double) arg2 - this.field108 - this.field114 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("b.y(IB)V")
    public final void method73(int arg0) {
        this.field107 = true;
        this.field96 += (double) arg0 * this.field104;
        this.field109 += (double) arg0 * this.field126;
        this.field108 += this.field115 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field114;
        this.field114 += (double) arg0 * this.field115;
        this.field100 = (int) (Math.atan2(this.field104, this.field126) * 325.949D) + 1024 & 0x7FF;
        this.field117 = (int) (Math.atan2(this.field114, this.field113) * 325.949D) & 0x7FF;
        if (this.field118 == null) {
            return;
        }
        this.field120 += arg0;
        while (true) {
            do {
                do {
                    if (this.field120 <= this.field118.field906[this.field119]) {
                        return;
                    }
                    this.field120 -= this.field118.field906[this.field119];
                    this.field119++;
                } while (this.field119 < this.field118.field913.length);
                this.field119 -= this.field118.field905;
            } while (this.field119 >= 0 && this.field119 < this.field118.field913.length);
            this.field119 = 0;
        }
    }

    @ObfuscatedName("b.j(B)Lcl;")
    public final class99 method20() {
        class40 var1 = class40.method903(this.field125);
        class99 var2 = var1.method735(this.field119);
        if (var2 == null) {
            return null;
        } else {
            var2.method2010(this.field117);
            return var2;
        }
    }
}
