package deob;

import java.util.Iterator;

@ObfuscatedName("gt")
public class class204 implements Iterable {

    @ObfuscatedName("gt.w")
    public class205 field2447 = new class205();

    @ObfuscatedName("gt.m")
    public class205 field2446;

    public class204() {
        this.field2447.field2448 = this.field2447;
        this.field2447.field2449 = this.field2447;
    }

    @ObfuscatedName("gt.w()V")
    public void method3764() {
        while (this.field2447.field2448 != this.field2447) {
            this.field2447.field2448.method3782();
        }
    }

    @ObfuscatedName("gt.m(Lgl;)V")
    public void method3753(class205 arg0) {
        if (arg0.field2449 != null) {
            arg0.method3782();
        }
        arg0.field2449 = this.field2447.field2449;
        arg0.field2448 = this.field2447;
        arg0.field2449.field2448 = arg0;
        arg0.field2448.field2449 = arg0;
    }

    @ObfuscatedName("gt.q(Lgl;)V")
    public void method3754(class205 arg0) {
        if (arg0.field2449 != null) {
            arg0.method3782();
        }
        arg0.field2449 = this.field2447;
        arg0.field2448 = this.field2447.field2448;
        arg0.field2449.field2448 = arg0;
        arg0.field2448.field2449 = arg0;
    }

    @ObfuscatedName("gt.x(Lgl;Lgl;)V")
    public static void method3773(class205 arg0, class205 arg1) {
        if (arg0.field2449 != null) {
            arg0.method3782();
        }
        arg0.field2449 = arg1;
        arg0.field2448 = arg1.field2448;
        arg0.field2449.field2448 = arg0;
        arg0.field2448.field2449 = arg0;
    }

    @ObfuscatedName("gt.j()Lgl;")
    public class205 method3756() {
        return this.method3762((class205) null);
    }

    @ObfuscatedName("gt.a(Lgl;)Lgl;")
    public class205 method3762(class205 arg0) {
        class205 var2;
        if (arg0 == null) {
            var2 = this.field2447.field2448;
        } else {
            var2 = arg0;
        }
        if (this.field2447 == var2) {
            this.field2446 = null;
            return null;
        } else {
            this.field2446 = var2.field2448;
            return var2;
        }
    }

    @ObfuscatedName("gt.l()Lgl;")
    public class205 method3758() {
        class205 var1 = this.field2446;
        if (this.field2447 == var1) {
            this.field2446 = null;
            return null;
        } else {
            this.field2446 = var1.field2448;
            return var1;
        }
    }

    @ObfuscatedName("gt.d()Z")
    public boolean method3759() {
        return this.field2447.field2448 == this.field2447;
    }

    public Iterator iterator() {
        return new class200(this);
    }
}
