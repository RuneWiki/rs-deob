package deob;

import java.util.Iterator;

@ObfuscatedName("gv")
public class class202 implements Iterable {

    @ObfuscatedName("gv.i")
    public class208 field3087 = new class208();

    public class202() {
        this.field3087.field3099 = this.field3087;
        this.field3087.field3101 = this.field3087;
    }

    @ObfuscatedName("gv.i(Lgo;)V")
    public void method3570(class208 arg0) {
        if (arg0.field3101 != null) {
            arg0.method3626();
        }
        arg0.field3101 = this.field3087.field3101;
        arg0.field3099 = this.field3087;
        arg0.field3101.field3099 = arg0;
        arg0.field3099.field3101 = arg0;
    }

    @ObfuscatedName("gv.v()Lgo;")
    public class208 method3571() {
        return this.method3572((class208) null);
    }

    @ObfuscatedName("gv.r(Lgo;)Lgo;")
    public class208 method3572(class208 arg0) {
        class208 var2;
        if (arg0 == null) {
            var2 = this.field3087.field3099;
        } else {
            var2 = arg0;
        }
        return this.field3087 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class205(this);
    }
}
