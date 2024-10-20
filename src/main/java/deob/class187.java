package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public final class class187 implements Iterable {

    @ObfuscatedName("gm.i")
    public int field2448;

    @ObfuscatedName("gm.h")
    public class193[] field2446;

    @ObfuscatedName("gm.u")
    public class193 field2447;

    @ObfuscatedName("gm.q")
    public class193 field2449;

    @ObfuscatedName("gm.g")
    public int field2445 = 0;

    public class187(int arg0) {
        this.field2448 = arg0;
        this.field2446 = new class193[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class193 var3 = this.field2446[var2] = new class193();
            var3.field2468 = var3;
            var3.field2466 = var3;
        }
    }

    @ObfuscatedName("gm.i(J)Lgn;")
    public class193 method3275(long arg0) {
        class193 var3 = this.field2446[(int) (arg0 & (long) (this.field2448 - 1))];
        for (this.field2447 = var3.field2468; this.field2447 != var3; this.field2447 = this.field2447.field2468) {
            if (this.field2447.field2467 == arg0) {
                class193 var4 = this.field2447;
                this.field2447 = this.field2447.field2468;
                return var4;
            }
        }
        this.field2447 = null;
        return null;
    }

    @ObfuscatedName("gm.h(Lgn;J)V")
    public void method3291(class193 arg0, long arg1) {
        if (arg0.field2466 != null) {
            arg0.method3364();
        }
        class193 var4 = this.field2446[(int) (arg1 & (long) (this.field2448 - 1))];
        arg0.field2466 = var4.field2466;
        arg0.field2468 = var4;
        arg0.field2466.field2468 = arg0;
        arg0.field2468.field2466 = arg0;
        arg0.field2467 = arg1;
    }

    @ObfuscatedName("gm.u()V")
    public void method3277() {
        for (int var1 = 0; var1 < this.field2448; var1++) {
            class193 var2 = this.field2446[var1];
            while (true) {
                class193 var3 = var2.field2468;
                if (var2 == var3) {
                    break;
                }
                var3.method3364();
            }
        }
        this.field2447 = null;
        this.field2449 = null;
    }

    @ObfuscatedName("gm.q()Lgn;")
    public class193 method3278() {
        this.field2445 = 0;
        return this.method3274();
    }

    @ObfuscatedName("gm.g()Lgn;")
    public class193 method3274() {
        if (this.field2445 > 0 && this.field2446[this.field2445 - 1] != this.field2449) {
            class193 var1 = this.field2449;
            this.field2449 = var1.field2468;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2445 >= this.field2448) {
                return null;
            }
            var2 = this.field2446[this.field2445++].field2468;
        } while (this.field2446[this.field2445 - 1] == var2);
        this.field2449 = var2.field2468;
        return var2;
    }

    public Iterator iterator() {
        return new class198(this);
    }
}
