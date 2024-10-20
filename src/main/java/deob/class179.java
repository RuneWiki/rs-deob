package deob;

@ObfuscatedName("fh")
public final class class179 {

    @ObfuscatedName("fh.a")
    public int field2885;

    @ObfuscatedName("fh.v")
    public class191[] field2883;

    @ObfuscatedName("fh.i")
    public class191 field2884;

    @ObfuscatedName("fh.b")
    public class191 field2886;

    @ObfuscatedName("fh.l")
    public int field2882 = 0;

    public class179(int arg0) {
        this.field2885 = arg0;
        this.field2883 = new class191[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class191 var3 = this.field2883[var2] = new class191();
            var3.field2909 = var3;
            var3.field2907 = var3;
        }
    }

    @ObfuscatedName("fh.a(J)Lgq;")
    public class191 method3231(long arg0) {
        class191 var3 = this.field2883[(int) (arg0 & (long) (this.field2885 - 1))];
        for (this.field2884 = var3.field2909; this.field2884 != var3; this.field2884 = this.field2884.field2909) {
            if (this.field2884.field2908 == arg0) {
                class191 var4 = this.field2884;
                this.field2884 = this.field2884.field2909;
                return var4;
            }
        }
        this.field2884 = null;
        return null;
    }

    @ObfuscatedName("fh.v(Lgq;J)V")
    public void method3211(class191 arg0, long arg1) {
        if (arg0.field2907 != null) {
            arg0.method3343();
        }
        class191 var4 = this.field2883[(int) (arg1 & (long) (this.field2885 - 1))];
        arg0.field2907 = var4.field2907;
        arg0.field2909 = var4;
        arg0.field2907.field2909 = arg0;
        arg0.field2909.field2907 = arg0;
        arg0.field2908 = arg1;
    }

    @ObfuscatedName("fh.i()V")
    public void method3212() {
        for (int var1 = 0; var1 < this.field2885; var1++) {
            class191 var2 = this.field2883[var1];
            while (true) {
                class191 var3 = var2.field2909;
                if (var2 == var3) {
                    break;
                }
                var3.method3343();
            }
        }
        this.field2884 = null;
        this.field2886 = null;
    }

    @ObfuscatedName("fh.b()Lgq;")
    public class191 method3210() {
        this.field2882 = 0;
        return this.method3214();
    }

    @ObfuscatedName("fh.l()Lgq;")
    public class191 method3214() {
        if (this.field2882 > 0 && this.field2883[this.field2882 - 1] != this.field2886) {
            class191 var1 = this.field2886;
            this.field2886 = var1.field2909;
            return var1;
        }
        class191 var2;
        do {
            if (this.field2882 >= this.field2885) {
                return null;
            }
            var2 = this.field2883[this.field2882++].field2909;
        } while (this.field2883[this.field2882 - 1] == var2);
        this.field2886 = var2.field2909;
        return var2;
    }
}
