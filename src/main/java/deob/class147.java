package deob;

@ObfuscatedName("ed")
public final class class147 {

    @ObfuscatedName("ed.d")
    public int field2026;

    @ObfuscatedName("ed.c")
    public class149[] field2028;

    @ObfuscatedName("ed.n")
    public class149 field2025;

    @ObfuscatedName("ed.q")
    public class149 field2027;

    @ObfuscatedName("ed.t")
    public int field2029 = 0;

    public class147(int arg0) {
        this.field2026 = arg0;
        this.field2028 = new class149[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class149 var3 = this.field2028[var2] = new class149();
            var3.field2032 = var3;
            var3.field2033 = var3;
        }
    }

    @ObfuscatedName("ed.d(J)Lew;")
    public class149 method2611(long arg0) {
        class149 var3 = this.field2028[(int) (arg0 & (long) (this.field2026 - 1))];
        for (this.field2025 = var3.field2032; this.field2025 != var3; this.field2025 = this.field2025.field2032) {
            if (this.field2025.field2034 == arg0) {
                class149 var4 = this.field2025;
                this.field2025 = this.field2025.field2032;
                return var4;
            }
        }
        this.field2025 = null;
        return null;
    }

    @ObfuscatedName("ed.c(Lew;J)V")
    public void method2612(class149 arg0, long arg1) {
        if (arg0.field2033 != null) {
            arg0.method2652();
        }
        class149 var4 = this.field2028[(int) (arg1 & (long) (this.field2026 - 1))];
        arg0.field2033 = var4.field2033;
        arg0.field2032 = var4;
        arg0.field2033.field2032 = arg0;
        arg0.field2032.field2033 = arg0;
        arg0.field2034 = arg1;
    }

    @ObfuscatedName("ed.n()V")
    public void method2613() {
        for (int var1 = 0; var1 < this.field2026; var1++) {
            class149 var2 = this.field2028[var1];
            while (true) {
                class149 var3 = var2.field2032;
                if (var2 == var3) {
                    break;
                }
                var3.method2652();
            }
        }
        this.field2025 = null;
        this.field2027 = null;
    }

    @ObfuscatedName("ed.q()Lew;")
    public class149 method2614() {
        this.field2029 = 0;
        return this.method2615();
    }

    @ObfuscatedName("ed.t()Lew;")
    public class149 method2615() {
        if (this.field2029 > 0 && this.field2028[this.field2029 - 1] != this.field2027) {
            class149 var1 = this.field2027;
            this.field2027 = var1.field2032;
            return var1;
        }
        class149 var2;
        do {
            if (this.field2029 >= this.field2026) {
                return null;
            }
            var2 = this.field2028[this.field2029++].field2032;
        } while (this.field2028[this.field2029 - 1] == var2);
        this.field2027 = var2.field2032;
        return var2;
    }
}
