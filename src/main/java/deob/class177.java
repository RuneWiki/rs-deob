package deob;

import java.util.Iterator;

@ObfuscatedName("ft")
public final class class177 implements Iterable {

    @ObfuscatedName("ft.k")
    public int field2859;

    @ObfuscatedName("ft.y")
    public class187[] field2858;

    @ObfuscatedName("ft.s")
    public class187 field2860;

    public class177(int arg0) {
        this.field2859 = arg0;
        this.field2858 = new class187[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class187 var3 = this.field2858[var2] = new class187();
            var3.field2878 = var3;
            var3.field2877 = var3;
        }
    }

    @ObfuscatedName("ft.k(J)Lgk;")
    public class187 method3268(long arg0) {
        class187 var3 = this.field2858[(int) (arg0 & (long) (this.field2859 - 1))];
        for (this.field2860 = var3.field2878; this.field2860 != var3; this.field2860 = this.field2860.field2878) {
            if (this.field2860.field2879 == arg0) {
                class187 var4 = this.field2860;
                this.field2860 = this.field2860.field2878;
                return var4;
            }
        }
        this.field2860 = null;
        return null;
    }

    @ObfuscatedName("ft.y(Lgk;J)V")
    public void method3257(class187 arg0, long arg1) {
        if (arg0.field2877 != null) {
            arg0.method3365();
        }
        class187 var4 = this.field2858[(int) (arg1 & (long) (this.field2859 - 1))];
        arg0.field2877 = var4.field2877;
        arg0.field2878 = var4;
        arg0.field2877.field2878 = arg0;
        arg0.field2878.field2877 = arg0;
        arg0.field2879 = arg1;
    }

    @ObfuscatedName("ft.s()V")
    public void method3258() {
        for (int var1 = 0; var1 < this.field2859; var1++) {
            class187 var2 = this.field2858[var1];
            while (true) {
                class187 var3 = var2.field2878;
                if (var2 == var3) {
                    break;
                }
                var3.method3365();
            }
        }
        this.field2860 = null;
    }

    public Iterator iterator() {
        return new class173(this);
    }
}
