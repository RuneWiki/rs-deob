package deob;

@ObfuscatedName("lc")
public final class class328 {

    @ObfuscatedName("lc.z")
    public int field3867;

    @ObfuscatedName("lc.k")
    public class190[] field3870;

    @ObfuscatedName("lc.s")
    public class190 field3868;

    @ObfuscatedName("lc.t")
    public class190 field3866;

    @ObfuscatedName("lc.i")
    public int field3869 = 0;

    public class328(int arg0) {
        this.field3867 = arg0;
        this.field3870 = new class190[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class190 var3 = this.field3870[var2] = new class190();
            var3.field2155 = var3;
            var3.field2156 = var3;
        }
    }

    @ObfuscatedName("lc.z(J)Lgw;")
    public class190 method5611(long arg0) {
        class190 var3 = this.field3870[(int) (arg0 & (long) (this.field3867 - 1))];
        for (this.field3868 = var3.field2155; this.field3868 != var3; this.field3868 = this.field3868.field2155) {
            if (this.field3868.field2157 == arg0) {
                class190 var4 = this.field3868;
                this.field3868 = this.field3868.field2155;
                return var4;
            }
        }
        this.field3868 = null;
        return null;
    }

    @ObfuscatedName("lc.k(Lgw;J)V")
    public void method5606(class190 arg0, long arg1) {
        if (arg0.field2156 != null) {
            arg0.method3401();
        }
        class190 var4 = this.field3870[(int) (arg1 & (long) (this.field3867 - 1))];
        arg0.field2156 = var4.field2156;
        arg0.field2155 = var4;
        arg0.field2156.field2155 = arg0;
        arg0.field2155.field2156 = arg0;
        arg0.field2157 = arg1;
    }

    @ObfuscatedName("lc.s()Lgw;")
    public class190 method5605() {
        this.field3869 = 0;
        return this.method5608();
    }

    @ObfuscatedName("lc.t()Lgw;")
    public class190 method5608() {
        if (this.field3869 > 0 && this.field3870[this.field3869 - 1] != this.field3866) {
            class190 var1 = this.field3866;
            this.field3866 = var1.field2155;
            return var1;
        }
        class190 var2;
        do {
            if (this.field3869 >= this.field3867) {
                return null;
            }
            var2 = this.field3870[this.field3869++].field2155;
        } while (this.field3870[this.field3869 - 1] == var2);
        this.field3866 = var2.field2155;
        return var2;
    }
}
