package deob;

import java.util.Iterator;

@ObfuscatedName("fs")
public final class class177 implements Iterable {

    @ObfuscatedName("fs.p")
    public int field2860;

    @ObfuscatedName("fs.g")
    public class187[] field2861;

    @ObfuscatedName("fs.x")
    public class187 field2862;

    public class177(int arg0) {
        this.field2860 = arg0;
        this.field2861 = new class187[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class187 var3 = this.field2861[var2] = new class187();
            var3.field2880 = var3;
            var3.field2879 = var3;
        }
    }

    @ObfuscatedName("fs.p(J)Lgq;")
    public class187 method3284(long arg0) {
        class187 var3 = this.field2861[(int) (arg0 & (long) (this.field2860 - 1))];
        for (this.field2862 = var3.field2880; this.field2862 != var3; this.field2862 = this.field2862.field2880) {
            if (this.field2862.field2881 == arg0) {
                class187 var4 = this.field2862;
                this.field2862 = this.field2862.field2880;
                return var4;
            }
        }
        this.field2862 = null;
        return null;
    }

    @ObfuscatedName("fs.g(Lgq;J)V")
    public void method3282(class187 arg0, long arg1) {
        if (arg0.field2879 != null) {
            arg0.method3378();
        }
        class187 var4 = this.field2861[(int) (arg1 & (long) (this.field2860 - 1))];
        arg0.field2879 = var4.field2879;
        arg0.field2880 = var4;
        arg0.field2879.field2880 = arg0;
        arg0.field2880.field2879 = arg0;
        arg0.field2881 = arg1;
    }

    @ObfuscatedName("fs.x()V")
    public void method3283() {
        for (int var1 = 0; var1 < this.field2860; var1++) {
            class187 var2 = this.field2861[var1];
            while (true) {
                class187 var3 = var2.field2880;
                if (var2 == var3) {
                    break;
                }
                var3.method3378();
            }
        }
        this.field2862 = null;
    }

    public Iterator iterator() {
        return new class173(this);
    }
}
