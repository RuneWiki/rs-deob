package deob;

@ObfuscatedName("m")
public final class class7 extends class89 {

    @ObfuscatedName("m.s")
    public int field97;

    @ObfuscatedName("m.z")
    public int field89;

    @ObfuscatedName("m.t")
    public int field106;

    @ObfuscatedName("m.y")
    public int field112;

    @ObfuscatedName("m.p")
    public int field92;

    @ObfuscatedName("m.g")
    public int field93;

    @ObfuscatedName("m.m")
    public int field94;

    @ObfuscatedName("m.f")
    public int field95;

    @ObfuscatedName("m.k")
    public int field96;

    @ObfuscatedName("m.h")
    public int field88;

    @ObfuscatedName("m.r")
    public int field98;

    @ObfuscatedName("m.w")
    public boolean field99 = false;

    @ObfuscatedName("m.u")
    public double field101;

    @ObfuscatedName("m.n")
    public double field90;

    @ObfuscatedName("m.d")
    public double field91;

    @ObfuscatedName("m.a")
    public double field103;

    @ObfuscatedName("m.b")
    public double field104;

    @ObfuscatedName("m.q")
    public double field105;

    @ObfuscatedName("m.o")
    public double field102;

    @ObfuscatedName("m.c")
    public double field107;

    @ObfuscatedName("m.i")
    public int field108;

    @ObfuscatedName("m.x")
    public int field109;

    @ObfuscatedName("m.v")
    public class45 field110;

    @ObfuscatedName("m.l")
    public int field111 = 0;

    @ObfuscatedName("m.e")
    public int field114 = 0;

    public class7(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field97 = arg0;
        this.field89 = arg1;
        this.field106 = arg2;
        this.field112 = arg3;
        this.field92 = arg4;
        this.field94 = arg5;
        this.field95 = arg6;
        this.field96 = arg7;
        this.field88 = arg8;
        this.field98 = arg9;
        this.field93 = arg10;
        this.field99 = false;
        int var12 = class46.method2163(this.field97).field992;
        if (var12 == -1) {
            this.field110 = null;
        } else {
            this.field110 = class45.method44(var12);
        }
    }

    @ObfuscatedName("m.s(IIIII)V")
    public final void method91(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field99) {
            double var5 = (double) (arg0 - this.field106);
            double var7 = (double) (arg1 - this.field112);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field101 = (double) this.field88 * var5 / var9 + (double) this.field106;
            this.field90 = (double) this.field88 * var7 / var9 + (double) this.field112;
            this.field91 = (double) this.field92;
        }
        double var11 = (double) (this.field95 + 1 - arg3);
        this.field103 = ((double) arg0 - this.field101) / var11;
        this.field104 = ((double) arg1 - this.field90) / var11;
        this.field105 = Math.sqrt(this.field104 * this.field104 + this.field103 * this.field103);
        if (!this.field99) {
            this.field102 = -this.field105 * Math.tan((double) this.field96 * 0.02454369D);
        }
        this.field107 = ((double) arg2 - this.field91 - this.field102 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("m.z(II)V")
    public final void method90(int arg0) {
        this.field99 = true;
        this.field101 += (double) arg0 * this.field103;
        this.field90 += (double) arg0 * this.field104;
        this.field91 += this.field107 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field102;
        this.field102 += (double) arg0 * this.field107;
        this.field108 = (int) (Math.atan2(this.field103, this.field104) * 325.949D) + 1024 & 0x7FF;
        this.field109 = (int) (Math.atan2(this.field102, this.field105) * 325.949D) & 0x7FF;
        if (this.field110 == null) {
            return;
        }
        this.field114 += arg0;
        while (true) {
            do {
                do {
                    if (this.field114 <= this.field110.field982[this.field111]) {
                        return;
                    }
                    this.field114 -= this.field110.field982[this.field111];
                    this.field111++;
                } while (this.field111 < this.field110.field970.length);
                this.field111 -= this.field110.field974;
            } while (this.field111 >= 0 && this.field111 < this.field110.field970.length);
            this.field111 = 0;
        }
    }

    @ObfuscatedName("m.t(B)Lde;")
    public final class109 method27() {
        class46 var1 = class46.method2163(this.field97);
        class109 var2 = var1.method900(this.field111);
        if (var2 == null) {
            return null;
        } else {
            var2.method2178(this.field109);
            return var2;
        }
    }
}
