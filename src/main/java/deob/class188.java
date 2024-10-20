package deob;

import java.util.Iterator;

@ObfuscatedName("gw")
public final class class188 implements Iterable {

    @ObfuscatedName("gw.e")
    public int field2434;

    @ObfuscatedName("gw.n")
    public class194[] field2431;

    @ObfuscatedName("gw.g")
    public class194 field2432;

    @ObfuscatedName("gw.y")
    public class194 field2433;

    @ObfuscatedName("gw.w")
    public int field2430 = 0;

    public class188(int arg0) {
        this.field2434 = arg0;
        this.field2431 = new class194[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class194 var3 = this.field2431[var2] = new class194();
            var3.field2452 = var3;
            var3.field2453 = var3;
        }
    }

    @ObfuscatedName("gw.e(J)Lgx;")
    public class194 method3249(long arg0) {
        class194 var3 = this.field2431[(int) (arg0 & (long) (this.field2434 - 1))];
        for (this.field2432 = var3.field2452; this.field2432 != var3; this.field2432 = this.field2432.field2452) {
            if (this.field2432.field2451 == arg0) {
                class194 var4 = this.field2432;
                this.field2432 = this.field2432.field2452;
                return var4;
            }
        }
        this.field2432 = null;
        return null;
    }

    @ObfuscatedName("gw.n(Lgx;J)V")
    public void method3250(class194 arg0, long arg1) {
        if (arg0.field2453 != null) {
            arg0.method3333();
        }
        class194 var4 = this.field2431[(int) (arg1 & (long) (this.field2434 - 1))];
        arg0.field2453 = var4.field2453;
        arg0.field2452 = var4;
        arg0.field2453.field2452 = arg0;
        arg0.field2452.field2453 = arg0;
        arg0.field2451 = arg1;
    }

    @ObfuscatedName("gw.g()V")
    public void method3251() {
        for (int var1 = 0; var1 < this.field2434; var1++) {
            class194 var2 = this.field2431[var1];
            while (true) {
                class194 var3 = var2.field2452;
                if (var2 == var3) {
                    break;
                }
                var3.method3333();
            }
        }
        this.field2432 = null;
        this.field2433 = null;
    }

    @ObfuscatedName("gw.y()Lgx;")
    public class194 method3252() {
        this.field2430 = 0;
        return this.method3253();
    }

    @ObfuscatedName("gw.w()Lgx;")
    public class194 method3253() {
        if (this.field2430 > 0 && this.field2431[this.field2430 - 1] != this.field2433) {
            class194 var1 = this.field2433;
            this.field2433 = var1.field2452;
            return var1;
        }
        class194 var2;
        do {
            if (this.field2430 >= this.field2434) {
                return null;
            }
            var2 = this.field2431[this.field2430++].field2452;
        } while (this.field2431[this.field2430 - 1] == var2);
        this.field2433 = var2.field2452;
        return var2;
    }

    public Iterator iterator() {
        return new class199(this);
    }
}
