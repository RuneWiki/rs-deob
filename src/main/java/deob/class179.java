package deob;

import java.util.Iterator;

@ObfuscatedName("fi")
public final class class179 implements Iterable {

    @ObfuscatedName("fi.e")
    public int field2877;

    @ObfuscatedName("fi.v")
    public class189[] field2876;

    @ObfuscatedName("fi.k")
    public class189 field2875;

    public class179(int arg0) {
        this.field2877 = arg0;
        this.field2876 = new class189[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class189 var3 = this.field2876[var2] = new class189();
            var3.field2895 = var3;
            var3.field2896 = var3;
        }
    }

    @ObfuscatedName("fi.e(J)Lgp;")
    public class189 method3209(long arg0) {
        class189 var3 = this.field2876[(int) (arg0 & (long) (this.field2877 - 1))];
        for (this.field2875 = var3.field2895; this.field2875 != var3; this.field2875 = this.field2875.field2895) {
            if (this.field2875.field2894 == arg0) {
                class189 var4 = this.field2875;
                this.field2875 = this.field2875.field2895;
                return var4;
            }
        }
        this.field2875 = null;
        return null;
    }

    @ObfuscatedName("fi.v(Lgp;J)V")
    public void method3210(class189 arg0, long arg1) {
        if (arg0.field2896 != null) {
            arg0.method3324();
        }
        class189 var4 = this.field2876[(int) (arg1 & (long) (this.field2877 - 1))];
        arg0.field2896 = var4.field2896;
        arg0.field2895 = var4;
        arg0.field2896.field2895 = arg0;
        arg0.field2895.field2896 = arg0;
        arg0.field2894 = arg1;
    }

    @ObfuscatedName("fi.k()V")
    public void method3208() {
        for (int var1 = 0; var1 < this.field2877; var1++) {
            class189 var2 = this.field2876[var1];
            while (true) {
                class189 var3 = var2.field2895;
                if (var2 == var3) {
                    break;
                }
                var3.method3324();
            }
        }
        this.field2875 = null;
    }

    public Iterator iterator() {
        return new class175(this);
    }
}
