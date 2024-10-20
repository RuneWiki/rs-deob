package deob;

import java.util.Iterator;

@ObfuscatedName("gq")
public class class192 implements Iterable {

    @ObfuscatedName("gq.w")
    public class193 field2463 = new class193();

    @ObfuscatedName("gq.s")
    public class193 field2462;

    public class192() {
        this.field2463.field2465 = this.field2463;
        this.field2463.field2466 = this.field2463;
    }

    @ObfuscatedName("gq.w(Lgd;)V")
    public void method3391(class193 arg0) {
        if (arg0.field2466 != null) {
            arg0.method3425();
        }
        arg0.field2466 = this.field2463.field2466;
        arg0.field2465 = this.field2463;
        arg0.field2466.field2465 = arg0;
        arg0.field2465.field2466 = arg0;
    }

    @ObfuscatedName("gq.s(Lgd;)V")
    public void method3392(class193 arg0) {
        if (arg0.field2466 != null) {
            arg0.method3425();
        }
        arg0.field2466 = this.field2463;
        arg0.field2465 = this.field2463.field2465;
        arg0.field2466.field2465 = arg0;
        arg0.field2465.field2466 = arg0;
    }

    @ObfuscatedName("gq.q(Lgd;Lgd;)V")
    public static void method3420(class193 arg0, class193 arg1) {
        if (arg0.field2466 != null) {
            arg0.method3425();
        }
        arg0.field2466 = arg1;
        arg0.field2465 = arg1.field2465;
        arg0.field2466.field2465 = arg0;
        arg0.field2465.field2466 = arg0;
    }

    @ObfuscatedName("gq.o()Lgd;")
    public class193 method3394() {
        class193 var1 = this.field2463.field2465;
        if (this.field2463 == var1) {
            return null;
        } else {
            var1.method3425();
            return var1;
        }
    }

    @ObfuscatedName("gq.g()Lgd;")
    public class193 method3395() {
        return this.method3396((class193) null);
    }

    @ObfuscatedName("gq.v(Lgd;)Lgd;")
    public class193 method3396(class193 arg0) {
        class193 var2;
        if (arg0 == null) {
            var2 = this.field2463.field2465;
        } else {
            var2 = arg0;
        }
        if (this.field2463 == var2) {
            this.field2462 = null;
            return null;
        } else {
            this.field2462 = var2.field2465;
            return var2;
        }
    }

    @ObfuscatedName("gq.p()Lgd;")
    public class193 method3417() {
        class193 var1 = this.field2462;
        if (this.field2463 == var1) {
            this.field2462 = null;
            return null;
        } else {
            this.field2462 = var1.field2465;
            return var1;
        }
    }

    @ObfuscatedName("gq.e()Z")
    public boolean method3398() {
        return this.field2463.field2465 == this.field2463;
    }

    public Iterator iterator() {
        return new class189(this);
    }
}
