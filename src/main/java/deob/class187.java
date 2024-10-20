package deob;

import java.util.Iterator;

@ObfuscatedName("gn")
public final class class187 implements Iterable {

    @ObfuscatedName("gn.i")
    public int field2456;

    @ObfuscatedName("gn.w")
    public class193[] field2453;

    @ObfuscatedName("gn.a")
    public class193 field2454;

    @ObfuscatedName("gn.t")
    public class193 field2455;

    @ObfuscatedName("gn.s")
    public int field2452 = 0;

    public class187(int arg0) {
        this.field2456 = arg0;
        this.field2453 = new class193[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class193 var3 = this.field2453[var2] = new class193();
            var3.field2474 = var3;
            var3.field2475 = var3;
        }
    }

    @ObfuscatedName("gn.i(J)Lgm;")
    public class193 method3197(long arg0) {
        class193 var3 = this.field2453[(int) (arg0 & (long) (this.field2456 - 1))];
        for (this.field2454 = var3.field2474; this.field2454 != var3; this.field2454 = this.field2454.field2474) {
            if (this.field2454.field2473 == arg0) {
                class193 var4 = this.field2454;
                this.field2454 = this.field2454.field2474;
                return var4;
            }
        }
        this.field2454 = null;
        return null;
    }

    @ObfuscatedName("gn.w(Lgm;J)V")
    public void method3198(class193 arg0, long arg1) {
        if (arg0.field2475 != null) {
            arg0.method3290();
        }
        class193 var4 = this.field2453[(int) (arg1 & (long) (this.field2456 - 1))];
        arg0.field2475 = var4.field2475;
        arg0.field2474 = var4;
        arg0.field2475.field2474 = arg0;
        arg0.field2474.field2475 = arg0;
        arg0.field2473 = arg1;
    }

    @ObfuscatedName("gn.a()V")
    public void method3199() {
        for (int var1 = 0; var1 < this.field2456; var1++) {
            class193 var2 = this.field2453[var1];
            while (true) {
                class193 var3 = var2.field2474;
                if (var2 == var3) {
                    break;
                }
                var3.method3290();
            }
        }
        this.field2454 = null;
        this.field2455 = null;
    }

    @ObfuscatedName("gn.t()Lgm;")
    public class193 method3200() {
        this.field2452 = 0;
        return this.method3196();
    }

    @ObfuscatedName("gn.s()Lgm;")
    public class193 method3196() {
        if (this.field2452 > 0 && this.field2453[this.field2452 - 1] != this.field2455) {
            class193 var1 = this.field2455;
            this.field2455 = var1.field2474;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2452 >= this.field2456) {
                return null;
            }
            var2 = this.field2453[this.field2452++].field2474;
        } while (this.field2453[this.field2452 - 1] == var2);
        this.field2455 = var2.field2474;
        return var2;
    }

    public Iterator iterator() {
        return new class198(this);
    }
}
