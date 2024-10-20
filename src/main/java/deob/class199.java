package deob;

import java.util.Iterator;

@ObfuscatedName("gu")
public final class class199 implements Iterable {

    @ObfuscatedName("gu.j")
    public int field3106;

    @ObfuscatedName("gu.h")
    public class209[] field3105;

    @ObfuscatedName("gu.m")
    public class209 field3104;

    public class199(int arg0) {
        this.field3106 = arg0;
        this.field3105 = new class209[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class209 var3 = this.field3105[var2] = new class209();
            var3.field3124 = var3;
            var3.field3125 = var3;
        }
    }

    @ObfuscatedName("gu.j(J)Lhc;")
    public class209 method3520(long arg0) {
        class209 var3 = this.field3105[(int) (arg0 & (long) (this.field3106 - 1))];
        for (this.field3104 = var3.field3124; this.field3104 != var3; this.field3104 = this.field3104.field3124) {
            if (this.field3104.field3123 == arg0) {
                class209 var4 = this.field3104;
                this.field3104 = this.field3104.field3124;
                return var4;
            }
        }
        this.field3104 = null;
        return null;
    }

    @ObfuscatedName("gu.h(Lhc;J)V")
    public void method3521(class209 arg0, long arg1) {
        if (arg0.field3125 != null) {
            arg0.method3639();
        }
        class209 var4 = this.field3105[(int) (arg1 & (long) (this.field3106 - 1))];
        arg0.field3125 = var4.field3125;
        arg0.field3124 = var4;
        arg0.field3125.field3124 = arg0;
        arg0.field3124.field3125 = arg0;
        arg0.field3123 = arg1;
    }

    @ObfuscatedName("gu.m()V")
    public void method3522() {
        for (int var1 = 0; var1 < this.field3106; var1++) {
            class209 var2 = this.field3105[var1];
            while (true) {
                class209 var3 = var2.field3124;
                if (var2 == var3) {
                    break;
                }
                var3.method3639();
            }
        }
        this.field3104 = null;
    }

    public Iterator iterator() {
        return new class195(this);
    }
}
