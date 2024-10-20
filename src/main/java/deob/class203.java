package deob;

import java.util.Iterator;

@ObfuscatedName("gs")
public class class203 implements Iterable {

    @ObfuscatedName("gs.n")
    public class204 field2594 = new class204();

    @ObfuscatedName("gs.v")
    public class204 field2595;

    public class203() {
        this.field2594.field2598 = this.field2594;
        this.field2594.field2596 = this.field2594;
    }

    @ObfuscatedName("gs.n()V")
    public void method3460() {
        while (this.field2594.field2598 != this.field2594) {
            this.field2594.field2598.method3474();
        }
    }

    @ObfuscatedName("gs.v(Lgw;)V")
    public void method3438(class204 arg0) {
        if (arg0.field2596 != null) {
            arg0.method3474();
        }
        arg0.field2596 = this.field2594.field2596;
        arg0.field2598 = this.field2594;
        arg0.field2596.field2598 = arg0;
        arg0.field2598.field2596 = arg0;
    }

    @ObfuscatedName("gs.y(Lgw;)V")
    public void method3439(class204 arg0) {
        if (arg0.field2596 != null) {
            arg0.method3474();
        }
        arg0.field2596 = this.field2594;
        arg0.field2598 = this.field2594.field2598;
        arg0.field2596.field2598 = arg0;
        arg0.field2598.field2596 = arg0;
    }

    @ObfuscatedName("gs.r(Lgw;Lgw;)V")
    public static void method3440(class204 arg0, class204 arg1) {
        if (arg0.field2596 != null) {
            arg0.method3474();
        }
        arg0.field2596 = arg1;
        arg0.field2598 = arg1.field2598;
        arg0.field2596.field2598 = arg0;
        arg0.field2598.field2596 = arg0;
    }

    @ObfuscatedName("gs.h()Lgw;")
    public class204 method3441() {
        class204 var1 = this.field2594.field2598;
        if (this.field2594 == var1) {
            return null;
        } else {
            var1.method3474();
            return var1;
        }
    }

    @ObfuscatedName("gs.d()Lgw;")
    public class204 method3442() {
        return this.method3443((class204) null);
    }

    @ObfuscatedName("gs.s(Lgw;)Lgw;")
    public class204 method3443(class204 arg0) {
        class204 var2;
        if (arg0 == null) {
            var2 = this.field2594.field2598;
        } else {
            var2 = arg0;
        }
        if (this.field2594 == var2) {
            this.field2595 = null;
            return null;
        } else {
            this.field2595 = var2.field2598;
            return var2;
        }
    }

    @ObfuscatedName("gs.b()Lgw;")
    public class204 method3444() {
        class204 var1 = this.field2595;
        if (this.field2594 == var1) {
            this.field2595 = null;
            return null;
        } else {
            this.field2595 = var1.field2598;
            return var1;
        }
    }

    @ObfuscatedName("gs.e()Z")
    public boolean method3469() {
        return this.field2594.field2598 == this.field2594;
    }

    public Iterator iterator() {
        return new class200(this);
    }
}
