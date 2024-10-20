package deob;

@ObfuscatedName("gf")
public final class class187 {

    @ObfuscatedName("gf.p")
    public int field2992;

    @ObfuscatedName("gf.k")
    public class199[] field2990;

    @ObfuscatedName("gf.e")
    public class199 field2989;

    @ObfuscatedName("gf.f")
    public class199 field2991;

    @ObfuscatedName("gf.w")
    public int field2993 = 0;

    public class187(int arg0) {
        this.field2992 = arg0;
        this.field2990 = new class199[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class199 var3 = this.field2990[var2] = new class199();
            var3.field3014 = var3;
            var3.field3016 = var3;
        }
    }

    @ObfuscatedName("gf.p(J)Lgl;")
    public class199 method3405(long arg0) {
        class199 var3 = this.field2990[(int) (arg0 & (long) (this.field2992 - 1))];
        for (this.field2989 = var3.field3014; this.field2989 != var3; this.field2989 = this.field2989.field3014) {
            if (this.field2989.field3015 == arg0) {
                class199 var4 = this.field2989;
                this.field2989 = this.field2989.field3014;
                return var4;
            }
        }
        this.field2989 = null;
        return null;
    }

    @ObfuscatedName("gf.k(Lgl;J)V")
    public void method3406(class199 arg0, long arg1) {
        if (arg0.field3016 != null) {
            arg0.method3533();
        }
        class199 var4 = this.field2990[(int) (arg1 & (long) (this.field2992 - 1))];
        arg0.field3016 = var4.field3016;
        arg0.field3014 = var4;
        arg0.field3016.field3014 = arg0;
        arg0.field3014.field3016 = arg0;
        arg0.field3015 = arg1;
    }

    @ObfuscatedName("gf.e()V")
    public void method3418() {
        for (int var1 = 0; var1 < this.field2992; var1++) {
            class199 var2 = this.field2990[var1];
            while (true) {
                class199 var3 = var2.field3014;
                if (var2 == var3) {
                    break;
                }
                var3.method3533();
            }
        }
        this.field2989 = null;
        this.field2991 = null;
    }

    @ObfuscatedName("gf.f()Lgl;")
    public class199 method3412() {
        this.field2993 = 0;
        return this.method3410();
    }

    @ObfuscatedName("gf.w()Lgl;")
    public class199 method3410() {
        if (this.field2993 > 0 && this.field2990[this.field2993 - 1] != this.field2991) {
            class199 var1 = this.field2991;
            this.field2991 = var1.field3014;
            return var1;
        }
        class199 var2;
        do {
            if (this.field2993 >= this.field2992) {
                return null;
            }
            var2 = this.field2990[this.field2993++].field3014;
        } while (this.field2990[this.field2993 - 1] == var2);
        this.field2991 = var2.field3014;
        return var2;
    }
}
