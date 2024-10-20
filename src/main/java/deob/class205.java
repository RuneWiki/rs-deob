package deob;

import java.util.Iterator;

@ObfuscatedName("gq")
public final class class205 implements Iterable {

    @ObfuscatedName("gq.n")
    public int field2479;

    @ObfuscatedName("gq.h")
    public class212[] field2476;

    @ObfuscatedName("gq.l")
    public class212 field2477;

    @ObfuscatedName("gq.g")
    public class212 field2478;

    @ObfuscatedName("gq.b")
    public int field2475 = 0;

    public class205(int arg0) {
        this.field2479 = arg0;
        this.field2476 = new class212[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class212 var3 = this.field2476[var2] = new class212();
            var3.field2500 = var3;
            var3.field2501 = var3;
        }
    }

    @ObfuscatedName("gq.n(J)Lhv;")
    public class212 method3870(long arg0) {
        class212 var3 = this.field2476[(int) (arg0 & (long) (this.field2479 - 1))];
        for (this.field2477 = var3.field2500; this.field2477 != var3; this.field2477 = this.field2477.field2500) {
            if (this.field2477.field2502 == arg0) {
                class212 var4 = this.field2477;
                this.field2477 = this.field2477.field2500;
                return var4;
            }
        }
        this.field2477 = null;
        return null;
    }

    @ObfuscatedName("gq.h(Lhv;J)V")
    public void method3877(class212 arg0, long arg1) {
        if (arg0.field2501 != null) {
            arg0.method3973();
        }
        class212 var4 = this.field2476[(int) (arg1 & (long) (this.field2479 - 1))];
        arg0.field2501 = var4.field2501;
        arg0.field2500 = var4;
        arg0.field2501.field2500 = arg0;
        arg0.field2500.field2501 = arg0;
        arg0.field2502 = arg1;
    }

    @ObfuscatedName("gq.l()V")
    public void method3872() {
        for (int var1 = 0; var1 < this.field2479; var1++) {
            class212 var2 = this.field2476[var1];
            while (true) {
                class212 var3 = var2.field2500;
                if (var2 == var3) {
                    break;
                }
                var3.method3973();
            }
        }
        this.field2477 = null;
        this.field2478 = null;
    }

    @ObfuscatedName("gq.g()Lhv;")
    public class212 method3869() {
        this.field2475 = 0;
        return this.method3874();
    }

    @ObfuscatedName("gq.b()Lhv;")
    public class212 method3874() {
        if (this.field2475 > 0 && this.field2476[this.field2475 - 1] != this.field2478) {
            class212 var1 = this.field2478;
            this.field2478 = var1.field2500;
            return var1;
        }
        class212 var2;
        do {
            if (this.field2475 >= this.field2479) {
                return null;
            }
            var2 = this.field2476[this.field2475++].field2500;
        } while (this.field2476[this.field2475 - 1] == var2);
        this.field2478 = var2.field2500;
        return var2;
    }

    public Iterator iterator() {
        return new class218(this);
    }
}
