package deob;

import java.util.Iterator;

@ObfuscatedName("fg")
public final class class175 implements Iterable {

    @ObfuscatedName("fg.y")
    public int field2814;

    @ObfuscatedName("fg.u")
    public class183[] field2815;

    @ObfuscatedName("fg.k")
    public class183 field2816;

    public class175(int arg0) {
        this.field2814 = arg0;
        this.field2815 = new class183[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class183 var3 = this.field2815[var2] = new class183();
            var3.field2829 = var3;
            var3.field2831 = var3;
        }
    }

    @ObfuscatedName("fg.y(J)Lgw;")
    public class183 method3190(long arg0) {
        class183 var3 = this.field2815[(int) (arg0 & (long) (this.field2814 - 1))];
        for (this.field2816 = var3.field2829; this.field2816 != var3; this.field2816 = this.field2816.field2829) {
            if (this.field2816.field2830 == arg0) {
                class183 var4 = this.field2816;
                this.field2816 = this.field2816.field2829;
                return var4;
            }
        }
        this.field2816 = null;
        return null;
    }

    @ObfuscatedName("fg.u(Lgw;J)V")
    public void method3191(class183 arg0, long arg1) {
        if (arg0.field2831 != null) {
            arg0.method3268();
        }
        class183 var4 = this.field2815[(int) (arg1 & (long) (this.field2814 - 1))];
        arg0.field2831 = var4.field2831;
        arg0.field2829 = var4;
        arg0.field2831.field2829 = arg0;
        arg0.field2829.field2831 = arg0;
        arg0.field2830 = arg1;
    }

    @ObfuscatedName("fg.k()V")
    public void method3192() {
        for (int var1 = 0; var1 < this.field2814; var1++) {
            class183 var2 = this.field2815[var1];
            while (true) {
                class183 var3 = var2.field2829;
                if (var2 == var3) {
                    break;
                }
                var3.method3268();
            }
        }
        this.field2816 = null;
    }

    public Iterator iterator() {
        return new class171(this);
    }
}
