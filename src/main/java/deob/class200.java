package deob;

import java.util.Iterator;

@ObfuscatedName("gt")
public final class class200 implements Iterable {

    @ObfuscatedName("gt.f")
    public int field2460;

    @ObfuscatedName("gt.h")
    public class207[] field2461;

    @ObfuscatedName("gt.e")
    public class207 field2463;

    @ObfuscatedName("gt.b")
    public class207 field2462;

    @ObfuscatedName("gt.l")
    public int field2464 = 0;

    public class200(int arg0) {
        this.field2460 = arg0;
        this.field2461 = new class207[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class207 var3 = this.field2461[var2] = new class207();
            var3.field2487 = var3;
            var3.field2485 = var3;
        }
    }

    @ObfuscatedName("gt.f(J)Lgf;")
    public class207 method3710(long arg0) {
        class207 var3 = this.field2461[(int) (arg0 & (long) (this.field2460 - 1))];
        for (this.field2463 = var3.field2487; this.field2463 != var3; this.field2463 = this.field2463.field2487) {
            if (this.field2463.field2486 == arg0) {
                class207 var4 = this.field2463;
                this.field2463 = this.field2463.field2487;
                return var4;
            }
        }
        this.field2463 = null;
        return null;
    }

    @ObfuscatedName("gt.h(Lgf;J)V")
    public void method3698(class207 arg0, long arg1) {
        if (arg0.field2485 != null) {
            arg0.method3812();
        }
        class207 var4 = this.field2461[(int) (arg1 & (long) (this.field2460 - 1))];
        arg0.field2485 = var4.field2485;
        arg0.field2487 = var4;
        arg0.field2485.field2487 = arg0;
        arg0.field2487.field2485 = arg0;
        arg0.field2486 = arg1;
    }

    @ObfuscatedName("gt.e()V")
    public void method3699() {
        for (int var1 = 0; var1 < this.field2460; var1++) {
            class207 var2 = this.field2461[var1];
            while (true) {
                class207 var3 = var2.field2487;
                if (var2 == var3) {
                    break;
                }
                var3.method3812();
            }
        }
        this.field2463 = null;
        this.field2462 = null;
    }

    @ObfuscatedName("gt.b()Lgf;")
    public class207 method3706() {
        this.field2464 = 0;
        return this.method3700();
    }

    @ObfuscatedName("gt.l()Lgf;")
    public class207 method3700() {
        if (this.field2464 > 0 && this.field2461[this.field2464 - 1] != this.field2462) {
            class207 var1 = this.field2462;
            this.field2462 = var1.field2487;
            return var1;
        }
        class207 var2;
        do {
            if (this.field2464 >= this.field2460) {
                return null;
            }
            var2 = this.field2461[this.field2464++].field2487;
        } while (this.field2461[this.field2464 - 1] == var2);
        this.field2462 = var2.field2487;
        return var2;
    }

    public Iterator iterator() {
        return new class213(this);
    }
}
