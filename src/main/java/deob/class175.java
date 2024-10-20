package deob;

import java.util.Iterator;

@ObfuscatedName("fm")
public final class class175 implements Iterable {

    @ObfuscatedName("fm.e")
    public int field2829;

    @ObfuscatedName("fm.p")
    public class183[] field2828;

    @ObfuscatedName("fm.a")
    public class183 field2830;

    public class175(int arg0) {
        this.field2829 = arg0;
        this.field2828 = new class183[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class183 var3 = this.field2828[var2] = new class183();
            var3.field2844 = var3;
            var3.field2845 = var3;
        }
    }

    @ObfuscatedName("fm.e(J)Lgl;")
    public class183 method3215(long arg0) {
        class183 var3 = this.field2828[(int) (arg0 & (long) (this.field2829 - 1))];
        for (this.field2830 = var3.field2844; this.field2830 != var3; this.field2830 = this.field2830.field2844) {
            if (this.field2830.field2843 == arg0) {
                class183 var4 = this.field2830;
                this.field2830 = this.field2830.field2844;
                return var4;
            }
        }
        this.field2830 = null;
        return null;
    }

    @ObfuscatedName("fm.p(Lgl;J)V")
    public void method3216(class183 arg0, long arg1) {
        if (arg0.field2845 != null) {
            arg0.method3307();
        }
        class183 var4 = this.field2828[(int) (arg1 & (long) (this.field2829 - 1))];
        arg0.field2845 = var4.field2845;
        arg0.field2844 = var4;
        arg0.field2845.field2844 = arg0;
        arg0.field2844.field2845 = arg0;
        arg0.field2843 = arg1;
    }

    @ObfuscatedName("fm.a()V")
    public void method3209() {
        for (int var1 = 0; var1 < this.field2829; var1++) {
            class183 var2 = this.field2828[var1];
            while (true) {
                class183 var3 = var2.field2844;
                if (var2 == var3) {
                    break;
                }
                var3.method3307();
            }
        }
        this.field2830 = null;
    }

    public Iterator iterator() {
        return new class171(this);
    }
}
