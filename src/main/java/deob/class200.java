package deob;

import java.util.Iterator;

@ObfuscatedName("gr")
public final class class200 implements Iterable {

    @ObfuscatedName("gr.g")
    public int field2471;

    @ObfuscatedName("gr.r")
    public class207[] field2473;

    @ObfuscatedName("gr.e")
    public class207 field2472;

    @ObfuscatedName("gr.q")
    public class207 field2474;

    @ObfuscatedName("gr.c")
    public int field2475 = 0;

    public class200(int arg0) {
        this.field2471 = arg0;
        this.field2473 = new class207[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class207 var3 = this.field2473[var2] = new class207();
            var3.field2496 = var3;
            var3.field2498 = var3;
        }
    }

    @ObfuscatedName("gr.g(J)Lgy;")
    public class207 method3866(long arg0) {
        class207 var3 = this.field2473[(int) (arg0 & (long) (this.field2471 - 1))];
        for (this.field2472 = var3.field2496; this.field2472 != var3; this.field2472 = this.field2472.field2496) {
            if (this.field2472.field2497 == arg0) {
                class207 var4 = this.field2472;
                this.field2472 = this.field2472.field2496;
                return var4;
            }
        }
        this.field2472 = null;
        return null;
    }

    @ObfuscatedName("gr.r(Lgy;J)V")
    public void method3851(class207 arg0, long arg1) {
        if (arg0.field2498 != null) {
            arg0.method3952();
        }
        class207 var4 = this.field2473[(int) (arg1 & (long) (this.field2471 - 1))];
        arg0.field2498 = var4.field2498;
        arg0.field2496 = var4;
        arg0.field2498.field2496 = arg0;
        arg0.field2496.field2498 = arg0;
        arg0.field2497 = arg1;
    }

    @ObfuscatedName("gr.e()V")
    public void method3859() {
        for (int var1 = 0; var1 < this.field2471; var1++) {
            class207 var2 = this.field2473[var1];
            while (true) {
                class207 var3 = var2.field2496;
                if (var2 == var3) {
                    break;
                }
                var3.method3952();
            }
        }
        this.field2472 = null;
        this.field2474 = null;
    }

    @ObfuscatedName("gr.q()Lgy;")
    public class207 method3853() {
        this.field2475 = 0;
        return this.method3854();
    }

    @ObfuscatedName("gr.c()Lgy;")
    public class207 method3854() {
        if (this.field2475 > 0 && this.field2473[this.field2475 - 1] != this.field2474) {
            class207 var1 = this.field2474;
            this.field2474 = var1.field2496;
            return var1;
        }
        class207 var2;
        do {
            if (this.field2475 >= this.field2471) {
                return null;
            }
            var2 = this.field2473[this.field2475++].field2496;
        } while (this.field2473[this.field2475 - 1] == var2);
        this.field2474 = var2.field2496;
        return var2;
    }

    public Iterator iterator() {
        return new class213(this);
    }
}
