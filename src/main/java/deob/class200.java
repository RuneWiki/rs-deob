package deob;

import java.util.Iterator;

@ObfuscatedName("go")
public final class class200 implements Iterable {

    @ObfuscatedName("go.y")
    public int field2445;

    @ObfuscatedName("go.c")
    public class207[] field2446;

    @ObfuscatedName("go.n")
    public class207 field2447;

    @ObfuscatedName("go.u")
    public class207 field2448;

    @ObfuscatedName("go.i")
    public int field2449 = 0;

    public class200(int arg0) {
        this.field2445 = arg0;
        this.field2446 = new class207[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class207 var3 = this.field2446[var2] = new class207();
            var3.field2471 = var3;
            var3.field2472 = var3;
        }
    }

    @ObfuscatedName("go.y(J)Lgp;")
    public class207 method3667(long arg0) {
        class207 var3 = this.field2446[(int) (arg0 & (long) (this.field2445 - 1))];
        for (this.field2447 = var3.field2471; this.field2447 != var3; this.field2447 = this.field2447.field2471) {
            if (this.field2447.field2470 == arg0) {
                class207 var4 = this.field2447;
                this.field2447 = this.field2447.field2471;
                return var4;
            }
        }
        this.field2447 = null;
        return null;
    }

    @ObfuscatedName("go.c(Lgp;J)V")
    public void method3651(class207 arg0, long arg1) {
        if (arg0.field2472 != null) {
            arg0.method3766();
        }
        class207 var4 = this.field2446[(int) (arg1 & (long) (this.field2445 - 1))];
        arg0.field2472 = var4.field2472;
        arg0.field2471 = var4;
        arg0.field2472.field2471 = arg0;
        arg0.field2471.field2472 = arg0;
        arg0.field2470 = arg1;
    }

    @ObfuscatedName("go.n()V")
    public void method3652() {
        for (int var1 = 0; var1 < this.field2445; var1++) {
            class207 var2 = this.field2446[var1];
            while (true) {
                class207 var3 = var2.field2471;
                if (var2 == var3) {
                    break;
                }
                var3.method3766();
            }
        }
        this.field2447 = null;
        this.field2448 = null;
    }

    @ObfuscatedName("go.u()Lgp;")
    public class207 method3653() {
        this.field2449 = 0;
        return this.method3654();
    }

    @ObfuscatedName("go.i()Lgp;")
    public class207 method3654() {
        if (this.field2449 > 0 && this.field2446[this.field2449 - 1] != this.field2448) {
            class207 var1 = this.field2448;
            this.field2448 = var1.field2471;
            return var1;
        }
        class207 var2;
        do {
            if (this.field2449 >= this.field2445) {
                return null;
            }
            var2 = this.field2446[this.field2449++].field2471;
        } while (this.field2446[this.field2449 - 1] == var2);
        this.field2448 = var2.field2471;
        return var2;
    }

    public Iterator iterator() {
        return new class213(this);
    }
}
