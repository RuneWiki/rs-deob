package deob;

import java.util.Iterator;

@ObfuscatedName("go")
public class class202 implements Iterable {

    @ObfuscatedName("go.o")
    public class208 field3099 = new class208();

    public class202() {
        this.field3099.field3112 = this.field3099;
        this.field3099.field3111 = this.field3099;
    }

    @ObfuscatedName("go.o(Lgn;)V")
    public void method3612(class208 arg0) {
        if (arg0.field3111 != null) {
            arg0.method3670();
        }
        arg0.field3111 = this.field3099.field3111;
        arg0.field3112 = this.field3099;
        arg0.field3111.field3112 = arg0;
        arg0.field3112.field3111 = arg0;
    }

    @ObfuscatedName("go.e()Lgn;")
    public class208 method3613() {
        return this.method3614((class208) null);
    }

    @ObfuscatedName("go.u(Lgn;)Lgn;")
    public class208 method3614(class208 arg0) {
        class208 var2;
        if (arg0 == null) {
            var2 = this.field3099.field3112;
        } else {
            var2 = arg0;
        }
        return this.field3099 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class205(this);
    }
}
