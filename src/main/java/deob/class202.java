package deob;

import java.util.Iterator;

@ObfuscatedName("go")
public class class202 implements Iterable {

    @ObfuscatedName("go.j")
    public class208 field3099 = new class208();

    public class202() {
        this.field3099.field3112 = this.field3099;
        this.field3099.field3111 = this.field3099;
    }

    @ObfuscatedName("go.j(Lgu;)V")
    public void method3561(class208 arg0) {
        if (arg0.field3111 != null) {
            arg0.method3608();
        }
        arg0.field3111 = this.field3099.field3111;
        arg0.field3112 = this.field3099;
        arg0.field3111.field3112 = arg0;
        arg0.field3112.field3111 = arg0;
    }

    @ObfuscatedName("go.l()Lgu;")
    public class208 method3562() {
        return this.method3563((class208) null);
    }

    @ObfuscatedName("go.a(Lgu;)Lgu;")
    public class208 method3563(class208 arg0) {
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
