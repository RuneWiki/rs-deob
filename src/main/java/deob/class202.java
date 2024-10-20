package deob;

import java.util.Iterator;

@ObfuscatedName("go")
public class class202 implements Iterable {

    @ObfuscatedName("go.n")
    public class208 field3098 = new class208();

    public class202() {
        this.field3098.field3110 = this.field3098;
        this.field3098.field3111 = this.field3098;
    }

    @ObfuscatedName("go.n(Lga;)V")
    public void method3596(class208 arg0) {
        if (arg0.field3111 != null) {
            arg0.method3651();
        }
        arg0.field3111 = this.field3098.field3111;
        arg0.field3110 = this.field3098;
        arg0.field3111.field3110 = arg0;
        arg0.field3110.field3111 = arg0;
    }

    @ObfuscatedName("go.q()Lga;")
    public class208 method3588() {
        return this.method3589((class208) null);
    }

    @ObfuscatedName("go.c(Lga;)Lga;")
    public class208 method3589(class208 arg0) {
        class208 var2;
        if (arg0 == null) {
            var2 = this.field3098.field3110;
        } else {
            var2 = arg0;
        }
        return this.field3098 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class205(this);
    }
}
