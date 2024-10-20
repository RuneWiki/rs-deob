package deob;

@ObfuscatedName("fu")
public final class class175 {

    @ObfuscatedName("fu.j")
    public int field2804;

    @ObfuscatedName("fu.f")
    public class179[] field2801;

    @ObfuscatedName("fu.o")
    public class179 field2803;

    @ObfuscatedName("fu.h")
    public class179 field2802;

    @ObfuscatedName("fu.u")
    public int field2805 = 0;

    public class175(int arg0) {
        this.field2804 = arg0;
        this.field2801 = new class179[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field2801[var2] = new class179();
            var3.field2812 = var3;
            var3.field2811 = var3;
        }
    }

    @ObfuscatedName("fu.j(J)Lfz;")
    public class179 method3296(long arg0) {
        class179 var3 = this.field2801[(int) (arg0 & (long) (this.field2804 - 1))];
        for (this.field2803 = var3.field2812; this.field2803 != var3; this.field2803 = this.field2803.field2812) {
            if (this.field2803.field2813 == arg0) {
                class179 var4 = this.field2803;
                this.field2803 = this.field2803.field2812;
                return var4;
            }
        }
        this.field2803 = null;
        return null;
    }

    @ObfuscatedName("fu.f(Lfz;J)V")
    public void method3297(class179 arg0, long arg1) {
        if (arg0.field2811 != null) {
            arg0.method3349();
        }
        class179 var4 = this.field2801[(int) (arg1 & (long) (this.field2804 - 1))];
        arg0.field2811 = var4.field2811;
        arg0.field2812 = var4;
        arg0.field2811.field2812 = arg0;
        arg0.field2812.field2811 = arg0;
        arg0.field2813 = arg1;
    }

    @ObfuscatedName("fu.o()V")
    public void method3307() {
        for (int var1 = 0; var1 < this.field2804; var1++) {
            class179 var2 = this.field2801[var1];
            while (true) {
                class179 var3 = var2.field2812;
                if (var2 == var3) {
                    break;
                }
                var3.method3349();
            }
        }
        this.field2803 = null;
        this.field2802 = null;
    }

    @ObfuscatedName("fu.h()Lfz;")
    public class179 method3298() {
        this.field2805 = 0;
        return this.method3299();
    }

    @ObfuscatedName("fu.u()Lfz;")
    public class179 method3299() {
        if (this.field2805 > 0 && this.field2801[this.field2805 - 1] != this.field2802) {
            class179 var1 = this.field2802;
            this.field2802 = var1.field2812;
            return var1;
        }
        class179 var2;
        do {
            if (this.field2805 >= this.field2804) {
                return null;
            }
            var2 = this.field2801[this.field2805++].field2812;
        } while (this.field2801[this.field2805 - 1] == var2);
        this.field2802 = var2.field2812;
        return var2;
    }
}
