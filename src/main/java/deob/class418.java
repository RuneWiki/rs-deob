package deob;

import java.util.Iterator;

@ObfuscatedName("pt")
public final class class418 implements Iterable {

    @ObfuscatedName("pt.v")
    public int field4538;

    @ObfuscatedName("pt.c")
    public class409[] field4539;

    @ObfuscatedName("pt.i")
    public class409 field4537;

    @ObfuscatedName("pt.f")
    public class409 field4536;

    @ObfuscatedName("pt.b")
    public int field4540 = 0;

    public class418(int arg0) {
        this.field4538 = arg0;
        this.field4539 = new class409[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class409 var3 = this.field4539[var2] = new class409();
            var3.field4411 = var3;
            var3.field4412 = var3;
        }
    }

    @ObfuscatedName("pt.v(J)Loq;")
    public class409 method6760(long arg0) {
        class409 var3 = this.field4539[(int) (arg0 & (long) (this.field4538 - 1))];
        for (this.field4537 = var3.field4411; this.field4537 != var3; this.field4537 = this.field4537.field4411) {
            if (this.field4537.field4410 == arg0) {
                class409 var4 = this.field4537;
                this.field4537 = this.field4537.field4411;
                return var4;
            }
        }
        this.field4537 = null;
        return null;
    }

    @ObfuscatedName("pt.c(Loq;J)V")
    public void method6757(class409 arg0, long arg1) {
        if (arg0.field4412 != null) {
            arg0.method6503();
        }
        class409 var4 = this.field4539[(int) (arg1 & (long) (this.field4538 - 1))];
        arg0.field4412 = var4.field4412;
        arg0.field4411 = var4;
        arg0.field4412.field4411 = arg0;
        arg0.field4411.field4412 = arg0;
        arg0.field4410 = arg1;
    }

    @ObfuscatedName("pt.i()V")
    public void method6767() {
        for (int var1 = 0; var1 < this.field4538; var1++) {
            class409 var2 = this.field4539[var1];
            while (true) {
                class409 var3 = var2.field4411;
                if (var2 == var3) {
                    break;
                }
                var3.method6503();
            }
        }
        this.field4537 = null;
        this.field4536 = null;
    }

    @ObfuscatedName("pt.f()Loq;")
    public class409 method6759() {
        this.field4540 = 0;
        return this.method6755();
    }

    @ObfuscatedName("pt.b()Loq;")
    public class409 method6755() {
        if (this.field4540 > 0 && this.field4539[this.field4540 - 1] != this.field4536) {
            class409 var1 = this.field4536;
            this.field4536 = var1.field4411;
            return var1;
        }
        class409 var2;
        do {
            if (this.field4540 >= this.field4538) {
                return null;
            }
            var2 = this.field4539[this.field4540++].field4411;
        } while (this.field4539[this.field4540 - 1] == var2);
        this.field4536 = var2.field4411;
        return var2;
    }

    public Iterator iterator() {
        return new class417(this);
    }
}
