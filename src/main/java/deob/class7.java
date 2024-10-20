package deob;

@ObfuscatedName("i")
public final class class7 extends class80 {

    @ObfuscatedName("i.e")
    public int field107;

    @ObfuscatedName("i.a")
    public int field90;

    @ObfuscatedName("i.l")
    public int field91;

    @ObfuscatedName("i.c")
    public int field92;

    @ObfuscatedName("i.u")
    public int field99;

    @ObfuscatedName("i.w")
    public int field94;

    @ObfuscatedName("i.i")
    public int field116;

    @ObfuscatedName("i.r")
    public int field96;

    @ObfuscatedName("i.f")
    public int field97;

    @ObfuscatedName("i.g")
    public int field98;

    @ObfuscatedName("i.o")
    public int field108;

    @ObfuscatedName("i.h")
    public boolean field89 = false;

    @ObfuscatedName("i.s")
    public double field101;

    @ObfuscatedName("i.j")
    public double field102;

    @ObfuscatedName("i.m")
    public double field103;

    @ObfuscatedName("i.t")
    public double field95;

    @ObfuscatedName("i.z")
    public double field111;

    @ObfuscatedName("i.y")
    public double field106;

    @ObfuscatedName("i.q")
    public double field114;

    @ObfuscatedName("i.d")
    public double field105;

    @ObfuscatedName("i.b")
    public int field109;

    @ObfuscatedName("i.x")
    public int field110;

    @ObfuscatedName("i.n")
    public class40 field104;

    @ObfuscatedName("i.v")
    public int field112 = 0;

    @ObfuscatedName("i.p")
    public int field113 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field107 = arg0;
        this.field90 = arg1;
        this.field91 = arg2;
        this.field92 = arg3;
        this.field99 = arg4;
        this.field116 = arg5;
        this.field96 = arg6;
        this.field97 = arg7;
        this.field98 = arg8;
        this.field108 = arg9;
        this.field94 = arg10;
        this.field89 = false;
        int var12 = class41.method2784(this.field107).field932;
        if (var12 == -1) {
            this.field104 = null;
        } else {
            this.field104 = class40.method1826(var12);
        }
    }

    @ObfuscatedName("i.e(IIIII)V")
    public final void method99(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field89) {
            double var5 = (double) (arg0 - this.field91);
            double var7 = (double) (arg1 - this.field92);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field101 = (double) this.field98 * var5 / var9 + (double) this.field91;
            this.field102 = (double) this.field98 * var7 / var9 + (double) this.field92;
            this.field103 = (double) this.field99;
        }
        double var11 = (double) (this.field96 + 1 - arg3);
        this.field95 = ((double) arg0 - this.field101) / var11;
        this.field111 = ((double) arg1 - this.field102) / var11;
        this.field106 = Math.sqrt(this.field95 * this.field95 + this.field111 * this.field111);
        if (!this.field89) {
            this.field114 = -this.field106 * Math.tan((double) this.field97 * 0.02454369D);
        }
        this.field105 = ((double) arg2 - this.field103 - this.field114 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("i.l(IB)V")
    public final void method102(int arg0) {
        this.field89 = true;
        this.field101 += (double) arg0 * this.field95;
        this.field102 += (double) arg0 * this.field111;
        this.field103 += this.field105 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field114;
        this.field114 += (double) arg0 * this.field105;
        this.field109 = (int) (Math.atan2(this.field95, this.field111) * 325.949D) + 1024 & 0x7FF;
        this.field110 = (int) (Math.atan2(this.field114, this.field106) * 325.949D) & 0x7FF;
        if (this.field104 == null) {
            return;
        }
        this.field113 += arg0;
        while (true) {
            do {
                do {
                    if (this.field113 <= this.field104.field894[this.field112]) {
                        return;
                    }
                    this.field113 -= this.field104.field894[this.field112];
                    this.field112++;
                } while (this.field112 < this.field104.field898.length);
                this.field112 -= this.field104.field902;
            } while (this.field112 >= 0 && this.field112 < this.field104.field898.length);
            this.field112 = 0;
        }
    }

    @ObfuscatedName("i.a(I)Lcy;")
    public final class100 method30() {
        class41 var1 = class41.method2784(this.field107);
        class100 var2 = var1.method776(this.field112);
        if (var2 == null) {
            return null;
        } else {
            var2.method2029(this.field110);
            return var2;
        }
    }
}
