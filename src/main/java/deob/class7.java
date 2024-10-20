package deob;

@ObfuscatedName("i")
public final class class7 extends class85 {

    @ObfuscatedName("i.n")
    public int field106;

    @ObfuscatedName("i.d")
    public int field93;

    @ObfuscatedName("i.s")
    public int field92;

    @ObfuscatedName("i.q")
    public int field95;

    @ObfuscatedName("i.j")
    public int field96;

    @ObfuscatedName("i.k")
    public int field97;

    @ObfuscatedName("i.i")
    public int field110;

    @ObfuscatedName("i.m")
    public int field99;

    @ObfuscatedName("i.p")
    public int field100;

    @ObfuscatedName("i.h")
    public int field101;

    @ObfuscatedName("i.e")
    public int field109;

    @ObfuscatedName("i.g")
    public boolean field118 = false;

    @ObfuscatedName("i.b")
    public double field104;

    @ObfuscatedName("i.f")
    public double field105;

    @ObfuscatedName("i.y")
    public double field114;

    @ObfuscatedName("i.z")
    public double field107;

    @ObfuscatedName("i.t")
    public double field98;

    @ObfuscatedName("i.o")
    public double field94;

    @ObfuscatedName("i.r")
    public double field108;

    @ObfuscatedName("i.u")
    public double field111;

    @ObfuscatedName("i.v")
    public int field112;

    @ObfuscatedName("i.a")
    public int field113;

    @ObfuscatedName("i.c")
    public class43 field117;

    @ObfuscatedName("i.l")
    public int field115 = 0;

    @ObfuscatedName("i.x")
    public int field116 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field106 = arg0;
        this.field93 = arg1;
        this.field92 = arg2;
        this.field95 = arg3;
        this.field96 = arg4;
        this.field110 = arg5;
        this.field99 = arg6;
        this.field100 = arg7;
        this.field101 = arg8;
        this.field109 = arg9;
        this.field97 = arg10;
        this.field118 = false;
        int var12 = class44.method17(this.field106).field1004;
        if (var12 == -1) {
            this.field117 = null;
        } else {
            this.field117 = class43.method2827(var12);
        }
    }

    @ObfuscatedName("i.n(IIIII)V")
    public final void method86(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field118) {
            double var5 = (double) (arg0 - this.field92);
            double var7 = (double) (arg1 - this.field95);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field104 = (double) this.field101 * var5 / var9 + (double) this.field92;
            this.field105 = (double) this.field101 * var7 / var9 + (double) this.field95;
            this.field114 = (double) this.field96;
        }
        double var11 = (double) (this.field99 + 1 - arg3);
        this.field107 = ((double) arg0 - this.field104) / var11;
        this.field98 = ((double) arg1 - this.field105) / var11;
        this.field94 = Math.sqrt(this.field98 * this.field98 + this.field107 * this.field107);
        if (!this.field118) {
            this.field108 = -this.field94 * Math.tan((double) this.field100 * 0.02454369D);
        }
        this.field111 = ((double) arg2 - this.field114 - this.field108 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("i.d(II)V")
    public final void method79(int arg0) {
        this.field118 = true;
        this.field104 += (double) arg0 * this.field107;
        this.field105 += (double) arg0 * this.field98;
        this.field114 += this.field111 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field108;
        this.field108 += (double) arg0 * this.field111;
        this.field112 = (int) (Math.atan2(this.field107, this.field98) * 325.949D) + 1024 & 0x7FF;
        this.field113 = (int) (Math.atan2(this.field108, this.field94) * 325.949D) & 0x7FF;
        if (this.field117 == null) {
            return;
        }
        this.field116 += arg0;
        while (true) {
            do {
                do {
                    if (this.field116 <= this.field117.field980[this.field115]) {
                        return;
                    }
                    this.field116 -= this.field117.field980[this.field115];
                    this.field115++;
                } while (this.field115 < this.field117.field973.length);
                this.field115 -= this.field117.field975;
            } while (this.field115 >= 0 && this.field115 < this.field117.field973.length);
            this.field115 = 0;
        }
    }

    @ObfuscatedName("i.s(I)Ldb;")
    public final class105 method36() {
        class44 var1 = class44.method17(this.field106);
        class105 var2 = var1.method866(this.field115);
        if (var2 == null) {
            return null;
        } else {
            var2.method2136(this.field113);
            return var2;
        }
    }
}
