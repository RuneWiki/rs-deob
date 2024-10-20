package deob;

import java.util.Iterator;

@ObfuscatedName("li")
public class class331 implements Iterable {

    @ObfuscatedName("li.c")
    public class387 field4022 = new class387();

    @ObfuscatedName("li.l")
    public class387 field4023;

    public class331() {
        this.field4022.field4294 = this.field4022;
        this.field4022.field4293 = this.field4022;
    }

    @ObfuscatedName("li.c()V")
    public void method5404() {
        while (this.field4022.field4294 != this.field4022) {
            this.field4022.field4294.method6163();
        }
    }

    @ObfuscatedName("li.l(Lnd;)V")
    public void method5428(class387 arg0) {
        if (arg0.field4293 != null) {
            arg0.method6163();
        }
        arg0.field4293 = this.field4022.field4293;
        arg0.field4294 = this.field4022;
        arg0.field4293.field4294 = arg0;
        arg0.field4294.field4293 = arg0;
    }

    @ObfuscatedName("li.s(Lnd;Lnd;)V")
    public static void method5406(class387 arg0, class387 arg1) {
        if (arg0.field4293 != null) {
            arg0.method6163();
        }
        arg0.field4293 = arg1;
        arg0.field4294 = arg1.field4294;
        arg0.field4293.field4294 = arg0;
        arg0.field4294.field4293 = arg0;
    }

    @ObfuscatedName("li.e()Lnd;")
    public class387 method5407() {
        class387 var1 = this.field4022.field4294;
        if (this.field4022 == var1) {
            return null;
        } else {
            var1.method6163();
            return var1;
        }
    }

    @ObfuscatedName("li.r()Lnd;")
    public class387 method5408() {
        return this.method5427((class387) null);
    }

    @ObfuscatedName("li.o(Lnd;)Lnd;")
    public class387 method5427(class387 arg0) {
        class387 var2;
        if (arg0 == null) {
            var2 = this.field4022.field4294;
        } else {
            var2 = arg0;
        }
        if (this.field4022 == var2) {
            this.field4023 = null;
            return null;
        } else {
            this.field4023 = var2.field4294;
            return var2;
        }
    }

    @ObfuscatedName("li.i()Lnd;")
    public class387 method5426() {
        class387 var1 = this.field4023;
        if (this.field4022 == var1) {
            this.field4023 = null;
            return null;
        } else {
            this.field4023 = var1.field4294;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class330(this);
    }
}
