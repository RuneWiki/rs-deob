package deob;

@ObfuscatedName("a")
public final class class7 extends class79 {

    @ObfuscatedName("a.e")
    public int field110;

    @ObfuscatedName("a.v")
    public int field92;

    @ObfuscatedName("a.k")
    public int field93;

    @ObfuscatedName("a.g")
    public int field94;

    @ObfuscatedName("a.q")
    public int field95;

    @ObfuscatedName("a.l")
    public int field96;

    @ObfuscatedName("a.a")
    public int field112;

    @ObfuscatedName("a.b")
    public int field91;

    @ObfuscatedName("a.z")
    public int field100;

    @ObfuscatedName("a.w")
    public int field98;

    @ObfuscatedName("a.j")
    public int field99;

    @ObfuscatedName("a.p")
    public boolean field107 = false;

    @ObfuscatedName("a.n")
    public double field103;

    @ObfuscatedName("a.r")
    public double field102;

    @ObfuscatedName("a.s")
    public double field105;

    @ObfuscatedName("a.f")
    public double field106;

    @ObfuscatedName("a.c")
    public double field108;

    @ObfuscatedName("a.t")
    public double field111;

    @ObfuscatedName("a.i")
    public double field109;

    @ObfuscatedName("a.u")
    public double field101;

    @ObfuscatedName("a.y")
    public int field117;

    @ObfuscatedName("a.o")
    public int field104;

    @ObfuscatedName("a.m")
    public class39 field113;

    @ObfuscatedName("a.h")
    public int field114 = 0;

    @ObfuscatedName("a.x")
    public int field115 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field110 = arg0;
        this.field92 = arg1;
        this.field93 = arg2;
        this.field94 = arg3;
        this.field95 = arg4;
        this.field112 = arg5;
        this.field91 = arg6;
        this.field100 = arg7;
        this.field98 = arg8;
        this.field99 = arg9;
        this.field96 = arg10;
        this.field107 = false;
        int var12 = class40.method2885(this.field110).field940;
        if (var12 == -1) {
            this.field113 = null;
        } else {
            this.field113 = class39.method2315(var12);
        }
    }

    @ObfuscatedName("a.e(IIIII)V")
    public final void method74(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field107) {
            double var5 = (double) (arg0 - this.field93);
            double var7 = (double) (arg1 - this.field94);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field103 = (double) this.field98 * var5 / var9 + (double) this.field93;
            this.field102 = (double) this.field98 * var7 / var9 + (double) this.field94;
            this.field105 = (double) this.field95;
        }
        double var11 = (double) (this.field91 + 1 - arg3);
        this.field106 = ((double) arg0 - this.field103) / var11;
        this.field108 = ((double) arg1 - this.field102) / var11;
        this.field111 = Math.sqrt(this.field108 * this.field108 + this.field106 * this.field106);
        if (!this.field107) {
            this.field109 = -this.field111 * Math.tan((double) this.field100 * 0.02454369D);
        }
        this.field101 = ((double) arg2 - this.field105 - this.field109 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("a.k(IB)V")
    public final void method79(int arg0) {
        this.field107 = true;
        this.field103 += (double) arg0 * this.field106;
        this.field102 += (double) arg0 * this.field108;
        this.field105 += this.field101 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field109;
        this.field109 += (double) arg0 * this.field101;
        this.field117 = (int) (Math.atan2(this.field106, this.field108) * 325.949D) + 1024 & 0x7FF;
        this.field104 = (int) (Math.atan2(this.field109, this.field111) * 325.949D) & 0x7FF;
        if (this.field113 == null) {
            return;
        }
        this.field115 += arg0;
        while (true) {
            do {
                do {
                    if (this.field115 <= this.field113.field917[this.field114]) {
                        return;
                    }
                    this.field115 -= this.field113.field917[this.field114];
                    this.field114++;
                } while (this.field114 < this.field113.field925.length);
                this.field114 -= this.field113.field919;
            } while (this.field114 >= 0 && this.field114 < this.field113.field925.length);
            this.field114 = 0;
        }
    }

    @ObfuscatedName("a.v(B)Lcu;")
    public final class99 method14() {
        class40 var1 = class40.method2885(this.field110);
        class99 var2 = var1.method740(this.field114);
        if (var2 == null) {
            return null;
        } else {
            var2.method1981(this.field104);
            return var2;
        }
    }
}
