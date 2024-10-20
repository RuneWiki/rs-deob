package deob;

import java.util.Iterator;

@ObfuscatedName("gh")
public final class class189 implements Iterable {

    @ObfuscatedName("gh.y")
    public int field3006;

    @ObfuscatedName("gh.k")
    public class199[] field3007;

    @ObfuscatedName("gh.g")
    public class199 field3005;

    public class189(int arg0) {
        this.field3006 = arg0;
        this.field3007 = new class199[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class199 var3 = this.field3007[var2] = new class199();
            var3.field3025 = var3;
            var3.field3026 = var3;
        }
    }

    @ObfuscatedName("gh.y(J)Lgb;")
    public class199 method3375(long arg0) {
        class199 var3 = this.field3007[(int) (arg0 & (long) (this.field3006 - 1))];
        for (this.field3005 = var3.field3025; this.field3005 != var3; this.field3005 = this.field3005.field3025) {
            if (this.field3005.field3024 == arg0) {
                class199 var4 = this.field3005;
                this.field3005 = this.field3005.field3025;
                return var4;
            }
        }
        this.field3005 = null;
        return null;
    }

    @ObfuscatedName("gh.k(Lgb;J)V")
    public void method3376(class199 arg0, long arg1) {
        if (arg0.field3026 != null) {
            arg0.method3482();
        }
        class199 var4 = this.field3007[(int) (arg1 & (long) (this.field3006 - 1))];
        arg0.field3026 = var4.field3026;
        arg0.field3025 = var4;
        arg0.field3026.field3025 = arg0;
        arg0.field3025.field3026 = arg0;
        arg0.field3024 = arg1;
    }

    @ObfuscatedName("gh.g()V")
    public void method3388() {
        for (int var1 = 0; var1 < this.field3006; var1++) {
            class199 var2 = this.field3007[var1];
            while (true) {
                class199 var3 = var2.field3025;
                if (var2 == var3) {
                    break;
                }
                var3.method3482();
            }
        }
        this.field3005 = null;
    }

    public Iterator iterator() {
        return new class185(this);
    }
}
