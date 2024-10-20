package deob;

import java.util.Iterator;

@ObfuscatedName("gr")
public final class class198 implements Iterable {

    @ObfuscatedName("gr.o")
    public int field3079;

    @ObfuscatedName("gr.f")
    public class208[] field3078;

    @ObfuscatedName("gr.i")
    public class208 field3080;

    public class198(int arg0) {
        this.field3079 = arg0;
        this.field3078 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3078[var2] = new class208();
            var3.field3098 = var3;
            var3.field3099 = var3;
        }
    }

    @ObfuscatedName("gr.o(J)Lgu;")
    public class208 method3501(long arg0) {
        class208 var3 = this.field3078[(int) (arg0 & (long) (this.field3079 - 1))];
        for (this.field3080 = var3.field3098; this.field3080 != var3; this.field3080 = this.field3080.field3098) {
            if (this.field3080.field3097 == arg0) {
                class208 var4 = this.field3080;
                this.field3080 = this.field3080.field3098;
                return var4;
            }
        }
        this.field3080 = null;
        return null;
    }

    @ObfuscatedName("gr.f(Lgu;J)V")
    public void method3512(class208 arg0, long arg1) {
        if (arg0.field3099 != null) {
            arg0.method3605();
        }
        class208 var4 = this.field3078[(int) (arg1 & (long) (this.field3079 - 1))];
        arg0.field3099 = var4.field3099;
        arg0.field3098 = var4;
        arg0.field3099.field3098 = arg0;
        arg0.field3098.field3099 = arg0;
        arg0.field3097 = arg1;
    }

    @ObfuscatedName("gr.i()V")
    public void method3503() {
        for (int var1 = 0; var1 < this.field3079; var1++) {
            class208 var2 = this.field3078[var1];
            while (true) {
                class208 var3 = var2.field3098;
                if (var2 == var3) {
                    break;
                }
                var3.method3605();
            }
        }
        this.field3080 = null;
    }

    public Iterator iterator() {
        return new class194(this);
    }
}
