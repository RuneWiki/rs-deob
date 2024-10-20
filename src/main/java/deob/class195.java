package deob;

import java.util.Iterator;

@ObfuscatedName("gl")
public class class195 implements Iterable {

    @ObfuscatedName("gl.w")
    public class196 field2486 = new class196();

    @ObfuscatedName("gl.o")
    public class196 field2487;

    public class195() {
        this.field2486.field2489 = this.field2486;
        this.field2486.field2488 = this.field2486;
    }

    @ObfuscatedName("gl.w(Lgd;)V")
    public void method3283(class196 arg0) {
        if (arg0.field2488 != null) {
            arg0.method3294();
        }
        arg0.field2488 = this.field2486.field2488;
        arg0.field2489 = this.field2486;
        arg0.field2488.field2489 = arg0;
        arg0.field2489.field2488 = arg0;
    }

    @ObfuscatedName("gl.o(Lgd;)V")
    public void method3289(class196 arg0) {
        if (arg0.field2488 != null) {
            arg0.method3294();
        }
        arg0.field2488 = this.field2486;
        arg0.field2489 = this.field2486.field2489;
        arg0.field2488.field2489 = arg0;
        arg0.field2489.field2488 = arg0;
    }

    @ObfuscatedName("gl.x(Lgd;Lgd;)V")
    public static void method3272(class196 arg0, class196 arg1) {
        if (arg0.field2488 != null) {
            arg0.method3294();
        }
        arg0.field2488 = arg1;
        arg0.field2489 = arg1.field2489;
        arg0.field2488.field2489 = arg0;
        arg0.field2489.field2488 = arg0;
    }

    @ObfuscatedName("gl.k()Lgd;")
    public class196 method3288() {
        class196 var1 = this.field2486.field2489;
        if (this.field2486 == var1) {
            return null;
        } else {
            var1.method3294();
            return var1;
        }
    }

    @ObfuscatedName("gl.f()Lgd;")
    public class196 method3273() {
        return this.method3274((class196) null);
    }

    @ObfuscatedName("gl.i(Lgd;)Lgd;")
    public class196 method3274(class196 arg0) {
        class196 var2;
        if (arg0 == null) {
            var2 = this.field2486.field2489;
        } else {
            var2 = arg0;
        }
        if (this.field2486 == var2) {
            this.field2487 = null;
            return null;
        } else {
            this.field2487 = var2.field2489;
            return var2;
        }
    }

    @ObfuscatedName("gl.j()Lgd;")
    public class196 method3275() {
        class196 var1 = this.field2487;
        if (this.field2486 == var1) {
            this.field2487 = null;
            return null;
        } else {
            this.field2487 = var1.field2489;
            return var1;
        }
    }

    @ObfuscatedName("gl.m()Z")
    public boolean method3276() {
        return this.field2486.field2489 == this.field2486;
    }

    public Iterator iterator() {
        return new class192(this);
    }
}
