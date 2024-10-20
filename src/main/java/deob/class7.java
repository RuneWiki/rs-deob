package deob;

@ObfuscatedName("x")
public final class class7 extends class79 {

    @ObfuscatedName("x.l")
    public int field106;

    @ObfuscatedName("x.y")
    public int field109;

    @ObfuscatedName("x.g")
    public int field91;

    @ObfuscatedName("x.j")
    public int field92;

    @ObfuscatedName("x.w")
    public int field93;

    @ObfuscatedName("x.c")
    public int field94;

    @ObfuscatedName("x.x")
    public int field95;

    @ObfuscatedName("x.f")
    public int field104;

    @ObfuscatedName("x.t")
    public int field107;

    @ObfuscatedName("x.n")
    public int field90;

    @ObfuscatedName("x.p")
    public int field99;

    @ObfuscatedName("x.a")
    public boolean field100 = false;

    @ObfuscatedName("x.o")
    public double field101;

    @ObfuscatedName("x.b")
    public double field102;

    @ObfuscatedName("x.r")
    public double field103;

    @ObfuscatedName("x.z")
    public double field98;

    @ObfuscatedName("x.u")
    public double field105;

    @ObfuscatedName("x.s")
    public double field111;

    @ObfuscatedName("x.i")
    public double field96;

    @ObfuscatedName("x.e")
    public double field108;

    @ObfuscatedName("x.h")
    public int field97;

    @ObfuscatedName("x.k")
    public int field110;

    @ObfuscatedName("x.v")
    public class39 field89;

    @ObfuscatedName("x.m")
    public int field112 = 0;

    @ObfuscatedName("x.d")
    public int field113 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field106 = arg0;
        this.field109 = arg1;
        this.field91 = arg2;
        this.field92 = arg3;
        this.field93 = arg4;
        this.field95 = arg5;
        this.field104 = arg6;
        this.field107 = arg7;
        this.field90 = arg8;
        this.field99 = arg9;
        this.field94 = arg10;
        this.field100 = false;
        int var12 = Statics.method503(this.field106).field920;
        if (var12 == -1) {
            this.field89 = null;
        } else {
            this.field89 = class39.method821(var12);
        }
    }

    @ObfuscatedName("x.l(IIIII)V")
    public final void method98(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field100) {
            double var5 = (double) (arg0 - this.field91);
            double var7 = (double) (arg1 - this.field92);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field101 = (double) this.field90 * var5 / var9 + (double) this.field91;
            this.field102 = (double) this.field90 * var7 / var9 + (double) this.field92;
            this.field103 = (double) this.field93;
        }
        double var11 = (double) (this.field104 + 1 - arg3);
        this.field98 = ((double) arg0 - this.field101) / var11;
        this.field105 = ((double) arg1 - this.field102) / var11;
        this.field111 = Math.sqrt(this.field98 * this.field98 + this.field105 * this.field105);
        if (!this.field100) {
            this.field96 = -this.field111 * Math.tan((double) this.field107 * 0.02454369D);
        }
        this.field108 = ((double) arg2 - this.field103 - this.field96 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("x.g(II)V")
    public final void method100(int arg0) {
        this.field100 = true;
        this.field101 += (double) arg0 * this.field98;
        this.field102 += (double) arg0 * this.field105;
        this.field103 += this.field108 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field96;
        this.field96 += (double) arg0 * this.field108;
        this.field97 = (int) (Math.atan2(this.field98, this.field105) * 325.949D) + 1024 & 0x7FF;
        this.field110 = (int) (Math.atan2(this.field96, this.field111) * 325.949D) & 0x7FF;
        if (this.field89 == null) {
            return;
        }
        this.field113 += arg0;
        while (true) {
            do {
                do {
                    if (this.field113 <= this.field89.field904[this.field112]) {
                        return;
                    }
                    this.field113 -= this.field89.field904[this.field112];
                    this.field112++;
                } while (this.field112 < this.field89.field902.length);
                this.field112 -= this.field89.field906;
            } while (this.field112 >= 0 && this.field112 < this.field89.field902.length);
            this.field112 = 0;
        }
    }

    @ObfuscatedName("x.y(I)Lck;")
    public final class99 method23() {
        class40 var1 = Statics.method503(this.field106);
        class99 var2 = var1.method752(this.field112);
        if (var2 == null) {
            return null;
        } else {
            var2.method2043(this.field110);
            return var2;
        }
    }
}
