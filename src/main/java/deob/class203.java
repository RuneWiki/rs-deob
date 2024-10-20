package deob;

import java.util.Iterator;

@ObfuscatedName("gi")
public class class203 implements Iterable {

    @ObfuscatedName("gi.s")
    public class204 field2582 = new class204();

    @ObfuscatedName("gi.g")
    public class204 field2583;

    public class203() {
        this.field2582.field2584 = this.field2582;
        this.field2582.field2586 = this.field2582;
    }

    @ObfuscatedName("gi.s()V")
    public void method3706() {
        while (this.field2582.field2584 != this.field2582) {
            this.field2582.field2584.method3740();
        }
    }

    @ObfuscatedName("gi.g(Lgf;)V")
    public void method3707(class204 arg0) {
        if (arg0.field2586 != null) {
            arg0.method3740();
        }
        arg0.field2586 = this.field2582.field2586;
        arg0.field2584 = this.field2582;
        arg0.field2586.field2584 = arg0;
        arg0.field2584.field2586 = arg0;
    }

    @ObfuscatedName("gi.m(Lgf;)V")
    public void method3724(class204 arg0) {
        if (arg0.field2586 != null) {
            arg0.method3740();
        }
        arg0.field2586 = this.field2582;
        arg0.field2584 = this.field2582.field2584;
        arg0.field2586.field2584 = arg0;
        arg0.field2584.field2586 = arg0;
    }

    @ObfuscatedName("gi.h(Lgf;Lgf;)V")
    public static void method3709(class204 arg0, class204 arg1) {
        if (arg0.field2586 != null) {
            arg0.method3740();
        }
        arg0.field2586 = arg1;
        arg0.field2584 = arg1.field2584;
        arg0.field2586.field2584 = arg0;
        arg0.field2584.field2586 = arg0;
    }

    @ObfuscatedName("gi.i()Lgf;")
    public class204 method3710() {
        class204 var1 = this.field2582.field2584;
        if (this.field2582 == var1) {
            return null;
        } else {
            var1.method3740();
            return var1;
        }
    }

    @ObfuscatedName("gi.w()Lgf;")
    public class204 method3723() {
        return this.method3718((class204) null);
    }

    @ObfuscatedName("gi.t(Lgf;)Lgf;")
    public class204 method3718(class204 arg0) {
        class204 var2;
        if (arg0 == null) {
            var2 = this.field2582.field2584;
        } else {
            var2 = arg0;
        }
        if (this.field2582 == var2) {
            this.field2583 = null;
            return null;
        } else {
            this.field2583 = var2.field2584;
            return var2;
        }
    }

    @ObfuscatedName("gi.d()Lgf;")
    public class204 method3705() {
        class204 var1 = this.field2583;
        if (this.field2582 == var1) {
            this.field2583 = null;
            return null;
        } else {
            this.field2583 = var1.field2584;
            return var1;
        }
    }

    @ObfuscatedName("gi.z()Z")
    public boolean method3708() {
        return this.field2582.field2584 == this.field2582;
    }

    public Iterator iterator() {
        return new class200(this);
    }
}
