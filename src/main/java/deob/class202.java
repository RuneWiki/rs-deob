package deob;

import java.util.Iterator;

@ObfuscatedName("gq")
public class class202 implements Iterable {

    @ObfuscatedName("gq.i")
    public class208 field3086 = new class208();

    public class202() {
        this.field3086.field3098 = this.field3086;
        this.field3086.field3100 = this.field3086;
    }

    @ObfuscatedName("gq.i(Lgp;)V")
    public void method3581(class208 arg0) {
        if (arg0.field3100 != null) {
            arg0.method3624();
        }
        arg0.field3100 = this.field3086.field3100;
        arg0.field3098 = this.field3086;
        arg0.field3100.field3098 = arg0;
        arg0.field3098.field3100 = arg0;
    }

    @ObfuscatedName("gq.v()Lgp;")
    public class208 method3586() {
        return this.method3573((class208) null);
    }

    @ObfuscatedName("gq.f(Lgp;)Lgp;")
    public class208 method3573(class208 arg0) {
        class208 var2;
        if (arg0 == null) {
            var2 = this.field3086.field3098;
        } else {
            var2 = arg0;
        }
        return this.field3086 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class205(this);
    }
}
