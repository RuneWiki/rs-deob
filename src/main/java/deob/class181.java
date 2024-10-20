package deob;

import java.util.Iterator;

@ObfuscatedName("fz")
public final class class181 implements Iterable {

    @ObfuscatedName("fz.b")
    public int field2886;

    @ObfuscatedName("fz.e")
    public class191[] field2887;

    @ObfuscatedName("fz.i")
    public class191 field2885;

    public class181(int arg0) {
        this.field2886 = arg0;
        this.field2887 = new class191[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class191 var3 = this.field2887[var2] = new class191();
            var3.field2904 = var3;
            var3.field2906 = var3;
        }
    }

    @ObfuscatedName("fz.b(J)Lgx;")
    public class191 method3274(long arg0) {
        class191 var3 = this.field2887[(int) (arg0 & (long) (this.field2886 - 1))];
        for (this.field2885 = var3.field2904; this.field2885 != var3; this.field2885 = this.field2885.field2904) {
            if (this.field2885.field2905 == arg0) {
                class191 var4 = this.field2885;
                this.field2885 = this.field2885.field2904;
                return var4;
            }
        }
        this.field2885 = null;
        return null;
    }

    @ObfuscatedName("fz.e(Lgx;J)V")
    public void method3275(class191 arg0, long arg1) {
        if (arg0.field2906 != null) {
            arg0.method3392();
        }
        class191 var4 = this.field2887[(int) (arg1 & (long) (this.field2886 - 1))];
        arg0.field2906 = var4.field2906;
        arg0.field2904 = var4;
        arg0.field2906.field2904 = arg0;
        arg0.field2904.field2906 = arg0;
        arg0.field2905 = arg1;
    }

    @ObfuscatedName("fz.i()V")
    public void method3276() {
        for (int var1 = 0; var1 < this.field2886; var1++) {
            class191 var2 = this.field2887[var1];
            while (true) {
                class191 var3 = var2.field2904;
                if (var2 == var3) {
                    break;
                }
                var3.method3392();
            }
        }
        this.field2885 = null;
    }

    public Iterator iterator() {
        return new class177(this);
    }
}
