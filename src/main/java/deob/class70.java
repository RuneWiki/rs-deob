package deob;

@ObfuscatedName("bq")
public final class class70 extends class206 {

    @ObfuscatedName("bq.o")
    public int field932;

    @ObfuscatedName("bq.q")
    public int field916;

    @ObfuscatedName("bq.l")
    public int field917;

    @ObfuscatedName("bq.k")
    public int field938;

    @ObfuscatedName("bq.a")
    public int field942;

    @ObfuscatedName("bq.m")
    public int field915;

    @ObfuscatedName("bq.p")
    public int field921;

    @ObfuscatedName("bq.s")
    public int field922;

    @ObfuscatedName("bq.r")
    public int field919;

    @ObfuscatedName("bq.v")
    public int field928;

    @ObfuscatedName("bq.y")
    public int field925;

    @ObfuscatedName("bq.c")
    public boolean field926 = false;

    @ObfuscatedName("bq.w")
    public double field927;

    @ObfuscatedName("bq.b")
    public double field920;

    @ObfuscatedName("bq.t")
    public double field929;

    @ObfuscatedName("bq.g")
    public double field930;

    @ObfuscatedName("bq.x")
    public double field931;

    @ObfuscatedName("bq.n")
    public double field918;

    @ObfuscatedName("bq.e")
    public double field933;

    @ObfuscatedName("bq.h")
    public double field924;

    @ObfuscatedName("bq.f")
    public int field935;

    @ObfuscatedName("bq.d")
    public int field934;

    @ObfuscatedName("bq.j")
    public class191 field937;

    @ObfuscatedName("bq.z")
    public int field923 = 0;

    @ObfuscatedName("bq.i")
    public int field939 = 0;

    public class70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field932 = arg0;
        this.field916 = arg1;
        this.field917 = arg2;
        this.field938 = arg3;
        this.field942 = arg4;
        this.field921 = arg5;
        this.field922 = arg6;
        this.field919 = arg7;
        this.field928 = arg8;
        this.field925 = arg9;
        this.field915 = arg10;
        this.field926 = false;
        int var12 = class181.method2676(this.field932).field2011;
        if (var12 == -1) {
            this.field937 = null;
        } else {
            this.field937 = class191.method2497(var12);
        }
    }

    @ObfuscatedName("bq.o(IIIII)V")
    public final void method1831(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field926) {
            double var5 = (double) (arg0 - this.field917);
            double var7 = (double) (arg1 - this.field938);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field927 = (double) this.field928 * var5 / var9 + (double) this.field917;
            this.field920 = (double) this.field928 * var7 / var9 + (double) this.field938;
            this.field929 = (double) this.field942;
        }
        double var11 = (double) (this.field922 + 1 - arg3);
        this.field930 = ((double) arg0 - this.field927) / var11;
        this.field931 = ((double) arg1 - this.field920) / var11;
        this.field918 = Math.sqrt(this.field931 * this.field931 + this.field930 * this.field930);
        if (!this.field926) {
            this.field933 = -this.field918 * Math.tan((double) this.field919 * 0.02454369D);
        }
        this.field924 = ((double) arg2 - this.field929 - this.field933 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("bq.l(II)V")
    public final void method1832(int arg0) {
        this.field926 = true;
        this.field927 += (double) arg0 * this.field930;
        this.field920 += (double) arg0 * this.field931;
        this.field929 += this.field924 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field933;
        this.field933 += (double) arg0 * this.field924;
        this.field935 = (int) (Math.atan2(this.field930, this.field931) * 325.949D) + 1024 & 0x7FF;
        this.field934 = (int) (Math.atan2(this.field933, this.field918) * 325.949D) & 0x7FF;
        if (this.field937 == null) {
            return;
        }
        if (this.field937.method3417()) {
            this.field923 += arg0;
            int var2 = this.field937.method3434();
            if (this.field923 >= var2) {
                this.field923 = var2 - this.field937.field2217;
            }
            return;
        }
        this.field939 += arg0;
        while (true) {
            do {
                do {
                    if (this.field939 <= this.field937.field2215[this.field923]) {
                        return;
                    }
                    this.field939 -= this.field937.field2215[this.field923];
                    this.field923++;
                } while (this.field923 < this.field937.field2213.length);
                this.field923 -= this.field937.field2217;
            } while (this.field923 >= 0 && this.field923 < this.field937.field2213.length);
            this.field923 = 0;
        }
    }

    @ObfuscatedName("bq.q(I)Lhv;")
    public final class212 method1774() {
        class181 var1 = class181.method2676(this.field932);
        class212 var2 = var1.method3155(this.field923);
        if (var2 == null) {
            return null;
        } else {
            var2.method3961(this.field934);
            return var2;
        }
    }
}
