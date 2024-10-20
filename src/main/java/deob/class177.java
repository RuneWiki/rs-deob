package deob;

import java.util.Iterator;

@ObfuscatedName("fv")
public final class class177 implements Iterable {

    @ObfuscatedName("fv.n")
    public int field2867;

    @ObfuscatedName("fv.x")
    public class187[] field2868;

    @ObfuscatedName("fv.k")
    public class187 field2869;

    public class177(int arg0) {
        this.field2867 = arg0;
        this.field2868 = new class187[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class187 var3 = this.field2868[var2] = new class187();
            var3.field2887 = var3;
            var3.field2886 = var3;
        }
    }

    @ObfuscatedName("fv.n(J)Lga;")
    public class187 method3169(long arg0) {
        class187 var3 = this.field2868[(int) (arg0 & (long) (this.field2867 - 1))];
        for (this.field2869 = var3.field2887; this.field2869 != var3; this.field2869 = this.field2869.field2887) {
            if (this.field2869.field2888 == arg0) {
                class187 var4 = this.field2869;
                this.field2869 = this.field2869.field2887;
                return var4;
            }
        }
        this.field2869 = null;
        return null;
    }

    @ObfuscatedName("fv.x(Lga;J)V")
    public void method3164(class187 arg0, long arg1) {
        if (arg0.field2886 != null) {
            arg0.method3277();
        }
        class187 var4 = this.field2868[(int) (arg1 & (long) (this.field2867 - 1))];
        arg0.field2886 = var4.field2886;
        arg0.field2887 = var4;
        arg0.field2886.field2887 = arg0;
        arg0.field2887.field2886 = arg0;
        arg0.field2888 = arg1;
    }

    @ObfuscatedName("fv.k()V")
    public void method3175() {
        for (int var1 = 0; var1 < this.field2867; var1++) {
            class187 var2 = this.field2868[var1];
            while (true) {
                class187 var3 = var2.field2887;
                if (var2 == var3) {
                    break;
                }
                var3.method3277();
            }
        }
        this.field2869 = null;
    }

    public Iterator iterator() {
        return new class173(this);
    }
}
