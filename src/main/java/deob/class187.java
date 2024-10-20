package deob;

import java.util.Iterator;

@ObfuscatedName("gc")
public final class class187 implements Iterable {

    @ObfuscatedName("gc.d")
    public int field2464;

    @ObfuscatedName("gc.k")
    public class193[] field2465;

    @ObfuscatedName("gc.e")
    public class193 field2466;

    @ObfuscatedName("gc.p")
    public class193 field2467;

    @ObfuscatedName("gc.q")
    public int field2468 = 0;

    public class187(int arg0) {
        this.field2464 = arg0;
        this.field2465 = new class193[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class193 var3 = this.field2465[var2] = new class193();
            var3.field2485 = var3;
            var3.field2487 = var3;
        }
    }

    @ObfuscatedName("gc.d(J)Lgs;")
    public class193 method3313(long arg0) {
        class193 var3 = this.field2465[(int) (arg0 & (long) (this.field2464 - 1))];
        for (this.field2466 = var3.field2485; this.field2466 != var3; this.field2466 = this.field2466.field2485) {
            if (this.field2466.field2486 == arg0) {
                class193 var4 = this.field2466;
                this.field2466 = this.field2466.field2485;
                return var4;
            }
        }
        this.field2466 = null;
        return null;
    }

    @ObfuscatedName("gc.k(Lgs;J)V")
    public void method3314(class193 arg0, long arg1) {
        if (arg0.field2487 != null) {
            arg0.method3407();
        }
        class193 var4 = this.field2465[(int) (arg1 & (long) (this.field2464 - 1))];
        arg0.field2487 = var4.field2487;
        arg0.field2485 = var4;
        arg0.field2487.field2485 = arg0;
        arg0.field2485.field2487 = arg0;
        arg0.field2486 = arg1;
    }

    @ObfuscatedName("gc.e()V")
    public void method3315() {
        for (int var1 = 0; var1 < this.field2464; var1++) {
            class193 var2 = this.field2465[var1];
            while (true) {
                class193 var3 = var2.field2485;
                if (var2 == var3) {
                    break;
                }
                var3.method3407();
            }
        }
        this.field2466 = null;
        this.field2467 = null;
    }

    @ObfuscatedName("gc.p()Lgs;")
    public class193 method3316() {
        this.field2468 = 0;
        return this.method3317();
    }

    @ObfuscatedName("gc.q()Lgs;")
    public class193 method3317() {
        if (this.field2468 > 0 && this.field2465[this.field2468 - 1] != this.field2467) {
            class193 var1 = this.field2467;
            this.field2467 = var1.field2485;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2468 >= this.field2464) {
                return null;
            }
            var2 = this.field2465[this.field2468++].field2485;
        } while (this.field2465[this.field2468 - 1] == var2);
        this.field2467 = var2.field2485;
        return var2;
    }

    public Iterator iterator() {
        return new class198(this);
    }
}
