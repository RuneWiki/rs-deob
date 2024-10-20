package deob;

import java.util.Iterator;

@ObfuscatedName("gv")
public final class class207 implements Iterable {

    @ObfuscatedName("gv.b")
    public int field2591;

    @ObfuscatedName("gv.q")
    public class213[] field2593;

    @ObfuscatedName("gv.o")
    public class213 field2592;

    @ObfuscatedName("gv.p")
    public class213 field2590;

    @ObfuscatedName("gv.a")
    public int field2594 = 0;

    public class207(int arg0) {
        this.field2591 = arg0;
        this.field2593 = new class213[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class213 var3 = this.field2593[var2] = new class213();
            var3.field2612 = var3;
            var3.field2611 = var3;
        }
    }

    @ObfuscatedName("gv.b(J)Lhe;")
    public class213 method3632(long arg0) {
        class213 var3 = this.field2593[(int) (arg0 & (long) (this.field2591 - 1))];
        for (this.field2592 = var3.field2612; this.field2592 != var3; this.field2592 = this.field2592.field2612) {
            if (this.field2592.field2613 == arg0) {
                class213 var4 = this.field2592;
                this.field2592 = this.field2592.field2612;
                return var4;
            }
        }
        this.field2592 = null;
        return null;
    }

    @ObfuscatedName("gv.q(Lhe;J)V")
    public void method3636(class213 arg0, long arg1) {
        if (arg0.field2611 != null) {
            arg0.method3726();
        }
        class213 var4 = this.field2593[(int) (arg1 & (long) (this.field2591 - 1))];
        arg0.field2611 = var4.field2611;
        arg0.field2612 = var4;
        arg0.field2611.field2612 = arg0;
        arg0.field2612.field2611 = arg0;
        arg0.field2613 = arg1;
    }

    @ObfuscatedName("gv.o()V")
    public void method3635() {
        for (int var1 = 0; var1 < this.field2591; var1++) {
            class213 var2 = this.field2593[var1];
            while (true) {
                class213 var3 = var2.field2612;
                if (var2 == var3) {
                    break;
                }
                var3.method3726();
            }
        }
        this.field2592 = null;
        this.field2590 = null;
    }

    @ObfuscatedName("gv.p()Lhe;")
    public class213 method3633() {
        this.field2594 = 0;
        return this.method3642();
    }

    @ObfuscatedName("gv.a()Lhe;")
    public class213 method3642() {
        if (this.field2594 > 0 && this.field2593[this.field2594 - 1] != this.field2590) {
            class213 var1 = this.field2590;
            this.field2590 = var1.field2612;
            return var1;
        }
        class213 var2;
        do {
            if (this.field2594 >= this.field2591) {
                return null;
            }
            var2 = this.field2593[this.field2594++].field2612;
        } while (this.field2593[this.field2594 - 1] == var2);
        this.field2590 = var2.field2612;
        return var2;
    }

    public Iterator iterator() {
        return new class218(this);
    }
}
