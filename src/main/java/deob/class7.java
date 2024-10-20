package deob;

@ObfuscatedName("g")
public final class class7 extends class78 {

    @ObfuscatedName("g.t")
    public int field98;

    @ObfuscatedName("g.o")
    public int field118;

    @ObfuscatedName("g.i")
    public int field127;

    @ObfuscatedName("g.p")
    public int field96;

    @ObfuscatedName("g.c")
    public int field100;

    @ObfuscatedName("g.y")
    public int field101;

    @ObfuscatedName("g.g")
    public int field105;

    @ObfuscatedName("g.l")
    public int field103;

    @ObfuscatedName("g.h")
    public int field104;

    @ObfuscatedName("g.n")
    public int field102;

    @ObfuscatedName("g.w")
    public int field106;

    @ObfuscatedName("g.m")
    public boolean field107 = false;

    @ObfuscatedName("g.x")
    public double field108;

    @ObfuscatedName("g.b")
    public double field109;

    @ObfuscatedName("g.u")
    public double field110;

    @ObfuscatedName("g.r")
    public double field111;

    @ObfuscatedName("g.z")
    public double field99;

    @ObfuscatedName("g.v")
    public double field113;

    @ObfuscatedName("g.k")
    public double field119;

    @ObfuscatedName("g.a")
    public double field115;

    @ObfuscatedName("g.d")
    public int field116;

    @ObfuscatedName("g.j")
    public int field117;

    @ObfuscatedName("g.s")
    public class38 field114;

    @ObfuscatedName("g.f")
    public int field126 = 0;

    @ObfuscatedName("g.e")
    public int field120 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field98 = arg0;
        this.field118 = arg1;
        this.field127 = arg2;
        this.field96 = arg3;
        this.field100 = arg4;
        this.field105 = arg5;
        this.field103 = arg6;
        this.field104 = arg7;
        this.field102 = arg8;
        this.field106 = arg9;
        this.field101 = arg10;
        this.field107 = false;
        int var12 = class39.method2654(this.field98).field912;
        if (var12 == -1) {
            this.field114 = null;
        } else {
            this.field114 = class38.method1579(var12);
        }
    }

    @ObfuscatedName("g.t(IIIIB)V")
    public final void method74(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field107) {
            double var5 = (double) (arg0 - this.field127);
            double var7 = (double) (arg1 - this.field96);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field108 = (double) this.field102 * var5 / var9 + (double) this.field127;
            this.field109 = (double) this.field102 * var7 / var9 + (double) this.field96;
            this.field110 = (double) this.field100;
        }
        double var11 = (double) (this.field103 + 1 - arg3);
        this.field111 = ((double) arg0 - this.field108) / var11;
        this.field99 = ((double) arg1 - this.field109) / var11;
        this.field113 = Math.sqrt(this.field99 * this.field99 + this.field111 * this.field111);
        if (!this.field107) {
            this.field119 = -this.field113 * Math.tan((double) this.field104 * 0.02454369D);
        }
        this.field115 = ((double) arg2 - this.field110 - this.field119 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("g.i(II)V")
    public final void method75(int arg0) {
        this.field107 = true;
        this.field108 += (double) arg0 * this.field111;
        this.field109 += (double) arg0 * this.field99;
        this.field110 += this.field115 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field119;
        this.field119 += (double) arg0 * this.field115;
        this.field116 = (int) (Math.atan2(this.field111, this.field99) * 325.949D) + 1024 & 0x7FF;
        this.field117 = (int) (Math.atan2(this.field119, this.field113) * 325.949D) & 0x7FF;
        if (this.field114 == null) {
            return;
        }
        this.field120 += arg0;
        while (true) {
            do {
                do {
                    if (this.field120 <= this.field114.field905[this.field126]) {
                        return;
                    }
                    this.field120 -= this.field114.field905[this.field126];
                    this.field126++;
                } while (this.field126 < this.field114.field896.length);
                this.field126 -= this.field114.field900;
            } while (this.field126 >= 0 && this.field126 < this.field114.field896.length);
            this.field126 = 0;
        }
    }

    @ObfuscatedName("g.o(I)Lcx;")
    public final class98 method21() {
        class39 var1 = class39.method2654(this.field98);
        class98 var2 = var1.method744(this.field126);
        if (var2 == null) {
            return null;
        } else {
            var2.method2033(this.field117);
            return var2;
        }
    }
}
