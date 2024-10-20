package deob;

@ObfuscatedName("l")
public final class class7 extends class80 {

    @ObfuscatedName("l.q")
    public int field99;

    @ObfuscatedName("l.s")
    public int field124;

    @ObfuscatedName("l.h")
    public int field96;

    @ObfuscatedName("l.e")
    public int field114;

    @ObfuscatedName("l.n")
    public int field95;

    @ObfuscatedName("l.t")
    public int field121;

    @ObfuscatedName("l.l")
    public int field104;

    @ObfuscatedName("l.m")
    public int field98;

    @ObfuscatedName("l.o")
    public int field102;

    @ObfuscatedName("l.k")
    public int field100;

    @ObfuscatedName("l.p")
    public int field101;

    @ObfuscatedName("l.u")
    public boolean field105 = false;

    @ObfuscatedName("l.g")
    public double field106;

    @ObfuscatedName("l.a")
    public double field107;

    @ObfuscatedName("l.y")
    public double field97;

    @ObfuscatedName("l.d")
    public double field109;

    @ObfuscatedName("l.b")
    public double field110;

    @ObfuscatedName("l.j")
    public double field103;

    @ObfuscatedName("l.f")
    public double field112;

    @ObfuscatedName("l.w")
    public double field113;

    @ObfuscatedName("l.z")
    public int field116;

    @ObfuscatedName("l.x")
    public int field115;

    @ObfuscatedName("l.v")
    public class40 field94;

    @ObfuscatedName("l.i")
    public int field117 = 0;

    @ObfuscatedName("l.c")
    public int field118 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field99 = arg0;
        this.field124 = arg1;
        this.field96 = arg2;
        this.field114 = arg3;
        this.field95 = arg4;
        this.field104 = arg5;
        this.field98 = arg6;
        this.field102 = arg7;
        this.field100 = arg8;
        this.field101 = arg9;
        this.field121 = arg10;
        this.field105 = false;
        int var12 = class41.method535(this.field99).field950;
        if (var12 == -1) {
            this.field94 = null;
        } else {
            this.field94 = class40.method575(var12);
        }
    }

    @ObfuscatedName("l.q(IIIII)V")
    public final void method84(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field105) {
            double var5 = (double) (arg0 - this.field96);
            double var7 = (double) (arg1 - this.field114);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field106 = (double) this.field100 * var5 / var9 + (double) this.field96;
            this.field107 = (double) this.field100 * var7 / var9 + (double) this.field114;
            this.field97 = (double) this.field95;
        }
        double var11 = (double) (this.field98 + 1 - arg3);
        this.field109 = ((double) arg0 - this.field106) / var11;
        this.field110 = ((double) arg1 - this.field107) / var11;
        this.field103 = Math.sqrt(this.field110 * this.field110 + this.field109 * this.field109);
        if (!this.field105) {
            this.field112 = -this.field103 * Math.tan((double) this.field102 * 0.02454369D);
        }
        this.field113 = ((double) arg2 - this.field97 - this.field112 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("l.h(II)V")
    public final void method81(int arg0) {
        this.field105 = true;
        this.field106 += (double) arg0 * this.field109;
        this.field107 += (double) arg0 * this.field110;
        this.field97 += this.field113 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field112;
        this.field112 += (double) arg0 * this.field113;
        this.field116 = (int) (Math.atan2(this.field109, this.field110) * 325.949D) + 1024 & 0x7FF;
        this.field115 = (int) (Math.atan2(this.field112, this.field103) * 325.949D) & 0x7FF;
        if (this.field94 == null) {
            return;
        }
        this.field118 += arg0;
        while (true) {
            do {
                do {
                    if (this.field118 <= this.field94.field917[this.field117]) {
                        return;
                    }
                    this.field118 -= this.field94.field917[this.field117];
                    this.field117++;
                } while (this.field117 < this.field94.field915.length);
                this.field117 -= this.field94.field919;
            } while (this.field117 >= 0 && this.field117 < this.field94.field915.length);
            this.field117 = 0;
        }
    }

    @ObfuscatedName("l.s(B)Lch;")
    public final class100 method14() {
        class41 var1 = class41.method535(this.field99);
        class100 var2 = var1.method755(this.field117);
        if (var2 == null) {
            return null;
        } else {
            var2.method2004(this.field115);
            return var2;
        }
    }
}
