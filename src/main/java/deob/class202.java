package deob;

import java.util.Iterator;

@ObfuscatedName("gz")
public final class class202 implements Iterable {

    @ObfuscatedName("gz.a")
    public int field3151;

    @ObfuscatedName("gz.d")
    public class212[] field3150;

    @ObfuscatedName("gz.v")
    public class212 field3152;

    public class202(int arg0) {
        this.field3151 = arg0;
        this.field3150 = new class212[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class212 var3 = this.field3150[var2] = new class212();
            var3.field3170 = var3;
            var3.field3172 = var3;
        }
    }

    @ObfuscatedName("gz.a(J)Lhr;")
    public class212 method3599(long arg0) {
        class212 var3 = this.field3150[(int) (arg0 & (long) (this.field3151 - 1))];
        for (this.field3152 = var3.field3170; this.field3152 != var3; this.field3152 = this.field3152.field3170) {
            if (this.field3152.field3171 == arg0) {
                class212 var4 = this.field3152;
                this.field3152 = this.field3152.field3170;
                return var4;
            }
        }
        this.field3152 = null;
        return null;
    }

    @ObfuscatedName("gz.d(Lhr;J)V")
    public void method3600(class212 arg0, long arg1) {
        if (arg0.field3172 != null) {
            arg0.method3729();
        }
        class212 var4 = this.field3150[(int) (arg1 & (long) (this.field3151 - 1))];
        arg0.field3172 = var4.field3172;
        arg0.field3170 = var4;
        arg0.field3172.field3170 = arg0;
        arg0.field3170.field3172 = arg0;
        arg0.field3171 = arg1;
    }

    @ObfuscatedName("gz.v()V")
    public void method3601() {
        for (int var1 = 0; var1 < this.field3151; var1++) {
            class212 var2 = this.field3150[var1];
            while (true) {
                class212 var3 = var2.field3170;
                if (var2 == var3) {
                    break;
                }
                var3.method3729();
            }
        }
        this.field3152 = null;
    }

    public Iterator iterator() {
        return new class198(this);
    }
}
