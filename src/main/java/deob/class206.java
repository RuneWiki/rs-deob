package deob;

import java.util.Iterator;

@ObfuscatedName("gq")
public class class206 implements Iterable {

    @ObfuscatedName("gq.v")
    public class207 field2462 = new class207();

    @ObfuscatedName("gq.s")
    public class207 field2461;

    public class206() {
        this.field2462.field2463 = this.field2462;
        this.field2462.field2465 = this.field2462;
    }

    @ObfuscatedName("gq.v()V")
    public void method3753() {
        while (this.field2462.field2463 != this.field2462) {
            this.field2462.field2463.method3787();
        }
    }

    @ObfuscatedName("gq.s(Lgl;)V")
    public void method3754(class207 arg0) {
        if (arg0.field2465 != null) {
            arg0.method3787();
        }
        arg0.field2465 = this.field2462.field2465;
        arg0.field2463 = this.field2462;
        arg0.field2465.field2463 = arg0;
        arg0.field2463.field2465 = arg0;
    }

    @ObfuscatedName("gq.o(Lgl;)V")
    public void method3776(class207 arg0) {
        if (arg0.field2465 != null) {
            arg0.method3787();
        }
        arg0.field2465 = this.field2462;
        arg0.field2463 = this.field2462.field2463;
        arg0.field2465.field2463 = arg0;
        arg0.field2463.field2465 = arg0;
    }

    @ObfuscatedName("gq.k(Lgl;Lgl;)V")
    public static void method3756(class207 arg0, class207 arg1) {
        if (arg0.field2465 != null) {
            arg0.method3787();
        }
        arg0.field2465 = arg1;
        arg0.field2463 = arg1.field2463;
        arg0.field2465.field2463 = arg0;
        arg0.field2463.field2465 = arg0;
    }

    @ObfuscatedName("gq.u()Lgl;")
    public class207 method3757() {
        return this.method3758((class207) null);
    }

    @ObfuscatedName("gq.i(Lgl;)Lgl;")
    public class207 method3758(class207 arg0) {
        class207 var2;
        if (arg0 == null) {
            var2 = this.field2462.field2463;
        } else {
            var2 = arg0;
        }
        if (this.field2462 == var2) {
            this.field2461 = null;
            return null;
        } else {
            this.field2461 = var2.field2463;
            return var2;
        }
    }

    @ObfuscatedName("gq.t()Lgl;")
    public class207 method3779() {
        class207 var1 = this.field2461;
        if (this.field2462 == var1) {
            this.field2461 = null;
            return null;
        } else {
            this.field2461 = var1.field2463;
            return var1;
        }
    }

    @ObfuscatedName("gq.c()Z")
    public boolean method3760() {
        return this.field2462.field2463 == this.field2462;
    }

    public Iterator iterator() {
        return new class202(this);
    }
}
