package deob;

import java.util.Iterator;

@ObfuscatedName("gd")
public final class class194 implements Iterable {

    @ObfuscatedName("gd.m")
    public int field2541;

    @ObfuscatedName("gd.p")
    public class200[] field2545;

    @ObfuscatedName("gd.i")
    public class200 field2543;

    @ObfuscatedName("gd.j")
    public class200 field2544;

    @ObfuscatedName("gd.v")
    public int field2542 = 0;

    public class194(int arg0) {
        this.field2541 = arg0;
        this.field2545 = new class200[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class200 var3 = this.field2545[var2] = new class200();
            var3.field2562 = var3;
            var3.field2564 = var3;
        }
    }

    @ObfuscatedName("gd.m(J)Lgh;")
    public class200 method3389(long arg0) {
        class200 var3 = this.field2545[(int) (arg0 & (long) (this.field2541 - 1))];
        for (this.field2543 = var3.field2562; this.field2543 != var3; this.field2543 = this.field2543.field2562) {
            if (this.field2543.field2563 == arg0) {
                class200 var4 = this.field2543;
                this.field2543 = this.field2543.field2562;
                return var4;
            }
        }
        this.field2543 = null;
        return null;
    }

    @ObfuscatedName("gd.p(Lgh;J)V")
    public void method3396(class200 arg0, long arg1) {
        if (arg0.field2564 != null) {
            arg0.method3476();
        }
        class200 var4 = this.field2545[(int) (arg1 & (long) (this.field2541 - 1))];
        arg0.field2564 = var4.field2564;
        arg0.field2562 = var4;
        arg0.field2564.field2562 = arg0;
        arg0.field2562.field2564 = arg0;
        arg0.field2563 = arg1;
    }

    @ObfuscatedName("gd.i()V")
    public void method3390() {
        for (int var1 = 0; var1 < this.field2541; var1++) {
            class200 var2 = this.field2545[var1];
            while (true) {
                class200 var3 = var2.field2562;
                if (var2 == var3) {
                    break;
                }
                var3.method3476();
            }
        }
        this.field2543 = null;
        this.field2544 = null;
    }

    @ObfuscatedName("gd.j()Lgh;")
    public class200 method3391() {
        this.field2542 = 0;
        return this.method3392();
    }

    @ObfuscatedName("gd.v()Lgh;")
    public class200 method3392() {
        if (this.field2542 > 0 && this.field2545[this.field2542 - 1] != this.field2544) {
            class200 var1 = this.field2544;
            this.field2544 = var1.field2562;
            return var1;
        }
        class200 var2;
        do {
            if (this.field2542 >= this.field2541) {
                return null;
            }
            var2 = this.field2545[this.field2542++].field2562;
        } while (this.field2545[this.field2542 - 1] == var2);
        this.field2544 = var2.field2562;
        return var2;
    }

    public Iterator iterator() {
        return new class205(this);
    }
}
