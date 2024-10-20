package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public class class202 implements Iterable {

    @ObfuscatedName("gm.j")
    public class208 field3091 = new class208();

    public class202() {
        this.field3091.field3103 = this.field3091;
        this.field3091.field3104 = this.field3091;
    }

    @ObfuscatedName("gm.j(Lgt;)V")
    public void method3656(class208 arg0) {
        if (arg0.field3104 != null) {
            arg0.method3700();
        }
        arg0.field3104 = this.field3091.field3104;
        arg0.field3103 = this.field3091;
        arg0.field3104.field3103 = arg0;
        arg0.field3103.field3104 = arg0;
    }

    @ObfuscatedName("gm.m()Lgt;")
    public class208 method3642() {
        return this.method3651((class208) null);
    }

    @ObfuscatedName("gm.f(Lgt;)Lgt;")
    public class208 method3651(class208 arg0) {
        class208 var2;
        if (arg0 == null) {
            var2 = this.field3091.field3103;
        } else {
            var2 = arg0;
        }
        return this.field3091 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class205(this);
    }
}
