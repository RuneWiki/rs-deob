package deob;

@ObfuscatedName("j")
public final class class7 extends class79 {

    @ObfuscatedName("j.x")
    public int field104;

    @ObfuscatedName("j.v")
    public int field92;

    @ObfuscatedName("j.m")
    public int field101;

    @ObfuscatedName("j.e")
    public int field113;

    @ObfuscatedName("j.h")
    public int field114;

    @ObfuscatedName("j.p")
    public int field96;

    @ObfuscatedName("j.j")
    public int field97;

    @ObfuscatedName("j.i")
    public int field98;

    @ObfuscatedName("j.u")
    public int field99;

    @ObfuscatedName("j.l")
    public int field100;

    @ObfuscatedName("j.k")
    public int field94;

    @ObfuscatedName("j.q")
    public boolean field102 = false;

    @ObfuscatedName("j.b")
    public double field103;

    @ObfuscatedName("j.w")
    public double field95;

    @ObfuscatedName("j.g")
    public double field105;

    @ObfuscatedName("j.s")
    public double field91;

    @ObfuscatedName("j.c")
    public double field107;

    @ObfuscatedName("j.r")
    public double field108;

    @ObfuscatedName("j.f")
    public double field109;

    @ObfuscatedName("j.t")
    public double field110;

    @ObfuscatedName("j.o")
    public int field111;

    @ObfuscatedName("j.z")
    public int field112;

    @ObfuscatedName("j.d")
    public class39 field93;

    @ObfuscatedName("j.y")
    public int field106 = 0;

    @ObfuscatedName("j.a")
    public int field115 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field104 = arg0;
        this.field92 = arg1;
        this.field101 = arg2;
        this.field113 = arg3;
        this.field114 = arg4;
        this.field97 = arg5;
        this.field98 = arg6;
        this.field99 = arg7;
        this.field100 = arg8;
        this.field94 = arg9;
        this.field96 = arg10;
        this.field102 = false;
        int var12 = class40.method517(this.field104).field940;
        if (var12 == -1) {
            this.field93 = null;
        } else {
            this.field93 = class39.method633(var12);
        }
    }

    @ObfuscatedName("j.x(IIIII)V")
    public final void method70(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field102) {
            double var5 = (double) (arg0 - this.field101);
            double var7 = (double) (arg1 - this.field113);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field103 = (double) this.field100 * var5 / var9 + (double) this.field101;
            this.field95 = (double) this.field100 * var7 / var9 + (double) this.field113;
            this.field105 = (double) this.field114;
        }
        double var11 = (double) (this.field98 + 1 - arg3);
        this.field91 = ((double) arg0 - this.field103) / var11;
        this.field107 = ((double) arg1 - this.field95) / var11;
        this.field108 = Math.sqrt(this.field91 * this.field91 + this.field107 * this.field107);
        if (!this.field102) {
            this.field109 = -this.field108 * Math.tan((double) this.field99 * 0.02454369D);
        }
        this.field110 = ((double) arg2 - this.field105 - this.field109 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("j.m(IB)V")
    public final void method67(int arg0) {
        this.field102 = true;
        this.field103 += (double) arg0 * this.field91;
        this.field95 += (double) arg0 * this.field107;
        this.field105 += this.field110 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field109;
        this.field109 += (double) arg0 * this.field110;
        this.field111 = (int) (Math.atan2(this.field91, this.field107) * 325.949D) + 1024 & 0x7FF;
        this.field112 = (int) (Math.atan2(this.field109, this.field108) * 325.949D) & 0x7FF;
        if (this.field93 == null) {
            return;
        }
        this.field115 += arg0;
        while (true) {
            do {
                do {
                    if (this.field115 <= this.field93.field919[this.field106]) {
                        return;
                    }
                    this.field115 -= this.field93.field919[this.field106];
                    this.field106++;
                } while (this.field106 < this.field93.field913.length);
                this.field106 -= this.field93.field921;
            } while (this.field106 >= 0 && this.field106 < this.field93.field913.length);
            this.field106 = 0;
        }
    }

    @ObfuscatedName("j.v(B)Lck;")
    public final class99 method18() {
        class40 var1 = class40.method517(this.field104);
        class99 var2 = var1.method771(this.field106);
        if (var2 == null) {
            return null;
        } else {
            var2.method1995(this.field112);
            return var2;
        }
    }
}
