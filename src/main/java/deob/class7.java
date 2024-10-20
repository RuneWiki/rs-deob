package deob;

@ObfuscatedName("b")
public final class class7 extends class78 {

    @ObfuscatedName("b.g")
    public int field85;

    @ObfuscatedName("b.s")
    public int field108;

    @ObfuscatedName("b.h")
    public int field86;

    @ObfuscatedName("b.m")
    public int field87;

    @ObfuscatedName("b.u")
    public int field84;

    @ObfuscatedName("b.j")
    public int field90;

    @ObfuscatedName("b.b")
    public int field97;

    @ObfuscatedName("b.v")
    public int field91;

    @ObfuscatedName("b.y")
    public int field109;

    @ObfuscatedName("b.w")
    public int field93;

    @ObfuscatedName("b.x")
    public int field99;

    @ObfuscatedName("b.k")
    public boolean field95 = false;

    @ObfuscatedName("b.o")
    public double field96;

    @ObfuscatedName("b.a")
    public double field92;

    @ObfuscatedName("b.f")
    public double field98;

    @ObfuscatedName("b.r")
    public double field89;

    @ObfuscatedName("b.e")
    public double field100;

    @ObfuscatedName("b.t")
    public double field94;

    @ObfuscatedName("b.c")
    public double field102;

    @ObfuscatedName("b.l")
    public double field103;

    @ObfuscatedName("b.n")
    public int field104;

    @ObfuscatedName("b.d")
    public int field105;

    @ObfuscatedName("b.p")
    public class38 field106;

    @ObfuscatedName("b.z")
    public int field107 = 0;

    @ObfuscatedName("b.q")
    public int field101 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field85 = arg0;
        this.field108 = arg1;
        this.field86 = arg2;
        this.field87 = arg3;
        this.field84 = arg4;
        this.field97 = arg5;
        this.field91 = arg6;
        this.field109 = arg7;
        this.field93 = arg8;
        this.field99 = arg9;
        this.field90 = arg10;
        this.field95 = false;
        int var12 = class39.method3306(this.field85).field917;
        if (var12 == -1) {
            this.field106 = null;
        } else {
            this.field106 = class38.method114(var12);
        }
    }

    @ObfuscatedName("b.g(IIIIB)V")
    public final void method89(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field95) {
            double var5 = (double) (arg0 - this.field86);
            double var7 = (double) (arg1 - this.field87);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field96 = (double) this.field93 * var5 / var9 + (double) this.field86;
            this.field92 = (double) this.field93 * var7 / var9 + (double) this.field87;
            this.field98 = (double) this.field84;
        }
        double var11 = (double) (this.field91 + 1 - arg3);
        this.field89 = ((double) arg0 - this.field96) / var11;
        this.field100 = ((double) arg1 - this.field92) / var11;
        this.field94 = Math.sqrt(this.field89 * this.field89 + this.field100 * this.field100);
        if (!this.field95) {
            this.field102 = -this.field94 * Math.tan((double) this.field109 * 0.02454369D);
        }
        this.field103 = ((double) arg2 - this.field98 - this.field102 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("b.h(II)V")
    public final void method88(int arg0) {
        this.field95 = true;
        this.field96 += (double) arg0 * this.field89;
        this.field92 += (double) arg0 * this.field100;
        this.field98 += this.field103 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field102;
        this.field102 += (double) arg0 * this.field103;
        this.field104 = (int) (Math.atan2(this.field89, this.field100) * 325.949D) + 1024 & 0x7FF;
        this.field105 = (int) (Math.atan2(this.field102, this.field94) * 325.949D) & 0x7FF;
        if (this.field106 == null) {
            return;
        }
        this.field101 += arg0;
        while (true) {
            do {
                do {
                    if (this.field101 <= this.field106.field895[this.field107]) {
                        return;
                    }
                    this.field101 -= this.field106.field895[this.field107];
                    this.field107++;
                } while (this.field107 < this.field106.field900.length);
                this.field107 -= this.field106.field902;
            } while (this.field107 >= 0 && this.field107 < this.field106.field900.length);
            this.field107 = 0;
        }
    }

    @ObfuscatedName("b.s(I)Lcl;")
    public final class98 method17() {
        class39 var1 = class39.method3306(this.field85);
        class98 var2 = var1.method743(this.field107);
        if (var2 == null) {
            return null;
        } else {
            var2.method1967(this.field105);
            return var2;
        }
    }
}
