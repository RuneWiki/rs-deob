package deob;

@ObfuscatedName("fv")
public final class class179 {

    @ObfuscatedName("fv.p")
    public int field2878;

    @ObfuscatedName("fv.y")
    public class191[] field2877;

    @ObfuscatedName("fv.d")
    public class191 field2880;

    @ObfuscatedName("fv.c")
    public class191 field2876;

    @ObfuscatedName("fv.r")
    public int field2879 = 0;

    public class179(int arg0) {
        this.field2878 = arg0;
        this.field2877 = new class191[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class191 var3 = this.field2877[var2] = new class191();
            var3.field2902 = var3;
            var3.field2901 = var3;
        }
    }

    @ObfuscatedName("fv.p(J)Lgu;")
    public class191 method3224(long arg0) {
        class191 var3 = this.field2877[(int) (arg0 & (long) (this.field2878 - 1))];
        for (this.field2880 = var3.field2902; this.field2880 != var3; this.field2880 = this.field2880.field2902) {
            if (this.field2880.field2903 == arg0) {
                class191 var4 = this.field2880;
                this.field2880 = this.field2880.field2902;
                return var4;
            }
        }
        this.field2880 = null;
        return null;
    }

    @ObfuscatedName("fv.y(Lgu;J)V")
    public void method3225(class191 arg0, long arg1) {
        if (arg0.field2901 != null) {
            arg0.method3358();
        }
        class191 var4 = this.field2877[(int) (arg1 & (long) (this.field2878 - 1))];
        arg0.field2901 = var4.field2901;
        arg0.field2902 = var4;
        arg0.field2901.field2902 = arg0;
        arg0.field2902.field2901 = arg0;
        arg0.field2903 = arg1;
    }

    @ObfuscatedName("fv.d()V")
    public void method3240() {
        for (int var1 = 0; var1 < this.field2878; var1++) {
            class191 var2 = this.field2877[var1];
            while (true) {
                class191 var3 = var2.field2902;
                if (var2 == var3) {
                    break;
                }
                var3.method3358();
            }
        }
        this.field2880 = null;
        this.field2876 = null;
    }

    @ObfuscatedName("fv.c()Lgu;")
    public class191 method3227() {
        this.field2879 = 0;
        return this.method3228();
    }

    @ObfuscatedName("fv.r()Lgu;")
    public class191 method3228() {
        if (this.field2879 > 0 && this.field2877[this.field2879 - 1] != this.field2876) {
            class191 var1 = this.field2876;
            this.field2876 = var1.field2902;
            return var1;
        }
        class191 var2;
        do {
            if (this.field2879 >= this.field2878) {
                return null;
            }
            var2 = this.field2877[this.field2879++].field2902;
        } while (this.field2877[this.field2879 - 1] == var2);
        this.field2876 = var2.field2902;
        return var2;
    }
}
