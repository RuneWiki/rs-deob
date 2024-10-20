package deob;

@ObfuscatedName("fe")
public final class class175 {

    @ObfuscatedName("fe.b")
    public int field2803;

    @ObfuscatedName("fe.e")
    public class179[] field2801;

    @ObfuscatedName("fe.g")
    public class179 field2802;

    @ObfuscatedName("fe.o")
    public class179 field2804;

    @ObfuscatedName("fe.a")
    public int field2800 = 0;

    public class175(int arg0) {
        this.field2803 = arg0;
        this.field2801 = new class179[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field2801[var2] = new class179();
            var3.field2811 = var3;
            var3.field2812 = var3;
        }
    }

    @ObfuscatedName("fe.b(J)Lfc;")
    public class179 method3291(long arg0) {
        class179 var3 = this.field2801[(int) (arg0 & (long) (this.field2803 - 1))];
        for (this.field2802 = var3.field2811; this.field2802 != var3; this.field2802 = this.field2802.field2811) {
            if (this.field2802.field2810 == arg0) {
                class179 var4 = this.field2802;
                this.field2802 = this.field2802.field2811;
                return var4;
            }
        }
        this.field2802 = null;
        return null;
    }

    @ObfuscatedName("fe.e(Lfc;J)V")
    public void method3292(class179 arg0, long arg1) {
        if (arg0.field2812 != null) {
            arg0.method3341();
        }
        class179 var4 = this.field2801[(int) (arg1 & (long) (this.field2803 - 1))];
        arg0.field2812 = var4.field2812;
        arg0.field2811 = var4;
        arg0.field2812.field2811 = arg0;
        arg0.field2811.field2812 = arg0;
        arg0.field2810 = arg1;
    }

    @ObfuscatedName("fe.g()V")
    public void method3293() {
        for (int var1 = 0; var1 < this.field2803; var1++) {
            class179 var2 = this.field2801[var1];
            while (true) {
                class179 var3 = var2.field2811;
                if (var2 == var3) {
                    break;
                }
                var3.method3341();
            }
        }
        this.field2802 = null;
        this.field2804 = null;
    }

    @ObfuscatedName("fe.o()Lfc;")
    public class179 method3294() {
        this.field2800 = 0;
        return this.method3302();
    }

    @ObfuscatedName("fe.a()Lfc;")
    public class179 method3302() {
        if (this.field2800 > 0 && this.field2801[this.field2800 - 1] != this.field2804) {
            class179 var1 = this.field2804;
            this.field2804 = var1.field2811;
            return var1;
        }
        class179 var2;
        do {
            if (this.field2800 >= this.field2803) {
                return null;
            }
            var2 = this.field2801[this.field2800++].field2811;
        } while (this.field2801[this.field2800 - 1] == var2);
        this.field2804 = var2.field2811;
        return var2;
    }
}
