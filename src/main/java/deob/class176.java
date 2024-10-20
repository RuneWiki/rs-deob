package deob;

import java.util.Iterator;

@ObfuscatedName("fh")
public final class class176 implements Iterable {

    @ObfuscatedName("fh.k")
    public int field2847;

    @ObfuscatedName("fh.b")
    public class186[] field2848;

    @ObfuscatedName("fh.e")
    public class186 field2849;

    public class176(int arg0) {
        this.field2847 = arg0;
        this.field2848 = new class186[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class186 var3 = this.field2848[var2] = new class186();
            var3.field2866 = var3;
            var3.field2868 = var3;
        }
    }

    @ObfuscatedName("fh.k(J)Lgy;")
    public class186 method3205(long arg0) {
        class186 var3 = this.field2848[(int) (arg0 & (long) (this.field2847 - 1))];
        for (this.field2849 = var3.field2866; this.field2849 != var3; this.field2849 = this.field2849.field2866) {
            if (this.field2849.field2867 == arg0) {
                class186 var4 = this.field2849;
                this.field2849 = this.field2849.field2866;
                return var4;
            }
        }
        this.field2849 = null;
        return null;
    }

    @ObfuscatedName("fh.b(Lgy;J)V")
    public void method3206(class186 arg0, long arg1) {
        if (arg0.field2868 != null) {
            arg0.method3321();
        }
        class186 var4 = this.field2848[(int) (arg1 & (long) (this.field2847 - 1))];
        arg0.field2868 = var4.field2868;
        arg0.field2866 = var4;
        arg0.field2868.field2866 = arg0;
        arg0.field2866.field2868 = arg0;
        arg0.field2867 = arg1;
    }

    @ObfuscatedName("fh.e()V")
    public void method3215() {
        for (int var1 = 0; var1 < this.field2847; var1++) {
            class186 var2 = this.field2848[var1];
            while (true) {
                class186 var3 = var2.field2866;
                if (var2 == var3) {
                    break;
                }
                var3.method3321();
            }
        }
        this.field2849 = null;
    }

    public Iterator iterator() {
        return new class172(this);
    }
}
