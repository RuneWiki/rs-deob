package deob;

import java.util.Iterator;

@ObfuscatedName("hz")
public final class class210 implements Iterable {

    @ObfuscatedName("hz.c")
    public int field2622;

    @ObfuscatedName("hz.i")
    public class217[] field2619;

    @ObfuscatedName("hz.o")
    public class217 field2620;

    @ObfuscatedName("hz.j")
    public class217 field2621;

    @ObfuscatedName("hz.k")
    public int field2618 = 0;

    public class210(int arg0) {
        this.field2622 = arg0;
        this.field2619 = new class217[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class217 var3 = this.field2619[var2] = new class217();
            var3.field2643 = var3;
            var3.field2644 = var3;
        }
    }

    @ObfuscatedName("hz.c(J)Lhg;")
    public class217 method3603(long arg0) {
        class217 var3 = this.field2619[(int) (arg0 & (long) (this.field2622 - 1))];
        for (this.field2620 = var3.field2643; this.field2620 != var3; this.field2620 = this.field2620.field2643) {
            if (this.field2620.field2645 == arg0) {
                class217 var4 = this.field2620;
                this.field2620 = this.field2620.field2643;
                return var4;
            }
        }
        this.field2620 = null;
        return null;
    }

    @ObfuscatedName("hz.i(Lhg;J)V")
    public void method3610(class217 arg0, long arg1) {
        if (arg0.field2644 != null) {
            arg0.method3710();
        }
        class217 var4 = this.field2619[(int) (arg1 & (long) (this.field2622 - 1))];
        arg0.field2644 = var4.field2644;
        arg0.field2643 = var4;
        arg0.field2644.field2643 = arg0;
        arg0.field2643.field2644 = arg0;
        arg0.field2645 = arg1;
    }

    @ObfuscatedName("hz.o()V")
    public void method3600() {
        for (int var1 = 0; var1 < this.field2622; var1++) {
            class217 var2 = this.field2619[var1];
            while (true) {
                class217 var3 = var2.field2643;
                if (var2 == var3) {
                    break;
                }
                var3.method3710();
            }
        }
        this.field2620 = null;
        this.field2621 = null;
    }

    @ObfuscatedName("hz.j()Lhg;")
    public class217 method3606() {
        this.field2618 = 0;
        return this.method3597();
    }

    @ObfuscatedName("hz.k()Lhg;")
    public class217 method3597() {
        if (this.field2618 > 0 && this.field2619[this.field2618 - 1] != this.field2621) {
            class217 var1 = this.field2621;
            this.field2621 = var1.field2643;
            return var1;
        }
        class217 var2;
        do {
            if (this.field2618 >= this.field2622) {
                return null;
            }
            var2 = this.field2619[this.field2618++].field2643;
        } while (this.field2619[this.field2618 - 1] == var2);
        this.field2621 = var2.field2643;
        return var2;
    }

    public Iterator iterator() {
        return new class223(this);
    }
}
