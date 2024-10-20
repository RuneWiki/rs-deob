package deob;

@ObfuscatedName("fa")
public final class class175 {

    @ObfuscatedName("fa.g")
    public int field2807;

    @ObfuscatedName("fa.m")
    public class179[] field2803;

    @ObfuscatedName("fa.v")
    public class179 field2805;

    @ObfuscatedName("fa.r")
    public class179 field2806;

    @ObfuscatedName("fa.n")
    public int field2804 = 0;

    public class175(int arg0) {
        this.field2807 = arg0;
        this.field2803 = new class179[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field2803[var2] = new class179();
            var3.field2815 = var3;
            var3.field2813 = var3;
        }
    }

    @ObfuscatedName("fa.g(J)Lfu;")
    public class179 method3293(long arg0) {
        class179 var3 = this.field2803[(int) (arg0 & (long) (this.field2807 - 1))];
        for (this.field2805 = var3.field2815; this.field2805 != var3; this.field2805 = this.field2805.field2815) {
            if (this.field2805.field2814 == arg0) {
                class179 var4 = this.field2805;
                this.field2805 = this.field2805.field2815;
                return var4;
            }
        }
        this.field2805 = null;
        return null;
    }

    @ObfuscatedName("fa.m(Lfu;J)V")
    public void method3303(class179 arg0, long arg1) {
        if (arg0.field2813 != null) {
            arg0.method3346();
        }
        class179 var4 = this.field2803[(int) (arg1 & (long) (this.field2807 - 1))];
        arg0.field2813 = var4.field2813;
        arg0.field2815 = var4;
        arg0.field2813.field2815 = arg0;
        arg0.field2815.field2813 = arg0;
        arg0.field2814 = arg1;
    }

    @ObfuscatedName("fa.v()V")
    public void method3298() {
        for (int var1 = 0; var1 < this.field2807; var1++) {
            class179 var2 = this.field2803[var1];
            while (true) {
                class179 var3 = var2.field2815;
                if (var2 == var3) {
                    break;
                }
                var3.method3346();
            }
        }
        this.field2805 = null;
        this.field2806 = null;
    }

    @ObfuscatedName("fa.r()Lfu;")
    public class179 method3312() {
        this.field2804 = 0;
        return this.method3297();
    }

    @ObfuscatedName("fa.n()Lfu;")
    public class179 method3297() {
        if (this.field2804 > 0 && this.field2803[this.field2804 - 1] != this.field2806) {
            class179 var1 = this.field2806;
            this.field2806 = var1.field2815;
            return var1;
        }
        class179 var2;
        do {
            if (this.field2804 >= this.field2807) {
                return null;
            }
            var2 = this.field2803[this.field2804++].field2815;
        } while (this.field2803[this.field2804 - 1] == var2);
        this.field2806 = var2.field2815;
        return var2;
    }
}
