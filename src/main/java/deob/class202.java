package deob;

import java.util.Iterator;

@ObfuscatedName("ga")
public class class202 implements Iterable {

    @ObfuscatedName("ga.a")
    public class208 field3098 = new class208();

    public class202() {
        this.field3098.field3111 = this.field3098;
        this.field3098.field3110 = this.field3098;
    }

    @ObfuscatedName("ga.a(Lgs;)V")
    public void method3610(class208 arg0) {
        if (arg0.field3110 != null) {
            arg0.method3661();
        }
        arg0.field3110 = this.field3098.field3110;
        arg0.field3111 = this.field3098;
        arg0.field3110.field3111 = arg0;
        arg0.field3111.field3110 = arg0;
    }

    @ObfuscatedName("ga.r()Lgs;")
    public class208 method3608() {
        return this.method3617((class208) null);
    }

    @ObfuscatedName("ga.f(Lgs;)Lgs;")
    public class208 method3617(class208 arg0) {
        class208 var2;
        if (arg0 == null) {
            var2 = this.field3098.field3111;
        } else {
            var2 = arg0;
        }
        return this.field3098 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class205(this);
    }
}
