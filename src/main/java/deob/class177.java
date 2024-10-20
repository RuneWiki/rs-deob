package deob;

import java.util.Iterator;

@ObfuscatedName("fg")
public final class class177 implements Iterable {

    @ObfuscatedName("fg.g")
    public int field2865;

    @ObfuscatedName("fg.s")
    public class187[] field2864;

    @ObfuscatedName("fg.v")
    public class187 field2863;

    public class177(int arg0) {
        this.field2865 = arg0;
        this.field2864 = new class187[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class187 var3 = this.field2864[var2] = new class187();
            var3.field2883 = var3;
            var3.field2882 = var3;
        }
    }

    @ObfuscatedName("fg.g(J)Lgz;")
    public class187 method3181(long arg0) {
        class187 var3 = this.field2864[(int) (arg0 & (long) (this.field2865 - 1))];
        for (this.field2863 = var3.field2883; this.field2863 != var3; this.field2863 = this.field2863.field2883) {
            if (this.field2863.field2884 == arg0) {
                class187 var4 = this.field2863;
                this.field2863 = this.field2863.field2883;
                return var4;
            }
        }
        this.field2863 = null;
        return null;
    }

    @ObfuscatedName("fg.s(Lgz;J)V")
    public void method3171(class187 arg0, long arg1) {
        if (arg0.field2882 != null) {
            arg0.method3285();
        }
        class187 var4 = this.field2864[(int) (arg1 & (long) (this.field2865 - 1))];
        arg0.field2882 = var4.field2882;
        arg0.field2883 = var4;
        arg0.field2882.field2883 = arg0;
        arg0.field2883.field2882 = arg0;
        arg0.field2884 = arg1;
    }

    @ObfuscatedName("fg.v()V")
    public void method3168() {
        for (int var1 = 0; var1 < this.field2865; var1++) {
            class187 var2 = this.field2864[var1];
            while (true) {
                class187 var3 = var2.field2883;
                if (var2 == var3) {
                    break;
                }
                var3.method3285();
            }
        }
        this.field2863 = null;
    }

    public Iterator iterator() {
        return new class173(this);
    }
}
