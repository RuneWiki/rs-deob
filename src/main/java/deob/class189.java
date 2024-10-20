package deob;

import java.util.Iterator;

@ObfuscatedName("gx")
public final class class189 implements Iterable {

    @ObfuscatedName("gx.p")
    public int field2996;

    @ObfuscatedName("gx.k")
    public class199[] field2995;

    @ObfuscatedName("gx.e")
    public class199 field2997;

    public class189(int arg0) {
        this.field2996 = arg0;
        this.field2995 = new class199[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class199 var3 = this.field2995[var2] = new class199();
            var3.field3014 = var3;
            var3.field3016 = var3;
        }
    }

    @ObfuscatedName("gx.p(J)Lgl;")
    public class199 method3422(long arg0) {
        class199 var3 = this.field2995[(int) (arg0 & (long) (this.field2996 - 1))];
        for (this.field2997 = var3.field3014; this.field2997 != var3; this.field2997 = this.field2997.field3014) {
            if (this.field2997.field3015 == arg0) {
                class199 var4 = this.field2997;
                this.field2997 = this.field2997.field3014;
                return var4;
            }
        }
        this.field2997 = null;
        return null;
    }

    @ObfuscatedName("gx.k(Lgl;J)V")
    public void method3423(class199 arg0, long arg1) {
        if (arg0.field3016 != null) {
            arg0.method3533();
        }
        class199 var4 = this.field2995[(int) (arg1 & (long) (this.field2996 - 1))];
        arg0.field3016 = var4.field3016;
        arg0.field3014 = var4;
        arg0.field3016.field3014 = arg0;
        arg0.field3014.field3016 = arg0;
        arg0.field3015 = arg1;
    }

    @ObfuscatedName("gx.e()V")
    public void method3424() {
        for (int var1 = 0; var1 < this.field2996; var1++) {
            class199 var2 = this.field2995[var1];
            while (true) {
                class199 var3 = var2.field3014;
                if (var2 == var3) {
                    break;
                }
                var3.method3533();
            }
        }
        this.field2997 = null;
    }

    public Iterator iterator() {
        return new class185(this);
    }
}
