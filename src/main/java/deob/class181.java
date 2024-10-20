package deob;

import java.util.Iterator;

@ObfuscatedName("fg")
public final class class181 implements Iterable {

    @ObfuscatedName("fg.p")
    public int field2883;

    @ObfuscatedName("fg.y")
    public class191[] field2882;

    @ObfuscatedName("fg.d")
    public class191 field2884;

    public class181(int arg0) {
        this.field2883 = arg0;
        this.field2882 = new class191[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class191 var3 = this.field2882[var2] = new class191();
            var3.field2902 = var3;
            var3.field2901 = var3;
        }
    }

    @ObfuscatedName("fg.p(J)Lgu;")
    public class191 method3243(long arg0) {
        class191 var3 = this.field2882[(int) (arg0 & (long) (this.field2883 - 1))];
        for (this.field2884 = var3.field2902; this.field2884 != var3; this.field2884 = this.field2884.field2902) {
            if (this.field2884.field2903 == arg0) {
                class191 var4 = this.field2884;
                this.field2884 = this.field2884.field2902;
                return var4;
            }
        }
        this.field2884 = null;
        return null;
    }

    @ObfuscatedName("fg.y(Lgu;J)V")
    public void method3244(class191 arg0, long arg1) {
        if (arg0.field2901 != null) {
            arg0.method3358();
        }
        class191 var4 = this.field2882[(int) (arg1 & (long) (this.field2883 - 1))];
        arg0.field2901 = var4.field2901;
        arg0.field2902 = var4;
        arg0.field2901.field2902 = arg0;
        arg0.field2902.field2901 = arg0;
        arg0.field2903 = arg1;
    }

    @ObfuscatedName("fg.d()V")
    public void method3248() {
        for (int var1 = 0; var1 < this.field2883; var1++) {
            class191 var2 = this.field2882[var1];
            while (true) {
                class191 var3 = var2.field2902;
                if (var2 == var3) {
                    break;
                }
                var3.method3358();
            }
        }
        this.field2884 = null;
    }

    public Iterator iterator() {
        return new class177(this);
    }
}
