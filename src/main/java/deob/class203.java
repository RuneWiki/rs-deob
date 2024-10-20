package deob;

import java.util.Iterator;

@ObfuscatedName("go")
public class class203 implements Iterable {

    @ObfuscatedName("go.a")
    public class204 field2588 = new class204();

    @ObfuscatedName("go.w")
    public class204 field2587;

    public class203() {
        this.field2588.field2590 = this.field2588;
        this.field2588.field2591 = this.field2588;
    }

    @ObfuscatedName("go.a()V")
    public void method3394() {
        while (this.field2588.field2590 != this.field2588) {
            this.field2588.field2590.method3427();
        }
    }

    @ObfuscatedName("go.w(Lgn;)V")
    public void method3417(class204 arg0) {
        if (arg0.field2591 != null) {
            arg0.method3427();
        }
        arg0.field2591 = this.field2588.field2591;
        arg0.field2590 = this.field2588;
        arg0.field2591.field2590 = arg0;
        arg0.field2590.field2591 = arg0;
    }

    @ObfuscatedName("go.e(Lgn;)V")
    public void method3396(class204 arg0) {
        if (arg0.field2591 != null) {
            arg0.method3427();
        }
        arg0.field2591 = this.field2588;
        arg0.field2590 = this.field2588.field2590;
        arg0.field2591.field2590 = arg0;
        arg0.field2590.field2591 = arg0;
    }

    @ObfuscatedName("go.k(Lgn;Lgn;)V")
    public static void method3408(class204 arg0, class204 arg1) {
        if (arg0.field2591 != null) {
            arg0.method3427();
        }
        arg0.field2591 = arg1;
        arg0.field2590 = arg1.field2590;
        arg0.field2591.field2590 = arg0;
        arg0.field2590.field2591 = arg0;
    }

    @ObfuscatedName("go.u()Lgn;")
    public class204 method3398() {
        class204 var1 = this.field2588.field2590;
        if (this.field2588 == var1) {
            return null;
        } else {
            var1.method3427();
            return var1;
        }
    }

    @ObfuscatedName("go.z()Lgn;")
    public class204 method3399() {
        return this.method3393((class204) null);
    }

    @ObfuscatedName("go.t(Lgn;)Lgn;")
    public class204 method3393(class204 arg0) {
        class204 var2;
        if (arg0 == null) {
            var2 = this.field2588.field2590;
        } else {
            var2 = arg0;
        }
        if (this.field2588 == var2) {
            this.field2587 = null;
            return null;
        } else {
            this.field2587 = var2.field2590;
            return var2;
        }
    }

    @ObfuscatedName("go.f()Lgn;")
    public class204 method3418() {
        class204 var1 = this.field2587;
        if (this.field2588 == var1) {
            this.field2587 = null;
            return null;
        } else {
            this.field2587 = var1.field2590;
            return var1;
        }
    }

    @ObfuscatedName("go.g()Z")
    public boolean method3425() {
        return this.field2588.field2590 == this.field2588;
    }

    public Iterator iterator() {
        return new class200(this);
    }
}
