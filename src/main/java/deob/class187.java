package deob;

import java.util.Iterator;

@ObfuscatedName("gk")
public final class class187 implements Iterable {

    @ObfuscatedName("gk.c")
    public int field2420;

    @ObfuscatedName("gk.o")
    public class193[] field2417;

    @ObfuscatedName("gk.i")
    public class193 field2418;

    @ObfuscatedName("gk.u")
    public class193 field2419;

    @ObfuscatedName("gk.g")
    public int field2416 = 0;

    public class187(int arg0) {
        this.field2420 = arg0;
        this.field2417 = new class193[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class193 var3 = this.field2417[var2] = new class193();
            var3.field2438 = var3;
            var3.field2439 = var3;
        }
    }

    @ObfuscatedName("gk.c(J)Lgh;")
    public class193 method3188(long arg0) {
        class193 var3 = this.field2417[(int) (arg0 & (long) (this.field2420 - 1))];
        for (this.field2418 = var3.field2438; this.field2418 != var3; this.field2418 = this.field2418.field2438) {
            if (this.field2418.field2437 == arg0) {
                class193 var4 = this.field2418;
                this.field2418 = this.field2418.field2438;
                return var4;
            }
        }
        this.field2418 = null;
        return null;
    }

    @ObfuscatedName("gk.o(Lgh;J)V")
    public void method3189(class193 arg0, long arg1) {
        if (arg0.field2439 != null) {
            arg0.method3287();
        }
        class193 var4 = this.field2417[(int) (arg1 & (long) (this.field2420 - 1))];
        arg0.field2439 = var4.field2439;
        arg0.field2438 = var4;
        arg0.field2439.field2438 = arg0;
        arg0.field2438.field2439 = arg0;
        arg0.field2437 = arg1;
    }

    @ObfuscatedName("gk.i()V")
    public void method3204() {
        for (int var1 = 0; var1 < this.field2420; var1++) {
            class193 var2 = this.field2417[var1];
            while (true) {
                class193 var3 = var2.field2438;
                if (var2 == var3) {
                    break;
                }
                var3.method3287();
            }
        }
        this.field2418 = null;
        this.field2419 = null;
    }

    @ObfuscatedName("gk.u()Lgh;")
    public class193 method3205() {
        this.field2416 = 0;
        return this.method3191();
    }

    @ObfuscatedName("gk.g()Lgh;")
    public class193 method3191() {
        if (this.field2416 > 0 && this.field2417[this.field2416 - 1] != this.field2419) {
            class193 var1 = this.field2419;
            this.field2419 = var1.field2438;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2416 >= this.field2420) {
                return null;
            }
            var2 = this.field2417[this.field2416++].field2438;
        } while (this.field2417[this.field2416 - 1] == var2);
        this.field2419 = var2.field2438;
        return var2;
    }

    public Iterator iterator() {
        return new class198(this);
    }
}
