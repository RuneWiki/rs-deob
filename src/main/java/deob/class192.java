package deob;

import java.util.Iterator;

@ObfuscatedName("gt")
public class class192 implements Iterable {

    @ObfuscatedName("gt.d")
    public class193 field2437 = new class193();

    @ObfuscatedName("gt.q")
    public class193 field2438;

    public class192() {
        this.field2437.field2440 = this.field2437;
        this.field2437.field2439 = this.field2437;
    }

    @ObfuscatedName("gt.d(Lgm;)V")
    public void method3278(class193 arg0) {
        if (arg0.field2439 != null) {
            arg0.method3312();
        }
        arg0.field2439 = this.field2437.field2439;
        arg0.field2440 = this.field2437;
        arg0.field2439.field2440 = arg0;
        arg0.field2440.field2439 = arg0;
    }

    @ObfuscatedName("gt.q(Lgm;)V")
    public void method3291(class193 arg0) {
        if (arg0.field2439 != null) {
            arg0.method3312();
        }
        arg0.field2439 = this.field2437;
        arg0.field2440 = this.field2437.field2440;
        arg0.field2439.field2440 = arg0;
        arg0.field2440.field2439 = arg0;
    }

    @ObfuscatedName("gt.x(Lgm;Lgm;)V")
    public static void method3280(class193 arg0, class193 arg1) {
        if (arg0.field2439 != null) {
            arg0.method3312();
        }
        arg0.field2439 = arg1;
        arg0.field2440 = arg1.field2440;
        arg0.field2439.field2440 = arg0;
        arg0.field2440.field2439 = arg0;
    }

    @ObfuscatedName("gt.y()Lgm;")
    public class193 method3296() {
        class193 var1 = this.field2437.field2440;
        if (this.field2437 == var1) {
            return null;
        } else {
            var1.method3312();
            return var1;
        }
    }

    @ObfuscatedName("gt.e()Lgm;")
    public class193 method3282() {
        return this.method3283((class193) null);
    }

    @ObfuscatedName("gt.f(Lgm;)Lgm;")
    public class193 method3283(class193 arg0) {
        class193 var2;
        if (arg0 == null) {
            var2 = this.field2437.field2440;
        } else {
            var2 = arg0;
        }
        if (this.field2437 == var2) {
            this.field2438 = null;
            return null;
        } else {
            this.field2438 = var2.field2440;
            return var2;
        }
    }

    @ObfuscatedName("gt.v()Lgm;")
    public class193 method3277() {
        class193 var1 = this.field2438;
        if (this.field2437 == var1) {
            this.field2438 = null;
            return null;
        } else {
            this.field2438 = var1.field2440;
            return var1;
        }
    }

    @ObfuscatedName("gt.t()Z")
    public boolean method3285() {
        return this.field2437.field2440 == this.field2437;
    }

    public Iterator iterator() {
        return new class189(this);
    }
}
