package deob;

import java.util.Iterator;

@ObfuscatedName("gi")
public class class192 implements Iterable {

    @ObfuscatedName("gi.i")
    public class193 field2478 = new class193();

    @ObfuscatedName("gi.c")
    public class193 field2479;

    public class192() {
        this.field2478.field2481 = this.field2478;
        this.field2478.field2482 = this.field2478;
    }

    @ObfuscatedName("gi.i(Lgz;)V")
    public void method3249(class193 arg0) {
        if (arg0.field2482 != null) {
            arg0.method3278();
        }
        arg0.field2482 = this.field2478.field2482;
        arg0.field2481 = this.field2478;
        arg0.field2482.field2481 = arg0;
        arg0.field2481.field2482 = arg0;
    }

    @ObfuscatedName("gi.c(Lgz;)V")
    public void method3250(class193 arg0) {
        if (arg0.field2482 != null) {
            arg0.method3278();
        }
        arg0.field2482 = this.field2478;
        arg0.field2481 = this.field2478.field2481;
        arg0.field2482.field2481 = arg0;
        arg0.field2481.field2482 = arg0;
    }

    @ObfuscatedName("gi.e(Lgz;Lgz;)V")
    public static void method3257(class193 arg0, class193 arg1) {
        if (arg0.field2482 != null) {
            arg0.method3278();
        }
        arg0.field2482 = arg1;
        arg0.field2481 = arg1.field2481;
        arg0.field2482.field2481 = arg0;
        arg0.field2481.field2482 = arg0;
    }

    @ObfuscatedName("gi.v()Lgz;")
    public class193 method3252() {
        class193 var1 = this.field2478.field2481;
        if (this.field2478 == var1) {
            return null;
        } else {
            var1.method3278();
            return var1;
        }
    }

    @ObfuscatedName("gi.b()Lgz;")
    public class193 method3248() {
        return this.method3253((class193) null);
    }

    @ObfuscatedName("gi.y(Lgz;)Lgz;")
    public class193 method3253(class193 arg0) {
        class193 var2;
        if (arg0 == null) {
            var2 = this.field2478.field2481;
        } else {
            var2 = arg0;
        }
        if (this.field2478 == var2) {
            this.field2479 = null;
            return null;
        } else {
            this.field2479 = var2.field2481;
            return var2;
        }
    }

    @ObfuscatedName("gi.h()Lgz;")
    public class193 method3258() {
        class193 var1 = this.field2479;
        if (this.field2478 == var1) {
            this.field2479 = null;
            return null;
        } else {
            this.field2479 = var1.field2481;
            return var1;
        }
    }

    @ObfuscatedName("gi.x()Z")
    public boolean method3256() {
        return this.field2478.field2481 == this.field2478;
    }

    public Iterator iterator() {
        return new class189(this);
    }
}
