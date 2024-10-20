package deob;

import java.util.Iterator;

@ObfuscatedName("gb")
public final class class189 implements Iterable {

    @ObfuscatedName("gb.n")
    public int field2998;

    @ObfuscatedName("gb.g")
    public class199[] field2999;

    @ObfuscatedName("gb.a")
    public class199 field3000;

    public class189(int arg0) {
        this.field2998 = arg0;
        this.field2999 = new class199[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class199 var3 = this.field2999[var2] = new class199();
            var3.field3017 = var3;
            var3.field3019 = var3;
        }
    }

    @ObfuscatedName("gb.n(J)Lgg;")
    public class199 method3449(long arg0) {
        class199 var3 = this.field2999[(int) (arg0 & (long) (this.field2998 - 1))];
        for (this.field3000 = var3.field3017; this.field3000 != var3; this.field3000 = this.field3000.field3017) {
            if (this.field3000.field3018 == arg0) {
                class199 var4 = this.field3000;
                this.field3000 = this.field3000.field3017;
                return var4;
            }
        }
        this.field3000 = null;
        return null;
    }

    @ObfuscatedName("gb.g(Lgg;J)V")
    public void method3450(class199 arg0, long arg1) {
        if (arg0.field3019 != null) {
            arg0.method3554();
        }
        class199 var4 = this.field2999[(int) (arg1 & (long) (this.field2998 - 1))];
        arg0.field3019 = var4.field3019;
        arg0.field3017 = var4;
        arg0.field3019.field3017 = arg0;
        arg0.field3017.field3019 = arg0;
        arg0.field3018 = arg1;
    }

    @ObfuscatedName("gb.a()V")
    public void method3459() {
        for (int var1 = 0; var1 < this.field2998; var1++) {
            class199 var2 = this.field2999[var1];
            while (true) {
                class199 var3 = var2.field3017;
                if (var2 == var3) {
                    break;
                }
                var3.method3554();
            }
        }
        this.field3000 = null;
    }

    public Iterator iterator() {
        return new class185(this);
    }
}
