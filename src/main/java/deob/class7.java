package deob;

@ObfuscatedName("l")
public final class class7 extends class80 {

    @ObfuscatedName("l.n")
    public int field116;

    @ObfuscatedName("l.w")
    public int field88;

    @ObfuscatedName("l.i")
    public int field89;

    @ObfuscatedName("l.e")
    public int field90;

    @ObfuscatedName("l.h")
    public int field115;

    @ObfuscatedName("l.q")
    public int field107;

    @ObfuscatedName("l.l")
    public int field93;

    @ObfuscatedName("l.c")
    public int field103;

    @ObfuscatedName("l.f")
    public int field95;

    @ObfuscatedName("l.s")
    public int field91;

    @ObfuscatedName("l.m")
    public int field97;

    @ObfuscatedName("l.y")
    public boolean field92 = false;

    @ObfuscatedName("l.b")
    public double field99;

    @ObfuscatedName("l.v")
    public double field100;

    @ObfuscatedName("l.z")
    public double field101;

    @ObfuscatedName("l.u")
    public double field102;

    @ObfuscatedName("l.g")
    public double field96;

    @ObfuscatedName("l.k")
    public double field87;

    @ObfuscatedName("l.o")
    public double field110;

    @ObfuscatedName("l.a")
    public double field106;

    @ObfuscatedName("l.p")
    public int field111;

    @ObfuscatedName("l.t")
    public int field108;

    @ObfuscatedName("l.x")
    public class40 field109;

    @ObfuscatedName("l.d")
    public int field98 = 0;

    @ObfuscatedName("l.j")
    public int field94 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field116 = arg0;
        this.field88 = arg1;
        this.field89 = arg2;
        this.field90 = arg3;
        this.field115 = arg4;
        this.field93 = arg5;
        this.field103 = arg6;
        this.field95 = arg7;
        this.field91 = arg8;
        this.field97 = arg9;
        this.field107 = arg10;
        this.field92 = false;
        int var12 = class41.method667(this.field116).field957;
        if (var12 == -1) {
            this.field109 = null;
        } else {
            this.field109 = class40.method122(var12);
        }
    }

    @ObfuscatedName("l.n(IIIIS)V")
    public final void method76(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field92) {
            double var5 = (double) (arg0 - this.field89);
            double var7 = (double) (arg1 - this.field90);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field99 = (double) this.field91 * var5 / var9 + (double) this.field89;
            this.field100 = (double) this.field91 * var7 / var9 + (double) this.field90;
            this.field101 = (double) this.field115;
        }
        double var11 = (double) (this.field103 + 1 - arg3);
        this.field102 = ((double) arg0 - this.field99) / var11;
        this.field96 = ((double) arg1 - this.field100) / var11;
        this.field87 = Math.sqrt(this.field96 * this.field96 + this.field102 * this.field102);
        if (!this.field92) {
            this.field110 = -this.field87 * Math.tan((double) this.field95 * 0.02454369D);
        }
        this.field106 = ((double) arg2 - this.field101 - this.field110 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("l.i(II)V")
    public final void method77(int arg0) {
        this.field92 = true;
        this.field99 += (double) arg0 * this.field102;
        this.field100 += (double) arg0 * this.field96;
        this.field101 += this.field106 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field110;
        this.field110 += (double) arg0 * this.field106;
        this.field111 = (int) (Math.atan2(this.field102, this.field96) * 325.949D) + 1024 & 0x7FF;
        this.field108 = (int) (Math.atan2(this.field110, this.field87) * 325.949D) & 0x7FF;
        if (this.field109 == null) {
            return;
        }
        this.field94 += arg0;
        while (true) {
            do {
                do {
                    if (this.field94 <= this.field109.field938[this.field98]) {
                        return;
                    }
                    this.field94 -= this.field109.field938[this.field98];
                    this.field98++;
                } while (this.field98 < this.field109.field936.length);
                this.field98 -= this.field109.field940;
            } while (this.field98 >= 0 && this.field98 < this.field109.field936.length);
            this.field98 = 0;
        }
    }

    @ObfuscatedName("l.w(B)Lcw;")
    public final class100 method12() {
        class41 var1 = class41.method667(this.field116);
        class100 var2 = var1.method780(this.field98);
        if (var2 == null) {
            return null;
        } else {
            var2.method2026(this.field108);
            return var2;
        }
    }
}
