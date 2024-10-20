package deob;

@ObfuscatedName("u")
public final class class7 extends class80 {

    @ObfuscatedName("u.b")
    public int field93;

    @ObfuscatedName("u.e")
    public int field105;

    @ObfuscatedName("u.a")
    public int field89;

    @ObfuscatedName("u.k")
    public int field90;

    @ObfuscatedName("u.p")
    public int field91;

    @ObfuscatedName("u.l")
    public int field103;

    @ObfuscatedName("u.u")
    public int field112;

    @ObfuscatedName("u.o")
    public int field94;

    @ObfuscatedName("u.m")
    public int field88;

    @ObfuscatedName("u.q")
    public int field96;

    @ObfuscatedName("u.v")
    public int field101;

    @ObfuscatedName("u.n")
    public boolean field98 = false;

    @ObfuscatedName("u.z")
    public double field99;

    @ObfuscatedName("u.r")
    public double field100;

    @ObfuscatedName("u.i")
    public double field87;

    @ObfuscatedName("u.s")
    public double field110;

    @ObfuscatedName("u.c")
    public double field102;

    @ObfuscatedName("u.t")
    public double field104;

    @ObfuscatedName("u.h")
    public double field97;

    @ObfuscatedName("u.w")
    public double field106;

    @ObfuscatedName("u.g")
    public int field107;

    @ObfuscatedName("u.f")
    public int field108;

    @ObfuscatedName("u.y")
    public class40 field109;

    @ObfuscatedName("u.j")
    public int field95 = 0;

    @ObfuscatedName("u.x")
    public int field111 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field93 = arg0;
        this.field105 = arg1;
        this.field89 = arg2;
        this.field90 = arg3;
        this.field91 = arg4;
        this.field112 = arg5;
        this.field94 = arg6;
        this.field88 = arg7;
        this.field96 = arg8;
        this.field101 = arg9;
        this.field103 = arg10;
        this.field98 = false;
        int var12 = class41.method174(this.field93).field940;
        if (var12 == -1) {
            this.field109 = null;
        } else {
            this.field109 = class40.method512(var12);
        }
    }

    @ObfuscatedName("u.b(IIIII)V")
    public final void method92(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field98) {
            double var5 = (double) (arg0 - this.field89);
            double var7 = (double) (arg1 - this.field90);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field99 = (double) this.field96 * var5 / var9 + (double) this.field89;
            this.field100 = (double) this.field96 * var7 / var9 + (double) this.field90;
            this.field87 = (double) this.field91;
        }
        double var11 = (double) (this.field94 + 1 - arg3);
        this.field110 = ((double) arg0 - this.field99) / var11;
        this.field102 = ((double) arg1 - this.field100) / var11;
        this.field104 = Math.sqrt(this.field110 * this.field110 + this.field102 * this.field102);
        if (!this.field98) {
            this.field97 = -this.field104 * Math.tan((double) this.field88 * 0.02454369D);
        }
        this.field106 = ((double) arg2 - this.field87 - this.field97 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("u.a(II)V")
    public final void method96(int arg0) {
        this.field98 = true;
        this.field99 += (double) arg0 * this.field110;
        this.field100 += (double) arg0 * this.field102;
        this.field87 += this.field106 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field97;
        this.field97 += (double) arg0 * this.field106;
        this.field107 = (int) (Math.atan2(this.field110, this.field102) * 325.949D) + 1024 & 0x7FF;
        this.field108 = (int) (Math.atan2(this.field97, this.field104) * 325.949D) & 0x7FF;
        if (this.field109 == null) {
            return;
        }
        this.field111 += arg0;
        while (true) {
            do {
                do {
                    if (this.field111 <= this.field109.field925[this.field95]) {
                        return;
                    }
                    this.field111 -= this.field109.field925[this.field95];
                    this.field95++;
                } while (this.field95 < this.field109.field928.length);
                this.field95 -= this.field109.field922;
            } while (this.field95 >= 0 && this.field95 < this.field109.field928.length);
            this.field95 = 0;
        }
    }

    @ObfuscatedName("u.e(I)Lcx;")
    public final class100 method16() {
        class41 var1 = class41.method174(this.field93);
        class100 var2 = var1.method764(this.field95);
        if (var2 == null) {
            return null;
        } else {
            var2.method1983(this.field108);
            return var2;
        }
    }
}
