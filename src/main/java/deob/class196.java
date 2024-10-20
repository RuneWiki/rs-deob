package deob;

@ObfuscatedName("gw")
public final class class196 {

    @ObfuscatedName("gw.n")
    public int field3071;

    @ObfuscatedName("gw.d")
    public class208[] field3072;

    @ObfuscatedName("gw.s")
    public class208 field3073;

    @ObfuscatedName("gw.q")
    public class208 field3075;

    @ObfuscatedName("gw.j")
    public int field3074 = 0;

    public class196(int arg0) {
        this.field3071 = arg0;
        this.field3072 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3072[var2] = new class208();
            var3.field3097 = var3;
            var3.field3098 = var3;
        }
    }

    @ObfuscatedName("gw.n(J)Lge;")
    public class208 method3519(long arg0) {
        class208 var3 = this.field3072[(int) (arg0 & (long) (this.field3071 - 1))];
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

    @ObfuscatedName("gw.d(Lge;J)V")
    public void method3526(class208 arg0, long arg1) {
        if (arg0.field3098 != null) {
            arg0.method3651();
        }
        class208 var4 = this.field3072[(int) (arg1 & (long) (this.field3071 - 1))];
        arg0.field3098 = var4.field3098;
        arg0.field3097 = var4;
        arg0.field3098.field3097 = arg0;
        arg0.field3097.field3098 = arg0;
        arg0.field3096 = arg1;
    }

    @ObfuscatedName("gw.s()V")
    public void method3518() {
        for (int var1 = 0; var1 < this.field3071; var1++) {
            class208 var2 = this.field3072[var1];
            while (true) {
                class208 var3 = var2.field3097;
                if (var2 == var3) {
                    break;
                }
                var3.method3651();
            }
        }
        this.field3073 = null;
        this.field3075 = null;
    }

    @ObfuscatedName("gw.q()Lge;")
    public class208 method3522() {
        this.field3074 = 0;
        return this.method3523();
    }

    @ObfuscatedName("gw.j()Lge;")
    public class208 method3523() {
        if (this.field3074 > 0 && this.field3072[this.field3074 - 1] != this.field3075) {
            class208 var1 = this.field3075;
            this.field3075 = var1.field3097;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3074 >= this.field3071) {
                return null;
            }
            var2 = this.field3072[this.field3074++].field3097;
        } while (this.field3072[this.field3074 - 1] == var2);
        this.field3075 = var2.field3097;
        return var2;
    }
}
