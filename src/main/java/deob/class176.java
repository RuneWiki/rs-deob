package deob;

import java.util.Iterator;

@ObfuscatedName("fm")
public final class class176 implements Iterable {

    @ObfuscatedName("fm.e")
    public int field2847;

    @ObfuscatedName("fm.v")
    public class186[] field2846;

    @ObfuscatedName("fm.i")
    public class186 field2848;

    public class176(int arg0) {
        this.field2847 = arg0;
        this.field2846 = new class186[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class186 var3 = this.field2846[var2] = new class186();
            var3.field2865 = var3;
            var3.field2866 = var3;
        }
    }

    @ObfuscatedName("fm.e(J)Lgc;")
    public class186 method3177(long arg0) {
        class186 var3 = this.field2846[(int) (arg0 & (long) (this.field2847 - 1))];
        for (this.field2848 = var3.field2865; this.field2848 != var3; this.field2848 = this.field2848.field2865) {
            if (this.field2848.field2867 == arg0) {
                class186 var4 = this.field2848;
                this.field2848 = this.field2848.field2865;
                return var4;
            }
        }
        this.field2848 = null;
        return null;
    }

    @ObfuscatedName("fm.v(Lgc;J)V")
    public void method3174(class186 arg0, long arg1) {
        if (arg0.field2866 != null) {
            arg0.method3273();
        }
        class186 var4 = this.field2846[(int) (arg1 & (long) (this.field2847 - 1))];
        arg0.field2866 = var4.field2866;
        arg0.field2865 = var4;
        arg0.field2866.field2865 = arg0;
        arg0.field2865.field2866 = arg0;
        arg0.field2867 = arg1;
    }

    @ObfuscatedName("fm.i()V")
    public void method3175() {
        for (int var1 = 0; var1 < this.field2847; var1++) {
            class186 var2 = this.field2846[var1];
            while (true) {
                class186 var3 = var2.field2865;
                if (var2 == var3) {
                    break;
                }
                var3.method3273();
            }
        }
        this.field2848 = null;
    }

    public Iterator iterator() {
        return new class172(this);
    }
}
