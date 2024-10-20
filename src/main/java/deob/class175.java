package deob;

@ObfuscatedName("fy")
public final class class175 {

    @ObfuscatedName("fy.t")
    public int field2812;

    @ObfuscatedName("fy.l")
    public class179[] field2809;

    @ObfuscatedName("fy.c")
    public class179 field2811;

    @ObfuscatedName("fy.d")
    public class179 field2810;

    @ObfuscatedName("fy.b")
    public int field2813 = 0;

    public class175(int arg0) {
        this.field2812 = arg0;
        this.field2809 = new class179[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field2809[var2] = new class179();
            var3.field2819 = var3;
            var3.field2820 = var3;
        }
    }

    @ObfuscatedName("fy.t(J)Lfu;")
    public class179 method3301(long arg0) {
        class179 var3 = this.field2809[(int) (arg0 & (long) (this.field2812 - 1))];
        for (this.field2811 = var3.field2819; this.field2811 != var3; this.field2811 = this.field2811.field2819) {
            if (this.field2811.field2821 == arg0) {
                class179 var4 = this.field2811;
                this.field2811 = this.field2811.field2819;
                return var4;
            }
        }
        this.field2811 = null;
        return null;
    }

    @ObfuscatedName("fy.l(Lfu;J)V")
    public void method3302(class179 arg0, long arg1) {
        if (arg0.field2820 != null) {
            arg0.method3361();
        }
        class179 var4 = this.field2809[(int) (arg1 & (long) (this.field2812 - 1))];
        arg0.field2820 = var4.field2820;
        arg0.field2819 = var4;
        arg0.field2820.field2819 = arg0;
        arg0.field2819.field2820 = arg0;
        arg0.field2821 = arg1;
    }

    @ObfuscatedName("fy.c()V")
    public void method3303() {
        for (int var1 = 0; var1 < this.field2812; var1++) {
            class179 var2 = this.field2809[var1];
            while (true) {
                class179 var3 = var2.field2819;
                if (var2 == var3) {
                    break;
                }
                var3.method3361();
            }
        }
        this.field2811 = null;
        this.field2810 = null;
    }

    @ObfuscatedName("fy.d()Lfu;")
    public class179 method3310() {
        this.field2813 = 0;
        return this.method3305();
    }

    @ObfuscatedName("fy.b()Lfu;")
    public class179 method3305() {
        if (this.field2813 > 0 && this.field2809[this.field2813 - 1] != this.field2810) {
            class179 var1 = this.field2810;
            this.field2810 = var1.field2819;
            return var1;
        }
        class179 var2;
        do {
            if (this.field2813 >= this.field2812) {
                return null;
            }
            var2 = this.field2809[this.field2813++].field2819;
        } while (this.field2809[this.field2813 - 1] == var2);
        this.field2810 = var2.field2819;
        return var2;
    }
}
