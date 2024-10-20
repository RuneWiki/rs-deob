package deob;

@ObfuscatedName("i")
public final class class7 extends class85 {

    @ObfuscatedName("i.m")
    public int field92;

    @ObfuscatedName("i.l")
    public int field93;

    @ObfuscatedName("i.y")
    public int field110;

    @ObfuscatedName("i.u")
    public int field113;

    @ObfuscatedName("i.k")
    public int field95;

    @ObfuscatedName("i.j")
    public int field115;

    @ObfuscatedName("i.i")
    public int field97;

    @ObfuscatedName("i.x")
    public int field112;

    @ObfuscatedName("i.g")
    public int field99;

    @ObfuscatedName("i.e")
    public int field100;

    @ObfuscatedName("i.p")
    public int field101;

    @ObfuscatedName("i.a")
    public boolean field102 = false;

    @ObfuscatedName("i.v")
    public double field96;

    @ObfuscatedName("i.c")
    public double field104;

    @ObfuscatedName("i.s")
    public double field109;

    @ObfuscatedName("i.r")
    public double field106;

    @ObfuscatedName("i.h")
    public double field107;

    @ObfuscatedName("i.n")
    public double field108;

    @ObfuscatedName("i.b")
    public double field103;

    @ObfuscatedName("i.f")
    public double field98;

    @ObfuscatedName("i.d")
    public int field111;

    @ObfuscatedName("i.q")
    public int field105;

    @ObfuscatedName("i.o")
    public class43 field94;

    @ObfuscatedName("i.w")
    public int field114 = 0;

    @ObfuscatedName("i.z")
    public int field91 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field92 = arg0;
        this.field93 = arg1;
        this.field110 = arg2;
        this.field113 = arg3;
        this.field95 = arg4;
        this.field97 = arg5;
        this.field112 = arg6;
        this.field99 = arg7;
        this.field100 = arg8;
        this.field101 = arg9;
        this.field115 = arg10;
        this.field102 = false;
        int var12 = class44.method875(this.field92).field977;
        if (var12 == -1) {
            this.field94 = null;
        } else {
            this.field94 = class43.method2262(var12);
        }
    }

    @ObfuscatedName("i.m(IIIIB)V")
    public final void method88(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field102) {
            double var5 = (double) (arg0 - this.field110);
            double var7 = (double) (arg1 - this.field113);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field96 = (double) this.field100 * var5 / var9 + (double) this.field110;
            this.field104 = (double) this.field100 * var7 / var9 + (double) this.field113;
            this.field109 = (double) this.field95;
        }
        double var11 = (double) (this.field112 + 1 - arg3);
        this.field106 = ((double) arg0 - this.field96) / var11;
        this.field107 = ((double) arg1 - this.field104) / var11;
        this.field108 = Math.sqrt(this.field107 * this.field107 + this.field106 * this.field106);
        if (!this.field102) {
            this.field103 = -this.field108 * Math.tan((double) this.field99 * 0.02454369D);
        }
        this.field98 = ((double) arg2 - this.field109 - this.field103 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("i.l(II)V")
    public final void method87(int arg0) {
        this.field102 = true;
        this.field96 += (double) arg0 * this.field106;
        this.field104 += (double) arg0 * this.field107;
        this.field109 += this.field98 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field103;
        this.field103 += (double) arg0 * this.field98;
        this.field111 = (int) (Math.atan2(this.field106, this.field107) * 325.949D) + 1024 & 0x7FF;
        this.field105 = (int) (Math.atan2(this.field103, this.field108) * 325.949D) & 0x7FF;
        if (this.field94 == null) {
            return;
        }
        this.field91 += arg0;
        while (true) {
            do {
                do {
                    if (this.field91 <= this.field94.field957[this.field114]) {
                        return;
                    }
                    this.field91 -= this.field94.field957[this.field114];
                    this.field114++;
                } while (this.field114 < this.field94.field955.length);
                this.field114 -= this.field94.field956;
            } while (this.field114 >= 0 && this.field114 < this.field94.field955.length);
            this.field114 = 0;
        }
    }

    @ObfuscatedName("i.y(I)Ldb;")
    public final class105 method16() {
        class44 var1 = class44.method875(this.field92);
        class105 var2 = var1.method922(this.field114);
        if (var2 == null) {
            return null;
        } else {
            var2.method2208(this.field105);
            return var2;
        }
    }
}
