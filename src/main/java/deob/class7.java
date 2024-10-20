package deob;

@ObfuscatedName("m")
public final class class7 extends class89 {

    @ObfuscatedName("m.f")
    public int field127;

    @ObfuscatedName("m.e")
    public int field101;

    @ObfuscatedName("m.n")
    public int field102;

    @ObfuscatedName("m.t")
    public int field103;

    @ObfuscatedName("m.v")
    public int field104;

    @ObfuscatedName("m.b")
    public int field105;

    @ObfuscatedName("m.m")
    public int field106;

    @ObfuscatedName("m.k")
    public int field107;

    @ObfuscatedName("m.c")
    public int field128;

    @ObfuscatedName("m.w")
    public int field110;

    @ObfuscatedName("m.l")
    public int field121;

    @ObfuscatedName("m.h")
    public boolean field109 = false;

    @ObfuscatedName("m.i")
    public double field112;

    @ObfuscatedName("m.u")
    public double field113;

    @ObfuscatedName("m.x")
    public double field114;

    @ObfuscatedName("m.d")
    public double field115;

    @ObfuscatedName("m.o")
    public double field116;

    @ObfuscatedName("m.j")
    public double field117;

    @ObfuscatedName("m.q")
    public double field118;

    @ObfuscatedName("m.r")
    public double field119;

    @ObfuscatedName("m.a")
    public int field120;

    @ObfuscatedName("m.z")
    public int field100;

    @ObfuscatedName("m.p")
    public class45 field111;

    @ObfuscatedName("m.y")
    public int field123 = 0;

    @ObfuscatedName("m.s")
    public int field124 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field127 = arg0;
        this.field101 = arg1;
        this.field102 = arg2;
        this.field103 = arg3;
        this.field104 = arg4;
        this.field106 = arg5;
        this.field107 = arg6;
        this.field128 = arg7;
        this.field110 = arg8;
        this.field121 = arg9;
        this.field105 = arg10;
        this.field109 = false;
        int var12 = class46.method2917(this.field127).field1024;
        if (var12 == -1) {
            this.field111 = null;
        } else {
            this.field111 = class45.method1289(var12);
        }
    }

    @ObfuscatedName("m.f(IIIIS)V")
    public final void method83(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field109) {
            double var5 = (double) (arg0 - this.field102);
            double var7 = (double) (arg1 - this.field103);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field112 = (double) this.field110 * var5 / var9 + (double) this.field102;
            this.field113 = (double) this.field110 * var7 / var9 + (double) this.field103;
            this.field114 = (double) this.field104;
        }
        double var11 = (double) (this.field107 + 1 - arg3);
        this.field115 = ((double) arg0 - this.field112) / var11;
        this.field116 = ((double) arg1 - this.field113) / var11;
        this.field117 = Math.sqrt(this.field116 * this.field116 + this.field115 * this.field115);
        if (!this.field109) {
            this.field118 = -this.field117 * Math.tan((double) this.field128 * 0.02454369D);
        }
        this.field119 = ((double) arg2 - this.field114 - this.field118 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("m.e(IB)V")
    public final void method86(int arg0) {
        this.field109 = true;
        this.field112 += (double) arg0 * this.field115;
        this.field113 += (double) arg0 * this.field116;
        this.field114 += this.field119 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field118;
        this.field118 += (double) arg0 * this.field119;
        this.field120 = (int) (Math.atan2(this.field115, this.field116) * 325.949D) + 1024 & 0x7FF;
        this.field100 = (int) (Math.atan2(this.field118, this.field117) * 325.949D) & 0x7FF;
        if (this.field111 == null) {
            return;
        }
        this.field124 += arg0;
        while (true) {
            do {
                do {
                    if (this.field124 <= this.field111.field995[this.field123]) {
                        return;
                    }
                    this.field124 -= this.field111.field995[this.field123];
                    this.field123++;
                } while (this.field123 < this.field111.field993.length);
                this.field123 -= this.field111.field997;
            } while (this.field123 >= 0 && this.field123 < this.field111.field993.length);
            this.field123 = 0;
        }
    }

    @ObfuscatedName("m.n(B)Ldg;")
    public final class109 method36() {
        class46 var1 = class46.method2917(this.field127);
        class109 var2 = var1.method901(this.field123);
        if (var2 == null) {
            return null;
        } else {
            var2.method2214(this.field100);
            return var2;
        }
    }
}
