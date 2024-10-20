package deob;

@ObfuscatedName("n")
public final class class7 extends class79 {

    @ObfuscatedName("n.f")
    public int field106;

    @ObfuscatedName("n.k")
    public int field88;

    @ObfuscatedName("n.y")
    public int field89;

    @ObfuscatedName("n.e")
    public int field90;

    @ObfuscatedName("n.r")
    public int field105;

    @ObfuscatedName("n.a")
    public int field92;

    @ObfuscatedName("n.n")
    public int field93;

    @ObfuscatedName("n.x")
    public int field116;

    @ObfuscatedName("n.g")
    public int field95;

    @ObfuscatedName("n.o")
    public int field100;

    @ObfuscatedName("n.p")
    public int field94;

    @ObfuscatedName("n.v")
    public boolean field98 = false;

    @ObfuscatedName("n.w")
    public double field99;

    @ObfuscatedName("n.t")
    public double field104;

    @ObfuscatedName("n.s")
    public double field97;

    @ObfuscatedName("n.b")
    public double field102;

    @ObfuscatedName("n.u")
    public double field103;

    @ObfuscatedName("n.j")
    public double field101;

    @ObfuscatedName("n.d")
    public double field107;

    @ObfuscatedName("n.l")
    public double field91;

    @ObfuscatedName("n.m")
    public int field111;

    @ObfuscatedName("n.q")
    public int field108;

    @ObfuscatedName("n.h")
    public class39 field109;

    @ObfuscatedName("n.c")
    public int field114 = 0;

    @ObfuscatedName("n.z")
    public int field87 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field106 = arg0;
        this.field88 = arg1;
        this.field89 = arg2;
        this.field90 = arg3;
        this.field105 = arg4;
        this.field93 = arg5;
        this.field116 = arg6;
        this.field95 = arg7;
        this.field100 = arg8;
        this.field94 = arg9;
        this.field92 = arg10;
        this.field98 = false;
        int var12 = class40.method99(this.field106).field943;
        if (var12 == -1) {
            this.field109 = null;
        } else {
            this.field109 = class39.method547(var12);
        }
    }

    @ObfuscatedName("n.f(IIIIS)V")
    public final void method87(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field98) {
            double var5 = (double) (arg0 - this.field89);
            double var7 = (double) (arg1 - this.field90);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field99 = (double) this.field100 * var5 / var9 + (double) this.field89;
            this.field104 = (double) this.field100 * var7 / var9 + (double) this.field90;
            this.field97 = (double) this.field105;
        }
        double var11 = (double) (this.field116 + 1 - arg3);
        this.field102 = ((double) arg0 - this.field99) / var11;
        this.field103 = ((double) arg1 - this.field104) / var11;
        this.field101 = Math.sqrt(this.field103 * this.field103 + this.field102 * this.field102);
        if (!this.field98) {
            this.field107 = -this.field101 * Math.tan((double) this.field95 * 0.02454369D);
        }
        this.field91 = ((double) arg2 - this.field97 - this.field107 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("n.y(II)V")
    public final void method91(int arg0) {
        this.field98 = true;
        this.field99 += (double) arg0 * this.field102;
        this.field104 += (double) arg0 * this.field103;
        this.field97 += this.field91 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field107;
        this.field107 += (double) arg0 * this.field91;
        this.field111 = (int) (Math.atan2(this.field102, this.field103) * 325.949D) + 1024 & 0x7FF;
        this.field108 = (int) (Math.atan2(this.field107, this.field101) * 325.949D) & 0x7FF;
        if (this.field109 == null) {
            return;
        }
        this.field87 += arg0;
        while (true) {
            do {
                do {
                    if (this.field87 <= this.field109.field918[this.field114]) {
                        return;
                    }
                    this.field87 -= this.field109.field918[this.field114];
                    this.field114++;
                } while (this.field114 < this.field109.field913.length);
                this.field114 -= this.field109.field924;
            } while (this.field114 >= 0 && this.field114 < this.field109.field913.length);
            this.field114 = 0;
        }
    }

    @ObfuscatedName("n.k(I)Lci;")
    public final class99 method16() {
        class40 var1 = class40.method99(this.field106);
        class99 var2 = var1.method783(this.field114);
        if (var2 == null) {
            return null;
        } else {
            var2.method2081(this.field108);
            return var2;
        }
    }
}
