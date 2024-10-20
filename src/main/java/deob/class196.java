package deob;

@ObfuscatedName("gd")
public final class class196 {

    @ObfuscatedName("gd.i")
    public int field3078;

    @ObfuscatedName("gd.v")
    public class208[] field3075;

    @ObfuscatedName("gd.r")
    public class208 field3076;

    @ObfuscatedName("gd.n")
    public class208 field3077;

    @ObfuscatedName("gd.x")
    public int field3074 = 0;

    public class196(int arg0) {
        this.field3078 = arg0;
        this.field3075 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3075[var2] = new class208();
            var3.field3099 = var3;
            var3.field3101 = var3;
        }
    }

    @ObfuscatedName("gd.i(J)Lgo;")
    public class208 method3496(long arg0) {
        class208 var3 = this.field3075[(int) (arg0 & (long) (this.field3078 - 1))];
        for (this.field3076 = var3.field3099; this.field3076 != var3; this.field3076 = this.field3076.field3099) {
            if (this.field3076.field3100 == arg0) {
                class208 var4 = this.field3076;
                this.field3076 = this.field3076.field3099;
                return var4;
            }
        }
        this.field3076 = null;
        return null;
    }

    @ObfuscatedName("gd.v(Lgo;J)V")
    public void method3497(class208 arg0, long arg1) {
        if (arg0.field3101 != null) {
            arg0.method3626();
        }
        class208 var4 = this.field3075[(int) (arg1 & (long) (this.field3078 - 1))];
        arg0.field3101 = var4.field3101;
        arg0.field3099 = var4;
        arg0.field3101.field3099 = arg0;
        arg0.field3099.field3101 = arg0;
        arg0.field3100 = arg1;
    }

    @ObfuscatedName("gd.r()V")
    public void method3498() {
        for (int var1 = 0; var1 < this.field3078; var1++) {
            class208 var2 = this.field3075[var1];
            while (true) {
                class208 var3 = var2.field3099;
                if (var2 == var3) {
                    break;
                }
                var3.method3626();
            }
        }
        this.field3076 = null;
        this.field3077 = null;
    }

    @ObfuscatedName("gd.n()Lgo;")
    public class208 method3506() {
        this.field3074 = 0;
        return this.method3500();
    }

    @ObfuscatedName("gd.x()Lgo;")
    public class208 method3500() {
        if (this.field3074 > 0 && this.field3075[this.field3074 - 1] != this.field3077) {
            class208 var1 = this.field3077;
            this.field3077 = var1.field3099;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3074 >= this.field3078) {
                return null;
            }
            var2 = this.field3075[this.field3074++].field3099;
        } while (this.field3075[this.field3074 - 1] == var2);
        this.field3077 = var2.field3099;
        return var2;
    }
}
