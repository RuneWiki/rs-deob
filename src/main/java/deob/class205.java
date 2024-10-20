package deob;

import java.util.Iterator;

@ObfuscatedName("gs")
public final class class205 implements Iterable {

    @ObfuscatedName("gs.a")
    public int field2486;

    @ObfuscatedName("gs.s")
    public class212[] field2485;

    @ObfuscatedName("gs.g")
    public class212 field2487;

    @ObfuscatedName("gs.x")
    public class212 field2488;

    @ObfuscatedName("gs.h")
    public int field2489 = 0;

    public class205(int arg0) {
        this.field2486 = arg0;
        this.field2485 = new class212[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class212 var3 = this.field2485[var2] = new class212();
            var3.field2511 = var3;
            var3.field2510 = var3;
        }
    }

    @ObfuscatedName("gs.a(J)Lhy;")
    public class212 method3851(long arg0) {
        class212 var3 = this.field2485[(int) (arg0 & (long) (this.field2486 - 1))];
        for (this.field2487 = var3.field2511; this.field2487 != var3; this.field2487 = this.field2487.field2511) {
            if (this.field2487.field2512 == arg0) {
                class212 var4 = this.field2487;
                this.field2487 = this.field2487.field2511;
                return var4;
            }
        }
        this.field2487 = null;
        return null;
    }

    @ObfuscatedName("gs.s(Lhy;J)V")
    public void method3859(class212 arg0, long arg1) {
        if (arg0.field2510 != null) {
            arg0.method3960();
        }
        class212 var4 = this.field2485[(int) (arg1 & (long) (this.field2486 - 1))];
        arg0.field2510 = var4.field2510;
        arg0.field2511 = var4;
        arg0.field2510.field2511 = arg0;
        arg0.field2511.field2510 = arg0;
        arg0.field2512 = arg1;
    }

    @ObfuscatedName("gs.g()V")
    public void method3853() {
        for (int var1 = 0; var1 < this.field2486; var1++) {
            class212 var2 = this.field2485[var1];
            while (true) {
                class212 var3 = var2.field2511;
                if (var2 == var3) {
                    break;
                }
                var3.method3960();
            }
        }
        this.field2487 = null;
        this.field2488 = null;
    }

    @ObfuscatedName("gs.x()Lhy;")
    public class212 method3854() {
        this.field2489 = 0;
        return this.method3863();
    }

    @ObfuscatedName("gs.h()Lhy;")
    public class212 method3863() {
        if (this.field2489 > 0 && this.field2485[this.field2489 - 1] != this.field2488) {
            class212 var1 = this.field2488;
            this.field2488 = var1.field2511;
            return var1;
        }
        class212 var2;
        do {
            if (this.field2489 >= this.field2486) {
                return null;
            }
            var2 = this.field2485[this.field2489++].field2511;
        } while (this.field2485[this.field2489 - 1] == var2);
        this.field2488 = var2.field2511;
        return var2;
    }

    public Iterator iterator() {
        return new class218(this);
    }
}
