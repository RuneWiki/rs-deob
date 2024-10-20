package deob;

import java.util.Iterator;

@ObfuscatedName("gc")
public class class202 implements Iterable {

    @ObfuscatedName("gc.f")
    public class208 field3093 = new class208();

    public class202() {
        this.field3093.field3106 = this.field3093;
        this.field3093.field3107 = this.field3093;
    }

    @ObfuscatedName("gc.f(Lgm;)V")
    public void method3607(class208 arg0) {
        if (arg0.field3107 != null) {
            arg0.method3665();
        }
        arg0.field3107 = this.field3093.field3107;
        arg0.field3106 = this.field3093;
        arg0.field3107.field3106 = arg0;
        arg0.field3106.field3107 = arg0;
    }

    @ObfuscatedName("gc.s()Lgm;")
    public class208 method3608() {
        return this.method3617((class208) null);
    }

    @ObfuscatedName("gc.q(Lgm;)Lgm;")
    public class208 method3617(class208 arg0) {
        class208 var2;
        if (arg0 == null) {
            var2 = this.field3093.field3106;
        } else {
            var2 = arg0;
        }
        return this.field3093 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class205(this);
    }
}
