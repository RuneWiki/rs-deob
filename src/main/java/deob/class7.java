package deob;

@ObfuscatedName("q")
public final class class7 extends class80 {

    @ObfuscatedName("q.y")
    public int field104;

    @ObfuscatedName("q.k")
    public int field95;

    @ObfuscatedName("q.g")
    public int field103;

    @ObfuscatedName("q.n")
    public int field97;

    @ObfuscatedName("q.t")
    public int field109;

    @ObfuscatedName("q.e")
    public int field99;

    @ObfuscatedName("q.q")
    public int field94;

    @ObfuscatedName("q.z")
    public int field108;

    @ObfuscatedName("q.v")
    public int field102;

    @ObfuscatedName("q.b")
    public int field117;

    @ObfuscatedName("q.f")
    public int field101;

    @ObfuscatedName("q.i")
    public boolean field105 = false;

    @ObfuscatedName("q.w")
    public double field106;

    @ObfuscatedName("q.l")
    public double field107;

    @ObfuscatedName("q.j")
    public double field98;

    @ObfuscatedName("q.s")
    public double field100;

    @ObfuscatedName("q.r")
    public double field110;

    @ObfuscatedName("q.h")
    public double field111;

    @ObfuscatedName("q.x")
    public double field112;

    @ObfuscatedName("q.m")
    public double field96;

    @ObfuscatedName("q.a")
    public int field114;

    @ObfuscatedName("q.p")
    public int field115;

    @ObfuscatedName("q.c")
    public class40 field120;

    @ObfuscatedName("q.u")
    public int field116 = 0;

    @ObfuscatedName("q.d")
    public int field118 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field104 = arg0;
        this.field95 = arg1;
        this.field103 = arg2;
        this.field97 = arg3;
        this.field109 = arg4;
        this.field94 = arg5;
        this.field108 = arg6;
        this.field102 = arg7;
        this.field117 = arg8;
        this.field101 = arg9;
        this.field99 = arg10;
        this.field105 = false;
        int var12 = class41.method2077(this.field104).field968;
        if (var12 == -1) {
            this.field120 = null;
        } else {
            this.field120 = class40.method547(var12);
        }
    }

    @ObfuscatedName("q.y(IIIII)V")
    public final void method68(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field105) {
            double var5 = (double) (arg0 - this.field103);
            double var7 = (double) (arg1 - this.field97);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field106 = (double) this.field117 * var5 / var9 + (double) this.field103;
            this.field107 = (double) this.field117 * var7 / var9 + (double) this.field97;
            this.field98 = (double) this.field109;
        }
        double var11 = (double) (this.field108 + 1 - arg3);
        this.field100 = ((double) arg0 - this.field106) / var11;
        this.field110 = ((double) arg1 - this.field107) / var11;
        this.field111 = Math.sqrt(this.field110 * this.field110 + this.field100 * this.field100);
        if (!this.field105) {
            this.field112 = -this.field111 * Math.tan((double) this.field102 * 0.02454369D);
        }
        this.field96 = ((double) arg2 - this.field98 - this.field112 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("q.g(IB)V")
    public final void method69(int arg0) {
        this.field105 = true;
        this.field106 += (double) arg0 * this.field100;
        this.field107 += (double) arg0 * this.field110;
        this.field98 += this.field96 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field112;
        this.field112 += (double) arg0 * this.field96;
        this.field114 = (int) (Math.atan2(this.field100, this.field110) * 325.949D) + 1024 & 0x7FF;
        this.field115 = (int) (Math.atan2(this.field112, this.field111) * 325.949D) & 0x7FF;
        if (this.field120 == null) {
            return;
        }
        this.field118 += arg0;
        while (true) {
            do {
                do {
                    if (this.field118 <= this.field120.field950[this.field116]) {
                        return;
                    }
                    this.field118 -= this.field120.field950[this.field116];
                    this.field116++;
                } while (this.field116 < this.field120.field949.length);
                this.field116 -= this.field120.field943;
            } while (this.field116 >= 0 && this.field116 < this.field120.field949.length);
            this.field116 = 0;
        }
    }

    @ObfuscatedName("q.k(I)Lch;")
    public final class100 method16() {
        class41 var1 = class41.method2077(this.field104);
        class100 var2 = var1.method799(this.field116);
        if (var2 == null) {
            return null;
        } else {
            var2.method2009(this.field115);
            return var2;
        }
    }
}
