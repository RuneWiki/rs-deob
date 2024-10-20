package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class192 implements Iterable {

    @ObfuscatedName("gf.i")
    public class193 field2472 = new class193();

    @ObfuscatedName("gf.w")
    public class193 field2471;

    public class192() {
        this.field2472.field2474 = this.field2472;
        this.field2472.field2475 = this.field2472;
    }

    @ObfuscatedName("gf.i(Lgm;)V")
    public void method3262(class193 arg0) {
        if (arg0.field2475 != null) {
            arg0.method3290();
        }
        arg0.field2475 = this.field2472.field2475;
        arg0.field2474 = this.field2472;
        arg0.field2475.field2474 = arg0;
        arg0.field2474.field2475 = arg0;
    }

    @ObfuscatedName("gf.w(Lgm;)V")
    public void method3263(class193 arg0) {
        if (arg0.field2475 != null) {
            arg0.method3290();
        }
        arg0.field2475 = this.field2472;
        arg0.field2474 = this.field2472.field2474;
        arg0.field2475.field2474 = arg0;
        arg0.field2474.field2475 = arg0;
    }

    @ObfuscatedName("gf.a(Lgm;Lgm;)V")
    public static void method3264(class193 arg0, class193 arg1) {
        if (arg0.field2475 != null) {
            arg0.method3290();
        }
        arg0.field2475 = arg1;
        arg0.field2474 = arg1.field2474;
        arg0.field2475.field2474 = arg0;
        arg0.field2474.field2475 = arg0;
    }

    @ObfuscatedName("gf.t()Lgm;")
    public class193 method3265() {
        class193 var1 = this.field2472.field2474;
        if (this.field2472 == var1) {
            return null;
        } else {
            var1.method3290();
            return var1;
        }
    }

    @ObfuscatedName("gf.s()Lgm;")
    public class193 method3266() {
        return this.method3288((class193) null);
    }

    @ObfuscatedName("gf.r(Lgm;)Lgm;")
    public class193 method3288(class193 arg0) {
        class193 var2;
        if (arg0 == null) {
            var2 = this.field2472.field2474;
        } else {
            var2 = arg0;
        }
        if (this.field2472 == var2) {
            this.field2471 = null;
            return null;
        } else {
            this.field2471 = var2.field2474;
            return var2;
        }
    }

    @ObfuscatedName("gf.v()Lgm;")
    public class193 method3277() {
        class193 var1 = this.field2471;
        if (this.field2472 == var1) {
            this.field2471 = null;
            return null;
        } else {
            this.field2471 = var1.field2474;
            return var1;
        }
    }

    @ObfuscatedName("gf.y()Z")
    public boolean method3269() {
        return this.field2472.field2474 == this.field2472;
    }

    public Iterator iterator() {
        return new class189(this);
    }
}
