package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public final class class199 implements Iterable {

    @ObfuscatedName("gm.t")
    public int field3106;

    @ObfuscatedName("gm.i")
    public class209[] field3107;

    @ObfuscatedName("gm.g")
    public class209 field3108;

    public class199(int arg0) {
        this.field3106 = arg0;
        this.field3107 = new class209[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class209 var3 = this.field3107[var2] = new class209();
            var3.field3127 = var3;
            var3.field3125 = var3;
        }
    }

    @ObfuscatedName("gm.t(J)Lhe;")
    public class209 method3498(long arg0) {
        class209 var3 = this.field3107[(int) (arg0 & (long) (this.field3106 - 1))];
        for (this.field3108 = var3.field3127; this.field3108 != var3; this.field3108 = this.field3108.field3127) {
            if (this.field3108.field3126 == arg0) {
                class209 var4 = this.field3108;
                this.field3108 = this.field3108.field3127;
                return var4;
            }
        }
        this.field3108 = null;
        return null;
    }

    @ObfuscatedName("gm.i(Lhe;J)V")
    public void method3499(class209 arg0, long arg1) {
        if (arg0.field3125 != null) {
            arg0.method3607();
        }
        class209 var4 = this.field3107[(int) (arg1 & (long) (this.field3106 - 1))];
        arg0.field3125 = var4.field3125;
        arg0.field3127 = var4;
        arg0.field3125.field3127 = arg0;
        arg0.field3127.field3125 = arg0;
        arg0.field3126 = arg1;
    }

    @ObfuscatedName("gm.g()V")
    public void method3501() {
        for (int var1 = 0; var1 < this.field3106; var1++) {
            class209 var2 = this.field3107[var1];
            while (true) {
                class209 var3 = var2.field3127;
                if (var2 == var3) {
                    break;
                }
                var3.method3607();
            }
        }
        this.field3108 = null;
    }

    public Iterator iterator() {
        return new class195(this);
    }
}
