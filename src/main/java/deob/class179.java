package deob;

@ObfuscatedName("fx")
public final class class179 {

    @ObfuscatedName("fx.b")
    public int field2880;

    @ObfuscatedName("fx.e")
    public class191[] field2879;

    @ObfuscatedName("fx.i")
    public class191 field2881;

    @ObfuscatedName("fx.k")
    public class191 field2882;

    @ObfuscatedName("fx.h")
    public int field2883 = 0;

    public class179(int arg0) {
        this.field2880 = arg0;
        this.field2879 = new class191[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class191 var3 = this.field2879[var2] = new class191();
            var3.field2904 = var3;
            var3.field2906 = var3;
        }
    }

    @ObfuscatedName("fx.b(J)Lgx;")
    public class191 method3257(long arg0) {
        class191 var3 = this.field2879[(int) (arg0 & (long) (this.field2880 - 1))];
        for (this.field2881 = var3.field2904; this.field2881 != var3; this.field2881 = this.field2881.field2904) {
            if (this.field2881.field2905 == arg0) {
                class191 var4 = this.field2881;
                this.field2881 = this.field2881.field2904;
                return var4;
            }
        }
        this.field2881 = null;
        return null;
    }

    @ObfuscatedName("fx.e(Lgx;J)V")
    public void method3258(class191 arg0, long arg1) {
        if (arg0.field2906 != null) {
            arg0.method3392();
        }
        class191 var4 = this.field2879[(int) (arg1 & (long) (this.field2880 - 1))];
        arg0.field2906 = var4.field2906;
        arg0.field2904 = var4;
        arg0.field2906.field2904 = arg0;
        arg0.field2904.field2906 = arg0;
        arg0.field2905 = arg1;
    }

    @ObfuscatedName("fx.i()V")
    public void method3267() {
        for (int var1 = 0; var1 < this.field2880; var1++) {
            class191 var2 = this.field2879[var1];
            while (true) {
                class191 var3 = var2.field2904;
                if (var2 == var3) {
                    break;
                }
                var3.method3392();
            }
        }
        this.field2881 = null;
        this.field2882 = null;
    }

    @ObfuscatedName("fx.k()Lgx;")
    public class191 method3260() {
        this.field2883 = 0;
        return this.method3261();
    }

    @ObfuscatedName("fx.h()Lgx;")
    public class191 method3261() {
        if (this.field2883 > 0 && this.field2879[this.field2883 - 1] != this.field2882) {
            class191 var1 = this.field2882;
            this.field2882 = var1.field2904;
            return var1;
        }
        class191 var2;
        do {
            if (this.field2883 >= this.field2880) {
                return null;
            }
            var2 = this.field2879[this.field2883++].field2904;
        } while (this.field2879[this.field2883 - 1] == var2);
        this.field2882 = var2.field2904;
        return var2;
    }
}
