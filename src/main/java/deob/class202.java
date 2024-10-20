package deob;

import java.util.Iterator;

@ObfuscatedName("gp")
public class class202 implements Iterable {

    @ObfuscatedName("gp.o")
    public class208 field3085 = new class208();

    public class202() {
        this.field3085.field3098 = this.field3085;
        this.field3085.field3099 = this.field3085;
    }

    @ObfuscatedName("gp.o(Lgu;)V")
    public void method3558(class208 arg0) {
        if (arg0.field3099 != null) {
            arg0.method3605();
        }
        arg0.field3099 = this.field3085.field3099;
        arg0.field3098 = this.field3085;
        arg0.field3099.field3098 = arg0;
        arg0.field3098.field3099 = arg0;
    }

    @ObfuscatedName("gp.f()Lgu;")
    public class208 method3559() {
        return this.method3560((class208) null);
    }

    @ObfuscatedName("gp.i(Lgu;)Lgu;")
    public class208 method3560(class208 arg0) {
        class208 var2;
        if (arg0 == null) {
            var2 = this.field3085.field3098;
        } else {
            var2 = arg0;
        }
        return this.field3085 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class205(this);
    }
}
