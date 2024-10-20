package deob;

import java.util.Iterator;

@ObfuscatedName("gr")
public final class class189 implements Iterable {

    @ObfuscatedName("gr.n")
    public int field2994;

    @ObfuscatedName("gr.w")
    public class199[] field2993;

    @ObfuscatedName("gr.i")
    public class199 field2995;

    public class189(int arg0) {
        this.field2994 = arg0;
        this.field2993 = new class199[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class199 var3 = this.field2993[var2] = new class199();
            var3.field3014 = var3;
            var3.field3012 = var3;
        }
    }

    @ObfuscatedName("gr.n(J)Lgn;")
    public class199 method3364(long arg0) {
        class199 var3 = this.field2993[(int) (arg0 & (long) (this.field2994 - 1))];
        for (this.field2995 = var3.field3014; this.field2995 != var3; this.field2995 = this.field2995.field3014) {
            if (this.field2995.field3013 == arg0) {
                class199 var4 = this.field2995;
                this.field2995 = this.field2995.field3014;
                return var4;
            }
        }
        this.field2995 = null;
        return null;
    }

    @ObfuscatedName("gr.w(Lgn;J)V")
    public void method3363(class199 arg0, long arg1) {
        if (arg0.field3012 != null) {
            arg0.method3474();
        }
        class199 var4 = this.field2993[(int) (arg1 & (long) (this.field2994 - 1))];
        arg0.field3012 = var4.field3012;
        arg0.field3014 = var4;
        arg0.field3012.field3014 = arg0;
        arg0.field3014.field3012 = arg0;
        arg0.field3013 = arg1;
    }

    @ObfuscatedName("gr.i()V")
    public void method3374() {
        for (int var1 = 0; var1 < this.field2994; var1++) {
            class199 var2 = this.field2993[var1];
            while (true) {
                class199 var3 = var2.field3014;
                if (var2 == var3) {
                    break;
                }
                var3.method3474();
            }
        }
        this.field2995 = null;
    }

    public Iterator iterator() {
        return new class185(this);
    }
}
