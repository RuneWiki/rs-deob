package deob;

import java.util.Iterator;

@ObfuscatedName("gu")
public class class192 implements Iterable {

    @ObfuscatedName("gu.i")
    public class193 field2465 = new class193();

    @ObfuscatedName("gu.h")
    public class193 field2464;

    public class192() {
        this.field2465.field2468 = this.field2465;
        this.field2465.field2466 = this.field2465;
    }

    @ObfuscatedName("gu.i(Lgn;)V")
    public void method3350(class193 arg0) {
        if (arg0.field2466 != null) {
            arg0.method3364();
        }
        arg0.field2466 = this.field2465.field2466;
        arg0.field2468 = this.field2465;
        arg0.field2466.field2468 = arg0;
        arg0.field2468.field2466 = arg0;
    }

    @ObfuscatedName("gu.h(Lgn;)V")
    public void method3335(class193 arg0) {
        if (arg0.field2466 != null) {
            arg0.method3364();
        }
        arg0.field2466 = this.field2465;
        arg0.field2468 = this.field2465.field2468;
        arg0.field2466.field2468 = arg0;
        arg0.field2468.field2466 = arg0;
    }

    @ObfuscatedName("gu.u(Lgn;Lgn;)V")
    public static void method3343(class193 arg0, class193 arg1) {
        if (arg0.field2466 != null) {
            arg0.method3364();
        }
        arg0.field2466 = arg1;
        arg0.field2468 = arg1.field2468;
        arg0.field2466.field2468 = arg0;
        arg0.field2468.field2466 = arg0;
    }

    @ObfuscatedName("gu.q()Lgn;")
    public class193 method3338() {
        class193 var1 = this.field2465.field2468;
        if (this.field2465 == var1) {
            return null;
        } else {
            var1.method3364();
            return var1;
        }
    }

    @ObfuscatedName("gu.g()Lgn;")
    public class193 method3336() {
        return this.method3340((class193) null);
    }

    @ObfuscatedName("gu.v(Lgn;)Lgn;")
    public class193 method3340(class193 arg0) {
        class193 var2;
        if (arg0 == null) {
            var2 = this.field2465.field2468;
        } else {
            var2 = arg0;
        }
        if (this.field2465 == var2) {
            this.field2464 = null;
            return null;
        } else {
            this.field2464 = var2.field2468;
            return var2;
        }
    }

    @ObfuscatedName("gu.t()Lgn;")
    public class193 method3341() {
        class193 var1 = this.field2464;
        if (this.field2465 == var1) {
            this.field2464 = null;
            return null;
        } else {
            this.field2464 = var1.field2468;
            return var1;
        }
    }

    @ObfuscatedName("gu.p()Z")
    public boolean method3342() {
        return this.field2465.field2468 == this.field2465;
    }

    public Iterator iterator() {
        return new class189(this);
    }
}
