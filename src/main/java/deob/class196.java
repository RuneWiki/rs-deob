package deob;

@ObfuscatedName("gm")
public final class class196 {

    @ObfuscatedName("gm.c")
    public int field3072;

    @ObfuscatedName("gm.h")
    public class208[] field3071;

    @ObfuscatedName("gm.k")
    public class208 field3073;

    @ObfuscatedName("gm.t")
    public class208 field3074;

    @ObfuscatedName("gm.g")
    public int field3075 = 0;

    public class196(int arg0) {
        this.field3072 = arg0;
        this.field3071 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3071[var2] = new class208();
            var3.field3097 = var3;
            var3.field3098 = var3;
        }
    }

    @ObfuscatedName("gm.c(J)Lgc;")
    public class208 method3521(long arg0) {
        class208 var3 = this.field3071[(int) (arg0 & (long) (this.field3072 - 1))];
        for (this.field3073 = var3.field3097; this.field3073 != var3; this.field3073 = this.field3073.field3097) {
            if (this.field3073.field3096 == arg0) {
                class208 var4 = this.field3073;
                this.field3073 = this.field3073.field3097;
                return var4;
            }
        }
        this.field3073 = null;
        return null;
    }

    @ObfuscatedName("gm.h(Lgc;J)V")
    public void method3531(class208 arg0, long arg1) {
        if (arg0.field3098 != null) {
            arg0.method3646();
        }
        class208 var4 = this.field3071[(int) (arg1 & (long) (this.field3072 - 1))];
        arg0.field3098 = var4.field3098;
        arg0.field3097 = var4;
        arg0.field3098.field3097 = arg0;
        arg0.field3097.field3098 = arg0;
        arg0.field3096 = arg1;
    }

    @ObfuscatedName("gm.k()V")
    public void method3523() {
        for (int var1 = 0; var1 < this.field3072; var1++) {
            class208 var2 = this.field3071[var1];
            while (true) {
                class208 var3 = var2.field3097;
                if (var2 == var3) {
                    break;
                }
                var3.method3646();
            }
        }
        this.field3073 = null;
        this.field3074 = null;
    }

    @ObfuscatedName("gm.t()Lgc;")
    public class208 method3520() {
        this.field3075 = 0;
        return this.method3533();
    }

    @ObfuscatedName("gm.g()Lgc;")
    public class208 method3533() {
        if (this.field3075 > 0 && this.field3071[this.field3075 - 1] != this.field3074) {
            class208 var1 = this.field3074;
            this.field3074 = var1.field3097;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3075 >= this.field3072) {
                return null;
            }
            var2 = this.field3071[this.field3075++].field3097;
        } while (this.field3071[this.field3075 - 1] == var2);
        this.field3074 = var2.field3097;
        return var2;
    }
}
