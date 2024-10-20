package deob;

@ObfuscatedName("fo")
public final class class174 {

    @ObfuscatedName("fo.j")
    public int field2839;

    @ObfuscatedName("fo.z")
    public class184[] field2841;

    @ObfuscatedName("fo.y")
    public class184 field2840;

    @ObfuscatedName("fo.h")
    public class184 field2842;

    @ObfuscatedName("fo.r")
    public int field2843 = 0;

    public class174(int arg0) {
        this.field2839 = arg0;
        this.field2841 = new class184[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class184 var3 = this.field2841[var2] = new class184();
            var3.field2860 = var3;
            var3.field2862 = var3;
        }
    }

    @ObfuscatedName("fo.j(J)Lgb;")
    public class184 method3214(long arg0) {
        class184 var3 = this.field2841[(int) (arg0 & (long) (this.field2839 - 1))];
        for (this.field2840 = var3.field2860; this.field2840 != var3; this.field2840 = this.field2840.field2860) {
            if (this.field2840.field2861 == arg0) {
                class184 var4 = this.field2840;
                this.field2840 = this.field2840.field2860;
                return var4;
            }
        }
        this.field2840 = null;
        return null;
    }

    @ObfuscatedName("fo.z(Lgb;J)V")
    public void method3208(class184 arg0, long arg1) {
        if (arg0.field2862 != null) {
            arg0.method3309();
        }
        class184 var4 = this.field2841[(int) (arg1 & (long) (this.field2839 - 1))];
        arg0.field2862 = var4.field2862;
        arg0.field2860 = var4;
        arg0.field2862.field2860 = arg0;
        arg0.field2860.field2862 = arg0;
        arg0.field2861 = arg1;
    }

    @ObfuscatedName("fo.y()V")
    public void method3211() {
        for (int var1 = 0; var1 < this.field2839; var1++) {
            class184 var2 = this.field2841[var1];
            while (true) {
                class184 var3 = var2.field2860;
                if (var2 == var3) {
                    break;
                }
                var3.method3309();
            }
        }
        this.field2840 = null;
        this.field2842 = null;
    }

    @ObfuscatedName("fo.h()Lgb;")
    public class184 method3210() {
        this.field2843 = 0;
        return this.method3207();
    }

    @ObfuscatedName("fo.r()Lgb;")
    public class184 method3207() {
        if (this.field2843 > 0 && this.field2841[this.field2843 - 1] != this.field2842) {
            class184 var1 = this.field2842;
            this.field2842 = var1.field2860;
            return var1;
        }
        class184 var2;
        do {
            if (this.field2843 >= this.field2839) {
                return null;
            }
            var2 = this.field2841[this.field2843++].field2860;
        } while (this.field2841[this.field2843 - 1] == var2);
        this.field2842 = var2.field2860;
        return var2;
    }
}
