package deob;

import java.util.Iterator;

@ObfuscatedName("ga")
public final class class200 implements Iterable {

    @ObfuscatedName("ga.v")
    public int field2441;

    @ObfuscatedName("ga.s")
    public class207[] field2439;

    @ObfuscatedName("ga.o")
    public class207 field2440;

    @ObfuscatedName("ga.k")
    public class207 field2438;

    @ObfuscatedName("ga.u")
    public int field2442 = 0;

    public class200(int arg0) {
        this.field2441 = arg0;
        this.field2439 = new class207[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class207 var3 = this.field2439[var2] = new class207();
            var3.field2463 = var3;
            var3.field2465 = var3;
        }
    }

    @ObfuscatedName("ga.v(J)Lgl;")
    public class207 method3659(long arg0) {
        class207 var3 = this.field2439[(int) (arg0 & (long) (this.field2441 - 1))];
        for (this.field2440 = var3.field2463; this.field2440 != var3; this.field2440 = this.field2440.field2463) {
            if (this.field2440.field2464 == arg0) {
                class207 var4 = this.field2440;
                this.field2440 = this.field2440.field2463;
                return var4;
            }
        }
        this.field2440 = null;
        return null;
    }

    @ObfuscatedName("ga.s(Lgl;J)V")
    public void method3660(class207 arg0, long arg1) {
        if (arg0.field2465 != null) {
            arg0.method3787();
        }
        class207 var4 = this.field2439[(int) (arg1 & (long) (this.field2441 - 1))];
        arg0.field2465 = var4.field2465;
        arg0.field2463 = var4;
        arg0.field2465.field2463 = arg0;
        arg0.field2463.field2465 = arg0;
        arg0.field2464 = arg1;
    }

    @ObfuscatedName("ga.o()V")
    public void method3661() {
        for (int var1 = 0; var1 < this.field2441; var1++) {
            class207 var2 = this.field2439[var1];
            while (true) {
                class207 var3 = var2.field2463;
                if (var2 == var3) {
                    break;
                }
                var3.method3787();
            }
        }
        this.field2440 = null;
        this.field2438 = null;
    }

    @ObfuscatedName("ga.k()Lgl;")
    public class207 method3662() {
        this.field2442 = 0;
        return this.method3658();
    }

    @ObfuscatedName("ga.u()Lgl;")
    public class207 method3658() {
        if (this.field2442 > 0 && this.field2439[this.field2442 - 1] != this.field2438) {
            class207 var1 = this.field2438;
            this.field2438 = var1.field2463;
            return var1;
        }
        class207 var2;
        do {
            if (this.field2442 >= this.field2441) {
                return null;
            }
            var2 = this.field2439[this.field2442++].field2463;
        } while (this.field2439[this.field2442 - 1] == var2);
        this.field2438 = var2.field2463;
        return var2;
    }

    public Iterator iterator() {
        return new class213(this);
    }
}
