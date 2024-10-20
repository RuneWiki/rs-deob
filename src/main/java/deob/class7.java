package deob;

@ObfuscatedName("l")
public final class class7 extends class85 {

    @ObfuscatedName("l.k")
    public int field104;

    @ObfuscatedName("l.h")
    public int field90;

    @ObfuscatedName("l.o")
    public int field94;

    @ObfuscatedName("l.z")
    public int field91;

    @ObfuscatedName("l.c")
    public int field92;

    @ObfuscatedName("l.d")
    public int field93;

    @ObfuscatedName("l.l")
    public int field111;

    @ObfuscatedName("l.b")
    public int field110;

    @ObfuscatedName("l.j")
    public int field114;

    @ObfuscatedName("l.f")
    public int field97;

    @ObfuscatedName("l.i")
    public int field98;

    @ObfuscatedName("l.g")
    public boolean field99 = false;

    @ObfuscatedName("l.t")
    public double field100;

    @ObfuscatedName("l.e")
    public double field101;

    @ObfuscatedName("l.q")
    public double field102;

    @ObfuscatedName("l.u")
    public double field103;

    @ObfuscatedName("l.r")
    public double field96;

    @ObfuscatedName("l.a")
    public double field105;

    @ObfuscatedName("l.m")
    public double field106;

    @ObfuscatedName("l.y")
    public double field109;

    @ObfuscatedName("l.x")
    public int field107;

    @ObfuscatedName("l.n")
    public int field108;

    @ObfuscatedName("l.v")
    public class43 field89;

    @ObfuscatedName("l.s")
    public int field113 = 0;

    @ObfuscatedName("l.w")
    public int field112 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field104 = arg0;
        this.field90 = arg1;
        this.field94 = arg2;
        this.field91 = arg3;
        this.field92 = arg4;
        this.field111 = arg5;
        this.field110 = arg6;
        this.field114 = arg7;
        this.field97 = arg8;
        this.field98 = arg9;
        this.field93 = arg10;
        this.field99 = false;
        int var12 = class44.method520(this.field104).field993;
        if (var12 == -1) {
            this.field89 = null;
        } else {
            this.field89 = class43.method3491(var12);
        }
    }

    @ObfuscatedName("l.k(IIIII)V")
    public final void method95(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field99) {
            double var5 = (double) (arg0 - this.field94);
            double var7 = (double) (arg1 - this.field91);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field100 = (double) this.field97 * var5 / var9 + (double) this.field94;
            this.field101 = (double) this.field97 * var7 / var9 + (double) this.field91;
            this.field102 = (double) this.field92;
        }
        double var11 = (double) (this.field110 + 1 - arg3);
        this.field103 = ((double) arg0 - this.field100) / var11;
        this.field96 = ((double) arg1 - this.field101) / var11;
        this.field105 = Math.sqrt(this.field96 * this.field96 + this.field103 * this.field103);
        if (!this.field99) {
            this.field106 = -this.field105 * Math.tan((double) this.field114 * 0.02454369D);
        }
        this.field109 = ((double) arg2 - this.field102 - this.field106 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("l.h(II)V")
    public final void method91(int arg0) {
        this.field99 = true;
        this.field100 += (double) arg0 * this.field103;
        this.field101 += (double) arg0 * this.field96;
        this.field102 += this.field109 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field106;
        this.field106 += (double) arg0 * this.field109;
        this.field107 = (int) (Math.atan2(this.field103, this.field96) * 325.949D) + 1024 & 0x7FF;
        this.field108 = (int) (Math.atan2(this.field106, this.field105) * 325.949D) & 0x7FF;
        if (this.field89 == null) {
            return;
        }
        this.field112 += arg0;
        while (true) {
            do {
                do {
                    if (this.field112 <= this.field89.field980[this.field113]) {
                        return;
                    }
                    this.field112 -= this.field89.field980[this.field113];
                    this.field113++;
                } while (this.field113 < this.field89.field974.length);
                this.field113 -= this.field89.field975;
            } while (this.field113 >= 0 && this.field113 < this.field89.field974.length);
            this.field113 = 0;
        }
    }

    @ObfuscatedName("l.o(I)Ldl;")
    public final class105 method11() {
        class44 var1 = class44.method520(this.field104);
        class105 var2 = var1.method847(this.field113);
        if (var2 == null) {
            return null;
        } else {
            var2.method2150(this.field108);
            return var2;
        }
    }
}
