package deob;

import java.util.Iterator;

@ObfuscatedName("mr")
public final class class361 implements Iterable {

    @ObfuscatedName("mr.v")
    public int field4070;

    @ObfuscatedName("mr.n")
    public class352[] field4069;

    @ObfuscatedName("mr.f")
    public class352 field4068;

    @ObfuscatedName("mr.y")
    public class352 field4071;

    @ObfuscatedName("mr.p")
    public int field4072 = 0;

    public class361(int arg0) {
        this.field4070 = arg0;
        this.field4069 = new class352[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class352 var3 = this.field4069[var2] = new class352();
            var3.field3939 = var3;
            var3.field3940 = var3;
        }
    }

    @ObfuscatedName("mr.v(J)Lmw;")
    public class352 method5752(long arg0) {
        class352 var3 = this.field4069[(int) (arg0 & (long) (this.field4070 - 1))];
        for (this.field4068 = var3.field3939; this.field4068 != var3; this.field4068 = this.field4068.field3939) {
            if (this.field4068.field3938 == arg0) {
                class352 var4 = this.field4068;
                this.field4068 = this.field4068.field3939;
                return var4;
            }
        }
        this.field4068 = null;
        return null;
    }

    @ObfuscatedName("mr.n(Lmw;J)V")
    public void method5754(class352 arg0, long arg1) {
        if (arg0.field3940 != null) {
            arg0.method5496();
        }
        class352 var4 = this.field4069[(int) (arg1 & (long) (this.field4070 - 1))];
        arg0.field3940 = var4.field3940;
        arg0.field3939 = var4;
        arg0.field3940.field3939 = arg0;
        arg0.field3939.field3940 = arg0;
        arg0.field3938 = arg1;
    }

    @ObfuscatedName("mr.f()V")
    public void method5761() {
        for (int var1 = 0; var1 < this.field4070; var1++) {
            class352 var2 = this.field4069[var1];
            while (true) {
                class352 var3 = var2.field3939;
                if (var2 == var3) {
                    break;
                }
                var3.method5496();
            }
        }
        this.field4068 = null;
        this.field4071 = null;
    }

    @ObfuscatedName("mr.y()Lmw;")
    public class352 method5750() {
        this.field4072 = 0;
        return this.method5751();
    }

    @ObfuscatedName("mr.p()Lmw;")
    public class352 method5751() {
        if (this.field4072 > 0 && this.field4069[this.field4072 - 1] != this.field4071) {
            class352 var1 = this.field4071;
            this.field4071 = var1.field3939;
            return var1;
        }
        class352 var2;
        do {
            if (this.field4072 >= this.field4070) {
                return null;
            }
            var2 = this.field4069[this.field4072++].field3939;
        } while (this.field4069[this.field4072 - 1] == var2);
        this.field4071 = var2.field3939;
        return var2;
    }

    public Iterator iterator() {
        return new class360(this);
    }
}
