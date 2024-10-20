package deob;

import java.util.Iterator;

@ObfuscatedName("gz")
public final class class199 implements Iterable {

    @ObfuscatedName("gz.a")
    public int field3107;

    @ObfuscatedName("gz.w")
    public class209[] field3105;

    @ObfuscatedName("gz.d")
    public class209 field3106;

    public class199(int arg0) {
        this.field3107 = arg0;
        this.field3105 = new class209[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class209 var3 = this.field3105[var2] = new class209();
            var3.field3125 = var3;
            var3.field3124 = var3;
        }
    }

    @ObfuscatedName("gz.a(J)Lha;")
    public class209 method3628(long arg0) {
        class209 var3 = this.field3105[(int) (arg0 & (long) (this.field3107 - 1))];
        for (this.field3106 = var3.field3125; this.field3106 != var3; this.field3106 = this.field3106.field3125) {
            if (this.field3106.field3126 == arg0) {
                class209 var4 = this.field3106;
                this.field3106 = this.field3106.field3125;
                return var4;
            }
        }
        this.field3106 = null;
        return null;
    }

    @ObfuscatedName("gz.w(Lha;J)V")
    public void method3629(class209 arg0, long arg1) {
        if (arg0.field3124 != null) {
            arg0.method3737();
        }
        class209 var4 = this.field3105[(int) (arg1 & (long) (this.field3107 - 1))];
        arg0.field3124 = var4.field3124;
        arg0.field3125 = var4;
        arg0.field3124.field3125 = arg0;
        arg0.field3125.field3124 = arg0;
        arg0.field3126 = arg1;
    }

    @ObfuscatedName("gz.d()V")
    public void method3630() {
        for (int var1 = 0; var1 < this.field3107; var1++) {
            class209 var2 = this.field3105[var1];
            while (true) {
                class209 var3 = var2.field3125;
                if (var2 == var3) {
                    break;
                }
                var3.method3737();
            }
        }
        this.field3106 = null;
    }

    public Iterator iterator() {
        return new class195(this);
    }
}
