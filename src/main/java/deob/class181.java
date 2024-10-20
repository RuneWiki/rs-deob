package deob;

import java.util.Iterator;

@ObfuscatedName("fj")
public class class181 implements Iterable {

    @ObfuscatedName("fj.n")
    public class187 field2874 = new class187();

    public class181() {
        this.field2874.field2887 = this.field2874;
        this.field2874.field2886 = this.field2874;
    }

    @ObfuscatedName("fj.n(Lga;)V")
    public void method3234(class187 arg0) {
        if (arg0.field2886 != null) {
            arg0.method3277();
        }
        arg0.field2886 = this.field2874.field2886;
        arg0.field2887 = this.field2874;
        arg0.field2886.field2887 = arg0;
        arg0.field2887.field2886 = arg0;
    }

    @ObfuscatedName("fj.x()Lga;")
    public class187 method3226() {
        return this.method3236((class187) null);
    }

    @ObfuscatedName("fj.k(Lga;)Lga;")
    public class187 method3236(class187 arg0) {
        class187 var2;
        if (arg0 == null) {
            var2 = this.field2874.field2887;
        } else {
            var2 = arg0;
        }
        return this.field2874 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class184(this);
    }
}
