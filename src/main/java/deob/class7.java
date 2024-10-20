package deob;

@ObfuscatedName("w")
public final class class7 extends class79 {

    @ObfuscatedName("w.g")
    public int field117;

    @ObfuscatedName("w.j")
    public int field93;

    @ObfuscatedName("w.z")
    public int field87;

    @ObfuscatedName("w.b")
    public int field88;

    @ObfuscatedName("w.k")
    public int field89;

    @ObfuscatedName("w.c")
    public int field118;

    @ObfuscatedName("w.w")
    public int field92;

    @ObfuscatedName("w.l")
    public int field101;

    @ObfuscatedName("w.n")
    public int field111;

    @ObfuscatedName("w.d")
    public int field116;

    @ObfuscatedName("w.h")
    public int field95;

    @ObfuscatedName("w.y")
    public boolean field96 = false;

    @ObfuscatedName("w.p")
    public double field90;

    @ObfuscatedName("w.i")
    public double field98;

    @ObfuscatedName("w.s")
    public double field99;

    @ObfuscatedName("w.f")
    public double field100;

    @ObfuscatedName("w.u")
    public double field94;

    @ObfuscatedName("w.v")
    public double field102;

    @ObfuscatedName("w.r")
    public double field103;

    @ObfuscatedName("w.q")
    public double field104;

    @ObfuscatedName("w.x")
    public int field105;

    @ObfuscatedName("w.t")
    public int field106;

    @ObfuscatedName("w.e")
    public class39 field107;

    @ObfuscatedName("w.m")
    public int field85 = 0;

    @ObfuscatedName("w.o")
    public int field109 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field117 = arg0;
        this.field93 = arg1;
        this.field87 = arg2;
        this.field88 = arg3;
        this.field89 = arg4;
        this.field92 = arg5;
        this.field101 = arg6;
        this.field111 = arg7;
        this.field116 = arg8;
        this.field95 = arg9;
        this.field118 = arg10;
        this.field96 = false;
        int var12 = class40.method2523(this.field117).field953;
        if (var12 == -1) {
            this.field107 = null;
        } else {
            this.field107 = class39.method2627(var12);
        }
    }

    @ObfuscatedName("w.g(IIIII)V")
    public final void method75(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field96) {
            double var5 = (double) (arg0 - this.field87);
            double var7 = (double) (arg1 - this.field88);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field90 = (double) this.field116 * var5 / var9 + (double) this.field87;
            this.field98 = (double) this.field116 * var7 / var9 + (double) this.field88;
            this.field99 = (double) this.field89;
        }
        double var11 = (double) (this.field101 + 1 - arg3);
        this.field100 = ((double) arg0 - this.field90) / var11;
        this.field94 = ((double) arg1 - this.field98) / var11;
        this.field102 = Math.sqrt(this.field94 * this.field94 + this.field100 * this.field100);
        if (!this.field96) {
            this.field103 = -this.field102 * Math.tan((double) this.field111 * 0.02454369D);
        }
        this.field104 = ((double) arg2 - this.field99 - this.field103 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("w.z(IB)V")
    public final void method79(int arg0) {
        this.field96 = true;
        this.field90 += (double) arg0 * this.field100;
        this.field98 += (double) arg0 * this.field94;
        this.field99 += this.field104 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field103;
        this.field103 += (double) arg0 * this.field104;
        this.field105 = (int) (Math.atan2(this.field100, this.field94) * 325.949D) + 1024 & 0x7FF;
        this.field106 = (int) (Math.atan2(this.field103, this.field102) * 325.949D) & 0x7FF;
        if (this.field107 == null) {
            return;
        }
        this.field109 += arg0;
        while (true) {
            do {
                do {
                    if (this.field109 <= this.field107.field918[this.field85]) {
                        return;
                    }
                    this.field109 -= this.field107.field918[this.field85];
                    this.field85++;
                } while (this.field85 < this.field107.field920.length);
                this.field85 -= this.field107.field924;
            } while (this.field85 >= 0 && this.field85 < this.field107.field920.length);
            this.field85 = 0;
        }
    }

    @ObfuscatedName("w.j(I)Lcx;")
    public final class99 method15() {
        class40 var1 = class40.method2523(this.field117);
        class99 var2 = var1.method720(this.field85);
        if (var2 == null) {
            return null;
        } else {
            var2.method1948(this.field106);
            return var2;
        }
    }
}
