package deob;

import java.util.Iterator;

@ObfuscatedName("gu")
public final class class194 implements Iterable {

    @ObfuscatedName("gu.b")
    public int field2537;

    @ObfuscatedName("gu.s")
    public class200[] field2534;

    @ObfuscatedName("gu.r")
    public class200 field2535;

    @ObfuscatedName("gu.g")
    public class200 field2536;

    @ObfuscatedName("gu.x")
    public int field2538 = 0;

    public class194(int arg0) {
        this.field2537 = arg0;
        this.field2534 = new class200[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class200 var3 = this.field2534[var2] = new class200();
            var3.field2556 = var3;
            var3.field2555 = var3;
        }
    }

    @ObfuscatedName("gu.b(J)Lgt;")
    public class200 method3308(long arg0) {
        class200 var3 = this.field2534[(int) (arg0 & (long) (this.field2537 - 1))];
        for (this.field2535 = var3.field2556; this.field2535 != var3; this.field2535 = this.field2535.field2556) {
            if (this.field2535.field2557 == arg0) {
                class200 var4 = this.field2535;
                this.field2535 = this.field2535.field2556;
                return var4;
            }
        }
        this.field2535 = null;
        return null;
    }

    @ObfuscatedName("gu.s(Lgt;J)V")
    public void method3301(class200 arg0, long arg1) {
        if (arg0.field2555 != null) {
            arg0.method3392();
        }
        class200 var4 = this.field2534[(int) (arg1 & (long) (this.field2537 - 1))];
        arg0.field2555 = var4.field2555;
        arg0.field2556 = var4;
        arg0.field2555.field2556 = arg0;
        arg0.field2556.field2555 = arg0;
        arg0.field2557 = arg1;
    }

    @ObfuscatedName("gu.r()V")
    public void method3302() {
        for (int var1 = 0; var1 < this.field2537; var1++) {
            class200 var2 = this.field2534[var1];
            while (true) {
                class200 var3 = var2.field2556;
                if (var2 == var3) {
                    break;
                }
                var3.method3392();
            }
        }
        this.field2535 = null;
        this.field2536 = null;
    }

    @ObfuscatedName("gu.g()Lgt;")
    public class200 method3303() {
        this.field2538 = 0;
        return this.method3304();
    }

    @ObfuscatedName("gu.x()Lgt;")
    public class200 method3304() {
        if (this.field2538 > 0 && this.field2534[this.field2538 - 1] != this.field2536) {
            class200 var1 = this.field2536;
            this.field2536 = var1.field2556;
            return var1;
        }
        class200 var2;
        do {
            if (this.field2538 >= this.field2537) {
                return null;
            }
            var2 = this.field2534[this.field2538++].field2556;
        } while (this.field2534[this.field2538 - 1] == var2);
        this.field2536 = var2.field2556;
        return var2;
    }

    public Iterator iterator() {
        return new class205(this);
    }
}
