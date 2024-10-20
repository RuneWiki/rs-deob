package deob;

import java.util.Iterator;

@ObfuscatedName("fd")
public final class class177 implements Iterable {

    @ObfuscatedName("fd.g")
    public int field2854;

    @ObfuscatedName("fd.s")
    public class187[] field2853;

    @ObfuscatedName("fd.h")
    public class187 field2855;

    public class177(int arg0) {
        this.field2854 = arg0;
        this.field2853 = new class187[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class187 var3 = this.field2853[var2] = new class187();
            var3.field2874 = var3;
            var3.field2872 = var3;
        }
    }

    @ObfuscatedName("fd.g(J)Lgg;")
    public class187 method3184(long arg0) {
        class187 var3 = this.field2853[(int) (arg0 & (long) (this.field2854 - 1))];
        for (this.field2855 = var3.field2874; this.field2855 != var3; this.field2855 = this.field2855.field2874) {
            if (this.field2855.field2873 == arg0) {
                class187 var4 = this.field2855;
                this.field2855 = this.field2855.field2874;
                return var4;
            }
        }
        this.field2855 = null;
        return null;
    }

    @ObfuscatedName("fd.s(Lgg;J)V")
    public void method3180(class187 arg0, long arg1) {
        if (arg0.field2872 != null) {
            arg0.method3280();
        }
        class187 var4 = this.field2853[(int) (arg1 & (long) (this.field2854 - 1))];
        arg0.field2872 = var4.field2872;
        arg0.field2874 = var4;
        arg0.field2872.field2874 = arg0;
        arg0.field2874.field2872 = arg0;
        arg0.field2873 = arg1;
    }

    @ObfuscatedName("fd.h()V")
    public void method3181() {
        for (int var1 = 0; var1 < this.field2854; var1++) {
            class187 var2 = this.field2853[var1];
            while (true) {
                class187 var3 = var2.field2874;
                if (var2 == var3) {
                    break;
                }
                var3.method3280();
            }
        }
        this.field2855 = null;
    }

    public Iterator iterator() {
        return new class173(this);
    }
}
