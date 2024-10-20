package deob;

import java.util.Iterator;

@ObfuscatedName("gd")
public final class class198 implements Iterable {

    @ObfuscatedName("gd.v")
    public int field3097;

    @ObfuscatedName("gd.f")
    public class208[] field3095;

    @ObfuscatedName("gd.i")
    public class208 field3096;

    public class198(int arg0) {
        this.field3097 = arg0;
        this.field3095 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3095[var2] = new class208();
            var3.field3116 = var3;
            var3.field3114 = var3;
        }
    }

    @ObfuscatedName("gd.v(J)Lgq;")
    public class208 method3545(long arg0) {
        class208 var3 = this.field3095[(int) (arg0 & (long) (this.field3097 - 1))];
        for (this.field3096 = var3.field3116; this.field3096 != var3; this.field3096 = this.field3096.field3116) {
            if (this.field3096.field3115 == arg0) {
                class208 var4 = this.field3096;
                this.field3096 = this.field3096.field3116;
                return var4;
            }
        }
        this.field3096 = null;
        return null;
    }

    @ObfuscatedName("gd.f(Lgq;J)V")
    public void method3550(class208 arg0, long arg1) {
        if (arg0.field3114 != null) {
            arg0.method3645();
        }
        class208 var4 = this.field3095[(int) (arg1 & (long) (this.field3097 - 1))];
        arg0.field3114 = var4.field3114;
        arg0.field3116 = var4;
        arg0.field3114.field3116 = arg0;
        arg0.field3116.field3114 = arg0;
        arg0.field3115 = arg1;
    }

    @ObfuscatedName("gd.i()V")
    public void method3541() {
        for (int var1 = 0; var1 < this.field3097; var1++) {
            class208 var2 = this.field3095[var1];
            while (true) {
                class208 var3 = var2.field3116;
                if (var2 == var3) {
                    break;
                }
                var3.method3645();
            }
        }
        this.field3096 = null;
    }

    public Iterator iterator() {
        return new class194(this);
    }
}
