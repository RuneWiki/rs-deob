package deob;

@ObfuscatedName("az")
public final class class43 extends class90 {

    @ObfuscatedName("az.x")
    public int field888;

    @ObfuscatedName("az.n")
    public int field861;

    @ObfuscatedName("az.g")
    public int field890;

    @ObfuscatedName("az.v")
    public int field863;

    @ObfuscatedName("az.y")
    public int field864;

    @ObfuscatedName("az.p")
    public int field865;

    @ObfuscatedName("az.j")
    public int field866;

    @ObfuscatedName("az.m")
    public int field867;

    @ObfuscatedName("az.a")
    public int field868;

    @ObfuscatedName("az.i")
    public int field873;

    @ObfuscatedName("az.s")
    public int field869;

    @ObfuscatedName("az.k")
    public boolean field871 = false;

    @ObfuscatedName("az.f")
    public double field872;

    @ObfuscatedName("az.o")
    public double field889;

    @ObfuscatedName("az.q")
    public double field874;

    @ObfuscatedName("az.c")
    public double field875;

    @ObfuscatedName("az.b")
    public double field862;

    @ObfuscatedName("az.w")
    public double field877;

    @ObfuscatedName("az.l")
    public double field883;

    @ObfuscatedName("az.r")
    public double field879;

    @ObfuscatedName("az.u")
    public int field880;

    @ObfuscatedName("az.e")
    public int field881;

    @ObfuscatedName("az.h")
    public class202 field882;

    @ObfuscatedName("az.d")
    public int field886 = 0;

    @ObfuscatedName("az.z")
    public int field884 = 0;

    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field888 = arg0;
        this.field861 = arg1;
        this.field890 = arg2;
        this.field863 = arg3;
        this.field864 = arg4;
        this.field866 = arg5;
        this.field867 = arg6;
        this.field868 = arg7;
        this.field873 = arg8;
        this.field869 = arg9;
        this.field865 = arg10;
        this.field871 = false;
        int var12 = class191.method2936(this.field888).field2798;
        if (var12 == -1) {
            this.field882 = null;
        } else {
            this.field882 = Statics.method1464(var12);
        }
    }

    @ObfuscatedName("az.x(IIIII)V")
    public final void method853(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field871) {
            double var5 = (double) (arg0 - this.field890);
            double var7 = (double) (arg1 - this.field863);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field872 = (double) this.field873 * var5 / var9 + (double) this.field890;
            this.field889 = (double) this.field873 * var7 / var9 + (double) this.field863;
            this.field874 = (double) this.field864;
        }
        double var11 = (double) (this.field867 + 1 - arg3);
        this.field875 = ((double) arg0 - this.field872) / var11;
        this.field862 = ((double) arg1 - this.field889) / var11;
        this.field877 = Math.sqrt(this.field875 * this.field875 + this.field862 * this.field862);
        if (!this.field871) {
            this.field883 = -this.field877 * Math.tan((double) this.field868 * 0.02454369D);
        }
        this.field879 = ((double) arg2 - this.field874 - this.field883 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("az.n(IB)V")
    public final void method854(int arg0) {
        this.field871 = true;
        this.field872 += (double) arg0 * this.field875;
        this.field889 += (double) arg0 * this.field862;
        this.field874 += this.field879 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field883;
        this.field883 += (double) arg0 * this.field879;
        this.field880 = (int) (Math.atan2(this.field875, this.field862) * 325.949D) + 1024 & 0x7FF;
        this.field881 = (int) (Math.atan2(this.field883, this.field877) * 325.949D) & 0x7FF;
        if (this.field882 == null) {
            return;
        }
        this.field884 += arg0;
        while (true) {
            do {
                do {
                    if (this.field884 <= this.field882.field3064[this.field886]) {
                        return;
                    }
                    this.field884 -= this.field882.field3064[this.field886];
                    this.field886++;
                } while (this.field886 < this.field882.field3063.length);
                this.field886 -= this.field882.field3067;
            } while (this.field886 >= 0 && this.field886 < this.field882.field3063.length);
            this.field886 = 0;
        }
    }

    @ObfuscatedName("az.g(B)Lcj;")
    public final class83 method240() {
        class191 var1 = class191.method2936(this.field888);
        class83 var2 = var1.method3326(this.field886);
        if (var2 == null) {
            return null;
        } else {
            var2.method1598(this.field881);
            return var2;
        }
    }
}
