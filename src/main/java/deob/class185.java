package deob;

import java.util.Iterator;

@ObfuscatedName("gp")
public class class185 implements Iterable {

    @ObfuscatedName("gp.a")
    public class191 field2895 = new class191();

    public class185() {
        this.field2895.field2909 = this.field2895;
        this.field2895.field2907 = this.field2895;
    }

    @ObfuscatedName("gp.a(Lgq;)V")
    public void method3298(class191 arg0) {
        if (arg0.field2907 != null) {
            arg0.method3343();
        }
        arg0.field2907 = this.field2895.field2907;
        arg0.field2909 = this.field2895;
        arg0.field2907.field2909 = arg0;
        arg0.field2909.field2907 = arg0;
    }

    @ObfuscatedName("gp.v()Lgq;")
    public class191 method3296() {
        return this.method3297((class191) null);
    }

    @ObfuscatedName("gp.i(Lgq;)Lgq;")
    public class191 method3297(class191 arg0) {
        class191 var2;
        if (arg0 == null) {
            var2 = this.field2895.field2909;
        } else {
            var2 = arg0;
        }
        return this.field2895 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class188(this);
    }
}
