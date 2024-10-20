package deob;

import java.util.Iterator;

@ObfuscatedName("gx")
public class class199 implements Iterable {

    @ObfuscatedName("gx.b")
    public class200 field2553 = new class200();

    @ObfuscatedName("gx.s")
    public class200 field2554;

    public class199() {
        this.field2553.field2556 = this.field2553;
        this.field2553.field2555 = this.field2553;
    }

    @ObfuscatedName("gx.b()V")
    public void method3357() {
        while (this.field2553.field2556 != this.field2553) {
            this.field2553.field2556.method3392();
        }
    }

    @ObfuscatedName("gx.s(Lgt;)V")
    public void method3369(class200 arg0) {
        if (arg0.field2555 != null) {
            arg0.method3392();
        }
        arg0.field2555 = this.field2553.field2555;
        arg0.field2556 = this.field2553;
        arg0.field2555.field2556 = arg0;
        arg0.field2556.field2555 = arg0;
    }

    @ObfuscatedName("gx.r(Lgt;)V")
    public void method3359(class200 arg0) {
        if (arg0.field2555 != null) {
            arg0.method3392();
        }
        arg0.field2555 = this.field2553;
        arg0.field2556 = this.field2553.field2556;
        arg0.field2555.field2556 = arg0;
        arg0.field2556.field2555 = arg0;
    }

    @ObfuscatedName("gx.g(Lgt;Lgt;)V")
    public static void method3360(class200 arg0, class200 arg1) {
        if (arg0.field2555 != null) {
            arg0.method3392();
        }
        arg0.field2555 = arg1;
        arg0.field2556 = arg1.field2556;
        arg0.field2555.field2556 = arg0;
        arg0.field2556.field2555 = arg0;
    }

    @ObfuscatedName("gx.x()Lgt;")
    public class200 method3356() {
        class200 var1 = this.field2553.field2556;
        if (this.field2553 == var1) {
            return null;
        } else {
            var1.method3392();
            return var1;
        }
    }

    @ObfuscatedName("gx.f()Lgt;")
    public class200 method3362() {
        return this.method3363((class200) null);
    }

    @ObfuscatedName("gx.u(Lgt;)Lgt;")
    public class200 method3363(class200 arg0) {
        class200 var2;
        if (arg0 == null) {
            var2 = this.field2553.field2556;
        } else {
            var2 = arg0;
        }
        if (this.field2553 == var2) {
            this.field2554 = null;
            return null;
        } else {
            this.field2554 = var2.field2556;
            return var2;
        }
    }

    @ObfuscatedName("gx.t()Lgt;")
    public class200 method3364() {
        class200 var1 = this.field2554;
        if (this.field2553 == var1) {
            this.field2554 = null;
            return null;
        } else {
            this.field2554 = var1.field2556;
            return var1;
        }
    }

    @ObfuscatedName("gx.k()Z")
    public boolean method3365() {
        return this.field2553.field2556 == this.field2553;
    }

    public Iterator iterator() {
        return new class196(this);
    }
}
