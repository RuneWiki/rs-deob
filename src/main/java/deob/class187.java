package deob;

import java.util.Iterator;

@ObfuscatedName("gc")
public final class class187 implements Iterable {

    @ObfuscatedName("gc.d")
    public int field2420;

    @ObfuscatedName("gc.q")
    public class193[] field2419;

    @ObfuscatedName("gc.x")
    public class193 field2422;

    @ObfuscatedName("gc.y")
    public class193 field2421;

    @ObfuscatedName("gc.e")
    public int field2418 = 0;

    public class187(int arg0) {
        this.field2420 = arg0;
        this.field2419 = new class193[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class193 var3 = this.field2419[var2] = new class193();
            var3.field2440 = var3;
            var3.field2439 = var3;
        }
    }

    @ObfuscatedName("gc.d(J)Lgm;")
    public class193 method3224(long arg0) {
        class193 var3 = this.field2419[(int) (arg0 & (long) (this.field2420 - 1))];
        for (this.field2422 = var3.field2440; this.field2422 != var3; this.field2422 = this.field2422.field2440) {
            if (this.field2422.field2441 == arg0) {
                class193 var4 = this.field2422;
                this.field2422 = this.field2422.field2440;
                return var4;
            }
        }
        this.field2422 = null;
        return null;
    }

    @ObfuscatedName("gc.q(Lgm;J)V")
    public void method3231(class193 arg0, long arg1) {
        if (arg0.field2439 != null) {
            arg0.method3312();
        }
        class193 var4 = this.field2419[(int) (arg1 & (long) (this.field2420 - 1))];
        arg0.field2439 = var4.field2439;
        arg0.field2440 = var4;
        arg0.field2439.field2440 = arg0;
        arg0.field2440.field2439 = arg0;
        arg0.field2441 = arg1;
    }

    @ObfuscatedName("gc.x()V")
    public void method3226() {
        for (int var1 = 0; var1 < this.field2420; var1++) {
            class193 var2 = this.field2419[var1];
            while (true) {
                class193 var3 = var2.field2440;
                if (var2 == var3) {
                    break;
                }
                var3.method3312();
            }
        }
        this.field2422 = null;
        this.field2421 = null;
    }

    @ObfuscatedName("gc.y()Lgm;")
    public class193 method3232() {
        this.field2418 = 0;
        return this.method3228();
    }

    @ObfuscatedName("gc.e()Lgm;")
    public class193 method3228() {
        if (this.field2418 > 0 && this.field2419[this.field2418 - 1] != this.field2421) {
            class193 var1 = this.field2421;
            this.field2421 = var1.field2440;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2418 >= this.field2420) {
                return null;
            }
            var2 = this.field2419[this.field2418++].field2440;
        } while (this.field2419[this.field2418 - 1] == var2);
        this.field2421 = var2.field2440;
        return var2;
    }

    public Iterator iterator() {
        return new class198(this);
    }
}
