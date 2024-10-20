package deob;

import java.util.Iterator;

@ObfuscatedName("gb")
public final class class198 implements Iterable {

    @ObfuscatedName("gb.n")
    public int field2577;

    @ObfuscatedName("gb.v")
    public class204[] field2576;

    @ObfuscatedName("gb.y")
    public class204 field2575;

    @ObfuscatedName("gb.r")
    public class204 field2578;

    @ObfuscatedName("gb.h")
    public int field2579 = 0;

    public class198(int arg0) {
        this.field2577 = arg0;
        this.field2576 = new class204[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class204 var3 = this.field2576[var2] = new class204();
            var3.field2598 = var3;
            var3.field2596 = var3;
        }
    }

    @ObfuscatedName("gb.n(J)Lgw;")
    public class204 method3382(long arg0) {
        class204 var3 = this.field2576[(int) (arg0 & (long) (this.field2577 - 1))];
        for (this.field2575 = var3.field2598; this.field2575 != var3; this.field2575 = this.field2575.field2598) {
            if (this.field2575.field2597 == arg0) {
                class204 var4 = this.field2575;
                this.field2575 = this.field2575.field2598;
                return var4;
            }
        }
        this.field2575 = null;
        return null;
    }

    @ObfuscatedName("gb.v(Lgw;J)V")
    public void method3387(class204 arg0, long arg1) {
        if (arg0.field2596 != null) {
            arg0.method3474();
        }
        class204 var4 = this.field2576[(int) (arg1 & (long) (this.field2577 - 1))];
        arg0.field2596 = var4.field2596;
        arg0.field2598 = var4;
        arg0.field2596.field2598 = arg0;
        arg0.field2598.field2596 = arg0;
        arg0.field2597 = arg1;
    }

    @ObfuscatedName("gb.y()V")
    public void method3378() {
        for (int var1 = 0; var1 < this.field2577; var1++) {
            class204 var2 = this.field2576[var1];
            while (true) {
                class204 var3 = var2.field2598;
                if (var2 == var3) {
                    break;
                }
                var3.method3474();
            }
        }
        this.field2575 = null;
        this.field2578 = null;
    }

    @ObfuscatedName("gb.r()Lgw;")
    public class204 method3379() {
        this.field2579 = 0;
        return this.method3376();
    }

    @ObfuscatedName("gb.h()Lgw;")
    public class204 method3376() {
        if (this.field2579 > 0 && this.field2576[this.field2579 - 1] != this.field2578) {
            class204 var1 = this.field2578;
            this.field2578 = var1.field2598;
            return var1;
        }
        class204 var2;
        do {
            if (this.field2579 >= this.field2577) {
                return null;
            }
            var2 = this.field2576[this.field2579++].field2598;
        } while (this.field2576[this.field2579 - 1] == var2);
        this.field2578 = var2.field2598;
        return var2;
    }

    public Iterator iterator() {
        return new class209(this);
    }
}
