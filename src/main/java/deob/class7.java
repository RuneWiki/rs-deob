package deob;

@ObfuscatedName("i")
public final class class7 extends class85 {

    @ObfuscatedName("i.c")
    public int field118;

    @ObfuscatedName("i.h")
    public int field116;

    @ObfuscatedName("i.k")
    public int field97;

    @ObfuscatedName("i.t")
    public int field121;

    @ObfuscatedName("i.g")
    public int field114;

    @ObfuscatedName("i.o")
    public int field100;

    @ObfuscatedName("i.i")
    public int field101;

    @ObfuscatedName("i.w")
    public int field105;

    @ObfuscatedName("i.m")
    public int field103;

    @ObfuscatedName("i.r")
    public int field104;

    @ObfuscatedName("i.y")
    public int field98;

    @ObfuscatedName("i.q")
    public boolean field106 = false;

    @ObfuscatedName("i.f")
    public double field107;

    @ObfuscatedName("i.x")
    public double field109;

    @ObfuscatedName("i.d")
    public double field96;

    @ObfuscatedName("i.e")
    public double field110;

    @ObfuscatedName("i.l")
    public double field111;

    @ObfuscatedName("i.u")
    public double field112;

    @ObfuscatedName("i.a")
    public double field113;

    @ObfuscatedName("i.b")
    public double field108;

    @ObfuscatedName("i.s")
    public int field115;

    @ObfuscatedName("i.v")
    public int field99;

    @ObfuscatedName("i.j")
    public class43 field117;

    @ObfuscatedName("i.z")
    public int field102 = 0;

    @ObfuscatedName("i.n")
    public int field119 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field118 = arg0;
        this.field116 = arg1;
        this.field97 = arg2;
        this.field121 = arg3;
        this.field114 = arg4;
        this.field101 = arg5;
        this.field105 = arg6;
        this.field103 = arg7;
        this.field104 = arg8;
        this.field98 = arg9;
        this.field100 = arg10;
        this.field106 = false;
        int var12 = class44.method1037(this.field118).field1016;
        if (var12 == -1) {
            this.field117 = null;
        } else {
            this.field117 = class43.method2648(var12);
        }
    }

    @ObfuscatedName("i.c(IIIII)V")
    public final void method94(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field106) {
            double var5 = (double) (arg0 - this.field97);
            double var7 = (double) (arg1 - this.field121);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field107 = (double) this.field104 * var5 / var9 + (double) this.field97;
            this.field109 = (double) this.field104 * var7 / var9 + (double) this.field121;
            this.field96 = (double) this.field114;
        }
        double var11 = (double) (this.field105 + 1 - arg3);
        this.field110 = ((double) arg0 - this.field107) / var11;
        this.field111 = ((double) arg1 - this.field109) / var11;
        this.field112 = Math.sqrt(this.field111 * this.field111 + this.field110 * this.field110);
        if (!this.field106) {
            this.field113 = -this.field112 * Math.tan((double) this.field103 * 0.02454369D);
        }
        this.field108 = ((double) arg2 - this.field96 - this.field113 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("i.h(II)V")
    public final void method93(int arg0) {
        this.field106 = true;
        this.field107 += (double) arg0 * this.field110;
        this.field109 += (double) arg0 * this.field111;
        this.field96 += this.field108 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field113;
        this.field113 += (double) arg0 * this.field108;
        this.field115 = (int) (Math.atan2(this.field110, this.field111) * 325.949D) + 1024 & 0x7FF;
        this.field99 = (int) (Math.atan2(this.field113, this.field112) * 325.949D) & 0x7FF;
        if (this.field117 == null) {
            return;
        }
        this.field119 += arg0;
        while (true) {
            do {
                do {
                    if (this.field119 <= this.field117.field991[this.field102]) {
                        return;
                    }
                    this.field119 -= this.field117.field991[this.field102];
                    this.field102++;
                } while (this.field102 < this.field117.field987.length);
                this.field102 -= this.field117.field993;
            } while (this.field102 >= 0 && this.field102 < this.field117.field987.length);
            this.field102 = 0;
        }
    }

    @ObfuscatedName("i.k(B)Ldt;")
    public final class105 method13() {
        class44 var1 = class44.method1037(this.field118);
        class105 var2 = var1.method876(this.field102);
        if (var2 == null) {
            return null;
        } else {
            var2.method2098(this.field99);
            return var2;
        }
    }
}
