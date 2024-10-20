package deob;

@ObfuscatedName("gq")
public final class class187 {

    @ObfuscatedName("gq.n")
    public int field2988;

    @ObfuscatedName("gq.w")
    public class199[] field2990;

    @ObfuscatedName("gq.i")
    public class199 field2989;

    @ObfuscatedName("gq.e")
    public class199 field2987;

    @ObfuscatedName("gq.h")
    public int field2991 = 0;

    public class187(int arg0) {
        this.field2988 = arg0;
        this.field2990 = new class199[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class199 var3 = this.field2990[var2] = new class199();
            var3.field3014 = var3;
            var3.field3012 = var3;
        }
    }

    @ObfuscatedName("gq.n(J)Lgn;")
    public class199 method3354(long arg0) {
        class199 var3 = this.field2990[(int) (arg0 & (long) (this.field2988 - 1))];
        for (this.field2989 = var3.field3014; this.field2989 != var3; this.field2989 = this.field2989.field3014) {
            if (this.field2989.field3013 == arg0) {
                class199 var4 = this.field2989;
                this.field2989 = this.field2989.field3014;
                return var4;
            }
        }
        this.field2989 = null;
        return null;
    }

    @ObfuscatedName("gq.w(Lgn;J)V")
    public void method3346(class199 arg0, long arg1) {
        if (arg0.field3012 != null) {
            arg0.method3474();
        }
        class199 var4 = this.field2990[(int) (arg1 & (long) (this.field2988 - 1))];
        arg0.field3012 = var4.field3012;
        arg0.field3014 = var4;
        arg0.field3012.field3014 = arg0;
        arg0.field3014.field3012 = arg0;
        arg0.field3013 = arg1;
    }

    @ObfuscatedName("gq.i()V")
    public void method3347() {
        for (int var1 = 0; var1 < this.field2988; var1++) {
            class199 var2 = this.field2990[var1];
            while (true) {
                class199 var3 = var2.field3014;
                if (var2 == var3) {
                    break;
                }
                var3.method3474();
            }
        }
        this.field2989 = null;
        this.field2987 = null;
    }

    @ObfuscatedName("gq.e()Lgn;")
    public class199 method3345() {
        this.field2991 = 0;
        return this.method3358();
    }

    @ObfuscatedName("gq.h()Lgn;")
    public class199 method3358() {
        if (this.field2991 > 0 && this.field2990[this.field2991 - 1] != this.field2987) {
            class199 var1 = this.field2987;
            this.field2987 = var1.field3014;
            return var1;
        }
        class199 var2;
        do {
            if (this.field2991 >= this.field2988) {
                return null;
            }
            var2 = this.field2990[this.field2991++].field3014;
        } while (this.field2990[this.field2991 - 1] == var2);
        this.field2987 = var2.field3014;
        return var2;
    }
}
