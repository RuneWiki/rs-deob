package deob;

import java.util.Iterator;

@ObfuscatedName("fa")
public final class class176 implements Iterable {

    @ObfuscatedName("fa.t")
    public int field2845;

    @ObfuscatedName("fa.o")
    public class186[] field2846;

    @ObfuscatedName("fa.i")
    public class186 field2847;

    public class176(int arg0) {
        this.field2845 = arg0;
        this.field2846 = new class186[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class186 var3 = this.field2846[var2] = new class186();
            var3.field2864 = var3;
            var3.field2865 = var3;
        }
    }

    @ObfuscatedName("fa.t(J)Lgh;")
    public class186 method3155(long arg0) {
        class186 var3 = this.field2846[(int) (arg0 & (long) (this.field2845 - 1))];
        for (this.field2847 = var3.field2864; this.field2847 != var3; this.field2847 = this.field2847.field2864) {
            if (this.field2847.field2866 == arg0) {
                class186 var4 = this.field2847;
                this.field2847 = this.field2847.field2864;
                return var4;
            }
        }
        this.field2847 = null;
        return null;
    }

    @ObfuscatedName("fa.o(Lgh;J)V")
    public void method3153(class186 arg0, long arg1) {
        if (arg0.field2865 != null) {
            arg0.method3261();
        }
        class186 var4 = this.field2846[(int) (arg1 & (long) (this.field2845 - 1))];
        arg0.field2865 = var4.field2865;
        arg0.field2864 = var4;
        arg0.field2865.field2864 = arg0;
        arg0.field2864.field2865 = arg0;
        arg0.field2866 = arg1;
    }

    @ObfuscatedName("fa.i()V")
    public void method3154() {
        for (int var1 = 0; var1 < this.field2845; var1++) {
            class186 var2 = this.field2846[var1];
            while (true) {
                class186 var3 = var2.field2864;
                if (var2 == var3) {
                    break;
                }
                var3.method3261();
            }
        }
        this.field2847 = null;
    }

    public Iterator iterator() {
        return new class172(this);
    }
}
