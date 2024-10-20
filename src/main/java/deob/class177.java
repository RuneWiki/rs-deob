package deob;

import java.util.Iterator;

@ObfuscatedName("fo")
public final class class177 implements Iterable {

    @ObfuscatedName("fo.g")
    public int field2868;

    @ObfuscatedName("fo.i")
    public class187[] field2867;

    @ObfuscatedName("fo.k")
    public class187 field2866;

    public class177(int arg0) {
        this.field2868 = arg0;
        this.field2867 = new class187[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class187 var3 = this.field2867[var2] = new class187();
            var3.field2886 = var3;
            var3.field2887 = var3;
        }
    }

    @ObfuscatedName("fo.g(J)Lgf;")
    public class187 method3189(long arg0) {
        class187 var3 = this.field2867[(int) (arg0 & (long) (this.field2868 - 1))];
        for (this.field2866 = var3.field2886; this.field2866 != var3; this.field2866 = this.field2866.field2886) {
            if (this.field2866.field2885 == arg0) {
                class187 var4 = this.field2866;
                this.field2866 = this.field2866.field2886;
                return var4;
            }
        }
        this.field2866 = null;
        return null;
    }

    @ObfuscatedName("fo.i(Lgf;J)V")
    public void method3191(class187 arg0, long arg1) {
        if (arg0.field2887 != null) {
            arg0.method3304();
        }
        class187 var4 = this.field2867[(int) (arg1 & (long) (this.field2868 - 1))];
        arg0.field2887 = var4.field2887;
        arg0.field2886 = var4;
        arg0.field2887.field2886 = arg0;
        arg0.field2886.field2887 = arg0;
        arg0.field2885 = arg1;
    }

    @ObfuscatedName("fo.k()V")
    public void method3192() {
        for (int var1 = 0; var1 < this.field2868; var1++) {
            class187 var2 = this.field2867[var1];
            while (true) {
                class187 var3 = var2.field2886;
                if (var2 == var3) {
                    break;
                }
                var3.method3304();
            }
        }
        this.field2866 = null;
    }

    public Iterator iterator() {
        return new class173(this);
    }
}
