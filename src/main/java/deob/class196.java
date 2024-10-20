package deob;

@ObfuscatedName("gf")
public final class class196 {

    @ObfuscatedName("gf.g")
    public int field3075;

    @ObfuscatedName("gf.b")
    public class208[] field3074;

    @ObfuscatedName("gf.w")
    public class208 field3076;

    @ObfuscatedName("gf.d")
    public class208 field3073;

    @ObfuscatedName("gf.z")
    public int field3077 = 0;

    public class196(int arg0) {
        this.field3075 = arg0;
        this.field3074 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3074[var2] = new class208();
            var3.field3098 = var3;
            var3.field3100 = var3;
        }
    }

    @ObfuscatedName("gf.g(J)Lgr;")
    public class208 method3573(long arg0) {
        class208 var3 = this.field3074[(int) (arg0 & (long) (this.field3075 - 1))];
        for (this.field3076 = var3.field3098; this.field3076 != var3; this.field3076 = this.field3076.field3098) {
            if (this.field3076.field3099 == arg0) {
                class208 var4 = this.field3076;
                this.field3076 = this.field3076.field3098;
                return var4;
            }
        }
        this.field3076 = null;
        return null;
    }

    @ObfuscatedName("gf.b(Lgr;J)V")
    public void method3569(class208 arg0, long arg1) {
        if (arg0.field3100 != null) {
            arg0.method3693();
        }
        class208 var4 = this.field3074[(int) (arg1 & (long) (this.field3075 - 1))];
        arg0.field3100 = var4.field3100;
        arg0.field3098 = var4;
        arg0.field3100.field3098 = arg0;
        arg0.field3098.field3100 = arg0;
        arg0.field3099 = arg1;
    }

    @ObfuscatedName("gf.w()V")
    public void method3570() {
        for (int var1 = 0; var1 < this.field3075; var1++) {
            class208 var2 = this.field3074[var1];
            while (true) {
                class208 var3 = var2.field3098;
                if (var2 == var3) {
                    break;
                }
                var3.method3693();
            }
        }
        this.field3076 = null;
        this.field3073 = null;
    }

    @ObfuscatedName("gf.d()Lgr;")
    public class208 method3571() {
        this.field3077 = 0;
        return this.method3572();
    }

    @ObfuscatedName("gf.z()Lgr;")
    public class208 method3572() {
        if (this.field3077 > 0 && this.field3074[this.field3077 - 1] != this.field3073) {
            class208 var1 = this.field3073;
            this.field3073 = var1.field3098;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3077 >= this.field3075) {
                return null;
            }
            var2 = this.field3074[this.field3077++].field3098;
        } while (this.field3074[this.field3077 - 1] == var2);
        this.field3073 = var2.field3098;
        return var2;
    }
}
