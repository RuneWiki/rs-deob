package deob;

@ObfuscatedName("an")
public final class class43 extends class90 {

    @ObfuscatedName("an.b")
    public int field884;

    @ObfuscatedName("an.e")
    public int field870;

    @ObfuscatedName("an.c")
    public int field859;

    @ObfuscatedName("an.l")
    public int field857;

    @ObfuscatedName("an.y")
    public int field858;

    @ObfuscatedName("an.j")
    public int field873;

    @ObfuscatedName("an.g")
    public int field863;

    @ObfuscatedName("an.s")
    public int field864;

    @ObfuscatedName("an.r")
    public int field865;

    @ObfuscatedName("an.t")
    public int field881;

    @ObfuscatedName("an.k")
    public int field878;

    @ObfuscatedName("an.f")
    public boolean field868 = false;

    @ObfuscatedName("an.a")
    public double field869;

    @ObfuscatedName("an.v")
    public double field861;

    @ObfuscatedName("an.d")
    public double field871;

    @ObfuscatedName("an.o")
    public double field862;

    @ObfuscatedName("an.q")
    public double field867;

    @ObfuscatedName("an.i")
    public double field874;

    @ObfuscatedName("an.x")
    public double field875;

    @ObfuscatedName("an.z")
    public double field876;

    @ObfuscatedName("an.n")
    public int field877;

    @ObfuscatedName("an.w")
    public int field866;

    @ObfuscatedName("an.h")
    public class202 field879;

    @ObfuscatedName("an.u")
    public int field880 = 0;

    @ObfuscatedName("an.m")
    public int field860 = 0;

    public class43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field884 = arg0;
        this.field870 = arg1;
        this.field859 = arg2;
        this.field857 = arg3;
        this.field858 = arg4;
        this.field863 = arg5;
        this.field864 = arg6;
        this.field865 = arg7;
        this.field881 = arg8;
        this.field878 = arg9;
        this.field873 = arg10;
        this.field868 = false;
        int var12 = class191.method3117(this.field884).field2802;
        if (var12 == -1) {
            this.field879 = null;
        } else {
            this.field879 = class202.method17(var12);
        }
    }

    @ObfuscatedName("an.b(IIIIB)V")
    public final void method807(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field868) {
            double var5 = (double) (arg0 - this.field859);
            double var7 = (double) (arg1 - this.field857);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field869 = (double) this.field881 * var5 / var9 + (double) this.field859;
            this.field861 = (double) this.field881 * var7 / var9 + (double) this.field857;
            this.field871 = (double) this.field858;
        }
        double var11 = (double) (this.field864 + 1 - arg3);
        this.field862 = ((double) arg0 - this.field869) / var11;
        this.field867 = ((double) arg1 - this.field861) / var11;
        this.field874 = Math.sqrt(this.field867 * this.field867 + this.field862 * this.field862);
        if (!this.field868) {
            this.field875 = -this.field874 * Math.tan((double) this.field865 * 0.02454369D);
        }
        this.field876 = ((double) arg2 - this.field871 - this.field875 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("an.e(II)V")
    public final void method801(int arg0) {
        this.field868 = true;
        this.field869 += (double) arg0 * this.field862;
        this.field861 += (double) arg0 * this.field867;
        this.field871 += this.field876 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field875;
        this.field875 += (double) arg0 * this.field876;
        this.field877 = (int) (Math.atan2(this.field862, this.field867) * 325.949D) + 1024 & 0x7FF;
        this.field866 = (int) (Math.atan2(this.field875, this.field874) * 325.949D) & 0x7FF;
        if (this.field879 == null) {
            return;
        }
        this.field860 += arg0;
        while (true) {
            do {
                do {
                    if (this.field860 <= this.field879.field3067[this.field880]) {
                        return;
                    }
                    this.field860 -= this.field879.field3067[this.field880];
                    this.field880++;
                } while (this.field880 < this.field879.field3062.length);
                this.field880 -= this.field879.field3065;
            } while (this.field880 >= 0 && this.field880 < this.field879.field3062.length);
            this.field880 = 0;
        }
    }

    @ObfuscatedName("an.c(B)Lco;")
    public final class83 method241() {
        class191 var1 = class191.method3117(this.field884);
        class83 var2 = var1.method3304(this.field880);
        if (var2 == null) {
            return null;
        } else {
            var2.method1540(this.field866);
            return var2;
        }
    }
}
