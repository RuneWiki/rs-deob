package deob;

@ObfuscatedName("at")
public final class class43 extends class90 {

    @ObfuscatedName("at.k")
    public int field870;

    @ObfuscatedName("at.y")
    public int field863;

    @ObfuscatedName("at.o")
    public int field879;

    @ObfuscatedName("at.r")
    public int field875;

    @ObfuscatedName("at.w")
    public int field861;

    @ObfuscatedName("at.j")
    public int field871;

    @ObfuscatedName("at.q")
    public int field865;

    @ObfuscatedName("at.d")
    public int field866;

    @ObfuscatedName("at.n")
    public int field867;

    @ObfuscatedName("at.c")
    public int field868;

    @ObfuscatedName("at.s")
    public int field864;

    @ObfuscatedName("at.g")
    public boolean field880 = false;

    @ObfuscatedName("at.i")
    public double field860;

    @ObfuscatedName("at.v")
    public double field872;

    @ObfuscatedName("at.a")
    public double field873;

    @ObfuscatedName("at.h")
    public double field874;

    @ObfuscatedName("at.p")
    public double field876;

    @ObfuscatedName("at.t")
    public double field859;

    @ObfuscatedName("at.f")
    public double field877;

    @ObfuscatedName("at.z")
    public double field878;

    @ObfuscatedName("at.u")
    public int field869;

    @ObfuscatedName("at.b")
    public int field862;

    @ObfuscatedName("at.m")
    public class202 field881;

    @ObfuscatedName("at.e")
    public int field882 = 0;

    @ObfuscatedName("at.l")
    public int field883 = 0;

    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field870 = arg0;
        this.field863 = arg1;
        this.field879 = arg2;
        this.field875 = arg3;
        this.field861 = arg4;
        this.field865 = arg5;
        this.field866 = arg6;
        this.field867 = arg7;
        this.field868 = arg8;
        this.field864 = arg9;
        this.field871 = arg10;
        this.field880 = false;
        int var12 = class191.method188(this.field870).field2779;
        if (var12 == -1) {
            this.field881 = null;
        } else {
            this.field881 = class202.method1368(var12);
        }
    }

    @ObfuscatedName("at.k(IIIIB)V")
    public final void method790(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field880) {
            double var5 = (double) (arg0 - this.field879);
            double var7 = (double) (arg1 - this.field875);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field860 = (double) this.field868 * var5 / var9 + (double) this.field879;
            this.field872 = (double) this.field868 * var7 / var9 + (double) this.field875;
            this.field873 = (double) this.field861;
        }
        double var11 = (double) (this.field866 + 1 - arg3);
        this.field874 = ((double) arg0 - this.field860) / var11;
        this.field876 = ((double) arg1 - this.field872) / var11;
        this.field859 = Math.sqrt(this.field876 * this.field876 + this.field874 * this.field874);
        if (!this.field880) {
            this.field877 = -this.field859 * Math.tan((double) this.field867 * 0.02454369D);
        }
        this.field878 = ((double) arg2 - this.field873 - this.field877 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("at.y(II)V")
    public final void method784(int arg0) {
        this.field880 = true;
        this.field860 += (double) arg0 * this.field874;
        this.field872 += (double) arg0 * this.field876;
        this.field873 += this.field878 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field877;
        this.field877 += (double) arg0 * this.field878;
        this.field869 = (int) (Math.atan2(this.field874, this.field876) * 325.949D) + 1024 & 0x7FF;
        this.field862 = (int) (Math.atan2(this.field877, this.field859) * 325.949D) & 0x7FF;
        if (this.field881 == null) {
            return;
        }
        this.field883 += arg0;
        while (true) {
            do {
                do {
                    if (this.field883 <= this.field881.field3040[this.field882]) {
                        return;
                    }
                    this.field883 -= this.field881.field3040[this.field882];
                    this.field882++;
                } while (this.field882 < this.field881.field3038.length);
                this.field882 -= this.field881.field3042;
            } while (this.field882 >= 0 && this.field882 < this.field881.field3038.length);
            this.field882 = 0;
        }
    }

    @ObfuscatedName("at.o(I)Lcu;")
    public final class83 method258() {
        class191 var1 = class191.method188(this.field870);
        class83 var2 = var1.method3242(this.field882);
        if (var2 == null) {
            return null;
        } else {
            var2.method1491(this.field862);
            return var2;
        }
    }
}
