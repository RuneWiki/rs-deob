package deob;

import java.util.Iterator;

@ObfuscatedName("on")
public final class class401 implements Iterable {

    @ObfuscatedName("on.c")
    public int field4436;

    @ObfuscatedName("on.l")
    public class392[] field4435;

    @ObfuscatedName("on.s")
    public class392 field4434;

    @ObfuscatedName("on.e")
    public class392 field4437;

    @ObfuscatedName("on.r")
    public int field4438 = 0;

    public class401(int arg0) {
        this.field4436 = arg0;
        this.field4435 = new class392[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class392 var3 = this.field4435[var2] = new class392();
            var3.field4300 = var3;
            var3.field4302 = var3;
        }
    }

    @ObfuscatedName("on.c(J)Loe;")
    public class392 method6448(long arg0) {
        class392 var3 = this.field4435[(int) (arg0 & (long) (this.field4436 - 1))];
        for (this.field4434 = var3.field4300; this.field4434 != var3; this.field4434 = this.field4434.field4300) {
            if (this.field4434.field4301 == arg0) {
                class392 var4 = this.field4434;
                this.field4434 = this.field4434.field4300;
                return var4;
            }
        }
        this.field4434 = null;
        return null;
    }

    @ObfuscatedName("on.l(Loe;J)V")
    public void method6432(class392 arg0, long arg1) {
        if (arg0.field4302 != null) {
            arg0.method6167();
        }
        class392 var4 = this.field4435[(int) (arg1 & (long) (this.field4436 - 1))];
        arg0.field4302 = var4.field4302;
        arg0.field4300 = var4;
        arg0.field4302.field4300 = arg0;
        arg0.field4300.field4302 = arg0;
        arg0.field4301 = arg1;
    }

    @ObfuscatedName("on.s()V")
    public void method6433() {
        for (int var1 = 0; var1 < this.field4436; var1++) {
            class392 var2 = this.field4435[var1];
            while (true) {
                class392 var3 = var2.field4300;
                if (var2 == var3) {
                    break;
                }
                var3.method6167();
            }
        }
        this.field4434 = null;
        this.field4437 = null;
    }

    @ObfuscatedName("on.e()Loe;")
    public class392 method6434() {
        this.field4438 = 0;
        return this.method6431();
    }

    @ObfuscatedName("on.r()Loe;")
    public class392 method6431() {
        if (this.field4438 > 0 && this.field4435[this.field4438 - 1] != this.field4437) {
            class392 var1 = this.field4437;
            this.field4437 = var1.field4300;
            return var1;
        }
        class392 var2;
        do {
            if (this.field4438 >= this.field4436) {
                return null;
            }
            var2 = this.field4435[this.field4438++].field4300;
        } while (this.field4435[this.field4438 - 1] == var2);
        this.field4437 = var2.field4300;
        return var2;
    }

    public Iterator iterator() {
        return new class400(this);
    }
}
