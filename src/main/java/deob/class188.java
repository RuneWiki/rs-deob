package deob;

import java.util.Iterator;

@ObfuscatedName("gi")
public final class class188 implements Iterable {

    @ObfuscatedName("gi.i")
    public int field2456;

    @ObfuscatedName("gi.j")
    public class194[] field2452;

    @ObfuscatedName("gi.a")
    public class194 field2454;

    @ObfuscatedName("gi.r")
    public class194 field2455;

    @ObfuscatedName("gi.o")
    public int field2453 = 0;

    public class188(int arg0) {
        this.field2456 = arg0;
        this.field2452 = new class194[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class194 var3 = this.field2452[var2] = new class194();
            var3.field2474 = var3;
            var3.field2473 = var3;
        }
    }

    @ObfuscatedName("gi.i(J)Lgs;")
    public class194 method3318(long arg0) {
        class194 var3 = this.field2452[(int) (arg0 & (long) (this.field2456 - 1))];
        for (this.field2454 = var3.field2474; this.field2454 != var3; this.field2454 = this.field2454.field2474) {
            if (this.field2454.field2475 == arg0) {
                class194 var4 = this.field2454;
                this.field2454 = this.field2454.field2474;
                return var4;
            }
        }
        this.field2454 = null;
        return null;
    }

    @ObfuscatedName("gi.j(Lgs;J)V")
    public void method3319(class194 arg0, long arg1) {
        if (arg0.field2473 != null) {
            arg0.method3397();
        }
        class194 var4 = this.field2452[(int) (arg1 & (long) (this.field2456 - 1))];
        arg0.field2473 = var4.field2473;
        arg0.field2474 = var4;
        arg0.field2473.field2474 = arg0;
        arg0.field2474.field2473 = arg0;
        arg0.field2475 = arg1;
    }

    @ObfuscatedName("gi.a()V")
    public void method3320() {
        for (int var1 = 0; var1 < this.field2456; var1++) {
            class194 var2 = this.field2452[var1];
            while (true) {
                class194 var3 = var2.field2474;
                if (var2 == var3) {
                    break;
                }
                var3.method3397();
            }
        }
        this.field2454 = null;
        this.field2455 = null;
    }

    @ObfuscatedName("gi.r()Lgs;")
    public class194 method3321() {
        this.field2453 = 0;
        return this.method3327();
    }

    @ObfuscatedName("gi.o()Lgs;")
    public class194 method3327() {
        if (this.field2453 > 0 && this.field2452[this.field2453 - 1] != this.field2455) {
            class194 var1 = this.field2455;
            this.field2455 = var1.field2474;
            return var1;
        }
        class194 var2;
        do {
            if (this.field2453 >= this.field2456) {
                return null;
            }
            var2 = this.field2452[this.field2453++].field2474;
        } while (this.field2452[this.field2453 - 1] == var2);
        this.field2455 = var2.field2474;
        return var2;
    }

    public Iterator iterator() {
        return new class199(this);
    }
}
