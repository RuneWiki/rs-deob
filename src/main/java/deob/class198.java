package deob;

import java.util.Iterator;

@ObfuscatedName("gt")
public final class class198 implements Iterable {

    @ObfuscatedName("gt.k")
    public int field3091;

    @ObfuscatedName("gt.h")
    public class208[] field3092;

    @ObfuscatedName("gt.o")
    public class208 field3090;

    public class198(int arg0) {
        this.field3091 = arg0;
        this.field3092 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3092[var2] = new class208();
            var3.field3110 = var3;
            var3.field3109 = var3;
        }
    }

    @ObfuscatedName("gt.k(J)Lgp;")
    public class208 method3564(long arg0) {
        class208 var3 = this.field3092[(int) (arg0 & (long) (this.field3091 - 1))];
        for (this.field3090 = var3.field3110; this.field3090 != var3; this.field3090 = this.field3090.field3110) {
            if (this.field3090.field3111 == arg0) {
                class208 var4 = this.field3090;
                this.field3090 = this.field3090.field3110;
                return var4;
            }
        }
        this.field3090 = null;
        return null;
    }

    @ObfuscatedName("gt.h(Lgp;J)V")
    public void method3574(class208 arg0, long arg1) {
        if (arg0.field3109 != null) {
            arg0.method3679();
        }
        class208 var4 = this.field3092[(int) (arg1 & (long) (this.field3091 - 1))];
        arg0.field3109 = var4.field3109;
        arg0.field3110 = var4;
        arg0.field3109.field3110 = arg0;
        arg0.field3110.field3109 = arg0;
        arg0.field3111 = arg1;
    }

    @ObfuscatedName("gt.o()V")
    public void method3566() {
        for (int var1 = 0; var1 < this.field3091; var1++) {
            class208 var2 = this.field3092[var1];
            while (true) {
                class208 var3 = var2.field3110;
                if (var2 == var3) {
                    break;
                }
                var3.method3679();
            }
        }
        this.field3090 = null;
    }

    public Iterator iterator() {
        return new class194(this);
    }
}
