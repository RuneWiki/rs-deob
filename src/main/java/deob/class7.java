package deob;

@ObfuscatedName("e")
public final class class7 extends class78 {

    @ObfuscatedName("e.k")
    public int field108;

    @ObfuscatedName("e.y")
    public int field101;

    @ObfuscatedName("e.s")
    public int field88;

    @ObfuscatedName("e.g")
    public int field89;

    @ObfuscatedName("e.h")
    public int field112;

    @ObfuscatedName("e.l")
    public int field91;

    @ObfuscatedName("e.e")
    public int field104;

    @ObfuscatedName("e.u")
    public int field93;

    @ObfuscatedName("e.j")
    public int field95;

    @ObfuscatedName("e.c")
    public int field105;

    @ObfuscatedName("e.d")
    public int field87;

    @ObfuscatedName("e.v")
    public boolean field97 = false;

    @ObfuscatedName("e.n")
    public double field98;

    @ObfuscatedName("e.z")
    public double field99;

    @ObfuscatedName("e.a")
    public double field100;

    @ObfuscatedName("e.t")
    public double field86;

    @ObfuscatedName("e.p")
    public double field102;

    @ObfuscatedName("e.i")
    public double field103;

    @ObfuscatedName("e.r")
    public double field111;

    @ObfuscatedName("e.w")
    public double field106;

    @ObfuscatedName("e.b")
    public int field92;

    @ObfuscatedName("e.x")
    public int field107;

    @ObfuscatedName("e.q")
    public class38 field96;

    @ObfuscatedName("e.o")
    public int field109 = 0;

    @ObfuscatedName("e.m")
    public int field110 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field108 = arg0;
        this.field101 = arg1;
        this.field88 = arg2;
        this.field89 = arg3;
        this.field112 = arg4;
        this.field104 = arg5;
        this.field93 = arg6;
        this.field95 = arg7;
        this.field105 = arg8;
        this.field87 = arg9;
        this.field91 = arg10;
        this.field97 = false;
        int var12 = class39.method2666(this.field108).field916;
        if (var12 == -1) {
            this.field96 = null;
        } else {
            this.field96 = class38.method29(var12);
        }
    }

    @ObfuscatedName("e.k(IIIIB)V")
    public final void method81(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field97) {
            double var5 = (double) (arg0 - this.field88);
            double var7 = (double) (arg1 - this.field89);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field98 = (double) this.field105 * var5 / var9 + (double) this.field88;
            this.field99 = (double) this.field105 * var7 / var9 + (double) this.field89;
            this.field100 = (double) this.field112;
        }
        double var11 = (double) (this.field93 + 1 - arg3);
        this.field86 = ((double) arg0 - this.field98) / var11;
        this.field102 = ((double) arg1 - this.field99) / var11;
        this.field103 = Math.sqrt(this.field86 * this.field86 + this.field102 * this.field102);
        if (!this.field97) {
            this.field111 = -this.field103 * Math.tan((double) this.field95 * 0.02454369D);
        }
        this.field106 = ((double) arg2 - this.field100 - this.field111 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("e.s(II)V")
    public final void method82(int arg0) {
        this.field97 = true;
        this.field98 += (double) arg0 * this.field86;
        this.field99 += (double) arg0 * this.field102;
        this.field100 += this.field106 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field111;
        this.field111 += (double) arg0 * this.field106;
        this.field92 = (int) (Math.atan2(this.field86, this.field102) * 325.949D) + 1024 & 0x7FF;
        this.field107 = (int) (Math.atan2(this.field111, this.field103) * 325.949D) & 0x7FF;
        if (this.field96 == null) {
            return;
        }
        this.field110 += arg0;
        while (true) {
            do {
                do {
                    if (this.field110 <= this.field96.field892[this.field109]) {
                        return;
                    }
                    this.field110 -= this.field96.field892[this.field109];
                    this.field109++;
                } while (this.field109 < this.field96.field890.length);
                this.field109 -= this.field96.field894;
            } while (this.field109 >= 0 && this.field109 < this.field96.field890.length);
            this.field109 = 0;
        }
    }

    @ObfuscatedName("e.y(I)Lck;")
    public final class98 method19() {
        class39 var1 = class39.method2666(this.field108);
        class98 var2 = var1.method722(this.field109);
        if (var2 == null) {
            return null;
        } else {
            var2.method2000(this.field107);
            return var2;
        }
    }
}
