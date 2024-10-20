package deob;

@ObfuscatedName("fr")
public final class class173 {

    @ObfuscatedName("fr.y")
    public int field2810;

    @ObfuscatedName("fr.u")
    public class183[] field2808;

    @ObfuscatedName("fr.k")
    public class183 field2809;

    @ObfuscatedName("fr.v")
    public class183 field2811;

    @ObfuscatedName("fr.l")
    public int field2812 = 0;

    public class173(int arg0) {
        this.field2810 = arg0;
        this.field2808 = new class183[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class183 var3 = this.field2808[var2] = new class183();
            var3.field2829 = var3;
            var3.field2831 = var3;
        }
    }

    @ObfuscatedName("fr.y(J)Lgw;")
    public class183 method3171(long arg0) {
        class183 var3 = this.field2808[(int) (arg0 & (long) (this.field2810 - 1))];
        for (this.field2809 = var3.field2829; this.field2809 != var3; this.field2809 = this.field2809.field2829) {
            if (this.field2809.field2830 == arg0) {
                class183 var4 = this.field2809;
                this.field2809 = this.field2809.field2829;
                return var4;
            }
        }
        this.field2809 = null;
        return null;
    }

    @ObfuscatedName("fr.u(Lgw;J)V")
    public void method3172(class183 arg0, long arg1) {
        if (arg0.field2831 != null) {
            arg0.method3268();
        }
        class183 var4 = this.field2808[(int) (arg1 & (long) (this.field2810 - 1))];
        arg0.field2831 = var4.field2831;
        arg0.field2829 = var4;
        arg0.field2831.field2829 = arg0;
        arg0.field2829.field2831 = arg0;
        arg0.field2830 = arg1;
    }

    @ObfuscatedName("fr.k()V")
    public void method3173() {
        for (int var1 = 0; var1 < this.field2810; var1++) {
            class183 var2 = this.field2808[var1];
            while (true) {
                class183 var3 = var2.field2829;
                if (var2 == var3) {
                    break;
                }
                var3.method3268();
            }
        }
        this.field2809 = null;
        this.field2811 = null;
    }

    @ObfuscatedName("fr.v()Lgw;")
    public class183 method3170() {
        this.field2812 = 0;
        return this.method3174();
    }

    @ObfuscatedName("fr.l()Lgw;")
    public class183 method3174() {
        if (this.field2812 > 0 && this.field2808[this.field2812 - 1] != this.field2811) {
            class183 var1 = this.field2811;
            this.field2811 = var1.field2829;
            return var1;
        }
        class183 var2;
        do {
            if (this.field2812 >= this.field2810) {
                return null;
            }
            var2 = this.field2808[this.field2812++].field2829;
        } while (this.field2808[this.field2812 - 1] == var2);
        this.field2811 = var2.field2829;
        return var2;
    }
}
