package deob;

@ObfuscatedName("fu")
public final class class175 {

    @ObfuscatedName("fu.p")
    public int field2855;

    @ObfuscatedName("fu.g")
    public class187[] field2858;

    @ObfuscatedName("fu.x")
    public class187 field2856;

    @ObfuscatedName("fu.c")
    public class187 field2854;

    @ObfuscatedName("fu.n")
    public int field2857 = 0;

    public class175(int arg0) {
        this.field2855 = arg0;
        this.field2858 = new class187[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class187 var3 = this.field2858[var2] = new class187();
            var3.field2880 = var3;
            var3.field2879 = var3;
        }
    }

    @ObfuscatedName("fu.p(J)Lgq;")
    public class187 method3263(long arg0) {
        class187 var3 = this.field2858[(int) (arg0 & (long) (this.field2855 - 1))];
        for (this.field2856 = var3.field2880; this.field2856 != var3; this.field2856 = this.field2856.field2880) {
            if (this.field2856.field2881 == arg0) {
                class187 var4 = this.field2856;
                this.field2856 = this.field2856.field2880;
                return var4;
            }
        }
        this.field2856 = null;
        return null;
    }

    @ObfuscatedName("fu.g(Lgq;J)V")
    public void method3264(class187 arg0, long arg1) {
        if (arg0.field2879 != null) {
            arg0.method3378();
        }
        class187 var4 = this.field2858[(int) (arg1 & (long) (this.field2855 - 1))];
        arg0.field2879 = var4.field2879;
        arg0.field2880 = var4;
        arg0.field2879.field2880 = arg0;
        arg0.field2880.field2879 = arg0;
        arg0.field2881 = arg1;
    }

    @ObfuscatedName("fu.x()V")
    public void method3269() {
        for (int var1 = 0; var1 < this.field2855; var1++) {
            class187 var2 = this.field2858[var1];
            while (true) {
                class187 var3 = var2.field2880;
                if (var2 == var3) {
                    break;
                }
                var3.method3378();
            }
        }
        this.field2856 = null;
        this.field2854 = null;
    }

    @ObfuscatedName("fu.c()Lgq;")
    public class187 method3277() {
        this.field2857 = 0;
        return this.method3267();
    }

    @ObfuscatedName("fu.n()Lgq;")
    public class187 method3267() {
        if (this.field2857 > 0 && this.field2858[this.field2857 - 1] != this.field2854) {
            class187 var1 = this.field2854;
            this.field2854 = var1.field2880;
            return var1;
        }
        class187 var2;
        do {
            if (this.field2857 >= this.field2855) {
                return null;
            }
            var2 = this.field2858[this.field2857++].field2880;
        } while (this.field2858[this.field2857 - 1] == var2);
        this.field2854 = var2.field2880;
        return var2;
    }
}
