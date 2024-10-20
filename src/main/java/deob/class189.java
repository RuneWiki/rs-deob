package deob;

import java.util.Iterator;

@ObfuscatedName("gi")
public final class class189 implements Iterable {

    @ObfuscatedName("gi.t")
    public int field2997;

    @ObfuscatedName("gi.b")
    public class199[] field2996;

    @ObfuscatedName("gi.p")
    public class199 field2995;

    public class189(int arg0) {
        this.field2997 = arg0;
        this.field2996 = new class199[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class199 var3 = this.field2996[var2] = new class199();
            var3.field3014 = var3;
            var3.field3016 = var3;
        }
    }

    @ObfuscatedName("gi.t(J)Lgt;")
    public class199 method3397(long arg0) {
        class199 var3 = this.field2996[(int) (arg0 & (long) (this.field2997 - 1))];
        for (this.field2995 = var3.field3014; this.field2995 != var3; this.field2995 = this.field2995.field3014) {
            if (this.field2995.field3015 == arg0) {
                class199 var4 = this.field2995;
                this.field2995 = this.field2995.field3014;
                return var4;
            }
        }
        this.field2995 = null;
        return null;
    }

    @ObfuscatedName("gi.b(Lgt;J)V")
    public void method3396(class199 arg0, long arg1) {
        if (arg0.field3016 != null) {
            arg0.method3506();
        }
        class199 var4 = this.field2996[(int) (arg1 & (long) (this.field2997 - 1))];
        arg0.field3016 = var4.field3016;
        arg0.field3014 = var4;
        arg0.field3016.field3014 = arg0;
        arg0.field3014.field3016 = arg0;
        arg0.field3015 = arg1;
    }

    @ObfuscatedName("gi.p()V")
    public void method3404() {
        for (int var1 = 0; var1 < this.field2997; var1++) {
            class199 var2 = this.field2996[var1];
            while (true) {
                class199 var3 = var2.field3014;
                if (var2 == var3) {
                    break;
                }
                var3.method3506();
            }
        }
        this.field2995 = null;
    }

    public Iterator iterator() {
        return new class185(this);
    }
}
