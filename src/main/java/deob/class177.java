package deob;

@ObfuscatedName("fd")
public final class class177 {

    @ObfuscatedName("fd.e")
    public int field2871;

    @ObfuscatedName("fd.v")
    public class189[] field2870;

    @ObfuscatedName("fd.k")
    public class189 field2872;

    @ObfuscatedName("fd.g")
    public class189 field2873;

    @ObfuscatedName("fd.q")
    public int field2869 = 0;

    public class177(int arg0) {
        this.field2871 = arg0;
        this.field2870 = new class189[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class189 var3 = this.field2870[var2] = new class189();
            var3.field2895 = var3;
            var3.field2896 = var3;
        }
    }

    @ObfuscatedName("fd.e(J)Lgp;")
    public class189 method3192(long arg0) {
        class189 var3 = this.field2870[(int) (arg0 & (long) (this.field2871 - 1))];
        for (this.field2872 = var3.field2895; this.field2872 != var3; this.field2872 = this.field2872.field2895) {
            if (this.field2872.field2894 == arg0) {
                class189 var4 = this.field2872;
                this.field2872 = this.field2872.field2895;
                return var4;
            }
        }
        this.field2872 = null;
        return null;
    }

    @ObfuscatedName("fd.v(Lgp;J)V")
    public void method3193(class189 arg0, long arg1) {
        if (arg0.field2896 != null) {
            arg0.method3324();
        }
        class189 var4 = this.field2870[(int) (arg1 & (long) (this.field2871 - 1))];
        arg0.field2896 = var4.field2896;
        arg0.field2895 = var4;
        arg0.field2896.field2895 = arg0;
        arg0.field2895.field2896 = arg0;
        arg0.field2894 = arg1;
    }

    @ObfuscatedName("fd.k()V")
    public void method3194() {
        for (int var1 = 0; var1 < this.field2871; var1++) {
            class189 var2 = this.field2870[var1];
            while (true) {
                class189 var3 = var2.field2895;
                if (var2 == var3) {
                    break;
                }
                var3.method3324();
            }
        }
        this.field2872 = null;
        this.field2873 = null;
    }

    @ObfuscatedName("fd.g()Lgp;")
    public class189 method3205() {
        this.field2869 = 0;
        return this.method3196();
    }

    @ObfuscatedName("fd.q()Lgp;")
    public class189 method3196() {
        if (this.field2869 > 0 && this.field2870[this.field2869 - 1] != this.field2873) {
            class189 var1 = this.field2873;
            this.field2873 = var1.field2895;
            return var1;
        }
        class189 var2;
        do {
            if (this.field2869 >= this.field2871) {
                return null;
            }
            var2 = this.field2870[this.field2869++].field2895;
        } while (this.field2870[this.field2869 - 1] == var2);
        this.field2873 = var2.field2895;
        return var2;
    }
}
