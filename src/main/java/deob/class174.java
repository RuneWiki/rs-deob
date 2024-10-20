package deob;

@ObfuscatedName("fz")
public final class class174 {

    @ObfuscatedName("fz.v")
    public int field2806;

    @ObfuscatedName("fz.f")
    public class178[] field2802;

    @ObfuscatedName("fz.n")
    public class178 field2804;

    @ObfuscatedName("fz.c")
    public class178 field2805;

    @ObfuscatedName("fz.r")
    public int field2803 = 0;

    public class174(int arg0) {
        this.field2806 = arg0;
        this.field2802 = new class178[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class178 var3 = this.field2802[var2] = new class178();
            var3.field2813 = var3;
            var3.field2812 = var3;
        }
    }

    @ObfuscatedName("fz.v(J)Lfd;")
    public class178 method3270(long arg0) {
        class178 var3 = this.field2802[(int) (arg0 & (long) (this.field2806 - 1))];
        for (this.field2804 = var3.field2813; this.field2804 != var3; this.field2804 = this.field2804.field2813) {
            if (this.field2804.field2814 == arg0) {
                class178 var4 = this.field2804;
                this.field2804 = this.field2804.field2813;
                return var4;
            }
        }
        this.field2804 = null;
        return null;
    }

    @ObfuscatedName("fz.f(Lfd;J)V")
    public void method3284(class178 arg0, long arg1) {
        if (arg0.field2812 != null) {
            arg0.method3320();
        }
        class178 var4 = this.field2802[(int) (arg1 & (long) (this.field2806 - 1))];
        arg0.field2812 = var4.field2812;
        arg0.field2813 = var4;
        arg0.field2812.field2813 = arg0;
        arg0.field2813.field2812 = arg0;
        arg0.field2814 = arg1;
    }

    @ObfuscatedName("fz.n()V")
    public void method3283() {
        for (int var1 = 0; var1 < this.field2806; var1++) {
            class178 var2 = this.field2802[var1];
            while (true) {
                class178 var3 = var2.field2813;
                if (var2 == var3) {
                    break;
                }
                var3.method3320();
            }
        }
        this.field2804 = null;
        this.field2805 = null;
    }

    @ObfuscatedName("fz.c()Lfd;")
    public class178 method3275() {
        this.field2803 = 0;
        return this.method3274();
    }

    @ObfuscatedName("fz.r()Lfd;")
    public class178 method3274() {
        if (this.field2803 > 0 && this.field2802[this.field2803 - 1] != this.field2805) {
            class178 var1 = this.field2805;
            this.field2805 = var1.field2813;
            return var1;
        }
        class178 var2;
        do {
            if (this.field2803 >= this.field2806) {
                return null;
            }
            var2 = this.field2802[this.field2803++].field2813;
        } while (this.field2802[this.field2803 - 1] == var2);
        this.field2805 = var2.field2813;
        return var2;
    }
}
