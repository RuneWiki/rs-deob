package deob;

@ObfuscatedName("ft")
public final class class175 {

    @ObfuscatedName("ft.g")
    public int field2859;

    @ObfuscatedName("ft.s")
    public class187[] field2858;

    @ObfuscatedName("ft.v")
    public class187 field2860;

    @ObfuscatedName("ft.o")
    public class187 field2861;

    @ObfuscatedName("ft.k")
    public int field2857 = 0;

    public class175(int arg0) {
        this.field2859 = arg0;
        this.field2858 = new class187[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class187 var3 = this.field2858[var2] = new class187();
            var3.field2883 = var3;
            var3.field2882 = var3;
        }
    }

    @ObfuscatedName("ft.g(J)Lgz;")
    public class187 method3155(long arg0) {
        class187 var3 = this.field2858[(int) (arg0 & (long) (this.field2859 - 1))];
        for (this.field2860 = var3.field2883; this.field2860 != var3; this.field2860 = this.field2860.field2883) {
            if (this.field2860.field2884 == arg0) {
                class187 var4 = this.field2860;
                this.field2860 = this.field2860.field2883;
                return var4;
            }
        }
        this.field2860 = null;
        return null;
    }

    @ObfuscatedName("ft.s(Lgz;J)V")
    public void method3152(class187 arg0, long arg1) {
        if (arg0.field2882 != null) {
            arg0.method3285();
        }
        class187 var4 = this.field2858[(int) (arg1 & (long) (this.field2859 - 1))];
        arg0.field2882 = var4.field2882;
        arg0.field2883 = var4;
        arg0.field2882.field2883 = arg0;
        arg0.field2883.field2882 = arg0;
        arg0.field2884 = arg1;
    }

    @ObfuscatedName("ft.v()V")
    public void method3153() {
        for (int var1 = 0; var1 < this.field2859; var1++) {
            class187 var2 = this.field2858[var1];
            while (true) {
                class187 var3 = var2.field2883;
                if (var2 == var3) {
                    break;
                }
                var3.method3285();
            }
        }
        this.field2860 = null;
        this.field2861 = null;
    }

    @ObfuscatedName("ft.o()Lgz;")
    public class187 method3154() {
        this.field2857 = 0;
        return this.method3163();
    }

    @ObfuscatedName("ft.k()Lgz;")
    public class187 method3163() {
        if (this.field2857 > 0 && this.field2858[this.field2857 - 1] != this.field2861) {
            class187 var1 = this.field2861;
            this.field2861 = var1.field2883;
            return var1;
        }
        class187 var2;
        do {
            if (this.field2857 >= this.field2859) {
                return null;
            }
            var2 = this.field2858[this.field2857++].field2883;
        } while (this.field2858[this.field2857 - 1] == var2);
        this.field2861 = var2.field2883;
        return var2;
    }
}
