package deob;

@ObfuscatedName("hx")
public final class class210 {

    @ObfuscatedName("hx.n")
    public int field2493;

    @ObfuscatedName("hx.h")
    public class212[] field2494;

    @ObfuscatedName("hx.l")
    public class212 field2495;

    @ObfuscatedName("hx.g")
    public class212 field2496;

    @ObfuscatedName("hx.b")
    public int field2497 = 0;

    public class210(int arg0) {
        this.field2493 = arg0;
        this.field2494 = new class212[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class212 var3 = this.field2494[var2] = new class212();
            var3.field2500 = var3;
            var3.field2501 = var3;
        }
    }

    @ObfuscatedName("hx.n(J)Lhv;")
    public class212 method3934(long arg0) {
        class212 var3 = this.field2494[(int) (arg0 & (long) (this.field2493 - 1))];
        for (this.field2495 = var3.field2500; this.field2495 != var3; this.field2495 = this.field2495.field2500) {
            if (this.field2495.field2502 == arg0) {
                class212 var4 = this.field2495;
                this.field2495 = this.field2495.field2500;
                return var4;
            }
        }
        this.field2495 = null;
        return null;
    }

    @ObfuscatedName("hx.h(Lhv;J)V")
    public void method3935(class212 arg0, long arg1) {
        if (arg0.field2501 != null) {
            arg0.method3973();
        }
        class212 var4 = this.field2494[(int) (arg1 & (long) (this.field2493 - 1))];
        arg0.field2501 = var4.field2501;
        arg0.field2500 = var4;
        arg0.field2501.field2500 = arg0;
        arg0.field2500.field2501 = arg0;
        arg0.field2502 = arg1;
    }

    @ObfuscatedName("hx.l()V")
    public void method3936() {
        for (int var1 = 0; var1 < this.field2493; var1++) {
            class212 var2 = this.field2494[var1];
            while (true) {
                class212 var3 = var2.field2500;
                if (var2 == var3) {
                    break;
                }
                var3.method3973();
            }
        }
        this.field2495 = null;
        this.field2496 = null;
    }

    @ObfuscatedName("hx.g()Lhv;")
    public class212 method3937() {
        this.field2497 = 0;
        return this.method3941();
    }

    @ObfuscatedName("hx.b()Lhv;")
    public class212 method3941() {
        if (this.field2497 > 0 && this.field2494[this.field2497 - 1] != this.field2496) {
            class212 var1 = this.field2496;
            this.field2496 = var1.field2500;
            return var1;
        }
        class212 var2;
        do {
            if (this.field2497 >= this.field2493) {
                return null;
            }
            var2 = this.field2494[this.field2497++].field2500;
        } while (this.field2494[this.field2497 - 1] == var2);
        this.field2496 = var2.field2500;
        return var2;
    }
}
