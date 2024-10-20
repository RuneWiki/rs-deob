package deob;

import java.util.Iterator;

@ObfuscatedName("gz")
public final class class198 implements Iterable {

    @ObfuscatedName("gz.s")
    public int field2566;

    @ObfuscatedName("gz.g")
    public class204[] field2564;

    @ObfuscatedName("gz.m")
    public class204 field2563;

    @ObfuscatedName("gz.h")
    public class204 field2565;

    @ObfuscatedName("gz.i")
    public int field2567 = 0;

    public class198(int arg0) {
        this.field2566 = arg0;
        this.field2564 = new class204[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class204 var3 = this.field2564[var2] = new class204();
            var3.field2584 = var3;
            var3.field2586 = var3;
        }
    }

    @ObfuscatedName("gz.s(J)Lgf;")
    public class204 method3641(long arg0) {
        class204 var3 = this.field2564[(int) (arg0 & (long) (this.field2566 - 1))];
        for (this.field2563 = var3.field2584; this.field2563 != var3; this.field2563 = this.field2563.field2584) {
            if (this.field2563.field2585 == arg0) {
                class204 var4 = this.field2563;
                this.field2563 = this.field2563.field2584;
                return var4;
            }
        }
        this.field2563 = null;
        return null;
    }

    @ObfuscatedName("gz.g(Lgf;J)V")
    public void method3642(class204 arg0, long arg1) {
        if (arg0.field2586 != null) {
            arg0.method3740();
        }
        class204 var4 = this.field2564[(int) (arg1 & (long) (this.field2566 - 1))];
        arg0.field2586 = var4.field2586;
        arg0.field2584 = var4;
        arg0.field2586.field2584 = arg0;
        arg0.field2584.field2586 = arg0;
        arg0.field2585 = arg1;
    }

    @ObfuscatedName("gz.m()V")
    public void method3643() {
        for (int var1 = 0; var1 < this.field2566; var1++) {
            class204 var2 = this.field2564[var1];
            while (true) {
                class204 var3 = var2.field2584;
                if (var2 == var3) {
                    break;
                }
                var3.method3740();
            }
        }
        this.field2563 = null;
        this.field2565 = null;
    }

    @ObfuscatedName("gz.h()Lgf;")
    public class204 method3640() {
        this.field2567 = 0;
        return this.method3645();
    }

    @ObfuscatedName("gz.i()Lgf;")
    public class204 method3645() {
        if (this.field2567 > 0 && this.field2564[this.field2567 - 1] != this.field2565) {
            class204 var1 = this.field2565;
            this.field2565 = var1.field2584;
            return var1;
        }
        class204 var2;
        do {
            if (this.field2567 >= this.field2566) {
                return null;
            }
            var2 = this.field2564[this.field2567++].field2584;
        } while (this.field2564[this.field2567 - 1] == var2);
        this.field2565 = var2.field2584;
        return var2;
    }

    public Iterator iterator() {
        return new class209(this);
    }
}
