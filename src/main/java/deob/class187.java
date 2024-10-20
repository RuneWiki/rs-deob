package deob;

@ObfuscatedName("gd")
public final class class187 {

    @ObfuscatedName("gd.y")
    public int field3003;

    @ObfuscatedName("gd.k")
    public class199[] field3000;

    @ObfuscatedName("gd.g")
    public class199 field3002;

    @ObfuscatedName("gd.n")
    public class199 field2999;

    @ObfuscatedName("gd.t")
    public int field3001 = 0;

    public class187(int arg0) {
        this.field3003 = arg0;
        this.field3000 = new class199[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class199 var3 = this.field3000[var2] = new class199();
            var3.field3025 = var3;
            var3.field3026 = var3;
        }
    }

    @ObfuscatedName("gd.y(J)Lgb;")
    public class199 method3357(long arg0) {
        class199 var3 = this.field3000[(int) (arg0 & (long) (this.field3003 - 1))];
        for (this.field3002 = var3.field3025; this.field3002 != var3; this.field3002 = this.field3002.field3025) {
            if (this.field3002.field3024 == arg0) {
                class199 var4 = this.field3002;
                this.field3002 = this.field3002.field3025;
                return var4;
            }
        }
        this.field3002 = null;
        return null;
    }

    @ObfuscatedName("gd.k(Lgb;J)V")
    public void method3358(class199 arg0, long arg1) {
        if (arg0.field3026 != null) {
            arg0.method3482();
        }
        class199 var4 = this.field3000[(int) (arg1 & (long) (this.field3003 - 1))];
        arg0.field3026 = var4.field3026;
        arg0.field3025 = var4;
        arg0.field3026.field3025 = arg0;
        arg0.field3025.field3026 = arg0;
        arg0.field3024 = arg1;
    }

    @ObfuscatedName("gd.g()V")
    public void method3356() {
        for (int var1 = 0; var1 < this.field3003; var1++) {
            class199 var2 = this.field3000[var1];
            while (true) {
                class199 var3 = var2.field3025;
                if (var2 == var3) {
                    break;
                }
                var3.method3482();
            }
        }
        this.field3002 = null;
        this.field2999 = null;
    }

    @ObfuscatedName("gd.n()Lgb;")
    public class199 method3360() {
        this.field3001 = 0;
        return this.method3373();
    }

    @ObfuscatedName("gd.t()Lgb;")
    public class199 method3373() {
        if (this.field3001 > 0 && this.field3000[this.field3001 - 1] != this.field2999) {
            class199 var1 = this.field2999;
            this.field2999 = var1.field3025;
            return var1;
        }
        class199 var2;
        do {
            if (this.field3001 >= this.field3003) {
                return null;
            }
            var2 = this.field3000[this.field3001++].field3025;
        } while (this.field3000[this.field3001 - 1] == var2);
        this.field2999 = var2.field3025;
        return var2;
    }
}
