package deob;

import java.util.Iterator;

@ObfuscatedName("gs")
public class class202 implements Iterable {

    @ObfuscatedName("gs.c")
    public class208 field3084 = new class208();

    public class202() {
        this.field3084.field3097 = this.field3084;
        this.field3084.field3098 = this.field3084;
    }

    @ObfuscatedName("gs.c(Lgc;)V")
    public void method3597(class208 arg0) {
        if (arg0.field3098 != null) {
            arg0.method3646();
        }
        arg0.field3098 = this.field3084.field3098;
        arg0.field3097 = this.field3084;
        arg0.field3098.field3097 = arg0;
        arg0.field3097.field3098 = arg0;
    }

    @ObfuscatedName("gs.h()Lgc;")
    public class208 method3607() {
        return this.method3599((class208) null);
    }

    @ObfuscatedName("gs.k(Lgc;)Lgc;")
    public class208 method3599(class208 arg0) {
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
