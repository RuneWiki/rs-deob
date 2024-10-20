package deob;

import java.util.Iterator;

@ObfuscatedName("gx")
public class class206 implements Iterable {

    @ObfuscatedName("gx.c")
    public class207 field2464 = new class207();

    @ObfuscatedName("gx.q")
    public class207 field2463;

    public class206() {
        this.field2464.field2465 = this.field2464;
        this.field2464.field2467 = this.field2464;
    }

    @ObfuscatedName("gx.c()V")
    public void method3703() {
        while (this.field2464.field2465 != this.field2464) {
            this.field2464.field2465.method3733();
        }
    }

    @ObfuscatedName("gx.q(Lgk;)V")
    public void method3702(class207 arg0) {
        if (arg0.field2467 != null) {
            arg0.method3733();
        }
        arg0.field2467 = this.field2464.field2467;
        arg0.field2465 = this.field2464;
        arg0.field2467.field2465 = arg0;
        arg0.field2465.field2467 = arg0;
    }

    @ObfuscatedName("gx.m(Lgk;)V")
    public void method3704(class207 arg0) {
        if (arg0.field2467 != null) {
            arg0.method3733();
        }
        arg0.field2467 = this.field2464;
        arg0.field2465 = this.field2464.field2465;
        arg0.field2467.field2465 = arg0;
        arg0.field2465.field2467 = arg0;
    }

    @ObfuscatedName("gx.j(Lgk;Lgk;)V")
    public static void method3705(class207 arg0, class207 arg1) {
        if (arg0.field2467 != null) {
            arg0.method3733();
        }
        arg0.field2467 = arg1;
        arg0.field2465 = arg1.field2465;
        arg0.field2467.field2465 = arg0;
        arg0.field2465.field2467 = arg0;
    }

    @ObfuscatedName("gx.g()Lgk;")
    public class207 method3706() {
        return this.method3707((class207) null);
    }

    @ObfuscatedName("gx.i(Lgk;)Lgk;")
    public class207 method3707(class207 arg0) {
        class207 var2;
        if (arg0 == null) {
            var2 = this.field2464.field2465;
        } else {
            var2 = arg0;
        }
        if (this.field2464 == var2) {
            this.field2463 = null;
            return null;
        } else {
            this.field2463 = var2.field2465;
            return var2;
        }
    }

    @ObfuscatedName("gx.h()Lgk;")
    public class207 method3714() {
        class207 var1 = this.field2463;
        if (this.field2464 == var1) {
            this.field2463 = null;
            return null;
        } else {
            this.field2463 = var1.field2465;
            return var1;
        }
    }

    @ObfuscatedName("gx.l()Z")
    public boolean method3708() {
        return this.field2464.field2465 == this.field2464;
    }

    public Iterator iterator() {
        return new class202(this);
    }
}
