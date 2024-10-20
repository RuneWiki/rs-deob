package deob;

@ObfuscatedName("f")
public final class class7 extends class80 {

    @ObfuscatedName("f.n")
    public int field95;

    @ObfuscatedName("f.d")
    public int field108;

    @ObfuscatedName("f.z")
    public int field91;

    @ObfuscatedName("f.y")
    public int field92;

    @ObfuscatedName("f.e")
    public int field93;

    @ObfuscatedName("f.g")
    public int field89;

    @ObfuscatedName("f.f")
    public int field116;

    @ObfuscatedName("f.m")
    public int field96;

    @ObfuscatedName("f.a")
    public int field97;

    @ObfuscatedName("f.h")
    public int field98;

    @ObfuscatedName("f.l")
    public int field99;

    @ObfuscatedName("f.u")
    public boolean field107 = false;

    @ObfuscatedName("f.q")
    public double field94;

    @ObfuscatedName("f.k")
    public double field102;

    @ObfuscatedName("f.x")
    public double field103;

    @ObfuscatedName("f.r")
    public double field90;

    @ObfuscatedName("f.j")
    public double field105;

    @ObfuscatedName("f.s")
    public double field106;

    @ObfuscatedName("f.v")
    public double field100;

    @ObfuscatedName("f.c")
    public double field110;

    @ObfuscatedName("f.p")
    public int field109;

    @ObfuscatedName("f.o")
    public int field112;

    @ObfuscatedName("f.b")
    public class40 field111;

    @ObfuscatedName("f.t")
    public int field113 = 0;

    @ObfuscatedName("f.w")
    public int field104 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field95 = arg0;
        this.field108 = arg1;
        this.field91 = arg2;
        this.field92 = arg3;
        this.field93 = arg4;
        this.field116 = arg5;
        this.field96 = arg6;
        this.field97 = arg7;
        this.field98 = arg8;
        this.field99 = arg9;
        this.field89 = arg10;
        this.field107 = false;
        int var12 = class41.method116(this.field95).field955;
        if (var12 == -1) {
            this.field111 = null;
        } else {
            this.field111 = class40.method3092(var12);
        }
    }

    @ObfuscatedName("f.n(IIIII)V")
    public final void method88(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field107) {
            double var5 = (double) (arg0 - this.field91);
            double var7 = (double) (arg1 - this.field92);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field94 = (double) this.field98 * var5 / var9 + (double) this.field91;
            this.field102 = (double) this.field98 * var7 / var9 + (double) this.field92;
            this.field103 = (double) this.field93;
        }
        double var11 = (double) (this.field96 + 1 - arg3);
        this.field90 = ((double) arg0 - this.field94) / var11;
        this.field105 = ((double) arg1 - this.field102) / var11;
        this.field106 = Math.sqrt(this.field90 * this.field90 + this.field105 * this.field105);
        if (!this.field107) {
            this.field100 = -this.field106 * Math.tan((double) this.field97 * 0.02454369D);
        }
        this.field110 = ((double) arg2 - this.field103 - this.field100 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("f.z(II)V")
    public final void method85(int arg0) {
        this.field107 = true;
        this.field94 += (double) arg0 * this.field90;
        this.field102 += (double) arg0 * this.field105;
        this.field103 += this.field110 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field100;
        this.field100 += (double) arg0 * this.field110;
        this.field109 = (int) (Math.atan2(this.field90, this.field105) * 325.949D) + 1024 & 0x7FF;
        this.field112 = (int) (Math.atan2(this.field100, this.field106) * 325.949D) & 0x7FF;
        if (this.field111 == null) {
            return;
        }
        this.field104 += arg0;
        while (true) {
            do {
                do {
                    if (this.field104 <= this.field111.field934[this.field113]) {
                        return;
                    }
                    this.field104 -= this.field111.field934[this.field113];
                    this.field113++;
                } while (this.field113 < this.field111.field939.length);
                this.field113 -= this.field111.field933;
            } while (this.field113 >= 0 && this.field113 < this.field111.field939.length);
            this.field113 = 0;
        }
    }

    @ObfuscatedName("f.d(B)Lcg;")
    public final class100 method25() {
        class41 var1 = class41.method116(this.field95);
        class100 var2 = var1.method808(this.field113);
        if (var2 == null) {
            return null;
        } else {
            var2.method2081(this.field112);
            return var2;
        }
    }
}
