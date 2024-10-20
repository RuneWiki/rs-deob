package deob;

@ObfuscatedName("i")
public final class class7 extends class78 {

    @ObfuscatedName("i.g")
    public int field109;

    @ObfuscatedName("i.s")
    public int field116;

    @ObfuscatedName("i.v")
    public int field99;

    @ObfuscatedName("i.o")
    public int field100;

    @ObfuscatedName("i.k")
    public int field117;

    @ObfuscatedName("i.m")
    public int field102;

    @ObfuscatedName("i.i")
    public int field103;

    @ObfuscatedName("i.t")
    public int field121;

    @ObfuscatedName("i.l")
    public int field105;

    @ObfuscatedName("i.p")
    public int field106;

    @ObfuscatedName("i.r")
    public int field123;

    @ObfuscatedName("i.j")
    public boolean field108 = false;

    @ObfuscatedName("i.c")
    public double field104;

    @ObfuscatedName("i.q")
    public double field110;

    @ObfuscatedName("i.n")
    public double field115;

    @ObfuscatedName("i.h")
    public double field112;

    @ObfuscatedName("i.d")
    public double field113;

    @ObfuscatedName("i.b")
    public double field114;

    @ObfuscatedName("i.w")
    public double field107;

    @ObfuscatedName("i.z")
    public double field98;

    @ObfuscatedName("i.x")
    public int field111;

    @ObfuscatedName("i.e")
    public int field118;

    @ObfuscatedName("i.a")
    public class38 field119;

    @ObfuscatedName("i.y")
    public int field120 = 0;

    @ObfuscatedName("i.f")
    public int field101 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field109 = arg0;
        this.field116 = arg1;
        this.field99 = arg2;
        this.field100 = arg3;
        this.field117 = arg4;
        this.field103 = arg5;
        this.field121 = arg6;
        this.field105 = arg7;
        this.field106 = arg8;
        this.field123 = arg9;
        this.field102 = arg10;
        this.field108 = false;
        int var12 = class39.method612(this.field109).field921;
        if (var12 == -1) {
            this.field119 = null;
        } else {
            this.field119 = class38.method1935(var12);
        }
    }

    @ObfuscatedName("i.g(IIIII)V")
    public final void method67(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field108) {
            double var5 = (double) (arg0 - this.field99);
            double var7 = (double) (arg1 - this.field100);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field104 = (double) this.field106 * var5 / var9 + (double) this.field99;
            this.field110 = (double) this.field106 * var7 / var9 + (double) this.field100;
            this.field115 = (double) this.field117;
        }
        double var11 = (double) (this.field121 + 1 - arg3);
        this.field112 = ((double) arg0 - this.field104) / var11;
        this.field113 = ((double) arg1 - this.field110) / var11;
        this.field114 = Math.sqrt(this.field113 * this.field113 + this.field112 * this.field112);
        if (!this.field108) {
            this.field107 = -this.field114 * Math.tan((double) this.field105 * 0.02454369D);
        }
        this.field98 = ((double) arg2 - this.field115 - this.field107 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("i.v(IB)V")
    public final void method71(int arg0) {
        this.field108 = true;
        this.field104 += (double) arg0 * this.field112;
        this.field110 += (double) arg0 * this.field113;
        this.field115 += this.field98 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field107;
        this.field107 += (double) arg0 * this.field98;
        this.field111 = (int) (Math.atan2(this.field112, this.field113) * 325.949D) + 1024 & 0x7FF;
        this.field118 = (int) (Math.atan2(this.field107, this.field114) * 325.949D) & 0x7FF;
        if (this.field119 == null) {
            return;
        }
        this.field101 += arg0;
        while (true) {
            do {
                do {
                    if (this.field101 <= this.field119.field894[this.field120]) {
                        return;
                    }
                    this.field101 -= this.field119.field894[this.field120];
                    this.field120++;
                } while (this.field120 < this.field119.field898.length);
                this.field120 -= this.field119.field914;
            } while (this.field120 >= 0 && this.field120 < this.field119.field898.length);
            this.field120 = 0;
        }
    }

    @ObfuscatedName("i.s(I)Lcg;")
    public final class98 method17() {
        class39 var1 = class39.method612(this.field109);
        class98 var2 = var1.method745(this.field120);
        if (var2 == null) {
            return null;
        } else {
            var2.method1959(this.field118);
            return var2;
        }
    }
}
