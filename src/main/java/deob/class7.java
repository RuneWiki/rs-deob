package deob;

@ObfuscatedName("h")
public final class class7 extends class85 {

    @ObfuscatedName("h.j")
    public int field108;

    @ObfuscatedName("h.m")
    public int field96;

    @ObfuscatedName("h.f")
    public int field111;

    @ObfuscatedName("h.l")
    public int field113;

    @ObfuscatedName("h.u")
    public int field98;

    @ObfuscatedName("h.a")
    public int field99;

    @ObfuscatedName("h.h")
    public int field100;

    @ObfuscatedName("h.i")
    public int field101;

    @ObfuscatedName("h.t")
    public int field102;

    @ObfuscatedName("h.k")
    public int field103;

    @ObfuscatedName("h.s")
    public int field104;

    @ObfuscatedName("h.w")
    public boolean field121 = false;

    @ObfuscatedName("h.e")
    public double field106;

    @ObfuscatedName("h.z")
    public double field107;

    @ObfuscatedName("h.p")
    public double field97;

    @ObfuscatedName("h.r")
    public double field109;

    @ObfuscatedName("h.g")
    public double field110;

    @ObfuscatedName("h.n")
    public double field118;

    @ObfuscatedName("h.y")
    public double field112;

    @ObfuscatedName("h.v")
    public double field114;

    @ObfuscatedName("h.q")
    public int field105;

    @ObfuscatedName("h.x")
    public int field115;

    @ObfuscatedName("h.d")
    public class43 field116;

    @ObfuscatedName("h.o")
    public int field94 = 0;

    @ObfuscatedName("h.c")
    public int field117 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field108 = arg0;
        this.field96 = arg1;
        this.field111 = arg2;
        this.field113 = arg3;
        this.field98 = arg4;
        this.field100 = arg5;
        this.field101 = arg6;
        this.field102 = arg7;
        this.field103 = arg8;
        this.field104 = arg9;
        this.field99 = arg10;
        this.field121 = false;
        int var12 = class44.method152(this.field108).field1006;
        if (var12 == -1) {
            this.field116 = null;
        } else {
            this.field116 = class43.method575(var12);
        }
    }

    @ObfuscatedName("h.j(IIIII)V")
    public final void method112(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field121) {
            double var5 = (double) (arg0 - this.field111);
            double var7 = (double) (arg1 - this.field113);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field106 = (double) this.field103 * var5 / var9 + (double) this.field111;
            this.field107 = (double) this.field103 * var7 / var9 + (double) this.field113;
            this.field97 = (double) this.field98;
        }
        double var11 = (double) (this.field101 + 1 - arg3);
        this.field109 = ((double) arg0 - this.field106) / var11;
        this.field110 = ((double) arg1 - this.field107) / var11;
        this.field118 = Math.sqrt(this.field110 * this.field110 + this.field109 * this.field109);
        if (!this.field121) {
            this.field112 = -this.field118 * Math.tan((double) this.field102 * 0.02454369D);
        }
        this.field114 = ((double) arg2 - this.field97 - this.field112 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("h.m(II)V")
    public final void method104(int arg0) {
        this.field121 = true;
        this.field106 += (double) arg0 * this.field109;
        this.field107 += (double) arg0 * this.field110;
        this.field97 += this.field114 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field112;
        this.field112 += (double) arg0 * this.field114;
        this.field105 = (int) (Math.atan2(this.field109, this.field110) * 325.949D) + 1024 & 0x7FF;
        this.field115 = (int) (Math.atan2(this.field112, this.field118) * 325.949D) & 0x7FF;
        if (this.field116 == null) {
            return;
        }
        this.field117 += arg0;
        while (true) {
            do {
                do {
                    if (this.field117 <= this.field116.field976[this.field94]) {
                        return;
                    }
                    this.field117 -= this.field116.field976[this.field94];
                    this.field94++;
                } while (this.field94 < this.field116.field974.length);
                this.field94 -= this.field116.field978;
            } while (this.field94 >= 0 && this.field94 < this.field116.field974.length);
            this.field94 = 0;
        }
    }

    @ObfuscatedName("h.f(I)Lda;")
    public final class105 method17() {
        class44 var1 = class44.method152(this.field108);
        class105 var2 = var1.method914(this.field94);
        if (var2 == null) {
            return null;
        } else {
            var2.method2188(this.field115);
            return var2;
        }
    }
}
