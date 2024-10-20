package deob;

@ObfuscatedName("fd")
public final class class174 {

    @ObfuscatedName("fd.k")
    public int field2851;

    @ObfuscatedName("fd.r")
    public class186[] field2852;

    @ObfuscatedName("fd.y")
    public class186 field2854;

    @ObfuscatedName("fd.w")
    public class186 field2853;

    @ObfuscatedName("fd.m")
    public int field2850 = 0;

    public class174(int arg0) {
        this.field2851 = arg0;
        this.field2852 = new class186[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class186 var3 = this.field2852[var2] = new class186();
            var3.field2875 = var3;
            var3.field2876 = var3;
        }
    }

    @ObfuscatedName("fd.k(J)Lgo;")
    public class186 method3163(long arg0) {
        class186 var3 = this.field2852[(int) (arg0 & (long) (this.field2851 - 1))];
        for (this.field2854 = var3.field2875; this.field2854 != var3; this.field2854 = this.field2854.field2875) {
            if (this.field2854.field2877 == arg0) {
                class186 var4 = this.field2854;
                this.field2854 = this.field2854.field2875;
                return var4;
            }
        }
        this.field2854 = null;
        return null;
    }

    @ObfuscatedName("fd.r(Lgo;J)V")
    public void method3164(class186 arg0, long arg1) {
        if (arg0.field2876 != null) {
            arg0.method3275();
        }
        class186 var4 = this.field2852[(int) (arg1 & (long) (this.field2851 - 1))];
        arg0.field2876 = var4.field2876;
        arg0.field2875 = var4;
        arg0.field2876.field2875 = arg0;
        arg0.field2875.field2876 = arg0;
        arg0.field2877 = arg1;
    }

    @ObfuscatedName("fd.y()V")
    public void method3165() {
        for (int var1 = 0; var1 < this.field2851; var1++) {
            class186 var2 = this.field2852[var1];
            while (true) {
                class186 var3 = var2.field2875;
                if (var2 == var3) {
                    break;
                }
                var3.method3275();
            }
        }
        this.field2854 = null;
        this.field2853 = null;
    }

    @ObfuscatedName("fd.w()Lgo;")
    public class186 method3166() {
        this.field2850 = 0;
        return this.method3168();
    }

    @ObfuscatedName("fd.m()Lgo;")
    public class186 method3168() {
        if (this.field2850 > 0 && this.field2852[this.field2850 - 1] != this.field2853) {
            class186 var1 = this.field2853;
            this.field2853 = var1.field2875;
            return var1;
        }
        class186 var2;
        do {
            if (this.field2850 >= this.field2851) {
                return null;
            }
            var2 = this.field2852[this.field2850++].field2875;
        } while (this.field2852[this.field2850 - 1] == var2);
        this.field2853 = var2.field2875;
        return var2;
    }
}
