package deob;

@ObfuscatedName("n")
public final class class7 extends class86 {

    @ObfuscatedName("n.f")
    public int field133;

    @ObfuscatedName("n.u")
    public int field109;

    @ObfuscatedName("n.x")
    public int field110;

    @ObfuscatedName("n.b")
    public int field111;

    @ObfuscatedName("n.l")
    public int field127;

    @ObfuscatedName("n.d")
    public int field113;

    @ObfuscatedName("n.n")
    public int field114;

    @ObfuscatedName("n.m")
    public int field115;

    @ObfuscatedName("n.g")
    public int field116;

    @ObfuscatedName("n.s")
    public int field130;

    @ObfuscatedName("n.r")
    public int field118;

    @ObfuscatedName("n.k")
    public boolean field119 = false;

    @ObfuscatedName("n.o")
    public double field120;

    @ObfuscatedName("n.q")
    public double field121;

    @ObfuscatedName("n.p")
    public double field122;

    @ObfuscatedName("n.h")
    public double field123;

    @ObfuscatedName("n.e")
    public double field124;

    @ObfuscatedName("n.t")
    public double field117;

    @ObfuscatedName("n.w")
    public double field125;

    @ObfuscatedName("n.v")
    public double field132;

    @ObfuscatedName("n.y")
    public int field128;

    @ObfuscatedName("n.c")
    public int field112;

    @ObfuscatedName("n.i")
    public class43 field108;

    @ObfuscatedName("n.a")
    public int field131 = 0;

    @ObfuscatedName("n.z")
    public int field126 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field133 = arg0;
        this.field109 = arg1;
        this.field110 = arg2;
        this.field111 = arg3;
        this.field127 = arg4;
        this.field114 = arg5;
        this.field115 = arg6;
        this.field116 = arg7;
        this.field130 = arg8;
        this.field118 = arg9;
        this.field113 = arg10;
        this.field119 = false;
        int var12 = class44.method13(this.field133).field1021;
        if (var12 == -1) {
            this.field108 = null;
        } else {
            this.field108 = class43.method745(var12);
        }
    }

    @ObfuscatedName("n.f(IIIII)V")
    public final void method96(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field119) {
            double var5 = (double) (arg0 - this.field110);
            double var7 = (double) (arg1 - this.field111);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field120 = (double) this.field130 * var5 / var9 + (double) this.field110;
            this.field121 = (double) this.field130 * var7 / var9 + (double) this.field111;
            this.field122 = (double) this.field127;
        }
        double var11 = (double) (this.field115 + 1 - arg3);
        this.field123 = ((double) arg0 - this.field120) / var11;
        this.field124 = ((double) arg1 - this.field121) / var11;
        this.field117 = Math.sqrt(this.field124 * this.field124 + this.field123 * this.field123);
        if (!this.field119) {
            this.field125 = -this.field117 * Math.tan((double) this.field116 * 0.02454369D);
        }
        this.field132 = ((double) arg2 - this.field122 - this.field125 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("n.u(II)V")
    public final void method102(int arg0) {
        this.field119 = true;
        this.field120 += (double) arg0 * this.field123;
        this.field121 += (double) arg0 * this.field124;
        this.field122 += this.field132 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field125;
        this.field125 += (double) arg0 * this.field132;
        this.field128 = (int) (Math.atan2(this.field123, this.field124) * 325.949D) + 1024 & 0x7FF;
        this.field112 = (int) (Math.atan2(this.field125, this.field117) * 325.949D) & 0x7FF;
        if (this.field108 == null) {
            return;
        }
        this.field126 += arg0;
        while (true) {
            do {
                do {
                    if (this.field126 <= this.field108.field1005[this.field131]) {
                        return;
                    }
                    this.field126 -= this.field108.field1005[this.field131];
                    this.field131++;
                } while (this.field131 < this.field108.field1000.length);
                this.field131 -= this.field108.field1015;
            } while (this.field131 >= 0 && this.field131 < this.field108.field1000.length);
            this.field131 = 0;
        }
    }

    @ObfuscatedName("n.x(S)Ldr;")
    public final class106 method29() {
        class44 var1 = class44.method13(this.field133);
        class106 var2 = var1.method925(this.field131);
        if (var2 == null) {
            return null;
        } else {
            var2.method2210(this.field112);
            return var2;
        }
    }
}
