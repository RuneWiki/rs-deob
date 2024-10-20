package deob;

@ObfuscatedName("l")
public final class class7 extends class78 {

    @ObfuscatedName("l.e")
    public int field108;

    @ObfuscatedName("l.o")
    public int field98;

    @ObfuscatedName("l.y")
    public int field101;

    @ObfuscatedName("l.b")
    public int field100;

    @ObfuscatedName("l.w")
    public int field102;

    @ObfuscatedName("l.r")
    public int field99;

    @ObfuscatedName("l.l")
    public int field103;

    @ObfuscatedName("l.s")
    public int field104;

    @ObfuscatedName("l.f")
    public int field105;

    @ObfuscatedName("l.x")
    public int field106;

    @ObfuscatedName("l.h")
    public int field107;

    @ObfuscatedName("l.a")
    public boolean field97 = false;

    @ObfuscatedName("l.u")
    public double field109;

    @ObfuscatedName("l.v")
    public double field110;

    @ObfuscatedName("l.i")
    public double field111;

    @ObfuscatedName("l.n")
    public double field112;

    @ObfuscatedName("l.d")
    public double field113;

    @ObfuscatedName("l.k")
    public double field120;

    @ObfuscatedName("l.p")
    public double field119;

    @ObfuscatedName("l.j")
    public double field116;

    @ObfuscatedName("l.z")
    public int field117;

    @ObfuscatedName("l.t")
    public int field118;

    @ObfuscatedName("l.c")
    public class38 field123;

    @ObfuscatedName("l.q")
    public int field114 = 0;

    @ObfuscatedName("l.g")
    public int field121 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field108 = arg0;
        this.field98 = arg1;
        this.field101 = arg2;
        this.field100 = arg3;
        this.field102 = arg4;
        this.field103 = arg5;
        this.field104 = arg6;
        this.field105 = arg7;
        this.field106 = arg8;
        this.field107 = arg9;
        this.field99 = arg10;
        this.field97 = false;
        int var12 = class39.method147(this.field108).field940;
        if (var12 == -1) {
            this.field123 = null;
        } else {
            this.field123 = class38.method131(var12);
        }
    }

    @ObfuscatedName("l.e(IIIIB)V")
    public final void method65(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field97) {
            double var5 = (double) (arg0 - this.field101);
            double var7 = (double) (arg1 - this.field100);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field109 = (double) this.field106 * var5 / var9 + (double) this.field101;
            this.field110 = (double) this.field106 * var7 / var9 + (double) this.field100;
            this.field111 = (double) this.field102;
        }
        double var11 = (double) (this.field104 + 1 - arg3);
        this.field112 = ((double) arg0 - this.field109) / var11;
        this.field113 = ((double) arg1 - this.field110) / var11;
        this.field120 = Math.sqrt(this.field113 * this.field113 + this.field112 * this.field112);
        if (!this.field97) {
            this.field119 = -this.field120 * Math.tan((double) this.field105 * 0.02454369D);
        }
        this.field116 = ((double) arg2 - this.field111 - this.field119 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("l.y(II)V")
    public final void method70(int arg0) {
        this.field97 = true;
        this.field109 += (double) arg0 * this.field112;
        this.field110 += (double) arg0 * this.field113;
        this.field111 += this.field116 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field119;
        this.field119 += (double) arg0 * this.field116;
        this.field117 = (int) (Math.atan2(this.field112, this.field113) * 325.949D) + 1024 & 0x7FF;
        this.field118 = (int) (Math.atan2(this.field119, this.field120) * 325.949D) & 0x7FF;
        if (this.field123 == null) {
            return;
        }
        this.field121 += arg0;
        while (true) {
            do {
                do {
                    if (this.field121 <= this.field123.field917[this.field114]) {
                        return;
                    }
                    this.field121 -= this.field123.field917[this.field114];
                    this.field114++;
                } while (this.field114 < this.field123.field923.length);
                this.field114 -= this.field123.field919;
            } while (this.field114 >= 0 && this.field114 < this.field123.field923.length);
            this.field114 = 0;
        }
    }

    @ObfuscatedName("l.o(B)Lcd;")
    public final class98 method21() {
        class39 var1 = class39.method147(this.field108);
        class98 var2 = var1.method740(this.field114);
        if (var2 == null) {
            return null;
        } else {
            var2.method1973(this.field118);
            return var2;
        }
    }
}
