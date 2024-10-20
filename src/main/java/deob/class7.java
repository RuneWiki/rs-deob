package deob;

@ObfuscatedName("e")
public final class class7 extends class78 {

    @ObfuscatedName("e.g")
    public int field118;

    @ObfuscatedName("e.v")
    public int field93;

    @ObfuscatedName("e.z")
    public int field98;

    @ObfuscatedName("e.h")
    public int field95;

    @ObfuscatedName("e.k")
    public int field109;

    @ObfuscatedName("e.l")
    public int field111;

    @ObfuscatedName("e.e")
    public int field97;

    @ObfuscatedName("e.j")
    public int field96;

    @ObfuscatedName("e.n")
    public int field100;

    @ObfuscatedName("e.f")
    public int field101;

    @ObfuscatedName("e.a")
    public int field102;

    @ObfuscatedName("e.i")
    public boolean field103 = false;

    @ObfuscatedName("e.y")
    public double field104;

    @ObfuscatedName("e.p")
    public double field105;

    @ObfuscatedName("e.q")
    public double field106;

    @ObfuscatedName("e.t")
    public double field92;

    @ObfuscatedName("e.r")
    public double field108;

    @ObfuscatedName("e.x")
    public double field116;

    @ObfuscatedName("e.s")
    public double field110;

    @ObfuscatedName("e.d")
    public double field119;

    @ObfuscatedName("e.m")
    public int field112;

    @ObfuscatedName("e.o")
    public int field113;

    @ObfuscatedName("e.b")
    public class38 field107;

    @ObfuscatedName("e.c")
    public int field115 = 0;

    @ObfuscatedName("e.w")
    public int field99 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field118 = arg0;
        this.field93 = arg1;
        this.field98 = arg2;
        this.field95 = arg3;
        this.field109 = arg4;
        this.field97 = arg5;
        this.field96 = arg6;
        this.field100 = arg7;
        this.field101 = arg8;
        this.field102 = arg9;
        this.field111 = arg10;
        this.field103 = false;
        int var12 = class39.method563(this.field118).field925;
        if (var12 == -1) {
            this.field107 = null;
        } else {
            this.field107 = class38.method1996(var12);
        }
    }

    @ObfuscatedName("e.g(IIIIB)V")
    public final void method77(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field103) {
            double var5 = (double) (arg0 - this.field98);
            double var7 = (double) (arg1 - this.field95);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field104 = (double) this.field101 * var5 / var9 + (double) this.field98;
            this.field105 = (double) this.field101 * var7 / var9 + (double) this.field95;
            this.field106 = (double) this.field109;
        }
        double var11 = (double) (this.field96 + 1 - arg3);
        this.field92 = ((double) arg0 - this.field104) / var11;
        this.field108 = ((double) arg1 - this.field105) / var11;
        this.field116 = Math.sqrt(this.field92 * this.field92 + this.field108 * this.field108);
        if (!this.field103) {
            this.field110 = -this.field116 * Math.tan((double) this.field100 * 0.02454369D);
        }
        this.field119 = ((double) arg2 - this.field106 - this.field110 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("e.z(II)V")
    public final void method82(int arg0) {
        this.field103 = true;
        this.field104 += (double) arg0 * this.field92;
        this.field105 += (double) arg0 * this.field108;
        this.field106 += this.field119 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field110;
        this.field110 += (double) arg0 * this.field119;
        this.field112 = (int) (Math.atan2(this.field92, this.field108) * 325.949D) + 1024 & 0x7FF;
        this.field113 = (int) (Math.atan2(this.field110, this.field116) * 325.949D) & 0x7FF;
        if (this.field107 == null) {
            return;
        }
        this.field99 += arg0;
        while (true) {
            do {
                do {
                    if (this.field99 <= this.field107.field903[this.field115]) {
                        return;
                    }
                    this.field99 -= this.field107.field903[this.field115];
                    this.field115++;
                } while (this.field115 < this.field107.field901.length);
                this.field115 -= this.field107.field905;
            } while (this.field115 >= 0 && this.field115 < this.field107.field901.length);
            this.field115 = 0;
        }
    }

    @ObfuscatedName("e.v(B)Lce;")
    public final class98 method25() {
        class39 var1 = class39.method563(this.field118);
        class98 var2 = var1.method751(this.field115);
        if (var2 == null) {
            return null;
        } else {
            var2.method2012(this.field113);
            return var2;
        }
    }
}
