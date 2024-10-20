package deob;

@ObfuscatedName("g")
public final class class7 extends class78 {

    @ObfuscatedName("g.i")
    public int field124;

    @ObfuscatedName("g.c")
    public int field103;

    @ObfuscatedName("g.h")
    public int field119;

    @ObfuscatedName("g.v")
    public int field104;

    @ObfuscatedName("g.q")
    public int field126;

    @ObfuscatedName("g.s")
    public int field108;

    @ObfuscatedName("g.g")
    public int field106;

    @ObfuscatedName("g.u")
    public int field110;

    @ObfuscatedName("g.d")
    public int field111;

    @ObfuscatedName("g.y")
    public int field112;

    @ObfuscatedName("g.e")
    public int field125;

    @ObfuscatedName("g.l")
    public boolean field114 = false;

    @ObfuscatedName("g.o")
    public double field115;

    @ObfuscatedName("g.w")
    public double field116;

    @ObfuscatedName("g.t")
    public double field107;

    @ObfuscatedName("g.z")
    public double field113;

    @ObfuscatedName("g.b")
    public double field117;

    @ObfuscatedName("g.a")
    public double field120;

    @ObfuscatedName("g.r")
    public double field121;

    @ObfuscatedName("g.m")
    public double field122;

    @ObfuscatedName("g.f")
    public int field123;

    @ObfuscatedName("g.k")
    public int field118;

    @ObfuscatedName("g.p")
    public class38 field109;

    @ObfuscatedName("g.n")
    public int field105 = 0;

    @ObfuscatedName("g.j")
    public int field127 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field124 = arg0;
        this.field103 = arg1;
        this.field119 = arg2;
        this.field104 = arg3;
        this.field126 = arg4;
        this.field106 = arg5;
        this.field110 = arg6;
        this.field111 = arg7;
        this.field112 = arg8;
        this.field125 = arg9;
        this.field108 = arg10;
        this.field114 = false;
        int var12 = class39.method3346(this.field124).field932;
        if (var12 == -1) {
            this.field109 = null;
        } else {
            this.field109 = class38.method3551(var12);
        }
    }

    @ObfuscatedName("g.i(IIIII)V")
    public final void method84(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field114) {
            double var5 = (double) (arg0 - this.field119);
            double var7 = (double) (arg1 - this.field104);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field115 = (double) this.field112 * var5 / var9 + (double) this.field119;
            this.field116 = (double) this.field112 * var7 / var9 + (double) this.field104;
            this.field107 = (double) this.field126;
        }
        double var11 = (double) (this.field110 + 1 - arg3);
        this.field113 = ((double) arg0 - this.field115) / var11;
        this.field117 = ((double) arg1 - this.field116) / var11;
        this.field120 = Math.sqrt(this.field117 * this.field117 + this.field113 * this.field113);
        if (!this.field114) {
            this.field121 = -this.field120 * Math.tan((double) this.field111 * 0.02454369D);
        }
        this.field122 = ((double) arg2 - this.field107 - this.field121 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("g.h(IB)V")
    public final void method80(int arg0) {
        this.field114 = true;
        this.field115 += (double) arg0 * this.field113;
        this.field116 += (double) arg0 * this.field117;
        this.field107 += this.field122 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field121;
        this.field121 += (double) arg0 * this.field122;
        this.field123 = (int) (Math.atan2(this.field113, this.field117) * 325.949D) + 1024 & 0x7FF;
        this.field118 = (int) (Math.atan2(this.field121, this.field120) * 325.949D) & 0x7FF;
        if (this.field109 == null) {
            return;
        }
        this.field127 += arg0;
        while (true) {
            do {
                do {
                    if (this.field127 <= this.field109.field906[this.field105]) {
                        return;
                    }
                    this.field127 -= this.field109.field906[this.field105];
                    this.field105++;
                } while (this.field105 < this.field109.field919.length);
                this.field105 -= this.field109.field913;
            } while (this.field105 >= 0 && this.field105 < this.field109.field919.length);
            this.field105 = 0;
        }
    }

    @ObfuscatedName("g.c(B)Lcc;")
    public final class98 method16() {
        class39 var1 = class39.method3346(this.field124);
        class98 var2 = var1.method752(this.field105);
        if (var2 == null) {
            return null;
        } else {
            var2.method2015(this.field118);
            return var2;
        }
    }
}
