package deob;

@ObfuscatedName("b")
public final class class7 extends class85 {

    @ObfuscatedName("b.l")
    public int field108;

    @ObfuscatedName("b.e")
    public int field96;

    @ObfuscatedName("b.q")
    public int field114;

    @ObfuscatedName("b.o")
    public int field98;

    @ObfuscatedName("b.g")
    public int field99;

    @ObfuscatedName("b.m")
    public int field100;

    @ObfuscatedName("b.b")
    public int field107;

    @ObfuscatedName("b.p")
    public int field95;

    @ObfuscatedName("b.t")
    public int field127;

    @ObfuscatedName("b.w")
    public int field125;

    @ObfuscatedName("b.x")
    public int field105;

    @ObfuscatedName("b.k")
    public boolean field106 = false;

    @ObfuscatedName("b.z")
    public double field101;

    @ObfuscatedName("b.v")
    public double field110;

    @ObfuscatedName("b.j")
    public double field109;

    @ObfuscatedName("b.f")
    public double field120;

    @ObfuscatedName("b.c")
    public double field111;

    @ObfuscatedName("b.s")
    public double field112;

    @ObfuscatedName("b.r")
    public double field113;

    @ObfuscatedName("b.u")
    public double field116;

    @ObfuscatedName("b.a")
    public int field115;

    @ObfuscatedName("b.h")
    public int field102;

    @ObfuscatedName("b.y")
    public class43 field117;

    @ObfuscatedName("b.d")
    public int field118 = 0;

    @ObfuscatedName("b.n")
    public int field119 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field108 = arg0;
        this.field96 = arg1;
        this.field114 = arg2;
        this.field98 = arg3;
        this.field99 = arg4;
        this.field107 = arg5;
        this.field95 = arg6;
        this.field127 = arg7;
        this.field125 = arg8;
        this.field105 = arg9;
        this.field100 = arg10;
        this.field106 = false;
        int var12 = class44.method3632(this.field108).field1004;
        if (var12 == -1) {
            this.field117 = null;
        } else {
            this.field117 = class43.method2304(var12);
        }
    }

    @ObfuscatedName("b.l(IIIII)V")
    public final void method91(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field106) {
            double var5 = (double) (arg0 - this.field114);
            double var7 = (double) (arg1 - this.field98);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field101 = (double) this.field125 * var5 / var9 + (double) this.field114;
            this.field110 = (double) this.field125 * var7 / var9 + (double) this.field98;
            this.field109 = (double) this.field99;
        }
        double var11 = (double) (this.field95 + 1 - arg3);
        this.field120 = ((double) arg0 - this.field101) / var11;
        this.field111 = ((double) arg1 - this.field110) / var11;
        this.field112 = Math.sqrt(this.field120 * this.field120 + this.field111 * this.field111);
        if (!this.field106) {
            this.field113 = -this.field112 * Math.tan((double) this.field127 * 0.02454369D);
        }
        this.field116 = ((double) arg2 - this.field109 - this.field113 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("b.e(II)V")
    public final void method96(int arg0) {
        this.field106 = true;
        this.field101 += (double) arg0 * this.field120;
        this.field110 += (double) arg0 * this.field111;
        this.field109 += this.field116 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field113;
        this.field113 += (double) arg0 * this.field116;
        this.field115 = (int) (Math.atan2(this.field120, this.field111) * 325.949D) + 1024 & 0x7FF;
        this.field102 = (int) (Math.atan2(this.field113, this.field112) * 325.949D) & 0x7FF;
        if (this.field117 == null) {
            return;
        }
        this.field119 += arg0;
        while (true) {
            do {
                do {
                    if (this.field119 <= this.field117.field984[this.field118]) {
                        return;
                    }
                    this.field119 -= this.field117.field984[this.field118];
                    this.field118++;
                } while (this.field118 < this.field117.field981.length);
                this.field118 -= this.field117.field988;
            } while (this.field118 >= 0 && this.field118 < this.field117.field981.length);
            this.field118 = 0;
        }
    }

    @ObfuscatedName("b.q(B)Ldt;")
    public final class105 method18() {
        class44 var1 = class44.method3632(this.field108);
        class105 var2 = var1.method902(this.field118);
        if (var2 == null) {
            return null;
        } else {
            var2.method2183(this.field102);
            return var2;
        }
    }
}
