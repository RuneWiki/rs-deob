package deob;

import java.util.Iterator;

@ObfuscatedName("mr")
public class class340 implements Iterable {

    @ObfuscatedName("mr.v")
    public class404 field4094 = new class404();

    @ObfuscatedName("mr.c")
    public class404 field4095;

    public class340() {
        this.field4094.field4403 = this.field4094;
        this.field4094.field4405 = this.field4094;
    }

    @ObfuscatedName("mr.v()V")
    public void method5659() {
        while (this.field4094.field4403 != this.field4094) {
            this.field4094.field4403.method6500();
        }
    }

    @ObfuscatedName("mr.c(Loz;)V")
    public void method5660(class404 arg0) {
        if (arg0.field4405 != null) {
            arg0.method6500();
        }
        arg0.field4405 = this.field4094.field4405;
        arg0.field4403 = this.field4094;
        arg0.field4405.field4403 = arg0;
        arg0.field4403.field4405 = arg0;
    }

    @ObfuscatedName("mr.i(Loz;Loz;)V")
    public static void method5661(class404 arg0, class404 arg1) {
        if (arg0.field4405 != null) {
            arg0.method6500();
        }
        arg0.field4405 = arg1;
        arg0.field4403 = arg1.field4403;
        arg0.field4405.field4403 = arg0;
        arg0.field4403.field4405 = arg0;
    }

    @ObfuscatedName("mr.f()Loz;")
    public class404 method5662() {
        class404 var1 = this.field4094.field4403;
        if (this.field4094 == var1) {
            return null;
        } else {
            var1.method6500();
            return var1;
        }
    }

    @ObfuscatedName("mr.b()Loz;")
    public class404 method5681() {
        return this.method5664((class404) null);
    }

    @ObfuscatedName("mr.n(Loz;)Loz;")
    public class404 method5664(class404 arg0) {
        class404 var2;
        if (arg0 == null) {
            var2 = this.field4094.field4403;
        } else {
            var2 = arg0;
        }
        if (this.field4094 == var2) {
            this.field4095 = null;
            return null;
        } else {
            this.field4095 = var2.field4403;
            return var2;
        }
    }

    @ObfuscatedName("mr.s()Loz;")
    public class404 method5665() {
        class404 var1 = this.field4095;
        if (this.field4094 == var1) {
            this.field4095 = null;
            return null;
        } else {
            this.field4095 = var1.field4403;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class339(this);
    }
}
