package deob;

@ObfuscatedName("gq")
public final class class196 {

    @ObfuscatedName("gq.o")
    public int field3073;

    @ObfuscatedName("gq.f")
    public class208[] field3076;

    @ObfuscatedName("gq.i")
    public class208 field3072;

    @ObfuscatedName("gq.h")
    public class208 field3075;

    @ObfuscatedName("gq.q")
    public int field3074 = 0;

    public class196(int arg0) {
        this.field3073 = arg0;
        this.field3076 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3076[var2] = new class208();
            var3.field3098 = var3;
            var3.field3099 = var3;
        }
    }

    @ObfuscatedName("gq.o(J)Lgu;")
    public class208 method3482(long arg0) {
        class208 var3 = this.field3076[(int) (arg0 & (long) (this.field3073 - 1))];
        for (this.field3072 = var3.field3098; this.field3072 != var3; this.field3072 = this.field3072.field3098) {
            if (this.field3072.field3097 == arg0) {
                class208 var4 = this.field3072;
                this.field3072 = this.field3072.field3098;
                return var4;
            }
        }
        this.field3072 = null;
        return null;
    }

    @ObfuscatedName("gq.f(Lgu;J)V")
    public void method3495(class208 arg0, long arg1) {
        if (arg0.field3099 != null) {
            arg0.method3605();
        }
        class208 var4 = this.field3076[(int) (arg1 & (long) (this.field3073 - 1))];
        arg0.field3099 = var4.field3099;
        arg0.field3098 = var4;
        arg0.field3099.field3098 = arg0;
        arg0.field3098.field3099 = arg0;
        arg0.field3097 = arg1;
    }

    @ObfuscatedName("gq.i()V")
    public void method3485() {
        for (int var1 = 0; var1 < this.field3073; var1++) {
            class208 var2 = this.field3076[var1];
            while (true) {
                class208 var3 = var2.field3098;
                if (var2 == var3) {
                    break;
                }
                var3.method3605();
            }
        }
        this.field3072 = null;
        this.field3075 = null;
    }

    @ObfuscatedName("gq.h()Lgu;")
    public class208 method3486() {
        this.field3074 = 0;
        return this.method3484();
    }

    @ObfuscatedName("gq.q()Lgu;")
    public class208 method3484() {
        if (this.field3074 > 0 && this.field3076[this.field3074 - 1] != this.field3075) {
            class208 var1 = this.field3075;
            this.field3075 = var1.field3098;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3074 >= this.field3073) {
                return null;
            }
            var2 = this.field3076[this.field3074++].field3098;
        } while (this.field3076[this.field3074 - 1] == var2);
        this.field3075 = var2.field3098;
        return var2;
    }
}
