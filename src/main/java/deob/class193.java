package deob;

import java.util.Iterator;

@ObfuscatedName("gn")
public class class193 implements Iterable {

    @ObfuscatedName("gn.i")
    public class194 field2471 = new class194();

    @ObfuscatedName("gn.j")
    public class194 field2472;

    public class193() {
        this.field2471.field2474 = this.field2471;
        this.field2471.field2473 = this.field2471;
    }

    @ObfuscatedName("gn.i(Lgs;)V")
    public void method3375(class194 arg0) {
        if (arg0.field2473 != null) {
            arg0.method3397();
        }
        arg0.field2473 = this.field2471.field2473;
        arg0.field2474 = this.field2471;
        arg0.field2473.field2474 = arg0;
        arg0.field2474.field2473 = arg0;
    }

    @ObfuscatedName("gn.j(Lgs;)V")
    public void method3376(class194 arg0) {
        if (arg0.field2473 != null) {
            arg0.method3397();
        }
        arg0.field2473 = this.field2471;
        arg0.field2474 = this.field2471.field2474;
        arg0.field2473.field2474 = arg0;
        arg0.field2474.field2473 = arg0;
    }

    @ObfuscatedName("gn.a(Lgs;Lgs;)V")
    public static void method3377(class194 arg0, class194 arg1) {
        if (arg0.field2473 != null) {
            arg0.method3397();
        }
        arg0.field2473 = arg1;
        arg0.field2474 = arg1.field2474;
        arg0.field2473.field2474 = arg0;
        arg0.field2474.field2473 = arg0;
    }

    @ObfuscatedName("gn.r()Lgs;")
    public class194 method3391() {
        class194 var1 = this.field2471.field2474;
        if (this.field2471 == var1) {
            return null;
        } else {
            var1.method3397();
            return var1;
        }
    }

    @ObfuscatedName("gn.o()Lgs;")
    public class194 method3379() {
        return this.method3380((class194) null);
    }

    @ObfuscatedName("gn.n(Lgs;)Lgs;")
    public class194 method3380(class194 arg0) {
        class194 var2;
        if (arg0 == null) {
            var2 = this.field2471.field2474;
        } else {
            var2 = arg0;
        }
        if (this.field2471 == var2) {
            this.field2472 = null;
            return null;
        } else {
            this.field2472 = var2.field2474;
            return var2;
        }
    }

    @ObfuscatedName("gn.q()Lgs;")
    public class194 method3381() {
        class194 var1 = this.field2472;
        if (this.field2471 == var1) {
            this.field2472 = null;
            return null;
        } else {
            this.field2472 = var1.field2474;
            return var1;
        }
    }

    @ObfuscatedName("gn.b()Z")
    public boolean method3382() {
        return this.field2471.field2474 == this.field2471;
    }

    public Iterator iterator() {
        return new class190(this);
    }
}
