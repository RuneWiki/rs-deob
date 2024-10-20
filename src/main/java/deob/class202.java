package deob;

import java.util.Iterator;

@ObfuscatedName("go")
public class class202 implements Iterable {

    @ObfuscatedName("go.k")
    public class208 field3097 = new class208();

    public class202() {
        this.field3097.field3110 = this.field3097;
        this.field3097.field3109 = this.field3097;
    }

    @ObfuscatedName("go.k(Lgp;)V")
    public void method3614(class208 arg0) {
        if (arg0.field3109 != null) {
            arg0.method3679();
        }
        arg0.field3109 = this.field3097.field3109;
        arg0.field3110 = this.field3097;
        arg0.field3109.field3110 = arg0;
        arg0.field3110.field3109 = arg0;
    }

    @ObfuscatedName("go.h()Lgp;")
    public class208 method3615() {
        return this.method3613((class208) null);
    }

    @ObfuscatedName("go.o(Lgp;)Lgp;")
    public class208 method3613(class208 arg0) {
        class208 var2;
        if (arg0 == null) {
            var2 = this.field3097.field3110;
        } else {
            var2 = arg0;
        }
        return this.field3097 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class205(this);
    }
}
