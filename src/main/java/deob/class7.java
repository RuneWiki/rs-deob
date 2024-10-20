package deob;

@ObfuscatedName("n")
public final class class7 extends class89 {

    @ObfuscatedName("n.a")
    public int field110;

    @ObfuscatedName("n.d")
    public int field96;

    @ObfuscatedName("n.v")
    public int field97;

    @ObfuscatedName("n.r")
    public int field120;

    @ObfuscatedName("n.z")
    public int field121;

    @ObfuscatedName("n.t")
    public int field103;

    @ObfuscatedName("n.n")
    public int field101;

    @ObfuscatedName("n.i")
    public int field99;

    @ObfuscatedName("n.g")
    public int field115;

    @ObfuscatedName("n.m")
    public int field104;

    @ObfuscatedName("n.k")
    public int field105;

    @ObfuscatedName("n.x")
    public boolean field106 = false;

    @ObfuscatedName("n.u")
    public double field107;

    @ObfuscatedName("n.j")
    public double field108;

    @ObfuscatedName("n.q")
    public double field95;

    @ObfuscatedName("n.w")
    public double field98;

    @ObfuscatedName("n.b")
    public double field109;

    @ObfuscatedName("n.p")
    public double field112;

    @ObfuscatedName("n.o")
    public double field113;

    @ObfuscatedName("n.y")
    public double field114;

    @ObfuscatedName("n.s")
    public int field111;

    @ObfuscatedName("n.e")
    public int field100;

    @ObfuscatedName("n.h")
    public class45 field117;

    @ObfuscatedName("n.l")
    public int field118 = 0;

    @ObfuscatedName("n.c")
    public int field119 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field110 = arg0;
        this.field96 = arg1;
        this.field97 = arg2;
        this.field120 = arg3;
        this.field121 = arg4;
        this.field101 = arg5;
        this.field99 = arg6;
        this.field115 = arg7;
        this.field104 = arg8;
        this.field105 = arg9;
        this.field103 = arg10;
        this.field106 = false;
        int var12 = class46.method1007(this.field110).field1035;
        if (var12 == -1) {
            this.field117 = null;
        } else {
            this.field117 = class45.method185(var12);
        }
    }

    @ObfuscatedName("n.a(IIIII)V")
    public final void method90(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field106) {
            double var5 = (double) (arg0 - this.field97);
            double var7 = (double) (arg1 - this.field120);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field107 = (double) this.field104 * var5 / var9 + (double) this.field97;
            this.field108 = (double) this.field104 * var7 / var9 + (double) this.field120;
            this.field95 = (double) this.field121;
        }
        double var11 = (double) (this.field99 + 1 - arg3);
        this.field98 = ((double) arg0 - this.field107) / var11;
        this.field109 = ((double) arg1 - this.field108) / var11;
        this.field112 = Math.sqrt(this.field98 * this.field98 + this.field109 * this.field109);
        if (!this.field106) {
            this.field113 = -this.field112 * Math.tan((double) this.field115 * 0.02454369D);
        }
        this.field114 = ((double) arg2 - this.field95 - this.field113 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("n.d(II)V")
    public final void method91(int arg0) {
        this.field106 = true;
        this.field107 += (double) arg0 * this.field98;
        this.field108 += (double) arg0 * this.field109;
        this.field95 += this.field114 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field113;
        this.field113 += (double) arg0 * this.field114;
        this.field111 = (int) (Math.atan2(this.field98, this.field109) * 325.949D) + 1024 & 0x7FF;
        this.field100 = (int) (Math.atan2(this.field113, this.field112) * 325.949D) & 0x7FF;
        if (this.field117 == null) {
            return;
        }
        this.field119 += arg0;
        while (true) {
            do {
                do {
                    if (this.field119 <= this.field117.field1016[this.field118]) {
                        return;
                    }
                    this.field119 -= this.field117.field1016[this.field118];
                    this.field118++;
                } while (this.field118 < this.field117.field1010.length);
                this.field118 -= this.field117.field1015;
            } while (this.field118 >= 0 && this.field118 < this.field117.field1010.length);
            this.field118 = 0;
        }
    }

    @ObfuscatedName("n.v(I)Ldp;")
    public final class109 method40() {
        class46 var1 = class46.method1007(this.field110);
        class109 var2 = var1.method918(this.field118);
        if (var2 == null) {
            return null;
        } else {
            var2.method2208(this.field100);
            return var2;
        }
    }
}
