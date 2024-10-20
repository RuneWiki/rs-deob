package deob;

@ObfuscatedName("fn")
public final class class169 {

    @ObfuscatedName("fn.m")
    public int field2798;

    @ObfuscatedName("fn.k")
    public class176[] field2797;

    @ObfuscatedName("fn.y")
    public class176 field2799;

    @ObfuscatedName("fn.g")
    public class176 field2800;

    @ObfuscatedName("fn.r")
    public int field2801 = 0;

    public class169(int arg0) {
        this.field2798 = arg0;
        this.field2797 = new class176[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class176 var3 = this.field2797[var2] = new class176();
            var3.field2813 = var3;
            var3.field2811 = var3;
        }
    }

    @ObfuscatedName("fn.m(J)Lfv;")
    public class176 method3159(long arg0) {
        class176 var3 = this.field2797[(int) (arg0 & (long) (this.field2798 - 1))];
        for (this.field2799 = var3.field2813; this.field2799 != var3; this.field2799 = this.field2799.field2813) {
            if (this.field2799.field2812 == arg0) {
                class176 var4 = this.field2799;
                this.field2799 = this.field2799.field2813;
                return var4;
            }
        }
        this.field2799 = null;
        return null;
    }

    @ObfuscatedName("fn.k(Lfv;J)V")
    public void method3165(class176 arg0, long arg1) {
        if (arg0.field2811 != null) {
            arg0.method3223();
        }
        class176 var4 = this.field2797[(int) (arg1 & (long) (this.field2798 - 1))];
        arg0.field2811 = var4.field2811;
        arg0.field2813 = var4;
        arg0.field2811.field2813 = arg0;
        arg0.field2813.field2811 = arg0;
        arg0.field2812 = arg1;
    }

    @ObfuscatedName("fn.y()V")
    public void method3153() {
        for (int var1 = 0; var1 < this.field2798; var1++) {
            class176 var2 = this.field2797[var1];
            while (true) {
                class176 var3 = var2.field2813;
                if (var2 == var3) {
                    break;
                }
                var3.method3223();
            }
        }
        this.field2799 = null;
        this.field2800 = null;
    }

    @ObfuscatedName("fn.g()Lfv;")
    public class176 method3156() {
        this.field2801 = 0;
        return this.method3157();
    }

    @ObfuscatedName("fn.r()Lfv;")
    public class176 method3157() {
        if (this.field2801 > 0 && this.field2797[this.field2801 - 1] != this.field2800) {
            class176 var1 = this.field2800;
            this.field2800 = var1.field2813;
            return var1;
        }
        class176 var2;
        do {
            if (this.field2801 >= this.field2798) {
                return null;
            }
            var2 = this.field2797[this.field2801++].field2813;
        } while (this.field2797[this.field2801 - 1] == var2);
        this.field2800 = var2.field2813;
        return var2;
    }
}
