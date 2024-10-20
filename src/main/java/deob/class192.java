package deob;

import java.util.Iterator;

@ObfuscatedName("gb")
public class class192 implements Iterable {

    @ObfuscatedName("gb.p")
    public class193 field2480 = new class193();

    @ObfuscatedName("gb.m")
    public class193 field2481;

    public class192() {
        this.field2480.field2484 = this.field2480;
        this.field2480.field2482 = this.field2480;
    }

    @ObfuscatedName("gb.p(Lgw;)V")
    public void method3206(class193 arg0) {
        if (arg0.field2482 != null) {
            arg0.method3234();
        }
        arg0.field2482 = this.field2480.field2482;
        arg0.field2484 = this.field2480;
        arg0.field2482.field2484 = arg0;
        arg0.field2484.field2482 = arg0;
    }

    @ObfuscatedName("gb.m(Lgw;)V")
    public void method3207(class193 arg0) {
        if (arg0.field2482 != null) {
            arg0.method3234();
        }
        arg0.field2482 = this.field2480;
        arg0.field2484 = this.field2480.field2484;
        arg0.field2482.field2484 = arg0;
        arg0.field2484.field2482 = arg0;
    }

    @ObfuscatedName("gb.e(Lgw;Lgw;)V")
    public static void method3208(class193 arg0, class193 arg1) {
        if (arg0.field2482 != null) {
            arg0.method3234();
        }
        arg0.field2482 = arg1;
        arg0.field2484 = arg1.field2484;
        arg0.field2482.field2484 = arg0;
        arg0.field2484.field2482 = arg0;
    }

    @ObfuscatedName("gb.t()Lgw;")
    public class193 method3209() {
        class193 var1 = this.field2480.field2484;
        if (this.field2480 == var1) {
            return null;
        } else {
            var1.method3234();
            return var1;
        }
    }

    @ObfuscatedName("gb.w()Lgw;")
    public class193 method3222() {
        return this.method3211((class193) null);
    }

    @ObfuscatedName("gb.z(Lgw;)Lgw;")
    public class193 method3211(class193 arg0) {
        class193 var2;
        if (arg0 == null) {
            var2 = this.field2480.field2484;
        } else {
            var2 = arg0;
        }
        if (this.field2480 == var2) {
            this.field2481 = null;
            return null;
        } else {
            this.field2481 = var2.field2484;
            return var2;
        }
    }

    @ObfuscatedName("gb.j()Lgw;")
    public class193 method3213() {
        class193 var1 = this.field2481;
        if (this.field2480 == var1) {
            this.field2481 = null;
            return null;
        } else {
            this.field2481 = var1.field2484;
            return var1;
        }
    }

    @ObfuscatedName("gb.c()Z")
    public boolean method3214() {
        return this.field2480.field2484 == this.field2480;
    }

    public Iterator iterator() {
        return new class189(this);
    }
}
