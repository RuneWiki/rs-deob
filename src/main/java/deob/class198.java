package deob;

import java.util.Iterator;

@ObfuscatedName("gx")
public final class class198 implements Iterable {

    @ObfuscatedName("gx.n")
    public int field3078;

    @ObfuscatedName("gx.d")
    public class208[] field3077;

    @ObfuscatedName("gx.s")
    public class208 field3079;

    public class198(int arg0) {
        this.field3078 = arg0;
        this.field3077 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3077[var2] = new class208();
            var3.field3097 = var3;
            var3.field3098 = var3;
        }
    }

    @ObfuscatedName("gx.n(J)Lge;")
    public class208 method3541(long arg0) {
        class208 var3 = this.field3077[(int) (arg0 & (long) (this.field3078 - 1))];
        for (this.field3079 = var3.field3097; this.field3079 != var3; this.field3079 = this.field3079.field3097) {
            if (this.field3079.field3096 == arg0) {
                class208 var4 = this.field3079;
                this.field3079 = this.field3079.field3097;
                return var4;
            }
        }
        this.field3079 = null;
        return null;
    }

    @ObfuscatedName("gx.d(Lge;J)V")
    public void method3536(class208 arg0, long arg1) {
        if (arg0.field3098 != null) {
            arg0.method3651();
        }
        class208 var4 = this.field3077[(int) (arg1 & (long) (this.field3078 - 1))];
        arg0.field3098 = var4.field3098;
        arg0.field3097 = var4;
        arg0.field3098.field3097 = arg0;
        arg0.field3097.field3098 = arg0;
        arg0.field3096 = arg1;
    }

    @ObfuscatedName("gx.s()V")
    public void method3535() {
        for (int var1 = 0; var1 < this.field3078; var1++) {
            class208 var2 = this.field3077[var1];
            while (true) {
                class208 var3 = var2.field3097;
                if (var2 == var3) {
                    break;
                }
                var3.method3651();
            }
        }
        this.field3079 = null;
    }

    public Iterator iterator() {
        return new class194(this);
    }
}
