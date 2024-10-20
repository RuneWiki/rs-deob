package deob;

import java.util.Iterator;

@ObfuscatedName("eb")
public final class class143 implements Iterable {

    @ObfuscatedName("eb.d")
    public int field2011;

    @ObfuscatedName("eb.c")
    public class149[] field2012;

    @ObfuscatedName("eb.n")
    public class149 field2013;

    @ObfuscatedName("eb.q")
    public class149 field2014;

    @ObfuscatedName("eb.t")
    public int field2015 = 0;

    public class143(int arg0) {
        this.field2011 = arg0;
        this.field2012 = new class149[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class149 var3 = this.field2012[var2] = new class149();
            var3.field2032 = var3;
            var3.field2033 = var3;
        }
    }

    @ObfuscatedName("eb.d(J)Lew;")
    public class149 method2566(long arg0) {
        class149 var3 = this.field2012[(int) (arg0 & (long) (this.field2011 - 1))];
        for (this.field2013 = var3.field2032; this.field2013 != var3; this.field2013 = this.field2013.field2032) {
            if (this.field2013.field2034 == arg0) {
                class149 var4 = this.field2013;
                this.field2013 = this.field2013.field2032;
                return var4;
            }
        }
        this.field2013 = null;
        return null;
    }

    @ObfuscatedName("eb.c(Lew;J)V")
    public void method2567(class149 arg0, long arg1) {
        if (arg0.field2033 != null) {
            arg0.method2652();
        }
        class149 var4 = this.field2012[(int) (arg1 & (long) (this.field2011 - 1))];
        arg0.field2033 = var4.field2033;
        arg0.field2032 = var4;
        arg0.field2033.field2032 = arg0;
        arg0.field2032.field2033 = arg0;
        arg0.field2034 = arg1;
    }

    @ObfuscatedName("eb.n()V")
    public void method2584() {
        for (int var1 = 0; var1 < this.field2011; var1++) {
            class149 var2 = this.field2012[var1];
            while (true) {
                class149 var3 = var2.field2032;
                if (var2 == var3) {
                    break;
                }
                var3.method2652();
            }
        }
        this.field2013 = null;
        this.field2014 = null;
    }

    @ObfuscatedName("eb.q()Lew;")
    public class149 method2568() {
        this.field2015 = 0;
        return this.method2570();
    }

    @ObfuscatedName("eb.t()Lew;")
    public class149 method2570() {
        if (this.field2015 > 0 && this.field2012[this.field2015 - 1] != this.field2014) {
            class149 var1 = this.field2014;
            this.field2014 = var1.field2032;
            return var1;
        }
        class149 var2;
        do {
            if (this.field2015 >= this.field2011) {
                return null;
            }
            var2 = this.field2012[this.field2015++].field2032;
        } while (this.field2012[this.field2015 - 1] == var2);
        this.field2014 = var2.field2032;
        return var2;
    }

    public Iterator iterator() {
        return new class154(this);
    }
}
