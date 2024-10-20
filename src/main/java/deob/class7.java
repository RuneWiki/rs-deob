package deob;

@ObfuscatedName("v")
public final class class7 extends class78 {

    @ObfuscatedName("v.t")
    public int field116;

    @ObfuscatedName("v.s")
    public int field96;

    @ObfuscatedName("v.f")
    public int field115;

    @ObfuscatedName("v.e")
    public int field98;

    @ObfuscatedName("v.d")
    public int field113;

    @ObfuscatedName("v.n")
    public int field100;

    @ObfuscatedName("v.v")
    public int field101;

    @ObfuscatedName("v.z")
    public int field102;

    @ObfuscatedName("v.j")
    public int field103;

    @ObfuscatedName("v.u")
    public int field104;

    @ObfuscatedName("v.g")
    public int field119;

    @ObfuscatedName("v.a")
    public boolean field106 = false;

    @ObfuscatedName("v.c")
    public double field107;

    @ObfuscatedName("v.w")
    public double field108;

    @ObfuscatedName("v.l")
    public double field95;

    @ObfuscatedName("v.q")
    public double field110;

    @ObfuscatedName("v.x")
    public double field111;

    @ObfuscatedName("v.p")
    public double field112;

    @ObfuscatedName("v.y")
    public double field99;

    @ObfuscatedName("v.r")
    public double field114;

    @ObfuscatedName("v.k")
    public int field117;

    @ObfuscatedName("v.b")
    public int field97;

    @ObfuscatedName("v.h")
    public class38 field109;

    @ObfuscatedName("v.i")
    public int field118 = 0;

    @ObfuscatedName("v.o")
    public int field121 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field116 = arg0;
        this.field96 = arg1;
        this.field115 = arg2;
        this.field98 = arg3;
        this.field113 = arg4;
        this.field101 = arg5;
        this.field102 = arg6;
        this.field103 = arg7;
        this.field104 = arg8;
        this.field119 = arg9;
        this.field100 = arg10;
        this.field106 = false;
        int var12 = class39.method123(this.field116).field916;
        if (var12 == -1) {
            this.field109 = null;
        } else {
            this.field109 = Statics.method448(var12);
        }
    }

    @ObfuscatedName("v.t(IIIIB)V")
    public final void method86(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field106) {
            double var5 = (double) (arg0 - this.field115);
            double var7 = (double) (arg1 - this.field98);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field107 = (double) this.field104 * var5 / var9 + (double) this.field115;
            this.field108 = (double) this.field104 * var7 / var9 + (double) this.field98;
            this.field95 = (double) this.field113;
        }
        double var11 = (double) (this.field102 + 1 - arg3);
        this.field110 = ((double) arg0 - this.field107) / var11;
        this.field111 = ((double) arg1 - this.field108) / var11;
        this.field112 = Math.sqrt(this.field111 * this.field111 + this.field110 * this.field110);
        if (!this.field106) {
            this.field99 = -this.field112 * Math.tan((double) this.field103 * 0.02454369D);
        }
        this.field114 = ((double) arg2 - this.field95 - this.field99 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("v.f(II)V")
    public final void method87(int arg0) {
        this.field106 = true;
        this.field107 += (double) arg0 * this.field110;
        this.field108 += (double) arg0 * this.field111;
        this.field95 += this.field114 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field99;
        this.field99 += (double) arg0 * this.field114;
        this.field117 = (int) (Math.atan2(this.field110, this.field111) * 325.949D) + 1024 & 0x7FF;
        this.field97 = (int) (Math.atan2(this.field99, this.field112) * 325.949D) & 0x7FF;
        if (this.field109 == null) {
            return;
        }
        this.field121 += arg0;
        while (true) {
            do {
                do {
                    if (this.field121 <= this.field109.field896[this.field118]) {
                        return;
                    }
                    this.field121 -= this.field109.field896[this.field118];
                    this.field118++;
                } while (this.field118 < this.field109.field894.length);
                this.field118 -= this.field109.field898;
            } while (this.field118 >= 0 && this.field118 < this.field109.field894.length);
            this.field118 = 0;
        }
    }

    @ObfuscatedName("v.s(I)Lcc;")
    public final class98 method17() {
        class39 var1 = class39.method123(this.field116);
        class98 var2 = var1.method717(this.field118);
        if (var2 == null) {
            return null;
        } else {
            var2.method1983(this.field97);
            return var2;
        }
    }
}
