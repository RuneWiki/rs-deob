package deob;

import java.util.Iterator;

@ObfuscatedName("gu")
public final class class198 implements Iterable {

    @ObfuscatedName("gu.i")
    public int field3081;

    @ObfuscatedName("gu.v")
    public class208[] field3080;

    @ObfuscatedName("gu.f")
    public class208 field3079;

    public class198(int arg0) {
        this.field3081 = arg0;
        this.field3080 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3080[var2] = new class208();
            var3.field3098 = var3;
            var3.field3100 = var3;
        }
    }

    @ObfuscatedName("gu.i(J)Lgp;")
    public class208 method3523(long arg0) {
        class208 var3 = this.field3080[(int) (arg0 & (long) (this.field3081 - 1))];
        for (this.field3079 = var3.field3098; this.field3079 != var3; this.field3079 = this.field3079.field3098) {
            if (this.field3079.field3099 == arg0) {
                class208 var4 = this.field3079;
                this.field3079 = this.field3079.field3098;
                return var4;
            }
        }
        this.field3079 = null;
        return null;
    }

    @ObfuscatedName("gu.v(Lgp;J)V")
    public void method3515(class208 arg0, long arg1) {
        if (arg0.field3100 != null) {
            arg0.method3624();
        }
        class208 var4 = this.field3080[(int) (arg1 & (long) (this.field3081 - 1))];
        arg0.field3100 = var4.field3100;
        arg0.field3098 = var4;
        arg0.field3100.field3098 = arg0;
        arg0.field3098.field3100 = arg0;
        arg0.field3099 = arg1;
    }

    @ObfuscatedName("gu.f()V")
    public void method3520() {
        for (int var1 = 0; var1 < this.field3081; var1++) {
            class208 var2 = this.field3080[var1];
            while (true) {
                class208 var3 = var2.field3098;
                if (var2 == var3) {
                    break;
                }
                var3.method3624();
            }
        }
        this.field3079 = null;
    }

    public Iterator iterator() {
        return new class194(this);
    }
}
