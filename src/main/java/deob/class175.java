package deob;

@ObfuscatedName("ft")
public final class class175 {

    @ObfuscatedName("ft.p")
    public int field2802;

    @ObfuscatedName("ft.e")
    public class179[] field2803;

    @ObfuscatedName("ft.a")
    public class179 field2804;

    @ObfuscatedName("ft.h")
    public class179 field2805;

    @ObfuscatedName("ft.y")
    public int field2806 = 0;

    public class175(int arg0) {
        this.field2802 = arg0;
        this.field2803 = new class179[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field2803[var2] = new class179();
            var3.field2812 = var3;
            var3.field2814 = var3;
        }
    }

    @ObfuscatedName("ft.p(J)Lfw;")
    public class179 method3311(long arg0) {
        class179 var3 = this.field2803[(int) (arg0 & (long) (this.field2802 - 1))];
        for (this.field2804 = var3.field2812; this.field2804 != var3; this.field2804 = this.field2804.field2812) {
            if (this.field2804.field2813 == arg0) {
                class179 var4 = this.field2804;
                this.field2804 = this.field2804.field2812;
                return var4;
            }
        }
        this.field2804 = null;
        return null;
    }

    @ObfuscatedName("ft.e(Lfw;J)V")
    public void method3310(class179 arg0, long arg1) {
        if (arg0.field2814 != null) {
            arg0.method3360();
        }
        class179 var4 = this.field2803[(int) (arg1 & (long) (this.field2802 - 1))];
        arg0.field2814 = var4.field2814;
        arg0.field2812 = var4;
        arg0.field2814.field2812 = arg0;
        arg0.field2812.field2814 = arg0;
        arg0.field2813 = arg1;
    }

    @ObfuscatedName("ft.a()V")
    public void method3308() {
        for (int var1 = 0; var1 < this.field2802; var1++) {
            class179 var2 = this.field2803[var1];
            while (true) {
                class179 var3 = var2.field2812;
                if (var2 == var3) {
                    break;
                }
                var3.method3360();
            }
        }
        this.field2804 = null;
        this.field2805 = null;
    }

    @ObfuscatedName("ft.h()Lfw;")
    public class179 method3312() {
        this.field2806 = 0;
        return this.method3313();
    }

    @ObfuscatedName("ft.y()Lfw;")
    public class179 method3313() {
        if (this.field2806 > 0 && this.field2803[this.field2806 - 1] != this.field2805) {
            class179 var1 = this.field2805;
            this.field2805 = var1.field2812;
            return var1;
        }
        class179 var2;
        do {
            if (this.field2806 >= this.field2802) {
                return null;
            }
            var2 = this.field2803[this.field2806++].field2812;
        } while (this.field2803[this.field2806 - 1] == var2);
        this.field2805 = var2.field2812;
        return var2;
    }
}
