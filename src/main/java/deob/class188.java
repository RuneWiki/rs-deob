package deob;

import java.util.Iterator;

@ObfuscatedName("gd")
public final class class188 implements Iterable {

    @ObfuscatedName("gd.j")
    public int field2450;

    @ObfuscatedName("gd.h")
    public class194[] field2448;

    @ObfuscatedName("gd.f")
    public class194 field2447;

    @ObfuscatedName("gd.p")
    public class194 field2449;

    @ObfuscatedName("gd.x")
    public int field2451 = 0;

    public class188(int arg0) {
        this.field2450 = arg0;
        this.field2448 = new class194[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class194 var3 = this.field2448[var2] = new class194();
            var3.field2470 = var3;
            var3.field2468 = var3;
        }
    }

    @ObfuscatedName("gd.j(J)Lga;")
    public class194 method3232(long arg0) {
        class194 var3 = this.field2448[(int) (arg0 & (long) (this.field2450 - 1))];
        for (this.field2447 = var3.field2470; this.field2447 != var3; this.field2447 = this.field2447.field2470) {
            if (this.field2447.field2469 == arg0) {
                class194 var4 = this.field2447;
                this.field2447 = this.field2447.field2470;
                return var4;
            }
        }
        this.field2447 = null;
        return null;
    }

    @ObfuscatedName("gd.h(Lga;J)V")
    public void method3233(class194 arg0, long arg1) {
        if (arg0.field2468 != null) {
            arg0.method3314();
        }
        class194 var4 = this.field2448[(int) (arg1 & (long) (this.field2450 - 1))];
        arg0.field2468 = var4.field2468;
        arg0.field2470 = var4;
        arg0.field2468.field2470 = arg0;
        arg0.field2470.field2468 = arg0;
        arg0.field2469 = arg1;
    }

    @ObfuscatedName("gd.f()V")
    public void method3243() {
        for (int var1 = 0; var1 < this.field2450; var1++) {
            class194 var2 = this.field2448[var1];
            while (true) {
                class194 var3 = var2.field2470;
                if (var2 == var3) {
                    break;
                }
                var3.method3314();
            }
        }
        this.field2447 = null;
        this.field2449 = null;
    }

    @ObfuscatedName("gd.p()Lga;")
    public class194 method3235() {
        this.field2451 = 0;
        return this.method3236();
    }

    @ObfuscatedName("gd.x()Lga;")
    public class194 method3236() {
        if (this.field2451 > 0 && this.field2448[this.field2451 - 1] != this.field2449) {
            class194 var1 = this.field2449;
            this.field2449 = var1.field2470;
            return var1;
        }
        class194 var2;
        do {
            if (this.field2451 >= this.field2450) {
                return null;
            }
            var2 = this.field2448[this.field2451++].field2470;
        } while (this.field2448[this.field2451 - 1] == var2);
        this.field2449 = var2.field2470;
        return var2;
    }

    public Iterator iterator() {
        return new class199(this);
    }
}
