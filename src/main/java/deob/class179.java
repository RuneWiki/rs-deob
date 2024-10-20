package deob;

import java.util.Iterator;

@ObfuscatedName("fa")
public final class class179 implements Iterable {

    @ObfuscatedName("fa.f")
    public int field2864;

    @ObfuscatedName("fa.k")
    public class189[] field2863;

    @ObfuscatedName("fa.y")
    public class189 field2865;

    public class179(int arg0) {
        this.field2864 = arg0;
        this.field2863 = new class189[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class189 var3 = this.field2863[var2] = new class189();
            var3.field2883 = var3;
            var3.field2884 = var3;
        }
    }

    @ObfuscatedName("fa.f(J)Lgx;")
    public class189 method3261(long arg0) {
        class189 var3 = this.field2863[(int) (arg0 & (long) (this.field2864 - 1))];
        for (this.field2865 = var3.field2883; this.field2865 != var3; this.field2865 = this.field2865.field2883) {
            if (this.field2865.field2882 == arg0) {
                class189 var4 = this.field2865;
                this.field2865 = this.field2865.field2883;
                return var4;
            }
        }
        this.field2865 = null;
        return null;
    }

    @ObfuscatedName("fa.k(Lgx;J)V")
    public void method3262(class189 arg0, long arg1) {
        if (arg0.field2884 != null) {
            arg0.method3367();
        }
        class189 var4 = this.field2863[(int) (arg1 & (long) (this.field2864 - 1))];
        arg0.field2884 = var4.field2884;
        arg0.field2883 = var4;
        arg0.field2884.field2883 = arg0;
        arg0.field2883.field2884 = arg0;
        arg0.field2882 = arg1;
    }

    @ObfuscatedName("fa.y()V")
    public void method3260() {
        for (int var1 = 0; var1 < this.field2864; var1++) {
            class189 var2 = this.field2863[var1];
            while (true) {
                class189 var3 = var2.field2883;
                if (var2 == var3) {
                    break;
                }
                var3.method3367();
            }
        }
        this.field2865 = null;
    }

    public Iterator iterator() {
        return new class175(this);
    }
}
