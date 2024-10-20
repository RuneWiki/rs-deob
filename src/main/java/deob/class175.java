package deob;

@ObfuscatedName("fz")
public final class class175 {

    @ObfuscatedName("fz.g")
    public int field2847;

    @ObfuscatedName("fz.s")
    public class187[] field2849;

    @ObfuscatedName("fz.h")
    public class187 field2848;

    @ObfuscatedName("fz.m")
    public class187 field2850;

    @ObfuscatedName("fz.u")
    public int field2851 = 0;

    public class175(int arg0) {
        this.field2847 = arg0;
        this.field2849 = new class187[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class187 var3 = this.field2849[var2] = new class187();
            var3.field2874 = var3;
            var3.field2872 = var3;
        }
    }

    @ObfuscatedName("fz.g(J)Lgg;")
    public class187 method3171(long arg0) {
        class187 var3 = this.field2849[(int) (arg0 & (long) (this.field2847 - 1))];
        for (this.field2848 = var3.field2874; this.field2848 != var3; this.field2848 = this.field2848.field2874) {
            if (this.field2848.field2873 == arg0) {
                class187 var4 = this.field2848;
                this.field2848 = this.field2848.field2874;
                return var4;
            }
        }
        this.field2848 = null;
        return null;
    }

    @ObfuscatedName("fz.s(Lgg;J)V")
    public void method3161(class187 arg0, long arg1) {
        if (arg0.field2872 != null) {
            arg0.method3280();
        }
        class187 var4 = this.field2849[(int) (arg1 & (long) (this.field2847 - 1))];
        arg0.field2872 = var4.field2872;
        arg0.field2874 = var4;
        arg0.field2872.field2874 = arg0;
        arg0.field2874.field2872 = arg0;
        arg0.field2873 = arg1;
    }

    @ObfuscatedName("fz.h()V")
    public void method3162() {
        for (int var1 = 0; var1 < this.field2847; var1++) {
            class187 var2 = this.field2849[var1];
            while (true) {
                class187 var3 = var2.field2874;
                if (var2 == var3) {
                    break;
                }
                var3.method3280();
            }
        }
        this.field2848 = null;
        this.field2850 = null;
    }

    @ObfuscatedName("fz.m()Lgg;")
    public class187 method3163() {
        this.field2851 = 0;
        return this.method3172();
    }

    @ObfuscatedName("fz.u()Lgg;")
    public class187 method3172() {
        if (this.field2851 > 0 && this.field2849[this.field2851 - 1] != this.field2850) {
            class187 var1 = this.field2850;
            this.field2850 = var1.field2874;
            return var1;
        }
        class187 var2;
        do {
            if (this.field2851 >= this.field2847) {
                return null;
            }
            var2 = this.field2849[this.field2851++].field2874;
        } while (this.field2849[this.field2851 - 1] == var2);
        this.field2850 = var2.field2874;
        return var2;
    }
}
