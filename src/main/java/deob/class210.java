package deob;

import java.util.Iterator;

@ObfuscatedName("hh")
public final class class210 implements Iterable {

    @ObfuscatedName("hh.g")
    public int field2637;

    @ObfuscatedName("hh.e")
    public class217[] field2634;

    @ObfuscatedName("hh.b")
    public class217 field2635;

    @ObfuscatedName("hh.z")
    public class217 field2636;

    @ObfuscatedName("hh.n")
    public int field2633 = 0;

    public class210(int arg0) {
        this.field2637 = arg0;
        this.field2634 = new class217[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class217 var3 = this.field2634[var2] = new class217();
            var3.field2659 = var3;
            var3.field2658 = var3;
        }
    }

    @ObfuscatedName("hh.g(J)Lht;")
    public class217 method3674(long arg0) {
        class217 var3 = this.field2634[(int) (arg0 & (long) (this.field2637 - 1))];
        for (this.field2635 = var3.field2659; this.field2635 != var3; this.field2635 = this.field2635.field2659) {
            if (this.field2635.field2660 == arg0) {
                class217 var4 = this.field2635;
                this.field2635 = this.field2635.field2659;
                return var4;
            }
        }
        this.field2635 = null;
        return null;
    }

    @ObfuscatedName("hh.e(Lht;J)V")
    public void method3683(class217 arg0, long arg1) {
        if (arg0.field2658 != null) {
            arg0.method3796();
        }
        class217 var4 = this.field2634[(int) (arg1 & (long) (this.field2637 - 1))];
        arg0.field2658 = var4.field2658;
        arg0.field2659 = var4;
        arg0.field2658.field2659 = arg0;
        arg0.field2659.field2658 = arg0;
        arg0.field2660 = arg1;
    }

    @ObfuscatedName("hh.b()V")
    public void method3676() {
        for (int var1 = 0; var1 < this.field2637; var1++) {
            class217 var2 = this.field2634[var1];
            while (true) {
                class217 var3 = var2.field2659;
                if (var2 == var3) {
                    break;
                }
                var3.method3796();
            }
        }
        this.field2635 = null;
        this.field2636 = null;
    }

    @ObfuscatedName("hh.z()Lht;")
    public class217 method3673() {
        this.field2633 = 0;
        return this.method3690();
    }

    @ObfuscatedName("hh.n()Lht;")
    public class217 method3690() {
        if (this.field2633 > 0 && this.field2634[this.field2633 - 1] != this.field2636) {
            class217 var1 = this.field2636;
            this.field2636 = var1.field2659;
            return var1;
        }
        class217 var2;
        do {
            if (this.field2633 >= this.field2637) {
                return null;
            }
            var2 = this.field2634[this.field2633++].field2659;
        } while (this.field2634[this.field2633 - 1] == var2);
        this.field2636 = var2.field2659;
        return var2;
    }

    public Iterator iterator() {
        return new class223(this);
    }
}
