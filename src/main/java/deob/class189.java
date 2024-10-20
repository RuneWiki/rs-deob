package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public final class class189 implements Iterable {

    @ObfuscatedName("gm.o")
    public int field2996;

    @ObfuscatedName("gm.l")
    public class199[] field2995;

    @ObfuscatedName("gm.g")
    public class199 field2994;

    public class189(int arg0) {
        this.field2996 = arg0;
        this.field2995 = new class199[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class199 var3 = this.field2995[var2] = new class199();
            var3.field3013 = var3;
            var3.field3014 = var3;
        }
    }

    @ObfuscatedName("gm.o(J)Lgj;")
    public class199 method3457(long arg0) {
        class199 var3 = this.field2995[(int) (arg0 & (long) (this.field2996 - 1))];
        for (this.field2994 = var3.field3013; this.field2994 != var3; this.field2994 = this.field2994.field3013) {
            if (this.field2994.field3015 == arg0) {
                class199 var4 = this.field2994;
                this.field2994 = this.field2994.field3013;
                return var4;
            }
        }
        this.field2994 = null;
        return null;
    }

    @ObfuscatedName("gm.l(Lgj;J)V")
    public void method3454(class199 arg0, long arg1) {
        if (arg0.field3014 != null) {
            arg0.method3564();
        }
        class199 var4 = this.field2995[(int) (arg1 & (long) (this.field2996 - 1))];
        arg0.field3014 = var4.field3014;
        arg0.field3013 = var4;
        arg0.field3014.field3013 = arg0;
        arg0.field3013.field3014 = arg0;
        arg0.field3015 = arg1;
    }

    @ObfuscatedName("gm.g()V")
    public void method3455() {
        for (int var1 = 0; var1 < this.field2996; var1++) {
            class199 var2 = this.field2995[var1];
            while (true) {
                class199 var3 = var2.field3013;
                if (var2 == var3) {
                    break;
                }
                var3.method3564();
            }
        }
        this.field2994 = null;
    }

    public Iterator iterator() {
        return new class185(this);
    }
}
