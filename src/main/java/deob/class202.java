package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class202 implements Iterable {

    @ObfuscatedName("gf.n")
    public class208 field3084 = new class208();

    public class202() {
        this.field3084.field3097 = this.field3084;
        this.field3084.field3098 = this.field3084;
    }

    @ObfuscatedName("gf.n(Lge;)V")
    public void method3607(class208 arg0) {
        if (arg0.field3098 != null) {
            arg0.method3651();
        }
        arg0.field3098 = this.field3084.field3098;
        arg0.field3097 = this.field3084;
        arg0.field3098.field3097 = arg0;
        arg0.field3097.field3098 = arg0;
    }

    @ObfuscatedName("gf.d()Lge;")
    public class208 method3599() {
        return this.method3601((class208) null);
    }

    @ObfuscatedName("gf.s(Lge;)Lge;")
    public class208 method3601(class208 arg0) {
        class208 var2;
        if (arg0 == null) {
            var2 = this.field3084.field3097;
        } else {
            var2 = arg0;
        }
        return this.field3084 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class205(this);
    }
}
