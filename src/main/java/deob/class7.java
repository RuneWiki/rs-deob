package deob;

@ObfuscatedName("z")
public final class class7 extends class79 {

    @ObfuscatedName("z.p")
    public int field93;

    @ObfuscatedName("z.y")
    public int field102;

    @ObfuscatedName("z.d")
    public int field85;

    @ObfuscatedName("z.c")
    public int field96;

    @ObfuscatedName("z.r")
    public int field87;

    @ObfuscatedName("z.f")
    public int field86;

    @ObfuscatedName("z.z")
    public int field104;

    @ObfuscatedName("z.o")
    public int field90;

    @ObfuscatedName("z.k")
    public int field91;

    @ObfuscatedName("z.s")
    public int field89;

    @ObfuscatedName("z.h")
    public int field83;

    @ObfuscatedName("z.m")
    public boolean field94 = false;

    @ObfuscatedName("z.w")
    public double field95;

    @ObfuscatedName("z.q")
    public double field84;

    @ObfuscatedName("z.u")
    public double field97;

    @ObfuscatedName("z.e")
    public double field98;

    @ObfuscatedName("z.b")
    public double field109;

    @ObfuscatedName("z.g")
    public double field100;

    @ObfuscatedName("z.j")
    public double field101;

    @ObfuscatedName("z.a")
    public double field92;

    @ObfuscatedName("z.x")
    public int field103;

    @ObfuscatedName("z.n")
    public int field88;

    @ObfuscatedName("z.v")
    public class39 field105;

    @ObfuscatedName("z.l")
    public int field99 = 0;

    @ObfuscatedName("z.t")
    public int field107 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field93 = arg0;
        this.field102 = arg1;
        this.field85 = arg2;
        this.field96 = arg3;
        this.field87 = arg4;
        this.field104 = arg5;
        this.field90 = arg6;
        this.field91 = arg7;
        this.field89 = arg8;
        this.field83 = arg9;
        this.field86 = arg10;
        this.field94 = false;
        int var12 = class40.method761(this.field93).field915;
        if (var12 == -1) {
            this.field105 = null;
        } else {
            this.field105 = class39.method2920(var12);
        }
    }

    @ObfuscatedName("z.p(IIIII)V")
    public final void method85(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field94) {
            double var5 = (double) (arg0 - this.field85);
            double var7 = (double) (arg1 - this.field96);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field95 = (double) this.field89 * var5 / var9 + (double) this.field85;
            this.field84 = (double) this.field89 * var7 / var9 + (double) this.field96;
            this.field97 = (double) this.field87;
        }
        double var11 = (double) (this.field90 + 1 - arg3);
        this.field98 = ((double) arg0 - this.field95) / var11;
        this.field109 = ((double) arg1 - this.field84) / var11;
        this.field100 = Math.sqrt(this.field98 * this.field98 + this.field109 * this.field109);
        if (!this.field94) {
            this.field101 = -this.field100 * Math.tan((double) this.field91 * 0.02454369D);
        }
        this.field92 = ((double) arg2 - this.field97 - this.field101 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("z.d(IB)V")
    public final void method86(int arg0) {
        this.field94 = true;
        this.field95 += (double) arg0 * this.field98;
        this.field84 += (double) arg0 * this.field109;
        this.field97 += this.field92 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field101;
        this.field101 += (double) arg0 * this.field92;
        this.field103 = (int) (Math.atan2(this.field98, this.field109) * 325.949D) + 1024 & 0x7FF;
        this.field88 = (int) (Math.atan2(this.field101, this.field100) * 325.949D) & 0x7FF;
        if (this.field105 == null) {
            return;
        }
        this.field107 += arg0;
        while (true) {
            do {
                do {
                    if (this.field107 <= this.field105.field886[this.field99]) {
                        return;
                    }
                    this.field107 -= this.field105.field886[this.field99];
                    this.field99++;
                } while (this.field99 < this.field105.field892.length);
                this.field99 -= this.field105.field888;
            } while (this.field99 >= 0 && this.field99 < this.field105.field892.length);
            this.field99 = 0;
        }
    }

    @ObfuscatedName("z.y(I)Lcy;")
    public final class99 method13() {
        class40 var1 = class40.method761(this.field93);
        class99 var2 = var1.method774(this.field99);
        if (var2 == null) {
            return null;
        } else {
            var2.method2005(this.field88);
            return var2;
        }
    }
}
