package deob;

import java.util.Iterator;

@ObfuscatedName("gr")
public final class class198 implements Iterable {

    @ObfuscatedName("gr.a")
    public int field2568;

    @ObfuscatedName("gr.w")
    public class204[] field2570;

    @ObfuscatedName("gr.e")
    public class204 field2569;

    @ObfuscatedName("gr.k")
    public class204 field2571;

    @ObfuscatedName("gr.u")
    public int field2572 = 0;

    public class198(int arg0) {
        this.field2568 = arg0;
        this.field2570 = new class204[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class204 var3 = this.field2570[var2] = new class204();
            var3.field2590 = var3;
            var3.field2591 = var3;
        }
    }

    @ObfuscatedName("gr.a(J)Lgn;")
    public class204 method3350(long arg0) {
        class204 var3 = this.field2570[(int) (arg0 & (long) (this.field2568 - 1))];
        for (this.field2569 = var3.field2590; this.field2569 != var3; this.field2569 = this.field2569.field2590) {
            if (this.field2569.field2589 == arg0) {
                class204 var4 = this.field2569;
                this.field2569 = this.field2569.field2590;
                return var4;
            }
        }
        this.field2569 = null;
        return null;
    }

    @ObfuscatedName("gr.w(Lgn;J)V")
    public void method3341(class204 arg0, long arg1) {
        if (arg0.field2591 != null) {
            arg0.method3427();
        }
        class204 var4 = this.field2570[(int) (arg1 & (long) (this.field2568 - 1))];
        arg0.field2591 = var4.field2591;
        arg0.field2590 = var4;
        arg0.field2591.field2590 = arg0;
        arg0.field2590.field2591 = arg0;
        arg0.field2589 = arg1;
    }

    @ObfuscatedName("gr.e()V")
    public void method3342() {
        for (int var1 = 0; var1 < this.field2568; var1++) {
            class204 var2 = this.field2570[var1];
            while (true) {
                class204 var3 = var2.field2590;
                if (var2 == var3) {
                    break;
                }
                var3.method3427();
            }
        }
        this.field2569 = null;
        this.field2571 = null;
    }

    @ObfuscatedName("gr.k()Lgn;")
    public class204 method3345() {
        this.field2572 = 0;
        return this.method3344();
    }

    @ObfuscatedName("gr.u()Lgn;")
    public class204 method3344() {
        if (this.field2572 > 0 && this.field2570[this.field2572 - 1] != this.field2571) {
            class204 var1 = this.field2571;
            this.field2571 = var1.field2590;
            return var1;
        }
        class204 var2;
        do {
            if (this.field2572 >= this.field2568) {
                return null;
            }
            var2 = this.field2570[this.field2572++].field2590;
        } while (this.field2570[this.field2572 - 1] == var2);
        this.field2571 = var2.field2590;
        return var2;
    }

    public Iterator iterator() {
        return new class209(this);
    }
}
