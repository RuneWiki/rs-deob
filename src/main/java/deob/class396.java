package deob;

import java.util.Iterator;

@ObfuscatedName("oz")
public final class class396 implements Iterable {

    @ObfuscatedName("oz.c")
    public int field4388;

    @ObfuscatedName("oz.b")
    public class387[] field4385;

    @ObfuscatedName("oz.p")
    public class387 field4386;

    @ObfuscatedName("oz.m")
    public class387 field4387;

    @ObfuscatedName("oz.t")
    public int field4384 = 0;

    public class396(int arg0) {
        this.field4388 = arg0;
        this.field4385 = new class387[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class387 var3 = this.field4385[var2] = new class387();
            var3.field4258 = var3;
            var3.field4259 = var3;
        }
    }

    @ObfuscatedName("oz.c(J)Lnw;")
    public class387 method6429(long arg0) {
        class387 var3 = this.field4385[(int) (arg0 & (long) (this.field4388 - 1))];
        for (this.field4386 = var3.field4258; this.field4386 != var3; this.field4386 = this.field4386.field4258) {
            if (this.field4386.field4257 == arg0) {
                class387 var4 = this.field4386;
                this.field4386 = this.field4386.field4258;
                return var4;
            }
        }
        this.field4386 = null;
        return null;
    }

    @ObfuscatedName("oz.b(Lnw;J)V")
    public void method6431(class387 arg0, long arg1) {
        if (arg0.field4259 != null) {
            arg0.method6163();
        }
        class387 var4 = this.field4385[(int) (arg1 & (long) (this.field4388 - 1))];
        arg0.field4259 = var4.field4259;
        arg0.field4258 = var4;
        arg0.field4259.field4258 = arg0;
        arg0.field4258.field4259 = arg0;
        arg0.field4257 = arg1;
    }

    @ObfuscatedName("oz.p()V")
    public void method6432() {
        for (int var1 = 0; var1 < this.field4388; var1++) {
            class387 var2 = this.field4385[var1];
            while (true) {
                class387 var3 = var2.field4258;
                if (var2 == var3) {
                    break;
                }
                var3.method6163();
            }
        }
        this.field4386 = null;
        this.field4387 = null;
    }

    @ObfuscatedName("oz.m()Lnw;")
    public class387 method6437() {
        this.field4384 = 0;
        return this.method6434();
    }

    @ObfuscatedName("oz.t()Lnw;")
    public class387 method6434() {
        if (this.field4384 > 0 && this.field4385[this.field4384 - 1] != this.field4387) {
            class387 var1 = this.field4387;
            this.field4387 = var1.field4258;
            return var1;
        }
        class387 var2;
        do {
            if (this.field4384 >= this.field4388) {
                return null;
            }
            var2 = this.field4385[this.field4384++].field4258;
        } while (this.field4385[this.field4384 - 1] == var2);
        this.field4387 = var2.field4258;
        return var2;
    }

    public Iterator iterator() {
        return new class395(this);
    }
}
