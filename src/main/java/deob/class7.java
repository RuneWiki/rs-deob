package deob;

@ObfuscatedName("k")
public final class class7 extends class78 {

    @ObfuscatedName("k.j")
    public int field114;

    @ObfuscatedName("k.z")
    public int field96;

    @ObfuscatedName("k.y")
    public int field97;

    @ObfuscatedName("k.h")
    public int field98;

    @ObfuscatedName("k.r")
    public int field116;

    @ObfuscatedName("k.e")
    public int field100;

    @ObfuscatedName("k.k")
    public int field115;

    @ObfuscatedName("k.b")
    public int field105;

    @ObfuscatedName("k.n")
    public int field103;

    @ObfuscatedName("k.a")
    public int field104;

    @ObfuscatedName("k.q")
    public int field113;

    @ObfuscatedName("k.i")
    public boolean field106 = false;

    @ObfuscatedName("k.f")
    public double field111;

    @ObfuscatedName("k.o")
    public double field108;

    @ObfuscatedName("k.t")
    public double field109;

    @ObfuscatedName("k.c")
    public double field110;

    @ObfuscatedName("k.d")
    public double field120;

    @ObfuscatedName("k.g")
    public double field101;

    @ObfuscatedName("k.s")
    public double field99;

    @ObfuscatedName("k.m")
    public double field102;

    @ObfuscatedName("k.v")
    public int field112;

    @ObfuscatedName("k.u")
    public int field121;

    @ObfuscatedName("k.p")
    public class38 field117;

    @ObfuscatedName("k.l")
    public int field118 = 0;

    @ObfuscatedName("k.w")
    public int field119 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field114 = arg0;
        this.field96 = arg1;
        this.field97 = arg2;
        this.field98 = arg3;
        this.field116 = arg4;
        this.field115 = arg5;
        this.field105 = arg6;
        this.field103 = arg7;
        this.field104 = arg8;
        this.field113 = arg9;
        this.field100 = arg10;
        this.field106 = false;
        int var12 = class39.method3319(this.field114).field929;
        if (var12 == -1) {
            this.field117 = null;
        } else {
            this.field117 = class38.method38(var12);
        }
    }

    @ObfuscatedName("k.j(IIIIB)V")
    public final void method92(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field106) {
            double var5 = (double) (arg0 - this.field97);
            double var7 = (double) (arg1 - this.field98);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field111 = (double) this.field104 * var5 / var9 + (double) this.field97;
            this.field108 = (double) this.field104 * var7 / var9 + (double) this.field98;
            this.field109 = (double) this.field116;
        }
        double var11 = (double) (this.field105 + 1 - arg3);
        this.field110 = ((double) arg0 - this.field111) / var11;
        this.field120 = ((double) arg1 - this.field108) / var11;
        this.field101 = Math.sqrt(this.field120 * this.field120 + this.field110 * this.field110);
        if (!this.field106) {
            this.field99 = -this.field101 * Math.tan((double) this.field103 * 0.02454369D);
        }
        this.field102 = ((double) arg2 - this.field109 - this.field99 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("k.y(II)V")
    public final void method84(int arg0) {
        this.field106 = true;
        this.field111 += (double) arg0 * this.field110;
        this.field108 += (double) arg0 * this.field120;
        this.field109 += this.field102 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field99;
        this.field99 += (double) arg0 * this.field102;
        this.field112 = (int) (Math.atan2(this.field110, this.field120) * 325.949D) + 1024 & 0x7FF;
        this.field121 = (int) (Math.atan2(this.field99, this.field101) * 325.949D) & 0x7FF;
        if (this.field117 == null) {
            return;
        }
        this.field119 += arg0;
        while (true) {
            do {
                do {
                    if (this.field119 <= this.field117.field907[this.field118]) {
                        return;
                    }
                    this.field119 -= this.field117.field907[this.field118];
                    this.field118++;
                } while (this.field118 < this.field117.field908.length);
                this.field118 -= this.field117.field909;
            } while (this.field118 >= 0 && this.field118 < this.field117.field908.length);
            this.field118 = 0;
        }
    }

    @ObfuscatedName("k.z(I)Lcl;")
    public final class98 method15() {
        class39 var1 = class39.method3319(this.field114);
        class98 var2 = var1.method714(this.field118);
        if (var2 == null) {
            return null;
        } else {
            var2.method1996(this.field121);
            return var2;
        }
    }
}
