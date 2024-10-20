package deob;

@ObfuscatedName("ff")
public final class class177 {

    @ObfuscatedName("ff.f")
    public int field2857;

    @ObfuscatedName("ff.k")
    public class189[] field2858;

    @ObfuscatedName("ff.y")
    public class189 field2861;

    @ObfuscatedName("ff.e")
    public class189 field2860;

    @ObfuscatedName("ff.r")
    public int field2859 = 0;

    public class177(int arg0) {
        this.field2857 = arg0;
        this.field2858 = new class189[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class189 var3 = this.field2858[var2] = new class189();
            var3.field2883 = var3;
            var3.field2884 = var3;
        }
    }

    @ObfuscatedName("ff.f(J)Lgx;")
    public class189 method3244(long arg0) {
        class189 var3 = this.field2858[(int) (arg0 & (long) (this.field2857 - 1))];
        for (this.field2861 = var3.field2883; this.field2861 != var3; this.field2861 = this.field2861.field2883) {
            if (this.field2861.field2882 == arg0) {
                class189 var4 = this.field2861;
                this.field2861 = this.field2861.field2883;
                return var4;
            }
        }
        this.field2861 = null;
        return null;
    }

    @ObfuscatedName("ff.k(Lgx;J)V")
    public void method3245(class189 arg0, long arg1) {
        if (arg0.field2884 != null) {
            arg0.method3367();
        }
        class189 var4 = this.field2858[(int) (arg1 & (long) (this.field2857 - 1))];
        arg0.field2884 = var4.field2884;
        arg0.field2883 = var4;
        arg0.field2884.field2883 = arg0;
        arg0.field2883.field2884 = arg0;
        arg0.field2882 = arg1;
    }

    @ObfuscatedName("ff.y()V")
    public void method3259() {
        for (int var1 = 0; var1 < this.field2857; var1++) {
            class189 var2 = this.field2858[var1];
            while (true) {
                class189 var3 = var2.field2883;
                if (var2 == var3) {
                    break;
                }
                var3.method3367();
            }
        }
        this.field2861 = null;
        this.field2860 = null;
    }

    @ObfuscatedName("ff.e()Lgx;")
    public class189 method3254() {
        this.field2859 = 0;
        return this.method3257();
    }

    @ObfuscatedName("ff.r()Lgx;")
    public class189 method3257() {
        if (this.field2859 > 0 && this.field2858[this.field2859 - 1] != this.field2860) {
            class189 var1 = this.field2860;
            this.field2860 = var1.field2883;
            return var1;
        }
        class189 var2;
        do {
            if (this.field2859 >= this.field2857) {
                return null;
            }
            var2 = this.field2858[this.field2859++].field2883;
        } while (this.field2858[this.field2859 - 1] == var2);
        this.field2860 = var2.field2883;
        return var2;
    }
}
