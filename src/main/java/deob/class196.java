package deob;

@ObfuscatedName("gm")
public final class class196 {

    @ObfuscatedName("gm.i")
    public int field3077;

    @ObfuscatedName("gm.v")
    public class208[] field3074;

    @ObfuscatedName("gm.f")
    public class208 field3073;

    @ObfuscatedName("gm.h")
    public class208 field3076;

    @ObfuscatedName("gm.a")
    public int field3075 = 0;

    public class196(int arg0) {
        this.field3077 = arg0;
        this.field3074 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3074[var2] = new class208();
            var3.field3098 = var3;
            var3.field3100 = var3;
        }
    }

    @ObfuscatedName("gm.i(J)Lgp;")
    public class208 method3509(long arg0) {
        class208 var3 = this.field3074[(int) (arg0 & (long) (this.field3077 - 1))];
        for (this.field3073 = var3.field3098; this.field3073 != var3; this.field3073 = this.field3073.field3098) {
            if (this.field3073.field3099 == arg0) {
                class208 var4 = this.field3073;
                this.field3073 = this.field3073.field3098;
                return var4;
            }
        }
        this.field3073 = null;
        return null;
    }

    @ObfuscatedName("gm.v(Lgp;J)V")
    public void method3495(class208 arg0, long arg1) {
        if (arg0.field3100 != null) {
            arg0.method3624();
        }
        class208 var4 = this.field3074[(int) (arg1 & (long) (this.field3077 - 1))];
        arg0.field3100 = var4.field3100;
        arg0.field3098 = var4;
        arg0.field3100.field3098 = arg0;
        arg0.field3098.field3100 = arg0;
        arg0.field3099 = arg1;
    }

    @ObfuscatedName("gm.f()V")
    public void method3498() {
        for (int var1 = 0; var1 < this.field3077; var1++) {
            class208 var2 = this.field3074[var1];
            while (true) {
                class208 var3 = var2.field3098;
                if (var2 == var3) {
                    break;
                }
                var3.method3624();
            }
        }
        this.field3073 = null;
        this.field3076 = null;
    }

    @ObfuscatedName("gm.h()Lgp;")
    public class208 method3496() {
        this.field3075 = 0;
        return this.method3500();
    }

    @ObfuscatedName("gm.a()Lgp;")
    public class208 method3500() {
        if (this.field3075 > 0 && this.field3074[this.field3075 - 1] != this.field3076) {
            class208 var1 = this.field3076;
            this.field3076 = var1.field3098;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3075 >= this.field3077) {
                return null;
            }
            var2 = this.field3074[this.field3075++].field3098;
        } while (this.field3074[this.field3075 - 1] == var2);
        this.field3076 = var2.field3098;
        return var2;
    }
}
