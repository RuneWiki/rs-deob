package deob;

import java.util.Iterator;

@ObfuscatedName("gk")
public class class203 implements Iterable {

    @ObfuscatedName("gk.p")
    public class204 field2559 = new class204();

    @ObfuscatedName("gk.i")
    public class204 field2560;

    public class203() {
        this.field2559.field2562 = this.field2559;
        this.field2559.field2561 = this.field2559;
    }

    @ObfuscatedName("gk.p()V")
    public void method3539() {
        while (this.field2559.field2562 != this.field2559) {
            this.field2559.field2562.method3561();
        }
    }

    @ObfuscatedName("gk.i(Lgw;)V")
    public void method3533(class204 arg0) {
        if (arg0.field2561 != null) {
            arg0.method3561();
        }
        arg0.field2561 = this.field2559.field2561;
        arg0.field2562 = this.field2559;
        arg0.field2561.field2562 = arg0;
        arg0.field2562.field2561 = arg0;
    }

    @ObfuscatedName("gk.w(Lgw;)V")
    public void method3532(class204 arg0) {
        if (arg0.field2561 != null) {
            arg0.method3561();
        }
        arg0.field2561 = this.field2559;
        arg0.field2562 = this.field2559.field2562;
        arg0.field2561.field2562 = arg0;
        arg0.field2562.field2561 = arg0;
    }

    @ObfuscatedName("gk.s(Lgw;Lgw;)V")
    public static void method3542(class204 arg0, class204 arg1) {
        if (arg0.field2561 != null) {
            arg0.method3561();
        }
        arg0.field2561 = arg1;
        arg0.field2562 = arg1.field2562;
        arg0.field2561.field2562 = arg0;
        arg0.field2562.field2561 = arg0;
    }

    @ObfuscatedName("gk.j()Lgw;")
    public class204 method3534() {
        class204 var1 = this.field2559.field2562;
        if (this.field2559 == var1) {
            return null;
        } else {
            var1.method3561();
            return var1;
        }
    }

    @ObfuscatedName("gk.a()Lgw;")
    public class204 method3556() {
        return this.method3536((class204) null);
    }

    @ObfuscatedName("gk.t(Lgw;)Lgw;")
    public class204 method3536(class204 arg0) {
        class204 var2;
        if (arg0 == null) {
            var2 = this.field2559.field2562;
        } else {
            var2 = arg0;
        }
        if (this.field2559 == var2) {
            this.field2560 = null;
            return null;
        } else {
            this.field2560 = var2.field2562;
            return var2;
        }
    }

    @ObfuscatedName("gk.r()Lgw;")
    public class204 method3537() {
        class204 var1 = this.field2560;
        if (this.field2559 == var1) {
            this.field2560 = null;
            return null;
        } else {
            this.field2560 = var1.field2562;
            return var1;
        }
    }

    @ObfuscatedName("gk.m()Z")
    public boolean method3538() {
        return this.field2559.field2562 == this.field2559;
    }

    public Iterator iterator() {
        return new class200(this);
    }
}
