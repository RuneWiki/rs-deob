package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public final class class187 implements Iterable {

    @ObfuscatedName("gf.e")
    public int field2434;

    @ObfuscatedName("gf.o")
    public class193[] field2432;

    @ObfuscatedName("gf.m")
    public class193 field2433;

    @ObfuscatedName("gf.g")
    public class193 field2431;

    @ObfuscatedName("gf.d")
    public int field2435 = 0;

    public class187(int arg0) {
        this.field2434 = arg0;
        this.field2432 = new class193[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class193 var3 = this.field2432[var2] = new class193();
            var3.field2453 = var3;
            var3.field2452 = var3;
        }
    }

    @ObfuscatedName("gf.e(J)Lgc;")
    public class193 method3216(long arg0) {
        class193 var3 = this.field2432[(int) (arg0 & (long) (this.field2434 - 1))];
        for (this.field2433 = var3.field2453; this.field2433 != var3; this.field2433 = this.field2433.field2453) {
            if (this.field2433.field2454 == arg0) {
                class193 var4 = this.field2433;
                this.field2433 = this.field2433.field2453;
                return var4;
            }
        }
        this.field2433 = null;
        return null;
    }

    @ObfuscatedName("gf.o(Lgc;J)V")
    public void method3234(class193 arg0, long arg1) {
        if (arg0.field2452 != null) {
            arg0.method3304();
        }
        class193 var4 = this.field2432[(int) (arg1 & (long) (this.field2434 - 1))];
        arg0.field2452 = var4.field2452;
        arg0.field2453 = var4;
        arg0.field2452.field2453 = arg0;
        arg0.field2453.field2452 = arg0;
        arg0.field2454 = arg1;
    }

    @ObfuscatedName("gf.m()V")
    public void method3218() {
        for (int var1 = 0; var1 < this.field2434; var1++) {
            class193 var2 = this.field2432[var1];
            while (true) {
                class193 var3 = var2.field2453;
                if (var2 == var3) {
                    break;
                }
                var3.method3304();
            }
        }
        this.field2433 = null;
        this.field2431 = null;
    }

    @ObfuscatedName("gf.g()Lgc;")
    public class193 method3224() {
        this.field2435 = 0;
        return this.method3220();
    }

    @ObfuscatedName("gf.d()Lgc;")
    public class193 method3220() {
        if (this.field2435 > 0 && this.field2432[this.field2435 - 1] != this.field2431) {
            class193 var1 = this.field2431;
            this.field2431 = var1.field2453;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2435 >= this.field2434) {
                return null;
            }
            var2 = this.field2432[this.field2435++].field2453;
        } while (this.field2432[this.field2435 - 1] == var2);
        this.field2431 = var2.field2453;
        return var2;
    }

    public Iterator iterator() {
        return new class198(this);
    }
}
