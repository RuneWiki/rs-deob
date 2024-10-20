package deob;

@ObfuscatedName("f")
public final class class7 extends class80 {

    @ObfuscatedName("f.t")
    public int field111;

    @ObfuscatedName("f.b")
    public int field90;

    @ObfuscatedName("f.p")
    public int field89;

    @ObfuscatedName("f.e")
    public int field92;

    @ObfuscatedName("f.i")
    public int field114;

    @ObfuscatedName("f.o")
    public int field91;

    @ObfuscatedName("f.f")
    public int field95;

    @ObfuscatedName("f.d")
    public int field96;

    @ObfuscatedName("f.j")
    public int field97;

    @ObfuscatedName("f.x")
    public int field98;

    @ObfuscatedName("f.v")
    public int field99;

    @ObfuscatedName("f.a")
    public boolean field100 = false;

    @ObfuscatedName("f.l")
    public double field105;

    @ObfuscatedName("f.h")
    public double field107;

    @ObfuscatedName("f.c")
    public double field101;

    @ObfuscatedName("f.u")
    public double field104;

    @ObfuscatedName("f.r")
    public double field94;

    @ObfuscatedName("f.k")
    public double field106;

    @ObfuscatedName("f.w")
    public double field102;

    @ObfuscatedName("f.q")
    public double field108;

    @ObfuscatedName("f.g")
    public int field109;

    @ObfuscatedName("f.z")
    public int field110;

    @ObfuscatedName("f.m")
    public class40 field103;

    @ObfuscatedName("f.y")
    public int field112 = 0;

    @ObfuscatedName("f.n")
    public int field113 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field111 = arg0;
        this.field90 = arg1;
        this.field89 = arg2;
        this.field92 = arg3;
        this.field114 = arg4;
        this.field95 = arg5;
        this.field96 = arg6;
        this.field97 = arg7;
        this.field98 = arg8;
        this.field99 = arg9;
        this.field91 = arg10;
        this.field100 = false;
        int var12 = class41.method113(this.field111).field941;
        if (var12 == -1) {
            this.field103 = null;
        } else {
            this.field103 = class40.method168(var12);
        }
    }

    @ObfuscatedName("f.t(IIIIB)V")
    public final void method92(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field100) {
            double var5 = (double) (arg0 - this.field89);
            double var7 = (double) (arg1 - this.field92);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field105 = (double) this.field98 * var5 / var9 + (double) this.field89;
            this.field107 = (double) this.field98 * var7 / var9 + (double) this.field92;
            this.field101 = (double) this.field114;
        }
        double var11 = (double) (this.field96 + 1 - arg3);
        this.field104 = ((double) arg0 - this.field105) / var11;
        this.field94 = ((double) arg1 - this.field107) / var11;
        this.field106 = Math.sqrt(this.field94 * this.field94 + this.field104 * this.field104);
        if (!this.field100) {
            this.field102 = -this.field106 * Math.tan((double) this.field97 * 0.02454369D);
        }
        this.field108 = ((double) arg2 - this.field101 - this.field102 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("f.p(IB)V")
    public final void method97(int arg0) {
        this.field100 = true;
        this.field105 += (double) arg0 * this.field104;
        this.field107 += (double) arg0 * this.field94;
        this.field101 += this.field108 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field102;
        this.field102 += (double) arg0 * this.field108;
        this.field109 = (int) (Math.atan2(this.field104, this.field94) * 325.949D) + 1024 & 0x7FF;
        this.field110 = (int) (Math.atan2(this.field102, this.field106) * 325.949D) & 0x7FF;
        if (this.field103 == null) {
            return;
        }
        this.field113 += arg0;
        while (true) {
            do {
                do {
                    if (this.field113 <= this.field103.field920[this.field112]) {
                        return;
                    }
                    this.field113 -= this.field103.field920[this.field112];
                    this.field112++;
                } while (this.field112 < this.field103.field918.length);
                this.field112 -= this.field103.field916;
            } while (this.field112 >= 0 && this.field112 < this.field103.field918.length);
            this.field112 = 0;
        }
    }

    @ObfuscatedName("f.b(B)Lcs;")
    public final class100 method14() {
        class41 var1 = class41.method113(this.field111);
        class100 var2 = var1.method827(this.field112);
        if (var2 == null) {
            return null;
        } else {
            var2.method2029(this.field110);
            return var2;
        }
    }
}
