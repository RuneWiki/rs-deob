package deob;

import java.util.Iterator;

@ObfuscatedName("mh")
public class class339 implements Iterable {

    @ObfuscatedName("mh.c")
    public class405 field4136 = new class405();

    @ObfuscatedName("mh.v")
    public class405 field4135;

    public class339() {
        this.field4136.field4456 = this.field4136;
        this.field4136.field4457 = this.field4136;
    }

    @ObfuscatedName("mh.c()V")
    public void method5661() {
        while (this.field4136.field4456 != this.field4136) {
            this.field4136.field4456.method6493();
        }
    }

    @ObfuscatedName("mh.v(Loo;)V")
    public void method5655(class405 arg0) {
        if (arg0.field4457 != null) {
            arg0.method6493();
        }
        arg0.field4457 = this.field4136.field4457;
        arg0.field4456 = this.field4136;
        arg0.field4457.field4456 = arg0;
        arg0.field4456.field4457 = arg0;
    }

    @ObfuscatedName("mh.q(Loo;Loo;)V")
    public static void method5663(class405 arg0, class405 arg1) {
        if (arg0.field4457 != null) {
            arg0.method6493();
        }
        arg0.field4457 = arg1;
        arg0.field4456 = arg1.field4456;
        arg0.field4457.field4456 = arg0;
        arg0.field4456.field4457 = arg0;
    }

    @ObfuscatedName("mh.f()Loo;")
    public class405 method5671() {
        class405 var1 = this.field4136.field4456;
        if (this.field4136 == var1) {
            return null;
        } else {
            var1.method6493();
            return var1;
        }
    }

    @ObfuscatedName("mh.j()Loo;")
    public class405 method5657() {
        return this.method5658((class405) null);
    }

    @ObfuscatedName("mh.e(Loo;)Loo;")
    public class405 method5658(class405 arg0) {
        class405 var2;
        if (arg0 == null) {
            var2 = this.field4136.field4456;
        } else {
            var2 = arg0;
        }
        if (this.field4136 == var2) {
            this.field4135 = null;
            return null;
        } else {
            this.field4135 = var2.field4456;
            return var2;
        }
    }

    @ObfuscatedName("mh.g()Loo;")
    public class405 method5659() {
        class405 var1 = this.field4135;
        if (this.field4136 == var1) {
            this.field4135 = null;
            return null;
        } else {
            this.field4135 = var1.field4456;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class338(this);
    }
}
