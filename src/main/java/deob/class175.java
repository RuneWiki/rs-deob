package deob;

@ObfuscatedName("fw")
public final class class175 {

    @ObfuscatedName("fw.f")
    public int field2806;

    @ObfuscatedName("fw.t")
    public class179[] field2805;

    @ObfuscatedName("fw.n")
    public class179 field2804;

    @ObfuscatedName("fw.e")
    public class179 field2802;

    @ObfuscatedName("fw.l")
    public int field2803 = 0;

    public class175(int arg0) {
        this.field2806 = arg0;
        this.field2805 = new class179[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field2805[var2] = new class179();
            var3.field2813 = var3;
            var3.field2814 = var3;
        }
    }

    @ObfuscatedName("fw.f(J)Lfy;")
    public class179 method3312(long arg0) {
        class179 var3 = this.field2805[(int) (arg0 & (long) (this.field2806 - 1))];
        for (this.field2804 = var3.field2813; this.field2804 != var3; this.field2804 = this.field2804.field2813) {
            if (this.field2804.field2812 == arg0) {
                class179 var4 = this.field2804;
                this.field2804 = this.field2804.field2813;
                return var4;
            }
        }
        this.field2804 = null;
        return null;
    }

    @ObfuscatedName("fw.t(Lfy;J)V")
    public void method3329(class179 arg0, long arg1) {
        if (arg0.field2814 != null) {
            arg0.method3374();
        }
        class179 var4 = this.field2805[(int) (arg1 & (long) (this.field2806 - 1))];
        arg0.field2814 = var4.field2814;
        arg0.field2813 = var4;
        arg0.field2814.field2813 = arg0;
        arg0.field2813.field2814 = arg0;
        arg0.field2812 = arg1;
    }

    @ObfuscatedName("fw.n()V")
    public void method3314() {
        for (int var1 = 0; var1 < this.field2806; var1++) {
            class179 var2 = this.field2805[var1];
            while (true) {
                class179 var3 = var2.field2813;
                if (var2 == var3) {
                    break;
                }
                var3.method3374();
            }
        }
        this.field2804 = null;
        this.field2802 = null;
    }

    @ObfuscatedName("fw.e()Lfy;")
    public class179 method3315() {
        this.field2803 = 0;
        return this.method3316();
    }

    @ObfuscatedName("fw.l()Lfy;")
    public class179 method3316() {
        if (this.field2803 > 0 && this.field2805[this.field2803 - 1] != this.field2802) {
            class179 var1 = this.field2802;
            this.field2802 = var1.field2813;
            return var1;
        }
        class179 var2;
        do {
            if (this.field2803 >= this.field2806) {
                return null;
            }
            var2 = this.field2805[this.field2803++].field2813;
        } while (this.field2805[this.field2803 - 1] == var2);
        this.field2802 = var2.field2813;
        return var2;
    }
}
