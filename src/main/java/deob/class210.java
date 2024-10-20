package deob;

import java.util.Iterator;

@ObfuscatedName("hq")
public final class class210 implements Iterable {

    @ObfuscatedName("hq.t")
    public int field2614;

    @ObfuscatedName("hq.q")
    public class217[] field2612;

    @ObfuscatedName("hq.i")
    public class217 field2613;

    @ObfuscatedName("hq.a")
    public class217 field2615;

    @ObfuscatedName("hq.l")
    public int field2611 = 0;

    public class210(int arg0) {
        this.field2614 = arg0;
        this.field2612 = new class217[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class217 var3 = this.field2612[var2] = new class217();
            var3.field2637 = var3;
            var3.field2638 = var3;
        }
    }

    @ObfuscatedName("hq.t(J)Lhx;")
    public class217 method3594(long arg0) {
        class217 var3 = this.field2612[(int) (arg0 & (long) (this.field2614 - 1))];
        for (this.field2613 = var3.field2637; this.field2613 != var3; this.field2613 = this.field2613.field2637) {
            if (this.field2613.field2636 == arg0) {
                class217 var4 = this.field2613;
                this.field2613 = this.field2613.field2637;
                return var4;
            }
        }
        this.field2613 = null;
        return null;
    }

    @ObfuscatedName("hq.q(Lhx;J)V")
    public void method3609(class217 arg0, long arg1) {
        if (arg0.field2638 != null) {
            arg0.method3721();
        }
        class217 var4 = this.field2612[(int) (arg1 & (long) (this.field2614 - 1))];
        arg0.field2638 = var4.field2638;
        arg0.field2637 = var4;
        arg0.field2638.field2637 = arg0;
        arg0.field2637.field2638 = arg0;
        arg0.field2636 = arg1;
    }

    @ObfuscatedName("hq.i()V")
    public void method3597() {
        for (int var1 = 0; var1 < this.field2614; var1++) {
            class217 var2 = this.field2612[var1];
            while (true) {
                class217 var3 = var2.field2637;
                if (var2 == var3) {
                    break;
                }
                var3.method3721();
            }
        }
        this.field2613 = null;
        this.field2615 = null;
    }

    @ObfuscatedName("hq.a()Lhx;")
    public class217 method3595() {
        this.field2611 = 0;
        return this.method3599();
    }

    @ObfuscatedName("hq.l()Lhx;")
    public class217 method3599() {
        if (this.field2611 > 0 && this.field2612[this.field2611 - 1] != this.field2615) {
            class217 var1 = this.field2615;
            this.field2615 = var1.field2637;
            return var1;
        }
        class217 var2;
        do {
            if (this.field2611 >= this.field2614) {
                return null;
            }
            var2 = this.field2612[this.field2611++].field2637;
        } while (this.field2612[this.field2611 - 1] == var2);
        this.field2615 = var2.field2637;
        return var2;
    }

    public Iterator iterator() {
        return new class223(this);
    }
}
