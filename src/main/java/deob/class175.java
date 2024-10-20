package deob;

@ObfuscatedName("fo")
public final class class175 {

    @ObfuscatedName("fo.d")
    public int field2810;

    @ObfuscatedName("fo.g")
    public class179[] field2809;

    @ObfuscatedName("fo.a")
    public class179 field2811;

    @ObfuscatedName("fo.t")
    public class179 field2808;

    @ObfuscatedName("fo.f")
    public int field2812 = 0;

    public class175(int arg0) {
        this.field2810 = arg0;
        this.field2809 = new class179[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field2809[var2] = new class179();
            var3.field2819 = var3;
            var3.field2820 = var3;
        }
    }

    @ObfuscatedName("fo.d(J)Lfy;")
    public class179 method3255(long arg0) {
        class179 var3 = this.field2809[(int) (arg0 & (long) (this.field2810 - 1))];
        for (this.field2811 = var3.field2819; this.field2811 != var3; this.field2811 = this.field2811.field2819) {
            if (this.field2811.field2818 == arg0) {
                class179 var4 = this.field2811;
                this.field2811 = this.field2811.field2819;
                return var4;
            }
        }
        this.field2811 = null;
        return null;
    }

    @ObfuscatedName("fo.g(Lfy;J)V")
    public void method3268(class179 arg0, long arg1) {
        if (arg0.field2820 != null) {
            arg0.method3306();
        }
        class179 var4 = this.field2809[(int) (arg1 & (long) (this.field2810 - 1))];
        arg0.field2820 = var4.field2820;
        arg0.field2819 = var4;
        arg0.field2820.field2819 = arg0;
        arg0.field2819.field2820 = arg0;
        arg0.field2818 = arg1;
    }

    @ObfuscatedName("fo.a()V")
    public void method3270() {
        for (int var1 = 0; var1 < this.field2810; var1++) {
            class179 var2 = this.field2809[var1];
            while (true) {
                class179 var3 = var2.field2819;
                if (var2 == var3) {
                    break;
                }
                var3.method3306();
            }
        }
        this.field2811 = null;
        this.field2808 = null;
    }

    @ObfuscatedName("fo.t()Lfy;")
    public class179 method3257() {
        this.field2812 = 0;
        return this.method3258();
    }

    @ObfuscatedName("fo.f()Lfy;")
    public class179 method3258() {
        if (this.field2812 > 0 && this.field2809[this.field2812 - 1] != this.field2808) {
            class179 var1 = this.field2808;
            this.field2808 = var1.field2819;
            return var1;
        }
        class179 var2;
        do {
            if (this.field2812 >= this.field2810) {
                return null;
            }
            var2 = this.field2809[this.field2812++].field2819;
        } while (this.field2809[this.field2812 - 1] == var2);
        this.field2808 = var2.field2819;
        return var2;
    }
}
