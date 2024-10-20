package deob;

import java.util.Iterator;

@ObfuscatedName("ha")
public final class class210 implements Iterable {

    @ObfuscatedName("ha.o")
    public int field2631;

    @ObfuscatedName("ha.k")
    public class217[] field2628;

    @ObfuscatedName("ha.t")
    public class217 field2627;

    @ObfuscatedName("ha.d")
    public class217 field2630;

    @ObfuscatedName("ha.h")
    public int field2629 = 0;

    public class210(int arg0) {
        this.field2631 = arg0;
        this.field2628 = new class217[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class217 var3 = this.field2628[var2] = new class217();
            var3.field2653 = var3;
            var3.field2654 = var3;
        }
    }

    @ObfuscatedName("ha.o(J)Lhj;")
    public class217 method3575(long arg0) {
        class217 var3 = this.field2628[(int) (arg0 & (long) (this.field2631 - 1))];
        for (this.field2627 = var3.field2653; this.field2627 != var3; this.field2627 = this.field2627.field2653) {
            if (this.field2627.field2652 == arg0) {
                class217 var4 = this.field2627;
                this.field2627 = this.field2627.field2653;
                return var4;
            }
        }
        this.field2627 = null;
        return null;
    }

    @ObfuscatedName("ha.k(Lhj;J)V")
    public void method3580(class217 arg0, long arg1) {
        if (arg0.field2654 != null) {
            arg0.method3681();
        }
        class217 var4 = this.field2628[(int) (arg1 & (long) (this.field2631 - 1))];
        arg0.field2654 = var4.field2654;
        arg0.field2653 = var4;
        arg0.field2654.field2653 = arg0;
        arg0.field2653.field2654 = arg0;
        arg0.field2652 = arg1;
    }

    @ObfuscatedName("ha.t()V")
    public void method3569() {
        for (int var1 = 0; var1 < this.field2631; var1++) {
            class217 var2 = this.field2628[var1];
            while (true) {
                class217 var3 = var2.field2653;
                if (var2 == var3) {
                    break;
                }
                var3.method3681();
            }
        }
        this.field2627 = null;
        this.field2630 = null;
    }

    @ObfuscatedName("ha.d()Lhj;")
    public class217 method3570() {
        this.field2629 = 0;
        return this.method3586();
    }

    @ObfuscatedName("ha.h()Lhj;")
    public class217 method3586() {
        if (this.field2629 > 0 && this.field2628[this.field2629 - 1] != this.field2630) {
            class217 var1 = this.field2630;
            this.field2630 = var1.field2653;
            return var1;
        }
        class217 var2;
        do {
            if (this.field2629 >= this.field2631) {
                return null;
            }
            var2 = this.field2628[this.field2629++].field2653;
        } while (this.field2628[this.field2629 - 1] == var2);
        this.field2630 = var2.field2653;
        return var2;
    }

    public Iterator iterator() {
        return new class223(this);
    }
}
