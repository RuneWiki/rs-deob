package deob;

import java.util.Iterator;

@ObfuscatedName("gj")
public final class class187 implements Iterable {

    @ObfuscatedName("gj.n")
    public int field2461;

    @ObfuscatedName("gj.p")
    public class193[] field2464;

    @ObfuscatedName("gj.i")
    public class193 field2463;

    @ObfuscatedName("gj.j")
    public class193 field2462;

    @ObfuscatedName("gj.f")
    public int field2465 = 0;

    public class187(int arg0) {
        this.field2461 = arg0;
        this.field2464 = new class193[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class193 var3 = this.field2464[var2] = new class193();
            var3.field2482 = var3;
            var3.field2484 = var3;
        }
    }

    @ObfuscatedName("gj.n(J)Lgr;")
    public class193 method3243(long arg0) {
        class193 var3 = this.field2464[(int) (arg0 & (long) (this.field2461 - 1))];
        for (this.field2463 = var3.field2482; this.field2463 != var3; this.field2463 = this.field2463.field2482) {
            if (this.field2463.field2483 == arg0) {
                class193 var4 = this.field2463;
                this.field2463 = this.field2463.field2482;
                return var4;
            }
        }
        this.field2463 = null;
        return null;
    }

    @ObfuscatedName("gj.p(Lgr;J)V")
    public void method3244(class193 arg0, long arg1) {
        if (arg0.field2484 != null) {
            arg0.method3347();
        }
        class193 var4 = this.field2464[(int) (arg1 & (long) (this.field2461 - 1))];
        arg0.field2484 = var4.field2484;
        arg0.field2482 = var4;
        arg0.field2484.field2482 = arg0;
        arg0.field2482.field2484 = arg0;
        arg0.field2483 = arg1;
    }

    @ObfuscatedName("gj.i()V")
    public void method3261() {
        for (int var1 = 0; var1 < this.field2461; var1++) {
            class193 var2 = this.field2464[var1];
            while (true) {
                class193 var3 = var2.field2482;
                if (var2 == var3) {
                    break;
                }
                var3.method3347();
            }
        }
        this.field2463 = null;
        this.field2462 = null;
    }

    @ObfuscatedName("gj.j()Lgr;")
    public class193 method3246() {
        this.field2465 = 0;
        return this.method3247();
    }

    @ObfuscatedName("gj.f()Lgr;")
    public class193 method3247() {
        if (this.field2465 > 0 && this.field2464[this.field2465 - 1] != this.field2462) {
            class193 var1 = this.field2462;
            this.field2462 = var1.field2482;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2465 >= this.field2461) {
                return null;
            }
            var2 = this.field2464[this.field2465++].field2482;
        } while (this.field2464[this.field2465 - 1] == var2);
        this.field2462 = var2.field2482;
        return var2;
    }

    public Iterator iterator() {
        return new class198(this);
    }
}
