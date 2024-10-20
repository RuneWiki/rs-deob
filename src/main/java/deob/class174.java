package deob;

@ObfuscatedName("fl")
public final class class174 {

    @ObfuscatedName("fl.i")
    public int field2847;

    @ObfuscatedName("fl.c")
    public class186[] field2844;

    @ObfuscatedName("fl.h")
    public class186 field2846;

    @ObfuscatedName("fl.v")
    public class186 field2845;

    @ObfuscatedName("fl.q")
    public int field2848 = 0;

    public class174(int arg0) {
        this.field2847 = arg0;
        this.field2844 = new class186[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class186 var3 = this.field2844[var2] = new class186();
            var3.field2870 = var3;
            var3.field2869 = var3;
        }
    }

    @ObfuscatedName("fl.i(J)Lgq;")
    public class186 method3218(long arg0) {
        class186 var3 = this.field2844[(int) (arg0 & (long) (this.field2847 - 1))];
        for (this.field2846 = var3.field2870; this.field2846 != var3; this.field2846 = this.field2846.field2870) {
            if (this.field2846.field2871 == arg0) {
                class186 var4 = this.field2846;
                this.field2846 = this.field2846.field2870;
                return var4;
            }
        }
        this.field2846 = null;
        return null;
    }

    @ObfuscatedName("fl.c(Lgq;J)V")
    public void method3229(class186 arg0, long arg1) {
        if (arg0.field2869 != null) {
            arg0.method3334();
        }
        class186 var4 = this.field2844[(int) (arg1 & (long) (this.field2847 - 1))];
        arg0.field2869 = var4.field2869;
        arg0.field2870 = var4;
        arg0.field2869.field2870 = arg0;
        arg0.field2870.field2869 = arg0;
        arg0.field2871 = arg1;
    }

    @ObfuscatedName("fl.h()V")
    public void method3219() {
        for (int var1 = 0; var1 < this.field2847; var1++) {
            class186 var2 = this.field2844[var1];
            while (true) {
                class186 var3 = var2.field2870;
                if (var2 == var3) {
                    break;
                }
                var3.method3334();
            }
        }
        this.field2846 = null;
        this.field2845 = null;
    }

    @ObfuscatedName("fl.v()Lgq;")
    public class186 method3220() {
        this.field2848 = 0;
        return this.method3221();
    }

    @ObfuscatedName("fl.q()Lgq;")
    public class186 method3221() {
        if (this.field2848 > 0 && this.field2844[this.field2848 - 1] != this.field2845) {
            class186 var1 = this.field2845;
            this.field2845 = var1.field2870;
            return var1;
        }
        class186 var2;
        do {
            if (this.field2848 >= this.field2847) {
                return null;
            }
            var2 = this.field2844[this.field2848++].field2870;
        } while (this.field2844[this.field2848 - 1] == var2);
        this.field2845 = var2.field2870;
        return var2;
    }
}
