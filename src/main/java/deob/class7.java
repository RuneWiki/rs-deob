package deob;

@ObfuscatedName("n")
public final class class7 extends class79 {

    @ObfuscatedName("n.b")
    public int field105;

    @ObfuscatedName("n.e")
    public int field98;

    @ObfuscatedName("n.i")
    public int field102;

    @ObfuscatedName("n.k")
    public int field106;

    @ObfuscatedName("n.h")
    public int field101;

    @ObfuscatedName("n.p")
    public int field109;

    @ObfuscatedName("n.n")
    public int field103;

    @ObfuscatedName("n.o")
    public int field104;

    @ObfuscatedName("n.g")
    public int field113;

    @ObfuscatedName("n.z")
    public int field99;

    @ObfuscatedName("n.t")
    public int field115;

    @ObfuscatedName("n.y")
    public boolean field108 = false;

    @ObfuscatedName("n.w")
    public double field110;

    @ObfuscatedName("n.x")
    public double field120;

    @ObfuscatedName("n.v")
    public double field111;

    @ObfuscatedName("n.q")
    public double field112;

    @ObfuscatedName("n.f")
    public double field97;

    @ObfuscatedName("n.s")
    public double field114;

    @ObfuscatedName("n.a")
    public double field100;

    @ObfuscatedName("n.m")
    public double field116;

    @ObfuscatedName("n.c")
    public int field117;

    @ObfuscatedName("n.j")
    public int field118;

    @ObfuscatedName("n.d")
    public class39 field119;

    @ObfuscatedName("n.l")
    public int field107 = 0;

    @ObfuscatedName("n.u")
    public int field121 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field105 = arg0;
        this.field98 = arg1;
        this.field102 = arg2;
        this.field106 = arg3;
        this.field101 = arg4;
        this.field103 = arg5;
        this.field104 = arg6;
        this.field113 = arg7;
        this.field99 = arg8;
        this.field115 = arg9;
        this.field109 = arg10;
        this.field108 = false;
        int var12 = class40.method1763(this.field105).field929;
        if (var12 == -1) {
            this.field119 = null;
        } else {
            this.field119 = class39.method1863(var12);
        }
    }

    @ObfuscatedName("n.b(IIIII)V")
    public final void method71(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field108) {
            double var5 = (double) (arg0 - this.field102);
            double var7 = (double) (arg1 - this.field106);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field110 = (double) this.field99 * var5 / var9 + (double) this.field102;
            this.field120 = (double) this.field99 * var7 / var9 + (double) this.field106;
            this.field111 = (double) this.field101;
        }
        double var11 = (double) (this.field104 + 1 - arg3);
        this.field112 = ((double) arg0 - this.field110) / var11;
        this.field97 = ((double) arg1 - this.field120) / var11;
        this.field114 = Math.sqrt(this.field97 * this.field97 + this.field112 * this.field112);
        if (!this.field108) {
            this.field100 = -this.field114 * Math.tan((double) this.field113 * 0.02454369D);
        }
        this.field116 = ((double) arg2 - this.field111 - this.field100 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("n.i(IB)V")
    public final void method72(int arg0) {
        this.field108 = true;
        this.field110 += (double) arg0 * this.field112;
        this.field120 += (double) arg0 * this.field97;
        this.field111 += this.field116 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field100;
        this.field100 += (double) arg0 * this.field116;
        this.field117 = (int) (Math.atan2(this.field112, this.field97) * 325.949D) + 1024 & 0x7FF;
        this.field118 = (int) (Math.atan2(this.field100, this.field114) * 325.949D) & 0x7FF;
        if (this.field119 == null) {
            return;
        }
        this.field121 += arg0;
        while (true) {
            do {
                do {
                    if (this.field121 <= this.field119.field906[this.field107]) {
                        return;
                    }
                    this.field121 -= this.field119.field906[this.field107];
                    this.field107++;
                } while (this.field107 < this.field119.field904.length);
                this.field107 -= this.field119.field908;
            } while (this.field107 >= 0 && this.field107 < this.field119.field904.length);
            this.field107 = 0;
        }
    }

    @ObfuscatedName("n.e(B)Lcr;")
    public final class99 method15() {
        class40 var1 = class40.method1763(this.field105);
        class99 var2 = var1.method763(this.field107);
        if (var2 == null) {
            return null;
        } else {
            var2.method1985(this.field118);
            return var2;
        }
    }
}
