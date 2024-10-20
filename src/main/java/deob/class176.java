package deob;

import java.util.Iterator;

@ObfuscatedName("fv")
public final class class176 implements Iterable {

    @ObfuscatedName("fv.e")
    public int field2853;

    @ObfuscatedName("fv.o")
    public class186[] field2854;

    @ObfuscatedName("fv.y")
    public class186 field2855;

    public class176(int arg0) {
        this.field2853 = arg0;
        this.field2854 = new class186[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class186 var3 = this.field2854[var2] = new class186();
            var3.field2873 = var3;
            var3.field2872 = var3;
        }
    }

    @ObfuscatedName("fv.e(J)Lgm;")
    public class186 method3109(long arg0) {
        class186 var3 = this.field2854[(int) (arg0 & (long) (this.field2853 - 1))];
        for (this.field2855 = var3.field2873; this.field2855 != var3; this.field2855 = this.field2855.field2873) {
            if (this.field2855.field2874 == arg0) {
                class186 var4 = this.field2855;
                this.field2855 = this.field2855.field2873;
                return var4;
            }
        }
        this.field2855 = null;
        return null;
    }

    @ObfuscatedName("fv.o(Lgm;J)V")
    public void method3106(class186 arg0, long arg1) {
        if (arg0.field2872 != null) {
            arg0.method3204();
        }
        class186 var4 = this.field2854[(int) (arg1 & (long) (this.field2853 - 1))];
        arg0.field2872 = var4.field2872;
        arg0.field2873 = var4;
        arg0.field2872.field2873 = arg0;
        arg0.field2873.field2872 = arg0;
        arg0.field2874 = arg1;
    }

    @ObfuscatedName("fv.y()V")
    public void method3114() {
        for (int var1 = 0; var1 < this.field2853; var1++) {
            class186 var2 = this.field2854[var1];
            while (true) {
                class186 var3 = var2.field2873;
                if (var2 == var3) {
                    break;
                }
                var3.method3204();
            }
        }
        this.field2855 = null;
    }

    public Iterator iterator() {
        return new class172(this);
    }
}
