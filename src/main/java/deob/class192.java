package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public class class192 implements Iterable {

    @ObfuscatedName("gm.n")
    public class193 field2480 = new class193();

    @ObfuscatedName("gm.p")
    public class193 field2481;

    public class192() {
        this.field2480.field2482 = this.field2480;
        this.field2480.field2484 = this.field2480;
    }

    @ObfuscatedName("gm.n(Lgr;)V")
    public void method3324(class193 arg0) {
        if (arg0.field2484 != null) {
            arg0.method3347();
        }
        arg0.field2484 = this.field2480.field2484;
        arg0.field2482 = this.field2480;
        arg0.field2484.field2482 = arg0;
        arg0.field2482.field2484 = arg0;
    }

    @ObfuscatedName("gm.p(Lgr;)V")
    public void method3326(class193 arg0) {
        if (arg0.field2484 != null) {
            arg0.method3347();
        }
        arg0.field2484 = this.field2480;
        arg0.field2482 = this.field2480.field2482;
        arg0.field2484.field2482 = arg0;
        arg0.field2482.field2484 = arg0;
    }

    @ObfuscatedName("gm.i(Lgr;Lgr;)V")
    public static void method3335(class193 arg0, class193 arg1) {
        if (arg0.field2484 != null) {
            arg0.method3347();
        }
        arg0.field2484 = arg1;
        arg0.field2482 = arg1.field2482;
        arg0.field2484.field2482 = arg0;
        arg0.field2482.field2484 = arg0;
    }

    @ObfuscatedName("gm.j()Lgr;")
    public class193 method3320() {
        class193 var1 = this.field2480.field2482;
        if (this.field2480 == var1) {
            return null;
        } else {
            var1.method3347();
            return var1;
        }
    }

    @ObfuscatedName("gm.f()Lgr;")
    public class193 method3321() {
        return this.method3338((class193) null);
    }

    @ObfuscatedName("gm.m(Lgr;)Lgr;")
    public class193 method3338(class193 arg0) {
        class193 var2;
        if (arg0 == null) {
            var2 = this.field2480.field2482;
        } else {
            var2 = arg0;
        }
        if (this.field2480 == var2) {
            this.field2481 = null;
            return null;
        } else {
            this.field2481 = var2.field2482;
            return var2;
        }
    }

    @ObfuscatedName("gm.c()Lgr;")
    public class193 method3323() {
        class193 var1 = this.field2481;
        if (this.field2480 == var1) {
            this.field2481 = null;
            return null;
        } else {
            this.field2481 = var1.field2482;
            return var1;
        }
    }

    @ObfuscatedName("gm.z()Z")
    public boolean method3318() {
        return this.field2480.field2482 == this.field2480;
    }

    public Iterator iterator() {
        return new class189(this);
    }
}
