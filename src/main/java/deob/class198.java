package deob;

import java.util.Iterator;

@ObfuscatedName("gi")
public final class class198 implements Iterable {

    @ObfuscatedName("gi.c")
    public int field3079;

    @ObfuscatedName("gi.h")
    public class208[] field3078;

    @ObfuscatedName("gi.k")
    public class208 field3077;

    public class198(int arg0) {
        this.field3079 = arg0;
        this.field3078 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3078[var2] = new class208();
            var3.field3097 = var3;
            var3.field3098 = var3;
        }
    }

    @ObfuscatedName("gi.c(J)Lgc;")
    public class208 method3548(long arg0) {
        class208 var3 = this.field3078[(int) (arg0 & (long) (this.field3079 - 1))];
        for (this.field3077 = var3.field3097; this.field3077 != var3; this.field3077 = this.field3077.field3097) {
            if (this.field3077.field3096 == arg0) {
                class208 var4 = this.field3077;
                this.field3077 = this.field3077.field3097;
                return var4;
            }
        }
        this.field3077 = null;
        return null;
    }

    @ObfuscatedName("gi.h(Lgc;J)V")
    public void method3538(class208 arg0, long arg1) {
        if (arg0.field3098 != null) {
            arg0.method3646();
        }
        class208 var4 = this.field3078[(int) (arg1 & (long) (this.field3079 - 1))];
        arg0.field3098 = var4.field3098;
        arg0.field3097 = var4;
        arg0.field3098.field3097 = arg0;
        arg0.field3097.field3098 = arg0;
        arg0.field3096 = arg1;
    }

    @ObfuscatedName("gi.k()V")
    public void method3536() {
        for (int var1 = 0; var1 < this.field3079; var1++) {
            class208 var2 = this.field3078[var1];
            while (true) {
                class208 var3 = var2.field3097;
                if (var2 == var3) {
                    break;
                }
                var3.method3646();
            }
        }
        this.field3077 = null;
    }

    public Iterator iterator() {
        return new class194(this);
    }
}
