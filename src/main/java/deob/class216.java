package deob;

import java.util.Iterator;

@ObfuscatedName("he")
public class class216 implements Iterable {

    @ObfuscatedName("he.c")
    public class217 field2641 = new class217();

    @ObfuscatedName("he.i")
    public class217 field2642;

    public class216() {
        this.field2641.field2643 = this.field2641;
        this.field2641.field2644 = this.field2641;
    }

    @ObfuscatedName("he.c()V")
    public void method3679() {
        while (this.field2641.field2643 != this.field2641) {
            this.field2641.field2643.method3710();
        }
    }

    @ObfuscatedName("he.i(Lhg;)V")
    public void method3680(class217 arg0) {
        if (arg0.field2644 != null) {
            arg0.method3710();
        }
        arg0.field2644 = this.field2641.field2644;
        arg0.field2643 = this.field2641;
        arg0.field2644.field2643 = arg0;
        arg0.field2643.field2644 = arg0;
    }

    @ObfuscatedName("he.o(Lhg;)V")
    public void method3705(class217 arg0) {
        if (arg0.field2644 != null) {
            arg0.method3710();
        }
        arg0.field2644 = this.field2641;
        arg0.field2643 = this.field2641.field2643;
        arg0.field2644.field2643 = arg0;
        arg0.field2643.field2644 = arg0;
    }

    @ObfuscatedName("he.j(Lhg;Lhg;)V")
    public static void method3682(class217 arg0, class217 arg1) {
        if (arg0.field2644 != null) {
            arg0.method3710();
        }
        arg0.field2644 = arg1;
        arg0.field2643 = arg1.field2643;
        arg0.field2644.field2643 = arg0;
        arg0.field2643.field2644 = arg0;
    }

    @ObfuscatedName("he.k()Lhg;")
    public class217 method3702() {
        class217 var1 = this.field2641.field2643;
        if (this.field2641 == var1) {
            return null;
        } else {
            var1.method3710();
            return var1;
        }
    }

    @ObfuscatedName("he.x()Lhg;")
    public class217 method3684() {
        return this.method3690((class217) null);
    }

    @ObfuscatedName("he.z(Lhg;)Lhg;")
    public class217 method3690(class217 arg0) {
        class217 var2;
        if (arg0 == null) {
            var2 = this.field2641.field2643;
        } else {
            var2 = arg0;
        }
        if (this.field2641 == var2) {
            this.field2642 = null;
            return null;
        } else {
            this.field2642 = var2.field2643;
            return var2;
        }
    }

    @ObfuscatedName("he.p()Lhg;")
    public class217 method3699() {
        class217 var1 = this.field2642;
        if (this.field2641 == var1) {
            this.field2642 = null;
            return null;
        } else {
            this.field2642 = var1.field2643;
            return var1;
        }
    }

    @ObfuscatedName("he.w()Z")
    public boolean method3698() {
        return this.field2641.field2643 == this.field2641;
    }

    public Iterator iterator() {
        return new class212(this);
    }
}
